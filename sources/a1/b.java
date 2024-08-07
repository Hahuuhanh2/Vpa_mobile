package a1;

import a1.d;
import java.util.ArrayList;

/* compiled from: ArrayRow */
public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public g f19a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f20b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<g> f21c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public a f22d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23e = false;

    /* compiled from: ArrayRow */
    public interface a {
        float a(g gVar, boolean z10);

        int b();

        g c(int i10);

        void clear();

        void d();

        float e(int i10);

        boolean f(g gVar);

        float g(g gVar);

        float h(b bVar, boolean z10);

        void i(g gVar, float f10, boolean z10);

        void j(g gVar, float f10);

        void k(float f10);
    }

    public b() {
    }

    public g a(boolean[] zArr) {
        return f(zArr, (g) null);
    }

    public final void b(d dVar, int i10) {
        this.f22d.j(dVar.j(i10), 1.0f);
        this.f22d.j(dVar.j(i10), -1.0f);
    }

    public final void c(g gVar, g gVar2, g gVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f20b = (float) i10;
        }
        if (!z10) {
            this.f22d.j(gVar, -1.0f);
            this.f22d.j(gVar2, 1.0f);
            this.f22d.j(gVar3, 1.0f);
            return;
        }
        this.f22d.j(gVar, 1.0f);
        this.f22d.j(gVar2, -1.0f);
        this.f22d.j(gVar3, -1.0f);
    }

    public final void d(g gVar, g gVar2, g gVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f20b = (float) i10;
        }
        if (!z10) {
            this.f22d.j(gVar, -1.0f);
            this.f22d.j(gVar2, 1.0f);
            this.f22d.j(gVar3, -1.0f);
            return;
        }
        this.f22d.j(gVar, 1.0f);
        this.f22d.j(gVar2, -1.0f);
        this.f22d.j(gVar3, 1.0f);
    }

    public boolean e() {
        if (this.f19a == null && this.f20b == 0.0f && this.f22d.b() == 0) {
            return true;
        }
        return false;
    }

    public final g f(boolean[] zArr, g gVar) {
        int i10;
        int b10 = this.f22d.b();
        g gVar2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < b10; i11++) {
            float e10 = this.f22d.e(i11);
            if (e10 < 0.0f) {
                g c10 = this.f22d.c(i11);
                if ((zArr == null || !zArr[c10.f55b]) && c10 != gVar && (((i10 = c10.f62p) == 3 || i10 == 4) && e10 < f10)) {
                    f10 = e10;
                    gVar2 = c10;
                }
            }
        }
        return gVar2;
    }

    public final void g(g gVar) {
        g gVar2 = this.f19a;
        if (gVar2 != null) {
            this.f22d.j(gVar2, -1.0f);
            this.f19a.f56c = -1;
            this.f19a = null;
        }
        float a10 = this.f22d.a(gVar, true) * -1.0f;
        this.f19a = gVar;
        if (a10 != 1.0f) {
            this.f20b /= a10;
            this.f22d.k(a10);
        }
    }

    public final void h(d dVar, g gVar, boolean z10) {
        if (gVar != null && gVar.f59f) {
            float g2 = this.f22d.g(gVar);
            this.f20b = (gVar.f58e * g2) + this.f20b;
            this.f22d.a(gVar, z10);
            if (z10) {
                gVar.c(this);
            }
            if (this.f22d.b() == 0) {
                this.f23e = true;
                dVar.f30a = true;
            }
        }
    }

    public void i(d dVar, b bVar, boolean z10) {
        float h10 = this.f22d.h(bVar, z10);
        this.f20b = (bVar.f20b * h10) + this.f20b;
        if (z10) {
            bVar.f19a.c(this);
        }
        if (this.f19a != null && this.f22d.b() == 0) {
            this.f23e = true;
            dVar.f30a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            a1.g r0 = r10.f19a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
            a1.g r1 = r10.f19a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = f0.b0.r(r0, r1)
            float r1 = r10.f20b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
            float r1 = r10.f20b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            a1.b$a r5 = r10.f22d
            int r5 = r5.b()
        L_0x003b:
            if (r3 >= r5) goto L_0x009a
            a1.b$a r6 = r10.f22d
            a1.g r6 = r6.c(r3)
            if (r6 != 0) goto L_0x0046
            goto L_0x0097
        L_0x0046:
            a1.b$a r7 = r10.f22d
            float r7 = r7.e(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0051
            goto L_0x0097
        L_0x0051:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0064
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0074
            java.lang.String r1 = "- "
            java.lang.String r0 = f0.b0.r(r0, r1)
            goto L_0x0073
        L_0x0064:
            if (r8 <= 0) goto L_0x006d
            java.lang.String r1 = " + "
            java.lang.String r0 = f0.b0.r(r0, r1)
            goto L_0x0074
        L_0x006d:
            java.lang.String r1 = " - "
            java.lang.String r0 = f0.b0.r(r0, r1)
        L_0x0073:
            float r7 = r7 * r9
        L_0x0074:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            java.lang.String r0 = f0.b0.r(r0, r6)
            goto L_0x0096
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x0096:
            r1 = r4
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x009a:
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = "0.0"
            java.lang.String r0 = f0.b0.r(r0, r1)
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b.toString():java.lang.String");
    }

    public b(c cVar) {
        this.f22d = new a(this, cVar);
    }
}
