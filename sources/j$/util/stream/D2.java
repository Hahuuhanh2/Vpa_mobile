package j$.util.stream;

import java.util.Arrays;

final class D2 extends C0487r2 {

    /* renamed from: c  reason: collision with root package name */
    private int[] f18595c;

    /* renamed from: d  reason: collision with root package name */
    private int f18596d;

    D2(C0440f2 f2Var) {
        super(f2Var);
    }

    public final void accept(int i10) {
        int[] iArr = this.f18595c;
        int i11 = this.f18596d;
        this.f18596d = i11 + 1;
        iArr[i11] = i10;
    }

    public final void end() {
        int i10 = 0;
        Arrays.sort(this.f18595c, 0, this.f18596d);
        this.f18745a.f((long) this.f18596d);
        if (!this.f18884b) {
            while (i10 < this.f18596d) {
                this.f18745a.accept(this.f18595c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f18596d && !this.f18745a.h()) {
                this.f18745a.accept(this.f18595c[i10]);
                i10++;
            }
        }
        this.f18745a.end();
        this.f18595c = null;
    }

    public final void f(long j10) {
        if (j10 < 2147483639) {
            this.f18595c = new int[((int) j10)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
