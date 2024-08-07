package j$.util.function;

import java.util.function.IntConsumer;

public final /* synthetic */ class K implements IntConsumer {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ L f18500a;

    private /* synthetic */ K(L l10) {
        this.f18500a = l10;
    }

    public static /* synthetic */ IntConsumer a(L l10) {
        if (l10 == null) {
            return null;
        }
        return l10 instanceof J ? ((J) l10).f18498a : new K(l10);
    }

    public final /* synthetic */ void accept(int i10) {
        this.f18500a.accept(i10);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return a(this.f18500a.n(J.a(intConsumer)));
    }
}
