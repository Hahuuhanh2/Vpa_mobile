package ul;

import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;

/* compiled from: Response */
public final class y<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Response f23246a;

    /* renamed from: b  reason: collision with root package name */
    public final T f23247b;

    /* renamed from: c  reason: collision with root package name */
    public final ResponseBody f23248c;

    public y(Response response, Object obj, ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1) {
        this.f23246a = response;
        this.f23247b = obj;
        this.f23248c = responseBody$Companion$asResponseBody$1;
    }

    public final String toString() {
        return this.f23246a.toString();
    }
}
