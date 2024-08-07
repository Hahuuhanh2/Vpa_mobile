package j$.util;

import j$.util.Comparator;
import j$.util.Map;
import j$.util.function.C0375g0;
import j$.util.function.C0388n;
import j$.util.function.Consumer;
import j$.util.function.L;
import java.util.Comparator;
import java.util.Map;

/* renamed from: j$.util.m  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0407m {
    public static void f(C c10, Consumer consumer) {
        if (consumer instanceof C0388n) {
            c10.d((C0388n) consumer);
        } else if (!c0.f18388a) {
            consumer.getClass();
            c10.d(new C0406l(consumer));
        } else {
            c0.a(c10.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        }
    }

    public static void g(F f10, Consumer consumer) {
        if (consumer instanceof L) {
            f10.c((L) consumer);
        } else if (!c0.f18388a) {
            consumer.getClass();
            f10.c(new C0411q(consumer));
        } else {
            c0.a(f10.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        }
    }

    public static void h(I i10, Consumer consumer) {
        if (consumer instanceof C0375g0) {
            i10.b((C0375g0) consumer);
        } else if (!c0.f18388a) {
            consumer.getClass();
            i10.b(new C0521u(consumer));
        } else {
            c0.a(i10.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        }
    }

    public static long i(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1;
        }
        return spliterator.estimateSize();
    }

    public static boolean k(Spliterator spliterator, int i10) {
        return (spliterator.characteristics() & i10) == i10;
    }

    public static boolean l(C c10, Consumer consumer) {
        if (consumer instanceof C0388n) {
            return c10.o((C0388n) consumer);
        }
        if (!c0.f18388a) {
            consumer.getClass();
            return c10.o(new C0406l(consumer));
        }
        c0.a(c10.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    public static boolean m(F f10, Consumer consumer) {
        if (consumer instanceof L) {
            return f10.j((L) consumer);
        }
        if (!c0.f18388a) {
            consumer.getClass();
            return f10.j(new C0411q(consumer));
        }
        c0.a(f10.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    public static boolean n(I i10, Consumer consumer) {
        if (consumer instanceof C0375g0) {
            return i10.e((C0375g0) consumer);
        }
        if (!c0.f18388a) {
            consumer.getClass();
            return i10.e(new C0521u(consumer));
        }
        c0.a(i10.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    public static boolean p(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static /* synthetic */ Object q(Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public static /* synthetic */ Comparator r(Comparator comparator, Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
