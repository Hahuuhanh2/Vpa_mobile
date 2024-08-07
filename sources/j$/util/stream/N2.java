package j$.util.stream;

import j$.util.C0407m;
import j$.util.L;
import java.util.Comparator;

abstract class N2 implements L {

    /* renamed from: a  reason: collision with root package name */
    int f18664a;

    /* renamed from: b  reason: collision with root package name */
    final int f18665b;

    /* renamed from: c  reason: collision with root package name */
    int f18666c;

    /* renamed from: d  reason: collision with root package name */
    final int f18667d;

    /* renamed from: e  reason: collision with root package name */
    Object f18668e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ O2 f18669f;

    static {
        Class<P2> cls = P2.class;
    }

    N2(O2 o22, int i10, int i11, int i12, int i13) {
        this.f18669f = o22;
        this.f18664a = i10;
        this.f18665b = i11;
        this.f18666c = i12;
        this.f18667d = i13;
        Object[] objArr = o22.f18672f;
        this.f18668e = objArr == null ? o22.f18671e : objArr[i10];
    }

    public final int characteristics() {
        return 16464;
    }

    public final long estimateSize() {
        int i10 = this.f18664a;
        int i11 = this.f18665b;
        if (i10 == i11) {
            return ((long) this.f18667d) - ((long) this.f18666c);
        }
        long[] jArr = this.f18669f.f18778d;
        return ((jArr[i11] + ((long) this.f18667d)) - jArr[i10]) - ((long) this.f18666c);
    }

    /* access modifiers changed from: package-private */
    public abstract void f(int i10, Object obj, Object obj2);

    /* renamed from: forEachRemaining */
    public final void d(Object obj) {
        int i10;
        obj.getClass();
        int i11 = this.f18664a;
        int i12 = this.f18665b;
        if (i11 < i12 || (i11 == i12 && this.f18666c < this.f18667d)) {
            int i13 = this.f18666c;
            while (true) {
                i10 = this.f18665b;
                if (i11 >= i10) {
                    break;
                }
                O2 o22 = this.f18669f;
                Object obj2 = o22.f18672f[i11];
                o22.r(obj2, i13, o22.s(obj2), obj);
                i13 = 0;
                i11++;
            }
            this.f18669f.r(this.f18664a == i10 ? this.f18668e : this.f18669f.f18672f[i10], i13, this.f18667d, obj);
            this.f18664a = this.f18665b;
            this.f18666c = this.f18667d;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract L g(Object obj, int i10, int i11);

    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    /* access modifiers changed from: package-private */
    public abstract L h(int i10, int i11, int i12, int i13);

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }

    /* renamed from: tryAdvance */
    public final boolean o(Object obj) {
        obj.getClass();
        int i10 = this.f18664a;
        int i11 = this.f18665b;
        if (i10 >= i11 && (i10 != i11 || this.f18666c >= this.f18667d)) {
            return false;
        }
        Object obj2 = this.f18668e;
        int i12 = this.f18666c;
        this.f18666c = i12 + 1;
        f(i12, obj2, obj);
        if (this.f18666c == this.f18669f.s(this.f18668e)) {
            this.f18666c = 0;
            int i13 = this.f18664a + 1;
            this.f18664a = i13;
            Object[] objArr = this.f18669f.f18672f;
            if (objArr != null && i13 <= this.f18665b) {
                this.f18668e = objArr[i13];
            }
        }
        return true;
    }

    public final L trySplit() {
        int i10 = this.f18664a;
        int i11 = this.f18665b;
        if (i10 < i11) {
            int i12 = this.f18666c;
            O2 o22 = this.f18669f;
            L h10 = h(i10, i11 - 1, i12, o22.s(o22.f18672f[i11 - 1]));
            int i13 = this.f18665b;
            this.f18664a = i13;
            this.f18666c = 0;
            this.f18668e = this.f18669f.f18672f[i13];
            return h10;
        } else if (i10 != i11) {
            return null;
        } else {
            int i14 = this.f18667d;
            int i15 = this.f18666c;
            int i16 = (i14 - i15) / 2;
            if (i16 == 0) {
                return null;
            }
            L g2 = g(this.f18668e, i15, i16);
            this.f18666c += i16;
            return g2;
        }
    }
}
