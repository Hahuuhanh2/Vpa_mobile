package nd;

import cd.a;

/* compiled from: AI01weightDecoder */
public abstract class h extends g {
    public h(a aVar) {
        super(aVar);
    }

    public abstract void d(int i10, StringBuilder sb2);

    public abstract int e(int i10);

    public final void f(StringBuilder sb2, int i10, int i11) {
        int c10 = this.f13573b.c(i10, i11);
        d(c10, sb2);
        int e10 = e(c10);
        int i12 = 100000;
        for (int i13 = 0; i13 < 5; i13++) {
            if (e10 / i12 == 0) {
                sb2.append('0');
            }
            i12 /= 10;
        }
        sb2.append(e10);
    }
}
