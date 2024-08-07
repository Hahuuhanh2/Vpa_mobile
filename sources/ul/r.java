package ul;

import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import ul.f;

@IgnoreJRERequirement
/* compiled from: OptionalConverterFactory */
public final class r extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final r f23148a = new r();

    @IgnoreJRERequirement
    /* compiled from: OptionalConverterFactory */
    public static final class a<T> implements f<ResponseBody, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final f<ResponseBody, T> f23149a;

        public a(f<ResponseBody, T> fVar) {
            this.f23149a = fVar;
        }

        public final Object a(Object obj) {
            return Optional.ofNullable(this.f23149a.a((ResponseBody) obj));
        }
    }

    public final f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, z zVar) {
        if (d0.f(type) != Optional.class) {
            return null;
        }
        return new a(zVar.e(d0.e(0, (ParameterizedType) type), annotationArr));
    }
}
