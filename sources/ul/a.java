package ul;

import ek.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import ul.f;
import xl.w;

/* compiled from: BuiltInConverters */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f23086a = true;

    /* renamed from: ul.a$a  reason: collision with other inner class name */
    /* compiled from: BuiltInConverters */
    public static final class C0308a implements f<ResponseBody, ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0308a f23087a = new C0308a();

        public final Object a(Object obj) {
            ResponseBody responseBody = (ResponseBody) obj;
            try {
                return d0.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class b implements f<RequestBody, RequestBody> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f23088a = new b();

        public final Object a(Object obj) {
            return (RequestBody) obj;
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class c implements f<ResponseBody, ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f23089a = new c();

        public final Object a(Object obj) {
            return (ResponseBody) obj;
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class d implements f<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f23090a = new d();

        public final Object a(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class e implements f<ResponseBody, i> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f23091a = new e();

        public final Object a(Object obj) {
            ((ResponseBody) obj).close();
            return i.f20112a;
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class f implements f<ResponseBody, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f23092a = new f();

        public final Object a(Object obj) {
            ((ResponseBody) obj).close();
            return null;
        }
    }

    public final f a(Type type) {
        if (RequestBody.class.isAssignableFrom(d0.f(type))) {
            return b.f23088a;
        }
        return null;
    }

    public final f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, z zVar) {
        if (type == ResponseBody.class) {
            if (d0.i(annotationArr, w.class)) {
                return c.f23089a;
            }
            return C0308a.f23087a;
        } else if (type == Void.class) {
            return f.f23092a;
        } else {
            if (!this.f23086a || type != i.class) {
                return null;
            }
            try {
                return e.f23091a;
            } catch (NoClassDefFoundError unused) {
                this.f23086a = false;
                return null;
            }
        }
    }
}
