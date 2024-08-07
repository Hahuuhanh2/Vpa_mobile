package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.u2  reason: case insensitive filesystem */
final class C0499u2 extends C0484q2 {

    /* renamed from: c  reason: collision with root package name */
    private I2 f18907c;

    C0499u2(C0440f2 f2Var) {
        super(f2Var);
    }

    public final void accept(double d10) {
        this.f18907c.accept(d10);
    }

    public final void end() {
        double[] dArr = (double[]) this.f18907c.b();
        Arrays.sort(dArr);
        this.f18743a.f((long) dArr.length);
        int i10 = 0;
        if (!this.f18874b) {
            int length = dArr.length;
            while (i10 < length) {
                this.f18743a.accept(dArr[i10]);
                i10++;
            }
        } else {
            int length2 = dArr.length;
            while (i10 < length2) {
                double d10 = dArr[i10];
                if (this.f18743a.h()) {
                    break;
                }
                this.f18743a.accept(d10);
                i10++;
            }
        }
        this.f18743a.end();
    }

    public final void f(long j10) {
        if (j10 < 2147483639) {
            this.f18907c = j10 > 0 ? new I2((int) j10) : new I2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
