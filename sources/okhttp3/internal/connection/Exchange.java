package okhttp3.internal.connection;

import android.support.v4.media.a;
import java.io.IOException;
import java.net.ProtocolException;
import ll.a0;
import ll.c0;
import ll.f;
import ll.l;
import ll.m;
import ll.w;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import sk.j;

/* compiled from: Exchange.kt */
public final class Exchange {

    /* renamed from: a  reason: collision with root package name */
    public final RealCall f22220a;

    /* renamed from: b  reason: collision with root package name */
    public final EventListener f22221b;

    /* renamed from: c  reason: collision with root package name */
    public final ExchangeFinder f22222c;

    /* renamed from: d  reason: collision with root package name */
    public final ExchangeCodec f22223d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22224e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22225f;

    /* renamed from: g  reason: collision with root package name */
    public final RealConnection f22226g;

    /* compiled from: Exchange.kt */
    public final class RequestBodySink extends l {

        /* renamed from: b  reason: collision with root package name */
        public final long f22227b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f22228c;

        /* renamed from: d  reason: collision with root package name */
        public long f22229d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f22230e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Exchange f22231f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, a0 a0Var, long j10) {
            super(a0Var);
            j.f(a0Var, "delegate");
            this.f22231f = exchange;
            this.f22227b = j10;
        }

        public final void Q(f fVar, long j10) {
            j.f(fVar, "source");
            if (!this.f22230e) {
                long j11 = this.f22227b;
                if (j11 == -1 || this.f22229d + j10 <= j11) {
                    try {
                        super.Q(fVar, j10);
                        this.f22229d += j10;
                    } catch (IOException e10) {
                        throw d(e10);
                    }
                } else {
                    StringBuilder q10 = a.q("expected ");
                    q10.append(this.f22227b);
                    q10.append(" bytes but received ");
                    q10.append(this.f22229d + j10);
                    throw new ProtocolException(q10.toString());
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final void close() {
            if (!this.f22230e) {
                this.f22230e = true;
                long j10 = this.f22227b;
                if (j10 == -1 || this.f22229d == j10) {
                    try {
                        super.close();
                        d((IOException) null);
                    } catch (IOException e10) {
                        throw d(e10);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public final <E extends IOException> E d(E e10) {
            if (this.f22228c) {
                return e10;
            }
            this.f22228c = true;
            return this.f22231f.a(this.f22229d, false, true, e10);
        }

        public final void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw d(e10);
            }
        }
    }

    /* compiled from: Exchange.kt */
    public final class ResponseBodySource extends m {

        /* renamed from: b  reason: collision with root package name */
        public final long f22232b;

        /* renamed from: c  reason: collision with root package name */
        public long f22233c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f22234d = true;

        /* renamed from: e  reason: collision with root package name */
        public boolean f22235e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f22236f;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ Exchange f22237n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, c0 c0Var, long j10) {
            super(c0Var);
            j.f(c0Var, "delegate");
            this.f22237n = exchange;
            this.f22232b = j10;
            if (j10 == 0) {
                d((IOException) null);
            }
        }

        public final long J0(f fVar, long j10) {
            j.f(fVar, "sink");
            if (!this.f22236f) {
                try {
                    long J0 = this.f20887a.J0(fVar, 8192);
                    if (this.f22234d) {
                        this.f22234d = false;
                        Exchange exchange = this.f22237n;
                        exchange.f22221b.w(exchange.f22220a);
                    }
                    if (J0 == -1) {
                        d((IOException) null);
                        return -1;
                    }
                    long j11 = this.f22233c + J0;
                    long j12 = this.f22232b;
                    if (j12 != -1) {
                        if (j11 > j12) {
                            throw new ProtocolException("expected " + this.f22232b + " bytes but received " + j11);
                        }
                    }
                    this.f22233c = j11;
                    if (j11 == j12) {
                        d((IOException) null);
                    }
                    return J0;
                } catch (IOException e10) {
                    throw d(e10);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final void close() {
            if (!this.f22236f) {
                this.f22236f = true;
                try {
                    super.close();
                    d((IOException) null);
                } catch (IOException e10) {
                    throw d(e10);
                }
            }
        }

        public final <E extends IOException> E d(E e10) {
            if (this.f22235e) {
                return e10;
            }
            this.f22235e = true;
            if (e10 == null && this.f22234d) {
                this.f22234d = false;
                Exchange exchange = this.f22237n;
                exchange.f22221b.w(exchange.f22220a);
            }
            return this.f22237n.a(this.f22233c, true, false, e10);
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        j.f(eventListener, "eventListener");
        this.f22220a = realCall;
        this.f22221b = eventListener;
        this.f22222c = exchangeFinder;
        this.f22223d = exchangeCodec;
        this.f22226g = exchangeCodec.e();
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            e(e10);
        }
        if (z11) {
            if (e10 != null) {
                this.f22221b.s(this.f22220a, e10);
            } else {
                this.f22221b.q(this.f22220a, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f22221b.x(this.f22220a, e10);
            } else {
                this.f22221b.v(this.f22220a, j10);
            }
        }
        return this.f22220a.g(this, z11, z10, e10);
    }

    public final a0 b(Request request) {
        this.f22224e = false;
        RequestBody requestBody = request.f22107d;
        j.c(requestBody);
        long a10 = requestBody.a();
        this.f22221b.r(this.f22220a);
        return new RequestBodySink(this, this.f22223d.h(request, a10), a10);
    }

    public final RealResponseBody c(Response response) {
        try {
            String h10 = Response.h(response, "Content-Type");
            long g2 = this.f22223d.g(response);
            return new RealResponseBody(h10, g2, new w(new ResponseBodySource(this, this.f22223d.c(response), g2)));
        } catch (IOException e10) {
            this.f22221b.x(this.f22220a, e10);
            e(e10);
            throw e10;
        }
    }

    public final Response.Builder d(boolean z10) {
        try {
            Response.Builder d10 = this.f22223d.d(z10);
            if (d10 != null) {
                d10.f22150m = this;
            }
            return d10;
        } catch (IOException e10) {
            this.f22221b.x(this.f22220a, e10);
            e(e10);
            throw e10;
        }
    }

    public final void e(IOException iOException) {
        boolean z10;
        this.f22225f = true;
        this.f22222c.c(iOException);
        RealConnection e10 = this.f22223d.e();
        RealCall realCall = this.f22220a;
        synchronized (e10) {
            j.f(realCall, "call");
            if (!(iOException instanceof StreamResetException)) {
                if (e10.f22276g != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || (iOException instanceof ConnectionShutdownException)) {
                    e10.f22279j = true;
                    if (e10.f22282m == 0) {
                        RealConnection.d(realCall.f22248a, e10.f22271b, iOException);
                        e10.f22281l++;
                    }
                }
            } else if (((StreamResetException) iOException).f22531a == ErrorCode.REFUSED_STREAM) {
                int i10 = e10.f22283n + 1;
                e10.f22283n = i10;
                if (i10 > 1) {
                    e10.f22279j = true;
                    e10.f22281l++;
                }
            } else if (((StreamResetException) iOException).f22531a != ErrorCode.CANCEL || !realCall.f22263w) {
                e10.f22279j = true;
                e10.f22281l++;
            }
        }
    }

    public final void f(Request request) {
        try {
            this.f22221b.u(this.f22220a);
            this.f22223d.b(request);
            this.f22221b.t(this.f22220a, request);
        } catch (IOException e10) {
            this.f22221b.s(this.f22220a, e10);
            e(e10);
            throw e10;
        }
    }
}
