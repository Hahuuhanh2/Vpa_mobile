package j$.util;

import j$.util.function.C0388n;
import j$.util.function.Consumer;
import java.util.Comparator;

final class T implements C {

    /* renamed from: a  reason: collision with root package name */
    private final double[] f18365a;

    /* renamed from: b  reason: collision with root package name */
    private int f18366b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18367c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18368d;

    public T(double[] dArr, int i10, int i11, int i12) {
        this.f18365a = dArr;
        this.f18366b = i10;
        this.f18367c = i11;
        this.f18368d = i12 | 64 | 16384;
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.l(this, consumer);
    }

    public final int characteristics() {
        return this.f18368d;
    }

    /* renamed from: d */
    public final void forEachRemaining(C0388n nVar) {
        int i10;
        nVar.getClass();
        double[] dArr = this.f18365a;
        int length = dArr.length;
        int i11 = this.f18367c;
        if (length >= i11 && (i10 = this.f18366b) >= 0) {
            this.f18366b = i11;
            if (i10 < i11) {
                do {
                    nVar.accept(dArr[i10]);
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    public final long estimateSize() {
        return (long) (this.f18367c - this.f18366b);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.f(this, consumer);
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

    /* renamed from: o */
    public final boolean tryAdvance(C0388n nVar) {
        nVar.getClass();
        int i10 = this.f18366b;
        if (i10 < 0 || i10 >= this.f18367c) {
            return false;
        }
        double[] dArr = this.f18365a;
        this.f18366b = i10 + 1;
        nVar.accept(dArr[i10]);
        return true;
    }

    public final C trySplit() {
        int i10 = this.f18366b;
        int i11 = (this.f18367c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        double[] dArr = this.f18365a;
        this.f18366b = i11;
        return new T(dArr, i10, i11, this.f18368d);
    }
}
