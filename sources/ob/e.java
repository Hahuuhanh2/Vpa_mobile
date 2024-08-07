package ob;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import lb.a;
import mb.d;
import tb.h;

/* compiled from: InstrURLConnectionBase */
public final class e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f13803f = a.d();

    /* renamed from: a  reason: collision with root package name */
    public final HttpURLConnection f13804a;

    /* renamed from: b  reason: collision with root package name */
    public final d f13805b;

    /* renamed from: c  reason: collision with root package name */
    public long f13806c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f13807d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final Timer f13808e;

    public e(HttpURLConnection httpURLConnection, Timer timer, d dVar) {
        this.f13804a = httpURLConnection;
        this.f13805b = dVar;
        this.f13808e = timer;
        dVar.n(httpURLConnection.getURL().toString());
    }

    public final void a() {
        if (this.f13806c == -1) {
            this.f13808e.e();
            long j10 = this.f13808e.f7662a;
            this.f13806c = j10;
            this.f13805b.j(j10);
        }
        try {
            this.f13804a.connect();
        } catch (IOException e10) {
            this.f13805b.m(this.f13808e.a());
            h.c(this.f13805b);
            throw e10;
        }
    }

    public final Object b() {
        i();
        this.f13805b.h(this.f13804a.getResponseCode());
        try {
            Object content = this.f13804a.getContent();
            if (content instanceof InputStream) {
                this.f13805b.k(this.f13804a.getContentType());
                return new a((InputStream) content, this.f13805b, this.f13808e);
            }
            this.f13805b.k(this.f13804a.getContentType());
            this.f13805b.l((long) this.f13804a.getContentLength());
            this.f13805b.m(this.f13808e.a());
            this.f13805b.e();
            return content;
        } catch (IOException e10) {
            this.f13805b.m(this.f13808e.a());
            h.c(this.f13805b);
            throw e10;
        }
    }

    public final Object c(Class[] clsArr) {
        i();
        this.f13805b.h(this.f13804a.getResponseCode());
        try {
            Object content = this.f13804a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f13805b.k(this.f13804a.getContentType());
                return new a((InputStream) content, this.f13805b, this.f13808e);
            }
            this.f13805b.k(this.f13804a.getContentType());
            this.f13805b.l((long) this.f13804a.getContentLength());
            this.f13805b.m(this.f13808e.a());
            this.f13805b.e();
            return content;
        } catch (IOException e10) {
            this.f13805b.m(this.f13808e.a());
            h.c(this.f13805b);
            throw e10;
        }
    }

    public final InputStream d() {
        i();
        try {
            this.f13805b.h(this.f13804a.getResponseCode());
        } catch (IOException unused) {
            f13803f.a();
        }
        InputStream errorStream = this.f13804a.getErrorStream();
        if (errorStream != null) {
            return new a(errorStream, this.f13805b, this.f13808e);
        }
        return errorStream;
    }

    public final InputStream e() {
        i();
        this.f13805b.h(this.f13804a.getResponseCode());
        this.f13805b.k(this.f13804a.getContentType());
        try {
            InputStream inputStream = this.f13804a.getInputStream();
            if (inputStream != null) {
                return new a(inputStream, this.f13805b, this.f13808e);
            }
            return inputStream;
        } catch (IOException e10) {
            this.f13805b.m(this.f13808e.a());
            h.c(this.f13805b);
            throw e10;
        }
    }

    public final boolean equals(Object obj) {
        return this.f13804a.equals(obj);
    }

    public final OutputStream f() {
        try {
            OutputStream outputStream = this.f13804a.getOutputStream();
            if (outputStream != null) {
                return new b(outputStream, this.f13805b, this.f13808e);
            }
            return outputStream;
        } catch (IOException e10) {
            this.f13805b.m(this.f13808e.a());
            h.c(this.f13805b);
            throw e10;
        }
    }

    public final int g() {
        i();
        if (this.f13807d == -1) {
            long a10 = this.f13808e.a();
            this.f13807d = a10;
            h.a aVar = this.f13805b.f13253o;
            aVar.s();
            h.N((h) aVar.f7906b, a10);
        }
        try {
            int responseCode = this.f13804a.getResponseCode();
            this.f13805b.h(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f13805b.m(this.f13808e.a());
            h.c(this.f13805b);
            throw e10;
        }
    }

    public final String h() {
        i();
        if (this.f13807d == -1) {
            long a10 = this.f13808e.a();
            this.f13807d = a10;
            h.a aVar = this.f13805b.f13253o;
            aVar.s();
            h.N((h) aVar.f7906b, a10);
        }
        try {
            String responseMessage = this.f13804a.getResponseMessage();
            this.f13805b.h(this.f13804a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f13805b.m(this.f13808e.a());
            h.c(this.f13805b);
            throw e10;
        }
    }

    public final int hashCode() {
        return this.f13804a.hashCode();
    }

    public final void i() {
        if (this.f13806c == -1) {
            this.f13808e.e();
            long j10 = this.f13808e.f7662a;
            this.f13806c = j10;
            this.f13805b.j(j10);
        }
        String requestMethod = this.f13804a.getRequestMethod();
        if (requestMethod != null) {
            this.f13805b.g(requestMethod);
        } else if (this.f13804a.getDoOutput()) {
            this.f13805b.g("POST");
        } else {
            this.f13805b.g("GET");
        }
    }

    public final String toString() {
        return this.f13804a.toString();
    }
}
