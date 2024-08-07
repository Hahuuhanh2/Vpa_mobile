package j$.util.function;

import java.util.function.Supplier;

public final /* synthetic */ class J0 implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ K0 f18499a;

    private /* synthetic */ J0(K0 k02) {
        this.f18499a = k02;
    }

    public static /* synthetic */ Supplier a(K0 k02) {
        if (k02 == null) {
            return null;
        }
        return k02 instanceof I0 ? ((I0) k02).f18496a : new J0(k02);
    }

    public final /* synthetic */ Object get() {
        return this.f18499a.get();
    }
}
