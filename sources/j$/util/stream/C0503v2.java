package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.v2  reason: case insensitive filesystem */
final class C0503v2 extends C0487r2 {

    /* renamed from: c  reason: collision with root package name */
    private K2 f18921c;

    C0503v2(C0440f2 f2Var) {
        super(f2Var);
    }

    public final void accept(int i10) {
        this.f18921c.accept(i10);
    }

    public final void end() {
        int[] iArr = (int[]) this.f18921c.b();
        Arrays.sort(iArr);
        this.f18745a.f((long) iArr.length);
        int i10 = 0;
        if (!this.f18884b) {
            int length = iArr.length;
            while (i10 < length) {
                this.f18745a.accept(iArr[i10]);
                i10++;
            }
        } else {
            int length2 = iArr.length;
            while (i10 < length2) {
                int i11 = iArr[i10];
                if (this.f18745a.h()) {
                    break;
                }
                this.f18745a.accept(i11);
                i10++;
            }
        }
        this.f18745a.end();
    }

    public final void f(long j10) {
        if (j10 < 2147483639) {
            this.f18921c = j10 > 0 ? new K2((int) j10) : new K2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
