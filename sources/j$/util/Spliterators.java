package j$.util;

import java.util.Collection;
import java.util.Iterator;

public final class Spliterators {

    /* renamed from: a  reason: collision with root package name */
    private static final Spliterator f18361a = new X();

    /* renamed from: b  reason: collision with root package name */
    private static final F f18362b = new V();

    /* renamed from: c  reason: collision with root package name */
    private static final I f18363c = new W();

    /* renamed from: d  reason: collision with root package name */
    private static final C f18364d = new U();

    private static void a(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + ")");
        } else if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(i11);
        } else if (i12 > i10) {
            throw new ArrayIndexOutOfBoundsException(i12);
        }
    }

    public static C b() {
        return f18364d;
    }

    public static F c() {
        return f18362b;
    }

    public static I d() {
        return f18363c;
    }

    public static Spliterator e() {
        return f18361a;
    }

    public static C0410p f(C c10) {
        c10.getClass();
        return new Q(c10);
    }

    public static C0520t g(F f10) {
        f10.getClass();
        return new O(f10);
    }

    public static C0524x h(I i10) {
        i10.getClass();
        return new P(i10);
    }

    public static Iterator i(Spliterator spliterator) {
        spliterator.getClass();
        return new N(spliterator);
    }

    public static C j(double[] dArr, int i10, int i11) {
        dArr.getClass();
        a(dArr.length, i10, i11);
        return new T(dArr, i10, i11, 1040);
    }

    public static F k(int[] iArr, int i10, int i11) {
        iArr.getClass();
        a(iArr.length, i10, i11);
        return new Y(iArr, i10, i11, 1040);
    }

    public static I l(long[] jArr, int i10, int i11) {
        jArr.getClass();
        a(jArr.length, i10, i11);
        return new a0(jArr, i10, i11, 1040);
    }

    public static Spliterator m(Object[] objArr, int i10, int i11) {
        objArr.getClass();
        a(objArr.length, i10, i11);
        return new S(objArr, i10, i11, 1040);
    }

    public static <T> Spliterator<T> spliterator(Collection<? extends T> collection, int i10) {
        collection.getClass();
        return new Z(collection, i10);
    }
}
