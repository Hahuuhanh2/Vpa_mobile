package wl;

import bc.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import ul.f;
import ul.z;

/* compiled from: GsonConverterFactory */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final h f23439a;

    public a(h hVar) {
        this.f23439a = hVar;
    }

    public final f a(Type type) {
        return new b(this.f23439a, this.f23439a.f(new gc.a(type)));
    }

    public final f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, z zVar) {
        return new y0.h((Object) this.f23439a, (Object) this.f23439a.f(new gc.a(type)));
    }
}
