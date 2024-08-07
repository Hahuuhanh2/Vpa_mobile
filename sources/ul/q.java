package ul;

import java.io.IOException;
import java.util.ArrayList;
import ll.f;
import ll.i;
import ll.m;
import ll.w;
import n0.l;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import sk.j;
import ul.w;
import v.v;

/* compiled from: OkHttpCall */
public final class q<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final x f23132a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f23133b;

    /* renamed from: c  reason: collision with root package name */
    public final Call.Factory f23134c;

    /* renamed from: d  reason: collision with root package name */
    public final f<ResponseBody, T> f23135d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f23136e;

    /* renamed from: f  reason: collision with root package name */
    public Call f23137f;

    /* renamed from: n  reason: collision with root package name */
    public Throwable f23138n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f23139o;

    /* compiled from: OkHttpCall */
    public class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f23140a;

        public a(d dVar) {
            this.f23140a = dVar;
        }

        public final void c(RealCall realCall, Response response) {
            try {
                try {
                    this.f23140a.a(q.this, q.this.c(response));
                } catch (Throwable th2) {
                    d0.n(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                d0.n(th3);
                th3.printStackTrace();
            }
        }

        public final void f(RealCall realCall, IOException iOException) {
            try {
                this.f23140a.c(q.this, iOException);
            } catch (Throwable th2) {
                d0.n(th2);
                th2.printStackTrace();
            }
        }
    }

    /* compiled from: OkHttpCall */
    public static final class b extends ResponseBody {

        /* renamed from: c  reason: collision with root package name */
        public final ResponseBody f23142c;

        /* renamed from: d  reason: collision with root package name */
        public final w f23143d;

        /* renamed from: e  reason: collision with root package name */
        public IOException f23144e;

        /* compiled from: OkHttpCall */
        public class a extends m {
            public a(i iVar) {
                super(iVar);
            }

            public final long J0(f fVar, long j10) {
                try {
                    return super.J0(fVar, 8192);
                } catch (IOException e10) {
                    b.this.f23144e = e10;
                    throw e10;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.f23142c = responseBody;
            this.f23143d = new w(new a(responseBody.i()));
        }

        public final void close() {
            this.f23142c.close();
        }

        public final long d() {
            return this.f23142c.d();
        }

        public final MediaType h() {
            return this.f23142c.h();
        }

        public final i i() {
            return this.f23143d;
        }
    }

    /* compiled from: OkHttpCall */
    public static final class c extends ResponseBody {

        /* renamed from: c  reason: collision with root package name */
        public final MediaType f23146c;

        /* renamed from: d  reason: collision with root package name */
        public final long f23147d;

        public c(MediaType mediaType, long j10) {
            this.f23146c = mediaType;
            this.f23147d = j10;
        }

        public final long d() {
            return this.f23147d;
        }

        public final MediaType h() {
            return this.f23146c;
        }

        public final i i() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public q(x xVar, Object[] objArr, Call.Factory factory, f<ResponseBody, T> fVar) {
        this.f23132a = xVar;
        this.f23133b = objArr;
        this.f23134c = factory;
        this.f23135d = fVar;
    }

    public final Call a() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder;
        Call.Factory factory = this.f23134c;
        x xVar = this.f23132a;
        Object[] objArr = this.f23133b;
        u<?>[] uVarArr = xVar.f23219j;
        int length = objArr.length;
        if (length == uVarArr.length) {
            w wVar = new w(xVar.f23212c, xVar.f23211b, xVar.f23213d, xVar.f23214e, xVar.f23215f, xVar.f23216g, xVar.f23217h, xVar.f23218i);
            if (xVar.f23220k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                uVarArr[i10].a(wVar, objArr[i10]);
            }
            HttpUrl.Builder builder2 = wVar.f23200d;
            if (builder2 != null) {
                httpUrl = builder2.a();
            } else {
                HttpUrl httpUrl2 = wVar.f23198b;
                String str = wVar.f23199c;
                httpUrl2.getClass();
                j.f(str, "link");
                try {
                    builder = new HttpUrl.Builder();
                    builder.c(httpUrl2, str);
                } catch (IllegalArgumentException unused) {
                    builder = null;
                }
                if (builder != null) {
                    httpUrl = builder.a();
                } else {
                    httpUrl = null;
                }
                if (httpUrl == null) {
                    StringBuilder q10 = android.support.v4.media.a.q("Malformed URL. Base: ");
                    q10.append(wVar.f23198b);
                    q10.append(", Relative: ");
                    q10.append(wVar.f23199c);
                    throw new IllegalArgumentException(q10.toString());
                }
            }
            w.a aVar = wVar.f23207k;
            if (aVar == null) {
                FormBody.Builder builder3 = wVar.f23206j;
                if (builder3 != null) {
                    aVar = new FormBody(builder3.f21993b, builder3.f21994c);
                } else {
                    MultipartBody.Builder builder4 = wVar.f23205i;
                    if (builder4 != null) {
                        if (!builder4.f22045c.isEmpty()) {
                            aVar = new MultipartBody(builder4.f22043a, builder4.f22044b, Util.x(builder4.f22045c));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.".toString());
                        }
                    } else if (wVar.f23204h) {
                        byte[] bArr = new byte[0];
                        RequestBody.f22115a.getClass();
                        long j10 = (long) 0;
                        byte[] bArr2 = Util.f22171a;
                        if ((j10 | j10) < 0 || j10 > j10 || j10 - j10 < j10) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        aVar = new RequestBody$Companion$toRequestBody$2((MediaType) null, bArr, 0, 0);
                    }
                }
            }
            MediaType mediaType = wVar.f23203g;
            if (mediaType != null) {
                if (aVar != null) {
                    aVar = new w.a(aVar, mediaType);
                } else {
                    wVar.f23202f.a("Content-Type", mediaType.f22029a);
                }
            }
            Request.Builder builder5 = wVar.f23201e;
            builder5.getClass();
            builder5.f22110a = httpUrl;
            builder5.f22112c = wVar.f23202f.d().l();
            builder5.c(wVar.f23197a, aVar);
            builder5.d(j.class, new j(xVar.f23210a, arrayList));
            RealCall a10 = factory.a(builder5.a());
            if (a10 != null) {
                return a10;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(v.e(l.l("Argument count (", length, ") doesn't match expected count ("), uVarArr.length, ")"));
    }

    public final Call b() {
        Call call = this.f23137f;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.f23138n;
        if (th2 == null) {
            try {
                Call a10 = a();
                this.f23137f = a10;
                return a10;
            } catch (IOException | Error | RuntimeException e10) {
                d0.n(e10);
                this.f23138n = e10;
                throw e10;
            }
        } else if (th2 instanceof IOException) {
            throw ((IOException) th2);
        } else if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        } else {
            throw ((Error) th2);
        }
    }

    public final y<T> c(Response response) {
        ResponseBody responseBody = response.f22130n;
        Response.Builder builder = new Response.Builder(response);
        builder.f22144g = new c(responseBody.h(), responseBody.d());
        Response a10 = builder.a();
        int i10 = a10.f22127d;
        if (i10 < 200 || i10 >= 300) {
            try {
                ResponseBody$Companion$asResponseBody$1 a11 = d0.a(responseBody);
                if (!a10.i()) {
                    return new y<>(a10, (Object) null, a11);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                responseBody.close();
            }
        } else if (i10 == 204 || i10 == 205) {
            responseBody.close();
            if (a10.i()) {
                return new y<>(a10, (Object) null, (ResponseBody$Companion$asResponseBody$1) null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } else {
            b bVar = new b(responseBody);
            try {
                T a12 = this.f23135d.a(bVar);
                if (a10.i()) {
                    return new y<>(a10, a12, (ResponseBody$Companion$asResponseBody$1) null);
                }
                throw new IllegalArgumentException("rawResponse must be successful response");
            } catch (RuntimeException e10) {
                IOException iOException = bVar.f23144e;
                if (iOException == null) {
                    throw e10;
                }
                throw iOException;
            }
        }
    }

    public final void cancel() {
        Call call;
        this.f23136e = true;
        synchronized (this) {
            call = this.f23137f;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() {
        return new q(this.f23132a, this.f23133b, this.f23134c, this.f23135d);
    }

    public final y<T> d() {
        Call b10;
        synchronized (this) {
            if (!this.f23139o) {
                this.f23139o = true;
                b10 = b();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f23136e) {
            b10.cancel();
        }
        return c(b10.d());
    }

    public final boolean h() {
        boolean z10 = true;
        if (this.f23136e) {
            return true;
        }
        synchronized (this) {
            Call call = this.f23137f;
            if (call == null || !call.h()) {
                z10 = false;
            }
        }
        return z10;
    }

    public final synchronized Request i() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return b().i();
    }

    public final void k0(d<T> dVar) {
        Call call;
        Throwable th2;
        synchronized (this) {
            if (!this.f23139o) {
                this.f23139o = true;
                call = this.f23137f;
                th2 = this.f23138n;
                if (call == null && th2 == null) {
                    try {
                        Call a10 = a();
                        this.f23137f = a10;
                        call = a10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        d0.n(th2);
                        this.f23138n = th2;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th2 != null) {
            dVar.c(this, th2);
            return;
        }
        if (this.f23136e) {
            call.cancel();
        }
        call.v(new a(dVar));
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final b m45clone() {
        return new q(this.f23132a, this.f23133b, this.f23134c, this.f23135d);
    }
}
