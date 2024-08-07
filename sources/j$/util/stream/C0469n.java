package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer;
import j$.util.function.C0387m0;
import j$.util.function.C0394t;
import j$.util.function.Consumer;
import j$.util.function.K0;
import j$.util.function.P;
import j$.util.function.Predicate;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: j$.util.stream.n  reason: case insensitive filesystem */
public final /* synthetic */ class C0469n implements Consumer, K0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18838a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18839b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f18840c;

    public /* synthetic */ C0469n(int i10, Object obj, Object obj2) {
        this.f18838a = i10;
        this.f18839b = obj;
        this.f18840c = obj2;
    }

    public final void accept(Object obj) {
        switch (this.f18838a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18839b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f18840c;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) this.f18839b).accept(this.f18840c, obj);
                return;
            default:
                ((C0422b3) this.f18839b).i((Consumer) this.f18840c, obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18838a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            case 5:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final Object get() {
        switch (this.f18838a) {
            case 1:
                return new C0474o0((P) this.f18840c, (C0489s0) this.f18839b);
            case 2:
                return new C0470n0((Predicate) this.f18840c, (C0489s0) this.f18839b);
            case 3:
                return new C0482q0((C0394t) this.f18840c, (C0489s0) this.f18839b);
            default:
                return new C0478p0((C0387m0) this.f18840c, (C0489s0) this.f18839b);
        }
    }
}
