package gc;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: TypeToken */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super T> f10437a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f10438b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10439c;

    public a() {
        Class<a> cls = a.class;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == cls) {
                Type a10 = dc.a.a(parameterizedType.getActualTypeArguments()[0]);
                this.f10438b = a10;
                this.f10437a = dc.a.e(a10);
                this.f10439c = a10.hashCode();
                return;
            }
        } else if (genericSuperclass == cls) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a) || !dc.a.c(this.f10438b, ((a) obj).f10438b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10439c;
    }

    public final String toString() {
        return dc.a.h(this.f10438b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a10 = dc.a.a(type);
        this.f10438b = a10;
        this.f10437a = dc.a.e(a10);
        this.f10439c = a10.hashCode();
    }
}
