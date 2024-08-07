package a1;

import a1.b;
import f0.b0;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PriorityGoalRow */
public final class f extends b {

    /* renamed from: f  reason: collision with root package name */
    public g[] f48f = new g[128];

    /* renamed from: g  reason: collision with root package name */
    public g[] f49g = new g[128];

    /* renamed from: h  reason: collision with root package name */
    public int f50h = 0;

    /* renamed from: i  reason: collision with root package name */
    public b f51i = new b();

    /* compiled from: PriorityGoalRow */
    public class a implements Comparator<g> {
        public final int compare(Object obj, Object obj2) {
            return ((g) obj).f55b - ((g) obj2).f55b;
        }
    }

    /* compiled from: PriorityGoalRow */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public g f52a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f52a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder q10 = android.support.v4.media.a.q(str);
                    q10.append(this.f52a.f61o[i10]);
                    q10.append(" ");
                    str = q10.toString();
                }
            }
            StringBuilder v2 = b0.v(str, "] ");
            v2.append(this.f52a);
            return v2.toString();
        }
    }

    public f(c cVar) {
        super(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r9 < r8) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a1.g a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0004:
            int r4 = r11.f50h
            if (r2 >= r4) goto L_0x0057
            a1.g[] r4 = r11.f48f
            r5 = r4[r2]
            int r6 = r5.f55b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            a1.f$b r6 = r11.f51i
            r6.f52a = r5
            r5 = 8
            r7 = 1
            if (r3 != r0) goto L_0x0036
        L_0x001c:
            if (r5 < 0) goto L_0x0032
            a1.g r4 = r6.f52a
            float[] r4 = r4.f61o
            r4 = r4[r5]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r5 = r5 + -1
            goto L_0x001c
        L_0x0032:
            r7 = r1
        L_0x0033:
            if (r7 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r4 = r4[r3]
        L_0x0038:
            if (r5 < 0) goto L_0x0050
            float[] r8 = r4.f61o
            r8 = r8[r5]
            a1.g r9 = r6.f52a
            float[] r9 = r9.f61o
            r9 = r9[r5]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x004b
            int r5 = r5 + -1
            goto L_0x0038
        L_0x004b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r7 = r1
        L_0x0051:
            if (r7 == 0) goto L_0x0054
        L_0x0053:
            r3 = r2
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0057:
            if (r3 != r0) goto L_0x005b
            r12 = 0
            return r12
        L_0x005b:
            a1.g[] r12 = r11.f48f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.f.a(boolean[]):a1.g");
    }

    public final boolean e() {
        if (this.f50h == 0) {
            return true;
        }
        return false;
    }

    public final void i(d dVar, b bVar, boolean z10) {
        b bVar2 = bVar;
        g gVar = bVar2.f19a;
        if (gVar != null) {
            b.a aVar = bVar2.f22d;
            int b10 = aVar.b();
            for (int i10 = 0; i10 < b10; i10++) {
                g c10 = aVar.c(i10);
                float e10 = aVar.e(i10);
                b bVar3 = this.f51i;
                bVar3.f52a = c10;
                boolean z11 = true;
                if (c10.f54a) {
                    for (int i11 = 0; i11 < 9; i11++) {
                        float[] fArr = bVar3.f52a.f61o;
                        float f10 = (gVar.f61o[i11] * e10) + fArr[i11];
                        fArr[i11] = f10;
                        if (Math.abs(f10) < 1.0E-4f) {
                            bVar3.f52a.f61o[i11] = 0.0f;
                        } else {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        f.this.k(bVar3.f52a);
                    }
                    z11 = false;
                } else {
                    for (int i12 = 0; i12 < 9; i12++) {
                        float f11 = gVar.f61o[i12];
                        if (f11 != 0.0f) {
                            float f12 = f11 * e10;
                            if (Math.abs(f12) < 1.0E-4f) {
                                f12 = 0.0f;
                            }
                            bVar3.f52a.f61o[i12] = f12;
                        } else {
                            bVar3.f52a.f61o[i12] = 0.0f;
                        }
                    }
                }
                if (z11) {
                    j(c10);
                }
                this.f20b = (bVar2.f20b * e10) + this.f20b;
            }
            k(gVar);
        }
    }

    public final void j(g gVar) {
        int i10;
        int i11 = this.f50h + 1;
        g[] gVarArr = this.f48f;
        if (i11 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.f48f = gVarArr2;
            this.f49g = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.f48f;
        int i12 = this.f50h;
        gVarArr3[i12] = gVar;
        int i13 = i12 + 1;
        this.f50h = i13;
        if (i13 > 1 && gVarArr3[i13 - 1].f55b > gVar.f55b) {
            int i14 = 0;
            while (true) {
                i10 = this.f50h;
                if (i14 >= i10) {
                    break;
                }
                this.f49g[i14] = this.f48f[i14];
                i14++;
            }
            Arrays.sort(this.f49g, 0, i10, new a());
            for (int i15 = 0; i15 < this.f50h; i15++) {
                this.f48f[i15] = this.f49g[i15];
            }
        }
        gVar.f54a = true;
        gVar.b(this);
    }

    public final void k(g gVar) {
        int i10 = 0;
        while (i10 < this.f50h) {
            if (this.f48f[i10] == gVar) {
                while (true) {
                    int i11 = this.f50h;
                    if (i10 < i11 - 1) {
                        g[] gVarArr = this.f48f;
                        int i12 = i10 + 1;
                        gVarArr[i10] = gVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f50h = i11 - 1;
                        gVar.f54a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    public final String toString() {
        StringBuilder v2 = b0.v("", " goal -> (");
        v2.append(this.f20b);
        v2.append(") : ");
        String sb2 = v2.toString();
        for (int i10 = 0; i10 < this.f50h; i10++) {
            this.f51i.f52a = this.f48f[i10];
            StringBuilder q10 = android.support.v4.media.a.q(sb2);
            q10.append(this.f51i);
            q10.append(" ");
            sb2 = q10.toString();
        }
        return sb2;
    }
}
