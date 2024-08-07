package ij;

/* compiled from: DoubleCheck */
public final class a<T> implements dk.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f20641c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile dk.a<T> f20642a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f20643b = f20641c;

    public a(dk.a<T> aVar) {
        this.f20642a = aVar;
    }

    public static <P extends dk.a<T>, T> dk.a<T> a(P p10) {
        if (p10 instanceof a) {
            return p10;
        }
        return new a(p10);
    }

    public static void b(Object obj, Object obj2) {
        boolean z10;
        if (obj != f20641c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
    }

    public final T get() {
        T t10 = this.f20643b;
        T t11 = f20641c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f20643b;
                if (t10 == t11) {
                    t10 = this.f20642a.get();
                    b(this.f20643b, t10);
                    this.f20643b = t10;
                    this.f20642a = null;
                }
            }
        }
        return t10;
    }
}
