package f2;

/* compiled from: SingleProcessDataStore.kt */
public final class b<T> extends a0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f9774a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9775b;

    public b(T t10, int i10) {
        this.f9774a = t10;
        this.f9775b = i10;
    }

    public final void a() {
        int i10;
        T t10 = this.f9774a;
        boolean z10 = false;
        if (t10 != null) {
            i10 = t10.hashCode();
        } else {
            i10 = 0;
        }
        if (i10 == this.f9775b) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
