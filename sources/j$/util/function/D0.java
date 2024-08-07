package j$.util.function;

import java.util.function.ObjLongConsumer;

public final /* synthetic */ class D0 implements F0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ObjLongConsumer f18484a;

    private /* synthetic */ D0(ObjLongConsumer objLongConsumer) {
        this.f18484a = objLongConsumer;
    }

    public static /* synthetic */ F0 a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return objLongConsumer instanceof E0 ? ((E0) objLongConsumer).f18486a : new D0(objLongConsumer);
    }

    public final /* synthetic */ void accept(Object obj, long j10) {
        this.f18484a.accept(obj, j10);
    }
}
