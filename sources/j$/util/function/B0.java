package j$.util.function;

import java.util.function.ObjIntConsumer;

public final /* synthetic */ class B0 implements ObjIntConsumer {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0 f18477a;

    private /* synthetic */ B0(C0 c02) {
        this.f18477a = c02;
    }

    public static /* synthetic */ ObjIntConsumer a(C0 c02) {
        if (c02 == null) {
            return null;
        }
        return c02 instanceof A0 ? ((A0) c02).f18475a : new B0(c02);
    }

    public final /* synthetic */ void accept(Object obj, int i10) {
        this.f18477a.accept(obj, i10);
    }
}
