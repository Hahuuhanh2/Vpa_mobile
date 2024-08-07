package j$.util.stream;

import j$.util.C0360e;
import j$.util.C0361f;
import j$.util.C0401g;
import j$.util.C0403i;
import j$.util.C0405k;
import j$.util.Optional;
import j$.util.concurrent.u;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0372f;
import j$.util.function.C0380j;
import j$.util.function.C0381j0;
import j$.util.function.C0392q;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.K0;
import j$.util.function.Predicate;
import j$.util.function.ToLongFunction;
import j$.util.function.z0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public final /* synthetic */ class J0 implements C0372f, C0381j0, IntFunction, ToLongFunction, Consumer, K0, BiConsumer, C0380j, C0392q, z0, Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18639a;

    public /* synthetic */ J0(int i10) {
        this.f18639a = i10;
    }

    public final BiFunction a(Function function) {
        switch (this.f18639a) {
            case 0:
                function.getClass();
                return new u(this, function);
            case 2:
                function.getClass();
                return new u(this, function);
            case 4:
                function.getClass();
                return new u(this, function);
            default:
                function.getClass();
                return new u(this, function);
        }
    }

    public final void accept(Object obj) {
    }

    public final void accept(Object obj, double d10) {
        ((C0360e) obj).accept(d10);
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f18639a) {
            case 17:
                ((List) obj).add(obj2);
                return;
            case 20:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 21:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            default:
                ((C0360e) obj).a((C0360e) obj2);
                return;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f18639a) {
            case 27:
                return Predicate.CC.$default$and(this, predicate);
            case 28:
                return Predicate.CC.$default$and(this, predicate);
            default:
                return Predicate.CC.$default$and(this, predicate);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18639a) {
            case 12:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final Object apply(double d10) {
        return Double.valueOf(d10);
    }

    public final Object apply(int i10) {
        switch (this.f18639a) {
            case 6:
                int i11 = X1.f18740s;
                return new Object[i10];
            case 8:
                return new Object[i10];
            case 9:
                int i12 = C0456j2.f18814v;
                return new Integer[i10];
            case 10:
                int i13 = C0464l2.f18825v;
                return new Long[i10];
            default:
                int i14 = C0472n2.f18844v;
                return new Double[i10];
        }
    }

    public final Object apply(long j10) {
        switch (this.f18639a) {
            case 1:
                return C0501v0.f1(j10);
            default:
                return C0501v0.h1(j10);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        switch (this.f18639a) {
            case 0:
                return new M0((A0) obj, (A0) obj2);
            case 2:
                return new N0((B0) obj, (B0) obj2);
            case 4:
                return new O0((C0) obj, (C0) obj2);
            default:
                return new Q0((E0) obj, (E0) obj2);
        }
    }

    public final double applyAsDouble(double d10, double d11) {
        switch (this.f18639a) {
            case 22:
                return Math.min(d10, d11);
            default:
                return Math.max(d10, d11);
        }
    }

    public final long applyAsLong(Object obj) {
        int i10 = X1.f18740s;
        return 1;
    }

    public final BiConsumer c(BiConsumer biConsumer) {
        switch (this.f18639a) {
            case 17:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
            case 20:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
            case 21:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
        }
    }

    public final Object get() {
        switch (this.f18639a) {
            case 14:
                return new C0360e();
            case 15:
                return new C0361f();
            case 16:
                return new ArrayList();
            case 18:
                return new C0401g();
            default:
                return new LinkedHashSet();
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f18639a) {
            case 27:
                return Predicate.CC.$default$negate(this);
            case 28:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f18639a) {
            case 27:
                return Predicate.CC.$default$or(this, predicate);
            case 28:
                return Predicate.CC.$default$or(this, predicate);
            default:
                return Predicate.CC.$default$or(this, predicate);
        }
    }

    public final boolean test(Object obj) {
        switch (this.f18639a) {
            case 27:
                return ((C0403i) obj).c();
            case 28:
                return ((C0405k) obj).c();
            default:
                return ((Optional) obj).c();
        }
    }
}
