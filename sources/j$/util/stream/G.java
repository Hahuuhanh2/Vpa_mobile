package j$.util.stream;

import j$.util.C0361f;
import j$.util.C0401g;
import j$.util.C0404j;
import j$.util.concurrent.u;
import j$.util.function.BiConsumer;
import j$.util.function.C0;
import j$.util.function.C0367c0;
import j$.util.function.C0381j0;
import j$.util.function.Consumer;
import j$.util.function.F0;
import j$.util.function.H;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;

public final /* synthetic */ class G implements Predicate, H, C0, BiConsumer, IntFunction, C0367c0, C0381j0, F0, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18611a;

    public /* synthetic */ G(int i10) {
        this.f18611a = i10;
    }

    public final void accept(Object obj) {
    }

    public final void accept(Object obj, int i10) {
        ((C0361f) obj).accept(i10);
    }

    public final void accept(Object obj, long j10) {
        ((C0401g) obj).accept(j10);
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f18611a) {
            case 4:
                ((C0361f) obj).a((C0361f) obj2);
                return;
            default:
                ((C0401g) obj).a((C0401g) obj2);
                return;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object apply(int i10) {
        return Integer.valueOf(i10);
    }

    public final Object apply(long j10) {
        return Long.valueOf(j10);
    }

    public final int applyAsInt(int i10, int i11) {
        switch (this.f18611a) {
            case 1:
                return Math.min(i10, i11);
            case 2:
                return i10 + i11;
            default:
                return Math.max(i10, i11);
        }
    }

    public final long applyAsLong(long j10, long j11) {
        switch (this.f18611a) {
            case 7:
                return Math.min(j10, j11);
            case 8:
                return Math.max(j10, j11);
            default:
                return j10 + j11;
        }
    }

    public final BiConsumer c(BiConsumer biConsumer) {
        switch (this.f18611a) {
            case 4:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
        }
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return ((C0404j) obj).c();
    }
}
