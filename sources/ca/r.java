package ca;

import java.lang.annotation.Annotation;

/* compiled from: Qualified */
public final class r<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? extends Annotation> f4659a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<T> f4660b;

    /* compiled from: Qualified */
    public @interface a {
    }

    public r(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f4659a = cls;
        this.f4660b = cls2;
    }

    public static <T> r<T> a(Class<T> cls) {
        return new r<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f4660b.equals(rVar.f4660b)) {
            return false;
        }
        return this.f4659a.equals(rVar.f4659a);
    }

    public final int hashCode() {
        return this.f4659a.hashCode() + (this.f4660b.hashCode() * 31);
    }

    public final String toString() {
        if (this.f4659a == a.class) {
            return this.f4660b.getName();
        }
        StringBuilder q10 = android.support.v4.media.a.q("@");
        q10.append(this.f4659a.getName());
        q10.append(" ");
        q10.append(this.f4660b.getName());
        return q10.toString();
    }
}
