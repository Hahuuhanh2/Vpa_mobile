package j$.util.stream;

import j$.util.function.C0362a;
import j$.util.function.C0370e;
import j$.util.function.E;
import j$.util.function.J0;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* renamed from: j$.util.stream.l  reason: case insensitive filesystem */
public final /* synthetic */ class C0461l implements Collector {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Collector f18823a;

    private /* synthetic */ C0461l(Collector collector) {
        this.f18823a = collector;
    }

    public static /* synthetic */ Collector a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C0457k ? ((C0457k) collector).f18817a : new C0461l(collector);
    }

    public final /* synthetic */ BiConsumer accumulator() {
        return C0362a.a(this.f18823a.accumulator());
    }

    public final /* synthetic */ Set characteristics() {
        return this.f18823a.characteristics();
    }

    public final /* synthetic */ BinaryOperator combiner() {
        return C0370e.a(this.f18823a.combiner());
    }

    public final /* synthetic */ Function finisher() {
        return E.a(this.f18823a.finisher());
    }

    public final /* synthetic */ Supplier supplier() {
        return J0.a(this.f18823a.supplier());
    }
}
