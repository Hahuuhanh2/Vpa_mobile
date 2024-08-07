package okhttp3.internal.http;

import ll.i;
import ll.w;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* compiled from: RealResponseBody.kt */
public final class RealResponseBody extends ResponseBody {

    /* renamed from: c  reason: collision with root package name */
    public final String f22327c;

    /* renamed from: d  reason: collision with root package name */
    public final long f22328d;

    /* renamed from: e  reason: collision with root package name */
    public final i f22329e;

    public RealResponseBody(String str, long j10, w wVar) {
        this.f22327c = str;
        this.f22328d = j10;
        this.f22329e = wVar;
    }

    public final long d() {
        return this.f22328d;
    }

    public final MediaType h() {
        String str = this.f22327c;
        if (str == null) {
            return null;
        }
        MediaType.f22026e.getClass();
        return MediaType.Companion.b(str);
    }

    public final i i() {
        return this.f22329e;
    }
}
