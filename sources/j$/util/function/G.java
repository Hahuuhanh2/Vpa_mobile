package j$.util.function;

import java.util.function.IntBinaryOperator;

public final /* synthetic */ class G implements IntBinaryOperator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ H f18489a;

    private /* synthetic */ G(H h10) {
        this.f18489a = h10;
    }

    public static /* synthetic */ IntBinaryOperator a(H h10) {
        if (h10 == null) {
            return null;
        }
        return h10 instanceof F ? ((F) h10).f18487a : new G(h10);
    }

    public final /* synthetic */ int applyAsInt(int i10, int i11) {
        return this.f18489a.applyAsInt(i10, i11);
    }
}
