package j$.util.stream;

import java.util.Arrays;

final class E2 extends C0491s2 {

    /* renamed from: c  reason: collision with root package name */
    private long[] f18603c;

    /* renamed from: d  reason: collision with root package name */
    private int f18604d;

    E2(C0440f2 f2Var) {
        super(f2Var);
    }

    public final void accept(long j10) {
        long[] jArr = this.f18603c;
        int i10 = this.f18604d;
        this.f18604d = i10 + 1;
        jArr[i10] = j10;
    }

    public final void end() {
        int i10 = 0;
        Arrays.sort(this.f18603c, 0, this.f18604d);
        this.f18751a.f((long) this.f18604d);
        if (!this.f18891b) {
            while (i10 < this.f18604d) {
                this.f18751a.accept(this.f18603c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f18604d && !this.f18751a.h()) {
                this.f18751a.accept(this.f18603c[i10]);
                i10++;
            }
        }
        this.f18751a.end();
        this.f18603c = null;
    }

    public final void f(long j10) {
        if (j10 < 2147483639) {
            this.f18603c = new long[((int) j10)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
