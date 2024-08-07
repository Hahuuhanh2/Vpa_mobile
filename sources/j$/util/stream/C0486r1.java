package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* renamed from: j$.util.stream.r1  reason: case insensitive filesystem */
final class C0486r1 extends P2 implements E0, C0517z0 {
    C0486r1() {
    }

    public final E0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public final /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final void accept(Object obj) {
        super.accept(obj);
    }

    public final E0 build() {
        return this;
    }

    public final void e(Object[] objArr, int i10) {
        long j10 = (long) i10;
        long count = count() + j10;
        if (count > ((long) objArr.length) || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f18777c == 0) {
            System.arraycopy(this.f18675e, 0, objArr, i10, this.f18776b);
        } else {
            for (int i11 = 0; i11 < this.f18777c; i11++) {
                Object[] objArr2 = this.f18676f[i11];
                System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
                i10 += this.f18676f[i11].length;
            }
            int i12 = this.f18776b;
            if (i12 > 0) {
                System.arraycopy(this.f18675e, 0, objArr, i10, i12);
            }
        }
    }

    public final void end() {
    }

    public final void f(long j10) {
        clear();
        r(j10);
    }

    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final /* synthetic */ int j() {
        return 0;
    }

    public final Object[] o(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            e(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.G0(this, j10, j11, intFunction);
    }

    public final Spliterator spliterator() {
        return super.spliterator();
    }
}
