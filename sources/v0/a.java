package v0;

import java.util.Map;

/* compiled from: ArrayMap */
public final class a extends g<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f15968d;

    public a(b bVar) {
        this.f15968d = bVar;
    }

    public final void a() {
        this.f15968d.clear();
    }

    public final Object b(int i10, int i11) {
        return this.f15968d.f16006b[(i10 << 1) + i11];
    }

    public final Map<Object, Object> c() {
        return this.f15968d;
    }

    public final int d() {
        return this.f15968d.f16007c;
    }

    public final int e(Object obj) {
        return this.f15968d.f(obj);
    }

    public final int f(Object obj) {
        return this.f15968d.h(obj);
    }

    public final void g(Object obj, Object obj2) {
        this.f15968d.put(obj, obj2);
    }

    public final void h(int i10) {
        this.f15968d.k(i10);
    }

    public final Object i(int i10, Object obj) {
        return this.f15968d.l(i10, obj);
    }
}
