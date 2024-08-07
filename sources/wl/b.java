package wl;

import bc.h;
import bc.u;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import ll.g;
import ll.j;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$1;
import ul.f;

/* compiled from: GsonRequestBodyConverter */
public final class b<T> implements f<T, RequestBody> {

    /* renamed from: c  reason: collision with root package name */
    public static final MediaType f23440c = MediaType.Companion.a("application/json; charset=UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f23441d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final h f23442a;

    /* renamed from: b  reason: collision with root package name */
    public final u<T> f23443b;

    static {
        MediaType.f22026e.getClass();
    }

    public b(h hVar, u<T> uVar) {
        this.f23442a = hVar;
        this.f23443b = uVar;
    }

    public final Object a(Object obj) {
        ll.f fVar = new ll.f();
        hc.b h10 = this.f23442a.h(new OutputStreamWriter(new g(fVar), f23441d));
        this.f23443b.b(h10, obj);
        h10.close();
        MediaType mediaType = f23440c;
        j N = fVar.N();
        RequestBody.f22115a.getClass();
        sk.j.f(N, "content");
        return new RequestBody$Companion$toRequestBody$1(mediaType, N);
    }
}
