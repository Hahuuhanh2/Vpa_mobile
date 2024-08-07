package j$.util.concurrent;

import j$.util.C0407m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

final class k extends q implements Spliterator {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f18424i;

    /* renamed from: j  reason: collision with root package name */
    long f18425j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m[] mVarArr, int i10, int i11, int i12, long j10, int i13) {
        super(mVarArr, i10, i11, i12);
        this.f18424i = i13;
        this.f18425j = j10;
    }

    public final boolean a(Consumer consumer) {
        switch (this.f18424i) {
            case 0:
                consumer.getClass();
                m f10 = f();
                if (f10 == null) {
                    return false;
                }
                consumer.accept(f10.f18430b);
                return true;
            default:
                consumer.getClass();
                m f11 = f();
                if (f11 == null) {
                    return false;
                }
                consumer.accept(f11.f18431c);
                return true;
        }
    }

    public final int characteristics() {
        switch (this.f18424i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    public final long estimateSize() {
        switch (this.f18424i) {
            case 0:
                return this.f18425j;
            default:
                return this.f18425j;
        }
    }

    public final void forEachRemaining(Consumer consumer) {
        switch (this.f18424i) {
            case 0:
                consumer.getClass();
                while (true) {
                    m f10 = f();
                    if (f10 != null) {
                        consumer.accept(f10.f18430b);
                    } else {
                        return;
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    m f11 = f();
                    if (f11 != null) {
                        consumer.accept(f11.f18431c);
                    } else {
                        return;
                    }
                }
        }
    }

    public final Comparator getComparator() {
        switch (this.f18424i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f18424i) {
            case 0:
                return C0407m.i(this);
            default:
                return C0407m.i(this);
        }
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        switch (this.f18424i) {
            case 0:
                return C0407m.k(this, i10);
            default:
                return C0407m.k(this, i10);
        }
    }

    public final Spliterator trySplit() {
        switch (this.f18424i) {
            case 0:
                int i10 = this.f18442f;
                int i11 = this.f18443g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                m[] mVarArr = this.f18437a;
                int i13 = this.f18444h;
                this.f18443g = i12;
                long j10 = this.f18425j >>> 1;
                this.f18425j = j10;
                return new k(mVarArr, i13, i12, i11, j10, 0);
            default:
                int i14 = this.f18442f;
                int i15 = this.f18443g;
                int i16 = (i14 + i15) >>> 1;
                if (i16 <= i14) {
                    return null;
                }
                m[] mVarArr2 = this.f18437a;
                int i17 = this.f18444h;
                this.f18443g = i16;
                long j11 = this.f18425j >>> 1;
                this.f18425j = j11;
                return new k(mVarArr2, i17, i16, i15, j11, 1);
        }
    }
}
