package q;

import r2.q;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14186a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f14187b;

    public /* synthetic */ g(j jVar, int i10) {
        this.f14186a = i10;
        this.f14187b = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a7, code lost:
        if (r9 != false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f14186a
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x00dc
        L_0x0008:
            q.j r0 = r8.f14187b
            q.d r9 = (q.d) r9
            int r2 = q.j.f14193g0
            r0.getClass()
            if (r9 == 0) goto L_0x00db
            int r2 = r9.f14178a
            java.lang.CharSequence r9 = r9.f14179b
            r3 = 1
            switch(r2) {
                case 1: goto L_0x001d;
                case 2: goto L_0x001d;
                case 3: goto L_0x001d;
                case 4: goto L_0x001d;
                case 5: goto L_0x001d;
                case 6: goto L_0x001b;
                case 7: goto L_0x001d;
                case 8: goto L_0x001d;
                case 9: goto L_0x001d;
                case 10: goto L_0x001d;
                case 11: goto L_0x001d;
                case 12: goto L_0x001d;
                case 13: goto L_0x001d;
                case 14: goto L_0x001d;
                case 15: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r4 = r1
            goto L_0x001e
        L_0x001d:
            r4 = r3
        L_0x001e:
            if (r4 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r2 = 8
        L_0x0023:
            android.content.Context r4 = r0.r()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r5 >= r6) goto L_0x005b
            r6 = 7
            if (r2 == r6) goto L_0x0037
            r6 = 9
            if (r2 != r6) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r6 = r1
            goto L_0x0038
        L_0x0037:
            r6 = r3
        L_0x0038:
            if (r6 == 0) goto L_0x005b
            if (r4 == 0) goto L_0x005b
            android.app.KeyguardManager r4 = q.v.a(r4)
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x0048
        L_0x0044:
            boolean r4 = q.v.b(r4)
        L_0x0048:
            if (r4 == 0) goto L_0x005b
            q.n r4 = r0.f14194e0
            int r4 = r4.d()
            boolean r4 = q.c.a(r4)
            if (r4 == 0) goto L_0x005b
            r0.n0()
            goto L_0x00d5
        L_0x005b:
            boolean r4 = r0.m0()
            if (r4 == 0) goto L_0x00b5
            if (r9 == 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            android.content.Context r9 = r0.r()
            java.lang.String r9 = j7.a.G(r9, r2)
        L_0x006c:
            r4 = 5
            if (r2 != r4) goto L_0x007f
            q.n r1 = r0.f14194e0
            int r1 = r1.f14232l
            if (r1 == 0) goto L_0x0078
            r3 = 3
            if (r1 != r3) goto L_0x007b
        L_0x0078:
            r0.p0(r2, r9)
        L_0x007b:
            r0.j0()
            goto L_0x00d5
        L_0x007f:
            q.n r4 = r0.f14194e0
            boolean r4 = r4.f14244x
            if (r4 == 0) goto L_0x0089
            r0.o0(r2, r9)
            goto L_0x00b0
        L_0x0089:
            r0.r0(r9)
            android.os.Handler r4 = r0.f14195f0
            q.i r6 = new q.i
            r6.<init>(r0, r2, r9)
            android.content.Context r9 = r0.r()
            if (r9 == 0) goto L_0x00aa
            java.lang.String r2 = android.os.Build.MODEL
            r7 = 28
            if (r5 == r7) goto L_0x00a1
            r9 = r1
            goto L_0x00a7
        L_0x00a1:
            int r5 = androidx.biometric.R$array.hide_fingerprint_instantly_prefixes
            boolean r9 = q.q.b(r5, r9, r2)
        L_0x00a7:
            if (r9 == 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r1 = 2000(0x7d0, float:2.803E-42)
        L_0x00ac:
            long r1 = (long) r1
            r4.postDelayed(r6, r1)
        L_0x00b0:
            q.n r9 = r0.f14194e0
            r9.f14244x = r3
            goto L_0x00d5
        L_0x00b5:
            if (r9 == 0) goto L_0x00b8
            goto L_0x00d2
        L_0x00b8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r1 = androidx.biometric.R$string.default_error_msg
            java.lang.String r1 = r0.x(r1)
            r9.append(r1)
            java.lang.String r1 = " "
            r9.append(r1)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
        L_0x00d2:
            r0.o0(r2, r9)
        L_0x00d5:
            q.n r9 = r0.f14194e0
            r0 = 0
            r9.f(r0)
        L_0x00db:
            return
        L_0x00dc:
            q.j r0 = r8.f14187b
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            int r2 = q.j.f14193g0
            r0.getClass()
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0112
            boolean r9 = r0.l0()
            if (r9 == 0) goto L_0x00f5
            r0.n0()
            goto L_0x010d
        L_0x00f5:
            q.n r9 = r0.f14194e0
            java.lang.CharSequence r9 = r9.e()
            if (r9 == 0) goto L_0x00fe
            goto L_0x0104
        L_0x00fe:
            int r9 = androidx.biometric.R$string.default_error_msg
            java.lang.String r9 = r0.x(r9)
        L_0x0104:
            r2 = 13
            r0.o0(r2, r9)
            r9 = 2
            r0.i0(r9)
        L_0x010d:
            q.n r9 = r0.f14194e0
            r9.i(r1)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.g.b(java.lang.Object):void");
    }
}
