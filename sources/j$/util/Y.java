package j$.util;

import j$.util.function.Consumer;
import j$.util.function.L;
import java.util.Comparator;

final class Y implements F {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f18369a;

    /* renamed from: b  reason: collision with root package name */
    private int f18370b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18371c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18372d;

    public Y(int[] iArr, int i10, int i11, int i12) {
        this.f18369a = iArr;
        this.f18370b = i10;
        this.f18371c = i11;
        this.f18372d = i12 | 64 | 16384;
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.m(this, consumer);
    }

    /* renamed from: c */
    public final void forEachRemaining(L l10) {
        int i10;
        l10.getClass();
        int[] iArr = this.f18369a;
        int length = iArr.length;
        int i11 = this.f18371c;
        if (length >= i11 && (i10 = this.f18370b) >= 0) {
            this.f18370b = i11;
            if (i10 < i11) {
                do {
                    l10.accept(iArr[i10]);
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    public final int characteristics() {
        return this.f18372d;
    }

    public final long estimateSize() {
        return (long) (this.f18371c - this.f18370b);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.g(this, consumer);
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

    /* renamed from: j */
    public final boolean tryAdvance(L l10) {
        l10.getClass();
        int i10 = this.f18370b;
        if (i10 < 0 || i10 >= this.f18371c) {
            return false;
        }
        int[] iArr = this.f18369a;
        this.f18370b = i10 + 1;
        l10.accept(iArr[i10]);
        return true;
    }

    public final F trySplit() {
        int i10 = this.f18370b;
        int i11 = (this.f18371c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        int[] iArr = this.f18369a;
        this.f18370b = i11;
        return new Y(iArr, i10, i11, this.f18372d);
    }
}
