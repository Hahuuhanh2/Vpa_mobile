package sa;

import android.support.v4.media.a;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* compiled from: FieldDescriptor */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f14700a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f14701b;

    public b(String str, Map<Class<?>, Object> map) {
        this.f14700a = str;
        this.f14701b = map;
    }

    public static b b(String str) {
        return new b(str, Collections.emptyMap());
    }

    public final <T extends Annotation> T a(Class<T> cls) {
        return (Annotation) this.f14701b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f14700a.equals(bVar.f14700a) || !this.f14701b.equals(bVar.f14701b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14701b.hashCode() + (this.f14700a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("FieldDescriptor{name=");
        q10.append(this.f14700a);
        q10.append(", properties=");
        q10.append(this.f14701b.values());
        q10.append("}");
        return q10.toString();
    }
}
