package j$.util.function;

import java.util.function.IntConsumer;

public final /* synthetic */ class J implements L {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IntConsumer f18498a;

    private /* synthetic */ J(IntConsumer intConsumer) {
        this.f18498a = intConsumer;
    }

    public static /* synthetic */ L a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof K ? ((K) intConsumer).f18500a : new J(intConsumer);
    }

    public final /* synthetic */ void accept(int i10) {
        this.f18498a.accept(i10);
    }

    public final /* synthetic */ L n(L l10) {
        return a(this.f18498a.andThen(K.a(l10)));
    }
}
