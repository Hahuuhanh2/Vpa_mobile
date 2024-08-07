package o5;

/* compiled from: CachedHashCodeArrayMap */
public final class b<K, V> extends v0.b<K, V> {

    /* renamed from: p  reason: collision with root package name */
    public int f13734p;

    public final void clear() {
        this.f13734p = 0;
        super.clear();
    }

    public final int hashCode() {
        if (this.f13734p == 0) {
            this.f13734p = super.hashCode();
        }
        return this.f13734p;
    }

    public final void j(v0.b bVar) {
        this.f13734p = 0;
        super.j(bVar);
    }

    public final V k(int i10) {
        this.f13734p = 0;
        return super.k(i10);
    }

    public final V l(int i10, V v2) {
        this.f13734p = 0;
        return super.l(i10, v2);
    }

    public final V put(K k10, V v2) {
        this.f13734p = 0;
        return super.put(k10, v2);
    }
}
