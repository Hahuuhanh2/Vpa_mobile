package j$.util.stream;

import j$.util.L;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* renamed from: j$.util.stream.j1  reason: case insensitive filesystem */
class C0455j1 implements C0 {

    /* renamed from: a  reason: collision with root package name */
    final long[] f18812a;

    /* renamed from: b  reason: collision with root package name */
    int f18813b;

    C0455j1(long j10) {
        if (j10 < 2147483639) {
            this.f18812a = new long[((int) j10)];
            this.f18813b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C0455j1(long[] jArr) {
        this.f18812a = jArr;
        this.f18813b = jArr.length;
    }

    public final D0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final Object b() {
        long[] jArr = this.f18812a;
        int length = jArr.length;
        int i10 = this.f18813b;
        return length == i10 ? jArr : Arrays.copyOf(jArr, i10);
    }

    public final void c(int i10, Object obj) {
        System.arraycopy(this.f18812a, 0, (long[]) obj, i10, this.f18813b);
    }

    public final long count() {
        return (long) this.f18813b;
    }

    public final void d(Object obj) {
        C0375g0 g0Var = (C0375g0) obj;
        for (int i10 = 0; i10 < this.f18813b; i10++) {
            g0Var.accept(this.f18812a[i10]);
        }
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C0501v0.C0(this, consumer);
    }

    public final /* synthetic */ int j() {
        return 0;
    }

    /* renamed from: m */
    public final /* synthetic */ void e(Long[] lArr, int i10) {
        C0501v0.z0(this, lArr, i10);
    }

    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return C0501v0.w0(this, intFunction);
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.F0(this, j10, j11);
    }

    public final L spliterator() {
        return Spliterators.l(this.f18812a, 0, this.f18813b);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m42spliterator() {
        return Spliterators.l(this.f18812a, 0, this.f18813b);
    }

    public String toString() {
        return String.format("LongArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f18812a.length - this.f18813b), Arrays.toString(this.f18812a)});
    }
}
