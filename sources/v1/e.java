package v1;

/* compiled from: Pools */
public final class e<T> extends a1.e {

    /* renamed from: d  reason: collision with root package name */
    public final Object f16014d = new Object();

    public e(int i10) {
        super(i10, 1);
    }

    public final boolean a(T t10) {
        boolean a10;
        synchronized (this.f16014d) {
            a10 = super.a(t10);
        }
        return a10;
    }

    public final T b() {
        T b10;
        synchronized (this.f16014d) {
            b10 = super.b();
        }
        return b10;
    }
}
