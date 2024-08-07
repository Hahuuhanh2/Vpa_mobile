package j$.util.stream;

import j$.util.function.I;
import j$.util.function.L;

final class W2 extends Y2 implements L {

    /* renamed from: c  reason: collision with root package name */
    final int[] f18737c = new int[128];

    W2() {
    }

    public final void a(Object obj, long j10) {
        L l10 = (L) obj;
        for (int i10 = 0; ((long) i10) < j10; i10++) {
            l10.accept(this.f18737c[i10]);
        }
    }

    public final void accept(int i10) {
        int[] iArr = this.f18737c;
        int i11 = this.f18744b;
        this.f18744b = i11 + 1;
        iArr[i11] = i10;
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }
}
