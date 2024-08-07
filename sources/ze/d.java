package ze;

/* compiled from: BindingAdapters.kt */
public final class d {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(android.widget.ImageView r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r0 = "view"
            sk.j.f(r9, r0)
            m5.a r0 = new m5.a
            r1 = 300(0x12c, float:4.2E-43)
            r2 = 1
            r0.<init>(r1, r2)
            android.content.Context r1 = r9.getContext()
            h5.k r3 = com.bumptech.glide.b.c(r1)
            com.bumptech.glide.l r1 = r3.f(r1)
            r3 = 2131231287(0x7f080237, float:1.807865E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.getClass()
            java.lang.Class<android.graphics.drawable.Drawable> r5 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.k r6 = new com.bumptech.glide.k
            com.bumptech.glide.b r7 = r1.f4948a
            android.content.Context r8 = r1.f4949b
            r6.<init>(r7, r1, r5, r8)
            com.bumptech.glide.k r1 = r6.D(r4)
            java.lang.String r4 = "load(...)"
            sk.j.e(r1, r4)
            r5 = 0
            if (r12 == 0) goto L_0x0068
            if (r10 == 0) goto L_0x0045
            int r12 = r10.length()
            if (r12 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r12 = r5
            goto L_0x0046
        L_0x0045:
            r12 = r2
        L_0x0046:
            if (r12 != 0) goto L_0x0068
            com.vpa.daugia.di.App$a r12 = com.vpa.daugia.di.App.f19364o     // Catch:{ Exception -> 0x0063 }
            com.vpa.daugia.di.App r12 = r12.a()     // Catch:{ Exception -> 0x0063 }
            java.lang.String r12 = r12.f19366d     // Catch:{ Exception -> 0x0063 }
            y4.f r6 = new y4.f     // Catch:{ Exception -> 0x0063 }
            ze.c r7 = new ze.c     // Catch:{ Exception -> 0x0063 }
            r7.<init>(r12)     // Catch:{ Exception -> 0x0063 }
            r6.<init>(r10, r7)     // Catch:{ Exception -> 0x0063 }
            com.bumptech.glide.k r12 = r1.E(r6)     // Catch:{ Exception -> 0x0063 }
            sk.j.e(r12, r4)     // Catch:{ Exception -> 0x0063 }
            r1 = r12
            goto L_0x006f
        L_0x0063:
            r12 = move-exception
            r12.printStackTrace()
            goto L_0x006f
        L_0x0068:
            com.bumptech.glide.k r1 = r1.E(r10)
            sk.j.e(r1, r4)
        L_0x006f:
            if (r10 == 0) goto L_0x007a
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r10 = r5
            goto L_0x007b
        L_0x007a:
            r10 = r2
        L_0x007b:
            if (r10 == 0) goto L_0x00c7
            r10 = 2131231611(0x7f08037b, float:1.8079308E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.bumptech.glide.k r10 = r1.D(r10)
            k5.g r11 = new k5.g
            r11.<init>()
            com.bumptech.glide.k r10 = r10.y(r11)
            k5.a r10 = r10.r()
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            k5.a r10 = r10.l(r3)
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            k5.a r10 = r10.f(r3)
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            s4.f r11 = new s4.f
            s4.l[] r12 = new s4.l[r2]
            b5.j r1 = new b5.j
            r1.<init>()
            r12[r5] = r1
            r11.<init>(r12)
            k5.a r10 = r10.u(r11, r2)
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            com.bumptech.glide.a r11 = new com.bumptech.glide.a
            r11.<init>()
            r11.f5004a = r0
            com.bumptech.glide.k r10 = r10.G(r11)
            r10.B(r9)
            goto L_0x01c4
        L_0x00c7:
            k5.a r10 = r1.r()
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            com.bumptech.glide.a r12 = new com.bumptech.glide.a
            r12.<init>()
            r12.f5004a = r0
            com.bumptech.glide.k r10 = r10.G(r12)
            java.lang.String r12 = "transition(...)"
            sk.j.e(r10, r12)
            r12 = 2131165706(0x7f07020a, float:1.7945637E38)
            if (r11 == 0) goto L_0x0191
            int r0 = r11.hashCode()
            r1 = -1986416409(0xffffffff8999b0e7, float:-3.699977E-33)
            r4 = 2131231439(0x7f0802cf, float:1.807896E38)
            if (r0 == r1) goto L_0x0181
            r1 = 78166382(0x4a8b96e, float:3.96669E-36)
            if (r0 == r1) goto L_0x0132
            r1 = 1988079824(0x767fb0d0, float:1.29650574E33)
            if (r0 == r1) goto L_0x00fa
            goto L_0x0191
        L_0x00fa:
            java.lang.String r0 = "CIRCLE"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0191
            k5.g r11 = new k5.g
            r11.<init>()
            b5.k$c r12 = b5.k.f4026b
            b5.j r0 = new b5.j
            r0.<init>()
            k5.a r11 = r11.s(r12, r0)
            com.bumptech.glide.k r10 = r10.y(r11)
            k5.a r10 = r10.f(r4)
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            s4.f r11 = new s4.f
            s4.l[] r12 = new s4.l[r2]
            b5.j r0 = new b5.j
            r0.<init>()
            r12[r5] = r0
            r11.<init>(r12)
            k5.a r10 = r10.u(r11, r2)
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            goto L_0x01c1
        L_0x0132:
            java.lang.String r0 = "ROUND"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x013b
            goto L_0x0191
        L_0x013b:
            r11 = 2
            s4.l[] r11 = new s4.l[r11]
            b5.h r0 = new b5.h
            r0.<init>()
            r11[r5] = r0
            b5.w r0 = new b5.w
            r1 = 10
            r0.<init>(r1)
            r11[r2] = r0
            s4.f r0 = new s4.f
            r0.<init>(r11)
            k5.a r10 = r10.u(r0, r2)
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            s4.f r11 = new s4.f
            s4.l[] r0 = new s4.l[r2]
            b5.w r1 = new b5.w
            android.content.Context r4 = r9.getContext()
            android.content.res.Resources r4 = r4.getResources()
            float r12 = r4.getDimension(r12)
            int r12 = (int) r12
            r1.<init>(r12)
            r0[r5] = r1
            r11.<init>(r0)
            k5.a r10 = r10.u(r11, r2)
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            k5.a r10 = r10.l(r3)
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            goto L_0x01c1
        L_0x0181:
            java.lang.String r0 = "NORMAL"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x018a
            goto L_0x0191
        L_0x018a:
            k5.a r10 = r10.f(r4)
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            goto L_0x01c1
        L_0x0191:
            k5.g r11 = new k5.g
            r11.<init>()
            com.bumptech.glide.k r10 = r10.y(r11)
            k5.a r10 = r10.l(r3)
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
            s4.f r11 = new s4.f
            s4.l[] r0 = new s4.l[r2]
            b5.w r1 = new b5.w
            android.content.Context r3 = r9.getContext()
            android.content.res.Resources r3 = r3.getResources()
            float r12 = r3.getDimension(r12)
            int r12 = (int) r12
            r1.<init>(r12)
            r0[r5] = r1
            r11.<init>(r0)
            k5.a r10 = r10.u(r11, r2)
            com.bumptech.glide.k r10 = (com.bumptech.glide.k) r10
        L_0x01c1:
            r10.B(r9)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.d.a(android.widget.ImageView, java.lang.String, java.lang.String, boolean):void");
    }
}
