package pd;

import java.util.EnumMap;
import java.util.Set;
import uc.j;
import x2.g;

/* compiled from: DetectionResult */
public final class f implements xd.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14163a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f14164b;

    /* renamed from: c  reason: collision with root package name */
    public Object f14165c;

    /* renamed from: d  reason: collision with root package name */
    public Object f14166d;

    /* renamed from: e  reason: collision with root package name */
    public Object f14167e;

    public f() {
    }

    public final void a(g gVar) {
        j jVar;
        j jVar2;
        int i10;
        boolean z10;
        boolean z11;
        if (gVar != null) {
            g gVar2 = (g) gVar;
            a aVar = (a) this.f14165c;
            d[] dVarArr = (d[]) gVar2.f16905c;
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    dVar.f14159e = (dVar.f14157c / 3) + ((dVar.f14158d / 30) * 3);
                }
            }
            gVar2.g(dVarArr, aVar);
            c cVar = (c) gVar2.f16904b;
            boolean z12 = gVar2.f14168d;
            if (z12) {
                jVar = cVar.f14147b;
            } else {
                jVar = cVar.f14149d;
            }
            if (z12) {
                jVar2 = cVar.f14148c;
            } else {
                jVar2 = cVar.f14150e;
            }
            int d10 = gVar2.d((int) jVar2.f15489b);
            int i11 = -1;
            int i12 = 0;
            int i13 = 1;
            for (int d11 = gVar2.d((int) jVar.f15489b); d11 < d10; d11++) {
                d dVar2 = dVarArr[d11];
                if (dVar2 != null) {
                    int i14 = dVar2.f14159e;
                    int i15 = i14 - i11;
                    if (i15 == 0) {
                        i12++;
                    } else {
                        if (i15 == 1) {
                            int max = Math.max(i13, i12);
                            i10 = dVar2.f14159e;
                            i13 = max;
                        } else if (i15 < 0 || i14 >= aVar.f14144e || i15 > d11) {
                            dVarArr[d11] = null;
                        } else {
                            if (i13 > 2) {
                                i15 *= i13 - 2;
                            }
                            if (i15 >= d11) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            for (int i16 = 1; i16 <= i15 && !z10; i16++) {
                                if (dVarArr[d11 - i16] != null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            }
                            if (z10) {
                                dVarArr[d11] = null;
                            } else {
                                i10 = dVar2.f14159e;
                            }
                        }
                        i11 = i10;
                        i12 = 1;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r10 = this;
            int r0 = r10.f14163a
            switch(r0) {
                case 0: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = super.toString()
            return r0
        L_0x000a:
            java.lang.Object r0 = r10.f14166d
            x2.g[] r0 = (x2.g[]) r0
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x0019
            int r2 = r10.f14164b
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x0019:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = r1
        L_0x001f:
            java.lang.Object r5 = r2.f16905c     // Catch:{ all -> 0x0089 }
            pd.d[] r5 = (pd.d[]) r5     // Catch:{ all -> 0x0089 }
            int r5 = r5.length     // Catch:{ all -> 0x0089 }
            if (r4 >= r5) goto L_0x0081
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0089 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0089 }
            r6[r1] = r7     // Catch:{ all -> 0x0089 }
            r0.format(r5, r6)     // Catch:{ all -> 0x0089 }
            r5 = r1
        L_0x0034:
            int r6 = r10.f14164b     // Catch:{ all -> 0x0089 }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x0077
            java.lang.Object r6 = r10.f14166d     // Catch:{ all -> 0x0089 }
            r8 = r6
            x2.g[] r8 = (x2.g[]) r8     // Catch:{ all -> 0x0089 }
            r8 = r8[r5]     // Catch:{ all -> 0x0089 }
            java.lang.String r9 = "    |   "
            if (r8 != 0) goto L_0x004b
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0089 }
            r0.format(r9, r6)     // Catch:{ all -> 0x0089 }
            goto L_0x0074
        L_0x004b:
            x2.g[] r6 = (x2.g[]) r6     // Catch:{ all -> 0x0089 }
            r6 = r6[r5]     // Catch:{ all -> 0x0089 }
            java.lang.Object r6 = r6.f16905c     // Catch:{ all -> 0x0089 }
            pd.d[] r6 = (pd.d[]) r6     // Catch:{ all -> 0x0089 }
            r6 = r6[r4]     // Catch:{ all -> 0x0089 }
            if (r6 != 0) goto L_0x005d
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0089 }
            r0.format(r9, r6)     // Catch:{ all -> 0x0089 }
            goto L_0x0074
        L_0x005d:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0089 }
            int r9 = r6.f14159e     // Catch:{ all -> 0x0089 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0089 }
            r7[r1] = r9     // Catch:{ all -> 0x0089 }
            int r6 = r6.f14158d     // Catch:{ all -> 0x0089 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0089 }
            r7[r3] = r6     // Catch:{ all -> 0x0089 }
            r0.format(r8, r7)     // Catch:{ all -> 0x0089 }
        L_0x0074:
            int r5 = r5 + 1
            goto L_0x0034
        L_0x0077:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0089 }
            r0.format(r5, r6)     // Catch:{ all -> 0x0089 }
            int r4 = r4 + 1
            goto L_0x001f
        L_0x0081:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0089 }
            r0.close()
            return r1
        L_0x0089:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0090 }
            goto L_0x0094
        L_0x0090:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0094:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.f.toString():java.lang.String");
    }

    public f(Set set, EnumMap enumMap, String str, int i10) {
        this.f14165c = set;
        this.f14166d = enumMap;
        this.f14167e = str;
        this.f14164b = i10;
    }

    public f(a aVar, c cVar) {
        this.f14165c = aVar;
        int i10 = aVar.f14140a;
        this.f14164b = i10;
        this.f14167e = cVar;
        this.f14166d = new g[(i10 + 2)];
    }
}
