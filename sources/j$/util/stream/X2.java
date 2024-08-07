package j$.util.stream;

import j$.util.function.C0369d0;
import j$.util.function.C0375g0;

final class X2 extends Y2 implements C0375g0 {

    /* renamed from: c  reason: collision with root package name */
    final long[] f18741c = new long[128];

    X2() {
    }

    public final void a(Object obj, long j10) {
        C0375g0 g0Var = (C0375g0) obj;
        for (int i10 = 0; ((long) i10) < j10; i10++) {
            g0Var.accept(this.f18741c[i10]);
        }
    }

    public final void accept(long j10) {
        long[] jArr = this.f18741c;
        int i10 = this.f18744b;
        this.f18744b = i10 + 1;
        jArr[i10] = j10;
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }
}
