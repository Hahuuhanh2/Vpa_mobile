package o5;

import android.support.v4.media.a;

/* compiled from: MultiClassKey */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f13751a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f13752b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f13753c;

    public k() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13751a.equals(kVar.f13751a) && this.f13752b.equals(kVar.f13752b) && l.b(this.f13753c, kVar.f13753c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f13752b.hashCode() + (this.f13751a.hashCode() * 31)) * 31;
        Class<?> cls = this.f13753c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("MultiClassKey{first=");
        q10.append(this.f13751a);
        q10.append(", second=");
        q10.append(this.f13752b);
        q10.append('}');
        return q10.toString();
    }

    public k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f13751a = cls;
        this.f13752b = cls2;
        this.f13753c = cls3;
    }
}
