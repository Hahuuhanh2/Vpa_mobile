package okhttp3.internal.http1;

import android.support.v4.media.a;
import f0.b0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import ll.a0;
import ll.c0;
import ll.d0;
import ll.f;
import ll.h;
import ll.i;
import ll.n;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import sk.j;
import yk.l;

/* compiled from: Http1ExchangeCodec.kt */
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f22338a;

    /* renamed from: b  reason: collision with root package name */
    public final RealConnection f22339b;

    /* renamed from: c  reason: collision with root package name */
    public final i f22340c;

    /* renamed from: d  reason: collision with root package name */
    public final h f22341d;

    /* renamed from: e  reason: collision with root package name */
    public int f22342e;

    /* renamed from: f  reason: collision with root package name */
    public final HeadersReader f22343f;

    /* renamed from: g  reason: collision with root package name */
    public Headers f22344g;

    /* compiled from: Http1ExchangeCodec.kt */
    public abstract class AbstractSource implements c0 {

        /* renamed from: a  reason: collision with root package name */
        public final n f22345a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22346b;

        public AbstractSource() {
            this.f22345a = new n(Http1ExchangeCodec.this.f22340c.f());
        }

        public long J0(f fVar, long j10) {
            j.f(fVar, "sink");
            try {
                return Http1ExchangeCodec.this.f22340c.J0(fVar, j10);
            } catch (IOException e10) {
                Http1ExchangeCodec.this.f22339b.k();
                d();
                throw e10;
            }
        }

        public final void d() {
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            int i10 = http1ExchangeCodec.f22342e;
            if (i10 != 6) {
                if (i10 == 5) {
                    Http1ExchangeCodec.i(http1ExchangeCodec, this.f22345a);
                    Http1ExchangeCodec.this.f22342e = 6;
                    return;
                }
                StringBuilder q10 = a.q("state: ");
                q10.append(Http1ExchangeCodec.this.f22342e);
                throw new IllegalStateException(q10.toString());
            }
        }

        public final d0 f() {
            return this.f22345a;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class ChunkedSink implements a0 {

        /* renamed from: a  reason: collision with root package name */
        public final n f22348a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22349b;

        public ChunkedSink() {
            this.f22348a = new n(Http1ExchangeCodec.this.f22341d.f());
        }

        public final void Q(f fVar, long j10) {
            j.f(fVar, "source");
            if (!(!this.f22349b)) {
                throw new IllegalStateException("closed".toString());
            } else if (j10 != 0) {
                Http1ExchangeCodec.this.f22341d.b0(j10);
                Http1ExchangeCodec.this.f22341d.O("\r\n");
                Http1ExchangeCodec.this.f22341d.Q(fVar, j10);
                Http1ExchangeCodec.this.f22341d.O("\r\n");
            }
        }

        public final synchronized void close() {
            if (!this.f22349b) {
                this.f22349b = true;
                Http1ExchangeCodec.this.f22341d.O("0\r\n\r\n");
                Http1ExchangeCodec.i(Http1ExchangeCodec.this, this.f22348a);
                Http1ExchangeCodec.this.f22342e = 3;
            }
        }

        public final d0 f() {
            return this.f22348a;
        }

        public final synchronized void flush() {
            if (!this.f22349b) {
                Http1ExchangeCodec.this.f22341d.flush();
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class ChunkedSource extends AbstractSource {

        /* renamed from: d  reason: collision with root package name */
        public final HttpUrl f22351d;

        /* renamed from: e  reason: collision with root package name */
        public long f22352e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f22353f = true;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f22354n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            j.f(httpUrl, "url");
            this.f22354n = http1ExchangeCodec;
            this.f22351d = httpUrl;
        }

        public final long J0(f fVar, long j10) {
            j.f(fVar, "sink");
            boolean z10 = true;
            if (!(!this.f22346b)) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f22353f) {
                return -1;
            } else {
                long j11 = this.f22352e;
                if (j11 == 0 || j11 == -1) {
                    if (j11 != -1) {
                        this.f22354n.f22340c.p0();
                    }
                    try {
                        this.f22352e = this.f22354n.f22340c.M0();
                        String obj = l.k1(this.f22354n.f22340c.p0()).toString();
                        if (this.f22352e >= 0) {
                            if (obj.length() <= 0) {
                                z10 = false;
                            }
                            if (!z10 || yk.h.L0(obj, ";", false)) {
                                if (this.f22352e == 0) {
                                    this.f22353f = false;
                                    Http1ExchangeCodec http1ExchangeCodec = this.f22354n;
                                    http1ExchangeCodec.f22344g = http1ExchangeCodec.f22343f.a();
                                    OkHttpClient okHttpClient = this.f22354n.f22338a;
                                    j.c(okHttpClient);
                                    CookieJar cookieJar = okHttpClient.f22059q;
                                    HttpUrl httpUrl = this.f22351d;
                                    Headers headers = this.f22354n.f22344g;
                                    j.c(headers);
                                    HttpHeaders.d(cookieJar, httpUrl, headers);
                                    d();
                                }
                                if (!this.f22353f) {
                                    return -1;
                                }
                            }
                        }
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f22352e + obj + '\"');
                    } catch (NumberFormatException e10) {
                        throw new ProtocolException(e10.getMessage());
                    }
                }
                long J0 = super.J0(fVar, Math.min(8192, this.f22352e));
                if (J0 != -1) {
                    this.f22352e -= J0;
                    return J0;
                }
                this.f22354n.f22339b.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                d();
                throw protocolException;
            }
        }

        public final void close() {
            if (!this.f22346b) {
                if (this.f22353f && !Util.g(this, TimeUnit.MILLISECONDS)) {
                    this.f22354n.f22339b.k();
                    d();
                }
                this.f22346b = true;
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class FixedLengthSource extends AbstractSource {

        /* renamed from: d  reason: collision with root package name */
        public long f22355d;

        public FixedLengthSource(long j10) {
            super();
            this.f22355d = j10;
            if (j10 == 0) {
                d();
            }
        }

        public final long J0(f fVar, long j10) {
            j.f(fVar, "sink");
            if (!this.f22346b) {
                long j11 = this.f22355d;
                if (j11 == 0) {
                    return -1;
                }
                long J0 = super.J0(fVar, Math.min(j11, 8192));
                if (J0 != -1) {
                    long j12 = this.f22355d - J0;
                    this.f22355d = j12;
                    if (j12 == 0) {
                        d();
                    }
                    return J0;
                }
                Http1ExchangeCodec.this.f22339b.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                d();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }

        public final void close() {
            if (!this.f22346b) {
                if (this.f22355d != 0 && !Util.g(this, TimeUnit.MILLISECONDS)) {
                    Http1ExchangeCodec.this.f22339b.k();
                    d();
                }
                this.f22346b = true;
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class KnownLengthSink implements a0 {

        /* renamed from: a  reason: collision with root package name */
        public final n f22357a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22358b;

        public KnownLengthSink() {
            this.f22357a = new n(Http1ExchangeCodec.this.f22341d.f());
        }

        public final void Q(f fVar, long j10) {
            j.f(fVar, "source");
            if (!this.f22358b) {
                long j11 = fVar.f20878b;
                byte[] bArr = Util.f22171a;
                if ((0 | j10) < 0 || 0 > j11 || j11 - 0 < j10) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Http1ExchangeCodec.this.f22341d.Q(fVar, j10);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public final void close() {
            if (!this.f22358b) {
                this.f22358b = true;
                Http1ExchangeCodec.i(Http1ExchangeCodec.this, this.f22357a);
                Http1ExchangeCodec.this.f22342e = 3;
            }
        }

        public final d0 f() {
            return this.f22357a;
        }

        public final void flush() {
            if (!this.f22358b) {
                Http1ExchangeCodec.this.f22341d.flush();
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class UnknownLengthSource extends AbstractSource {

        /* renamed from: d  reason: collision with root package name */
        public boolean f22360d;

        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec) {
            super();
        }

        public final long J0(f fVar, long j10) {
            j.f(fVar, "sink");
            if (!(!this.f22346b)) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f22360d) {
                return -1;
            } else {
                long J0 = super.J0(fVar, 8192);
                if (J0 != -1) {
                    return J0;
                }
                this.f22360d = true;
                d();
                return -1;
            }
        }

        public final void close() {
            if (!this.f22346b) {
                if (!this.f22360d) {
                    d();
                }
                this.f22346b = true;
            }
        }
    }

    static {
        new Companion(0);
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, i iVar, h hVar) {
        j.f(realConnection, "connection");
        this.f22338a = okHttpClient;
        this.f22339b = realConnection;
        this.f22340c = iVar;
        this.f22341d = hVar;
        this.f22343f = new HeadersReader(iVar);
    }

    public static final void i(Http1ExchangeCodec http1ExchangeCodec, n nVar) {
        http1ExchangeCodec.getClass();
        d0 d0Var = nVar.f20888e;
        d0.a aVar = d0.f20871d;
        j.f(aVar, "delegate");
        nVar.f20888e = aVar;
        d0Var.a();
        d0Var.b();
    }

    public final void a() {
        this.f22341d.flush();
    }

    public final void b(Request request) {
        boolean z10;
        RequestLine requestLine = RequestLine.f22330a;
        Proxy.Type type = this.f22339b.f22271b.f22161b.type();
        j.e(type, "connection.route().proxy.type()");
        requestLine.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f22105b);
        sb2.append(' ');
        HttpUrl httpUrl = request.f22104a;
        if (httpUrl.f22016j || type != Proxy.Type.HTTP) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            sb2.append(httpUrl);
        } else {
            sb2.append(RequestLine.a(httpUrl));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        l(request.f22106c, sb3);
    }

    public final c0 c(Response response) {
        if (!HttpHeaders.a(response)) {
            return j(0);
        }
        boolean z10 = true;
        if (yk.h.G0("chunked", Response.h(response, "Transfer-Encoding"))) {
            HttpUrl httpUrl = response.f22124a.f22104a;
            if (this.f22342e != 4) {
                z10 = false;
            }
            if (z10) {
                this.f22342e = 5;
                return new ChunkedSource(this, httpUrl);
            }
            StringBuilder q10 = a.q("state: ");
            q10.append(this.f22342e);
            throw new IllegalStateException(q10.toString().toString());
        }
        long j10 = Util.j(response);
        if (j10 != -1) {
            return j(j10);
        }
        if (this.f22342e != 4) {
            z10 = false;
        }
        if (z10) {
            this.f22342e = 5;
            this.f22339b.k();
            return new UnknownLengthSource(this);
        }
        StringBuilder q11 = a.q("state: ");
        q11.append(this.f22342e);
        throw new IllegalStateException(q11.toString().toString());
    }

    public final void cancel() {
        Socket socket = this.f22339b.f22272c;
        if (socket != null) {
            Util.d(socket);
        }
    }

    public final Response.Builder d(boolean z10) {
        boolean z11;
        int i10 = this.f22342e;
        boolean z12 = false;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            HttpUrl.Builder builder = null;
            try {
                StatusLine.Companion companion = StatusLine.f22332d;
                HeadersReader headersReader = this.f22343f;
                String F = headersReader.f22336a.F(headersReader.f22337b);
                headersReader.f22337b -= (long) F.length();
                companion.getClass();
                StatusLine a10 = StatusLine.Companion.a(F);
                Response.Builder builder2 = new Response.Builder();
                Protocol protocol = a10.f22333a;
                j.f(protocol, "protocol");
                builder2.f22139b = protocol;
                builder2.f22140c = a10.f22334b;
                String str = a10.f22335c;
                j.f(str, "message");
                builder2.f22141d = str;
                builder2.f22143f = this.f22343f.a().l();
                if (z10 && a10.f22334b == 100) {
                    return null;
                }
                int i11 = a10.f22334b;
                if (i11 == 100) {
                    this.f22342e = 3;
                } else {
                    if (102 <= i11 && i11 < 200) {
                        z12 = true;
                    }
                    if (z12) {
                        this.f22342e = 3;
                    } else {
                        this.f22342e = 4;
                    }
                }
                return builder2;
            } catch (EOFException e10) {
                HttpUrl httpUrl = this.f22339b.f22271b.f22160a.f21901i;
                httpUrl.getClass();
                try {
                    HttpUrl.Builder builder3 = new HttpUrl.Builder();
                    builder3.c(httpUrl, "/...");
                    builder = builder3;
                } catch (IllegalArgumentException unused) {
                }
                j.c(builder);
                HttpUrl.Companion companion2 = HttpUrl.f22005k;
                builder.f22019b = HttpUrl.Companion.a(companion2, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
                builder.f22020c = HttpUrl.Companion.a(companion2, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
                throw new IOException(b0.r("unexpected end of stream on ", builder.a().f22015i), e10);
            }
        } else {
            StringBuilder q10 = a.q("state: ");
            q10.append(this.f22342e);
            throw new IllegalStateException(q10.toString().toString());
        }
    }

    public final RealConnection e() {
        return this.f22339b;
    }

    public final void f() {
        this.f22341d.flush();
    }

    public final long g(Response response) {
        if (!HttpHeaders.a(response)) {
            return 0;
        }
        if (yk.h.G0("chunked", Response.h(response, "Transfer-Encoding"))) {
            return -1;
        }
        return Util.j(response);
    }

    public final a0 h(Request request, long j10) {
        boolean z10 = true;
        if (yk.h.G0("chunked", request.f22106c.g("Transfer-Encoding"))) {
            if (this.f22342e != 1) {
                z10 = false;
            }
            if (z10) {
                this.f22342e = 2;
                return new ChunkedSink();
            }
            StringBuilder q10 = a.q("state: ");
            q10.append(this.f22342e);
            throw new IllegalStateException(q10.toString().toString());
        } else if (j10 != -1) {
            if (this.f22342e != 1) {
                z10 = false;
            }
            if (z10) {
                this.f22342e = 2;
                return new KnownLengthSink();
            }
            StringBuilder q11 = a.q("state: ");
            q11.append(this.f22342e);
            throw new IllegalStateException(q11.toString().toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final c0 j(long j10) {
        boolean z10;
        if (this.f22342e == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f22342e = 5;
            return new FixedLengthSource(j10);
        }
        StringBuilder q10 = a.q("state: ");
        q10.append(this.f22342e);
        throw new IllegalStateException(q10.toString().toString());
    }

    public final void k(Response response) {
        long j10 = Util.j(response);
        if (j10 != -1) {
            c0 j11 = j(j10);
            Util.u(j11, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            ((FixedLengthSource) j11).close();
        }
    }

    public final void l(Headers headers, String str) {
        boolean z10;
        j.f(headers, "headers");
        j.f(str, "requestLine");
        if (this.f22342e == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f22341d.O(str).O("\r\n");
            int length = headers.f22003a.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                this.f22341d.O(headers.i(i10)).O(": ").O(headers.m(i10)).O("\r\n");
            }
            this.f22341d.O("\r\n");
            this.f22342e = 1;
            return;
        }
        StringBuilder q10 = a.q("state: ");
        q10.append(this.f22342e);
        throw new IllegalStateException(q10.toString().toString());
    }
}
