package h6;

/* compiled from: DoubleCheck */
public final class a<T> implements dk.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f10606c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile dk.a<T> f10607a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f10608b = f10606c;

    public a(b bVar) {
        this.f10607a = bVar;
    }

    public static dk.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        return new a(bVar);
    }

    public static void b(Object obj, Object obj2) {
        boolean z10;
        if (obj != f10606c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
    }

    public final T get() {
        T t10 = this.f10608b;
        T t11 = f10606c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f10608b;
                if (t10 == t11) {
                    t10 = this.f10607a.get();
                    b(this.f10608b, t10);
                    this.f10608b = t10;
                    this.f10607a = null;
                }
            }
        }
        return t10;
    }
}
