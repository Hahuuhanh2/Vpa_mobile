package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;

final class S implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f18356a;

    /* renamed from: b  reason: collision with root package name */
    private int f18357b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18358c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18359d;

    public S(Object[] objArr, int i10, int i11, int i12) {
        this.f18356a = objArr;
        this.f18357b = i10;
        this.f18358c = i11;
        this.f18359d = i12 | 64 | 16384;
    }

    public final boolean a(Consumer consumer) {
        consumer.getClass();
        int i10 = this.f18357b;
        if (i10 < 0 || i10 >= this.f18358c) {
            return false;
        }
        Object[] objArr = this.f18356a;
        this.f18357b = i10 + 1;
        consumer.accept(objArr[i10]);
        return true;
    }

    public final int characteristics() {
        return this.f18359d;
    }

    public final long estimateSize() {
        return (long) (this.f18358c - this.f18357b);
    }

    public final void forEachRemaining(Consumer consumer) {
        int i10;
        consumer.getClass();
        Object[] objArr = this.f18356a;
        int length = objArr.length;
        int i11 = this.f18358c;
        if (length >= i11 && (i10 = this.f18357b) >= 0) {
            this.f18357b = i11;
            if (i10 < i11) {
                do {
                    consumer.accept(objArr[i10]);
                    i10++;
                } while (i10 < i11);
            }
        }
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

    public final Spliterator trySplit() {
        int i10 = this.f18357b;
        int i11 = (this.f18358c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        Object[] objArr = this.f18356a;
        this.f18357b = i11;
        return new S(objArr, i10, i11, this.f18359d);
    }
}
