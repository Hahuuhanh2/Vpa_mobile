package j$.util.stream;

import java.util.Arrays;

final class C2 extends C0484q2 {

    /* renamed from: c  reason: collision with root package name */
    private double[] f18588c;

    /* renamed from: d  reason: collision with root package name */
    private int f18589d;

    C2(C0440f2 f2Var) {
        super(f2Var);
    }

    public final void accept(double d10) {
        double[] dArr = this.f18588c;
        int i10 = this.f18589d;
        this.f18589d = i10 + 1;
        dArr[i10] = d10;
    }

    public final void end() {
        int i10 = 0;
        Arrays.sort(this.f18588c, 0, this.f18589d);
        this.f18743a.f((long) this.f18589d);
        if (!this.f18874b) {
            while (i10 < this.f18589d) {
                this.f18743a.accept(this.f18588c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f18589d && !this.f18743a.h()) {
                this.f18743a.accept(this.f18588c[i10]);
                i10++;
            }
        }
        this.f18743a.end();
        this.f18588c = null;
    }

    public final void f(long j10) {
        if (j10 < 2147483639) {
            this.f18588c = new double[((int) j10)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
