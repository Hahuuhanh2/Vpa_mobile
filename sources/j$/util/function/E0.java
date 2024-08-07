package j$.util.function;

import java.util.function.ObjLongConsumer;

public final /* synthetic */ class E0 implements ObjLongConsumer {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ F0 f18486a;

    private /* synthetic */ E0(F0 f02) {
        this.f18486a = f02;
    }

    public static /* synthetic */ ObjLongConsumer a(F0 f02) {
        if (f02 == null) {
            return null;
        }
        return f02 instanceof D0 ? ((D0) f02).f18484a : new E0(f02);
    }

    public final /* synthetic */ void accept(Object obj, long j10) {
        this.f18486a.accept(obj, j10);
    }
}
