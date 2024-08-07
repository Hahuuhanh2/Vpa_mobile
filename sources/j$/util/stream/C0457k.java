package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0368d;
import j$.util.function.C0372f;
import j$.util.function.Function;
import j$.util.function.I0;
import j$.util.function.K0;
import java.util.Set;
import java.util.stream.Collector;

/* renamed from: j$.util.stream.k  reason: case insensitive filesystem */
public final /* synthetic */ class C0457k implements Collector {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Collector f18817a;

    private /* synthetic */ C0457k(Collector collector) {
        this.f18817a = collector;
    }

    public static /* synthetic */ Collector a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C0461l ? ((C0461l) collector).f18823a : new C0457k(collector);
    }

    public final /* synthetic */ BiConsumer accumulator() {
        return BiConsumer.VivifiedWrapper.convert(this.f18817a.accumulator());
    }

    public final /* synthetic */ Set characteristics() {
        return this.f18817a.characteristics();
    }

    public final /* synthetic */ C0372f combiner() {
        return C0368d.b(this.f18817a.combiner());
    }

    public final /* synthetic */ Function finisher() {
        return Function.VivifiedWrapper.convert(this.f18817a.finisher());
    }

    public final /* synthetic */ K0 supplier() {
        return I0.a(this.f18817a.supplier());
    }
}
