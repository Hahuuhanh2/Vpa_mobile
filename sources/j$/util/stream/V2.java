package j$.util.stream;

import j$.util.function.C0382k;
import j$.util.function.C0388n;

final class V2 extends Y2 implements C0388n {

    /* renamed from: c  reason: collision with root package name */
    final double[] f18734c = new double[128];

    V2() {
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj, long j10) {
        C0388n nVar = (C0388n) obj;
        for (int i10 = 0; ((long) i10) < j10; i10++) {
            nVar.accept(this.f18734c[i10]);
        }
    }

    public final void accept(double d10) {
        double[] dArr = this.f18734c;
        int i10 = this.f18744b;
        this.f18744b = i10 + 1;
        dArr[i10] = d10;
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }
}
