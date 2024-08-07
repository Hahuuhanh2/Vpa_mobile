package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0381j0;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.K0;
import java.util.List;

/* renamed from: j$.util.stream.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0413a implements K0, C0381j0, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18747a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18748b;

    public /* synthetic */ C0413a(int i10, Object obj) {
        this.f18747a = i10;
        this.f18748b = obj;
    }

    public final void accept(Object obj) {
        switch (this.f18747a) {
            case 3:
                ((C0440f2) this.f18748b).accept(obj);
                return;
            default:
                ((List) this.f18748b).add(obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18747a) {
            case 3:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final Object apply(long j10) {
        int i10 = K0.f18644l;
        return C0501v0.N0(j10, (IntFunction) this.f18748b);
    }

    public final Object get() {
        switch (this.f18747a) {
            case 0:
                return (Spliterator) this.f18748b;
            default:
                return ((C0423c) this.f18748b).E1();
        }
    }
}
