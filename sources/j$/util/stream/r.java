package j$.util.stream;

import j$.util.concurrent.u;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0372f;
import j$.util.function.Function;

public final /* synthetic */ class r implements C0372f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18880a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BiConsumer f18881b;

    public /* synthetic */ r(BiConsumer biConsumer, int i10) {
        this.f18880a = i10;
        this.f18881b = biConsumer;
    }

    public final BiFunction a(Function function) {
        switch (this.f18880a) {
            case 0:
                function.getClass();
                return new u(this, function);
            case 1:
                function.getClass();
                return new u(this, function);
            default:
                function.getClass();
                return new u(this, function);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        switch (this.f18880a) {
            case 0:
                this.f18881b.accept(obj, obj2);
                return obj;
            case 1:
                BiConsumer biConsumer = this.f18881b;
                int i10 = C0429d0.f18774s;
                biConsumer.accept(obj, obj2);
                return obj;
            default:
                BiConsumer biConsumer2 = this.f18881b;
                int i11 = C0454j0.f18811s;
                biConsumer2.accept(obj, obj2);
                return obj;
        }
    }
}
