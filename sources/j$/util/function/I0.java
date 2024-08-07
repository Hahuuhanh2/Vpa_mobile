package j$.util.function;

import java.util.function.Supplier;

public final /* synthetic */ class I0 implements K0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Supplier f18496a;

    private /* synthetic */ I0(Supplier supplier) {
        this.f18496a = supplier;
    }

    public static /* synthetic */ K0 a(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier instanceof J0 ? ((J0) supplier).f18499a : new I0(supplier);
    }

    public final /* synthetic */ Object get() {
        return this.f18496a.get();
    }
}
