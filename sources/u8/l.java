package u8;

import m9.b;

/* compiled from: RegularImmutableSet */
public final class l<E> extends f<E> {

    /* renamed from: p  reason: collision with root package name */
    public static final Object[] f15391p;

    /* renamed from: q  reason: collision with root package name */
    public static final l<Object> f15392q;

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f15393d;

    /* renamed from: e  reason: collision with root package name */
    public final transient int f15394e;

    /* renamed from: f  reason: collision with root package name */
    public final transient Object[] f15395f;

    /* renamed from: n  reason: collision with root package name */
    public final transient int f15396n;

    /* renamed from: o  reason: collision with root package name */
    public final transient int f15397o;

    static {
        Object[] objArr = new Object[0];
        f15391p = objArr;
        f15392q = new l(0, 0, 0, objArr, objArr);
    }

    public l(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f15393d = objArr;
        this.f15394e = i10;
        this.f15395f = objArr2;
        this.f15396n = i11;
        this.f15397o = i12;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f15395f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int Y = b.Y(obj.hashCode());
        while (true) {
            int i10 = Y & this.f15396n;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            Y = i10 + 1;
        }
    }

    public final int g(Object[] objArr) {
        System.arraycopy(this.f15393d, 0, objArr, 0, this.f15397o);
        return 0 + this.f15397o;
    }

    public final int hashCode() {
        return this.f15394e;
    }

    public final Object[] i() {
        return this.f15393d;
    }

    public final int l() {
        return this.f15397o;
    }

    public final int m() {
        return 0;
    }

    /* renamed from: n */
    public final n<E> iterator() {
        return o().listIterator(0);
    }

    public final d<E> r() {
        return d.o(this.f15397o, this.f15393d);
    }

    public final int size() {
        return this.f15397o;
    }
}
