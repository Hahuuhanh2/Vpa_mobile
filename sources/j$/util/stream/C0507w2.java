package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.w2  reason: case insensitive filesystem */
final class C0507w2 extends C0491s2 {

    /* renamed from: c  reason: collision with root package name */
    private M2 f18928c;

    C0507w2(C0440f2 f2Var) {
        super(f2Var);
    }

    public final void accept(long j10) {
        this.f18928c.accept(j10);
    }

    public final void end() {
        long[] jArr = (long[]) this.f18928c.b();
        Arrays.sort(jArr);
        this.f18751a.f((long) jArr.length);
        int i10 = 0;
        if (!this.f18891b) {
            int length = jArr.length;
            while (i10 < length) {
                this.f18751a.accept(jArr[i10]);
                i10++;
            }
        } else {
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                if (this.f18751a.h()) {
                    break;
                }
                this.f18751a.accept(j10);
                i10++;
            }
        }
        this.f18751a.end();
    }

    public final void f(long j10) {
        if (j10 < 2147483639) {
            this.f18928c = j10 > 0 ? new M2((int) j10) : new M2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
