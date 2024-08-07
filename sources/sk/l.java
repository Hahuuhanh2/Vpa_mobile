package sk;

/* compiled from: PackageReference.kt */
public final class l implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f22928a;

    public l(Class cls) {
        j.f(cls, "jClass");
        this.f22928a = cls;
    }

    public final Class<?> a() {
        return this.f22928a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l) || !j.a(this.f22928a, ((l) obj).f22928a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22928a.hashCode();
    }

    public final String toString() {
        return this.f22928a.toString() + " (Kotlin reflection is not available)";
    }
}
