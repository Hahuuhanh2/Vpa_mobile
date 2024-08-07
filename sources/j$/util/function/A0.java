package j$.util.function;

import java.util.function.ObjIntConsumer;

public final /* synthetic */ class A0 implements C0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ObjIntConsumer f18475a;

    private /* synthetic */ A0(ObjIntConsumer objIntConsumer) {
        this.f18475a = objIntConsumer;
    }

    public static /* synthetic */ C0 a(ObjIntConsumer objIntConsumer) {
        if (objIntConsumer == null) {
            return null;
        }
        return objIntConsumer instanceof B0 ? ((B0) objIntConsumer).f18477a : new A0(objIntConsumer);
    }

    public final /* synthetic */ void accept(Object obj, int i10) {
        this.f18475a.accept(obj, i10);
    }
}
