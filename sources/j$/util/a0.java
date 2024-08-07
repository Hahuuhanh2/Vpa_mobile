package j$.util;

import j$.util.function.C0375g0;
import j$.util.function.Consumer;
import java.util.Comparator;

final class a0 implements I {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f18380a;

    /* renamed from: b  reason: collision with root package name */
    private int f18381b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18382c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18383d;

    public a0(long[] jArr, int i10, int i11, int i12) {
        this.f18380a = jArr;
        this.f18381b = i10;
        this.f18382c = i11;
        this.f18383d = i12 | 64 | 16384;
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.n(this, consumer);
    }

    /* renamed from: b */
    public final void forEachRemaining(C0375g0 g0Var) {
        int i10;
        g0Var.getClass();
        long[] jArr = this.f18380a;
        int length = jArr.length;
        int i11 = this.f18382c;
        if (length >= i11 && (i10 = this.f18381b) >= 0) {
            this.f18381b = i11;
            if (i10 < i11) {
                do {
                    g0Var.accept(jArr[i10]);
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    public final int characteristics() {
        return this.f18383d;
    }

    /* renamed from: e */
    public final boolean tryAdvance(C0375g0 g0Var) {
        g0Var.getClass();
        int i10 = this.f18381b;
        if (i10 < 0 || i10 >= this.f18382c) {
            return false;
        }
        long[] jArr = this.f18380a;
        this.f18381b = i10 + 1;
        g0Var.accept(jArr[i10]);
        return true;
    }

    public final long estimateSize() {
        return (long) (this.f18382c - this.f18381b);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.h(this, consumer);
    }

    public final Comparator getComparator() {
        if (C0407m.k(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }

    public final I trySplit() {
        int i10 = this.f18381b;
        int i11 = (this.f18382c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        long[] jArr = this.f18380a;
        this.f18381b = i11;
        return new a0(jArr, i10, i11, this.f18383d);
    }
}
