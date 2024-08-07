package ob;

import com.google.firebase.perf.util.Timer;
import mb.d;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* compiled from: InstrumentApacheHttpResponseHandler */
public final class f<T> implements ResponseHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ResponseHandler<? extends T> f13809a;

    /* renamed from: b  reason: collision with root package name */
    public final Timer f13810b;

    /* renamed from: c  reason: collision with root package name */
    public final d f13811c;

    public f(ResponseHandler<? extends T> responseHandler, Timer timer, d dVar) {
        this.f13809a = responseHandler;
        this.f13810b = timer;
        this.f13811c = dVar;
    }

    public final T handleResponse(HttpResponse httpResponse) {
        this.f13811c.m(this.f13810b.a());
        this.f13811c.h(httpResponse.getStatusLine().getStatusCode());
        Long a10 = h.a(httpResponse);
        if (a10 != null) {
            this.f13811c.l(a10.longValue());
        }
        String b10 = h.b(httpResponse);
        if (b10 != null) {
            this.f13811c.k(b10);
        }
        this.f13811c.e();
        return this.f13809a.handleResponse(httpResponse);
    }
}
