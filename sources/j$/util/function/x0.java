package j$.util.function;

import java.util.function.ObjDoubleConsumer;

public final /* synthetic */ class x0 implements z0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ObjDoubleConsumer f18557a;

    private /* synthetic */ x0(ObjDoubleConsumer objDoubleConsumer) {
        this.f18557a = objDoubleConsumer;
    }

    public static /* synthetic */ z0 a(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return objDoubleConsumer instanceof y0 ? ((y0) objDoubleConsumer).f18559a : new x0(objDoubleConsumer);
    }

    public final /* synthetic */ void accept(Object obj, double d10) {
        this.f18557a.accept(obj, d10);
    }
}
