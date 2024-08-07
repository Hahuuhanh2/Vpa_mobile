package b0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3858a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3859b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3860c;

    public /* synthetic */ a(int i10, Object obj, boolean z10) {
        this.f3858a = i10;
        this.f3860c = obj;
        this.f3859b = z10;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:858)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.f3858a
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0060
        L_0x0008:
            java.lang.Object r0 = r9.f3860c
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r9.f3859b
            if (r1 == 0) goto L_0x001c
            w1.x0 r1 = w1.d0.h(r0)
            if (r1 == 0) goto L_0x001c
            w1.x0$e r0 = r1.f16423a
            r0.e()
            goto L_0x002b
        L_0x001c:
            android.content.Context r1 = r0.getContext()
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r1 = k1.a.getSystemService(r1, r3)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r1.showSoftInput(r0, r2)
        L_0x002b:
            return
        L_0x002c:
            java.lang.Object r0 = r9.f3860c
            b0.c r0 = (b0.c) r0
            boolean r3 = r9.f3859b
            boolean r4 = r0.f3862a
            if (r4 != r3) goto L_0x0037
            goto L_0x005f
        L_0x0037:
            r0.f3862a = r3
            if (r3 == 0) goto L_0x004e
            boolean r3 = r0.f3863b
            if (r3 == 0) goto L_0x005f
            v.o r3 = r0.f3864c
            java.util.concurrent.Executor r4 = r3.f15757c
            v.k r5 = new v.k
            r5.<init>(r3, r2)
            r4.execute(r5)
            r0.f3863b = r1
            goto L_0x005f
        L_0x004e:
            z0.b$a<java.lang.Void> r1 = r0.f3868g
            if (r1 == 0) goto L_0x005f
            androidx.camera.core.CameraControl$OperationCanceledException r2 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r3 = "The camera control has became inactive."
            r2.<init>(r3)
            r1.b(r2)
            r1 = 0
            r0.f3868g = r1
        L_0x005f:
            return
        L_0x0060:
            java.lang.Object r0 = r9.f3860c
            ab.b r0 = (ab.b) r0
            boolean r3 = r9.f3859b
            java.lang.Object r4 = ab.b.f143m
            r0.getClass()
            java.lang.Object r4 = ab.b.f143m
            monitor-enter(r4)
            m9.d r5 = r0.f144a     // Catch:{ all -> 0x0151 }
            r5.a()     // Catch:{ all -> 0x0151 }
            android.content.Context r5 = r5.f13218a     // Catch:{ all -> 0x0151 }
            vl.d r5 = vl.d.a(r5)     // Catch:{ all -> 0x0151 }
            cb.c r6 = r0.f146c     // Catch:{ all -> 0x014a }
            cb.a r6 = r6.c()     // Catch:{ all -> 0x014a }
            if (r5 == 0) goto L_0x0084
            r5.p()     // Catch:{ all -> 0x0151 }
        L_0x0084:
            monitor-exit(r4)     // Catch:{ all -> 0x0151 }
            int r5 = r6.f()     // Catch:{ FirebaseInstallationsException -> 0x00a9 }
            r7 = 5
            if (r5 != r7) goto L_0x008e
            r5 = r2
            goto L_0x008f
        L_0x008e:
            r5 = r1
        L_0x008f:
            if (r5 != 0) goto L_0x00b1
            int r5 = r6.f()     // Catch:{ FirebaseInstallationsException -> 0x00a9 }
            r8 = 3
            if (r5 != r8) goto L_0x009a
            r5 = r2
            goto L_0x009b
        L_0x009a:
            r5 = r1
        L_0x009b:
            if (r5 == 0) goto L_0x009e
            goto L_0x00b1
        L_0x009e:
            if (r3 != 0) goto L_0x00ac
            ab.i r3 = r0.f147d     // Catch:{ FirebaseInstallationsException -> 0x00a9 }
            boolean r3 = r3.b(r6)     // Catch:{ FirebaseInstallationsException -> 0x00a9 }
            if (r3 == 0) goto L_0x0149
            goto L_0x00ac
        L_0x00a9:
            r1 = move-exception
            goto L_0x0146
        L_0x00ac:
            cb.a r3 = r0.c(r6)     // Catch:{ FirebaseInstallationsException -> 0x00a9 }
            goto L_0x00b5
        L_0x00b1:
            cb.a r3 = r0.f(r6)     // Catch:{ FirebaseInstallationsException -> 0x00a9 }
        L_0x00b5:
            monitor-enter(r4)
            m9.d r5 = r0.f144a     // Catch:{ all -> 0x0143 }
            r5.a()     // Catch:{ all -> 0x0143 }
            android.content.Context r5 = r5.f13218a     // Catch:{ all -> 0x0143 }
            vl.d r5 = vl.d.a(r5)     // Catch:{ all -> 0x0143 }
            cb.c r8 = r0.f146c     // Catch:{ all -> 0x013c }
            r8.b(r3)     // Catch:{ all -> 0x013c }
            if (r5 == 0) goto L_0x00cb
            r5.p()     // Catch:{ all -> 0x0143 }
        L_0x00cb:
            monitor-exit(r4)     // Catch:{ all -> 0x0143 }
            monitor-enter(r0)
            java.util.HashSet r4 = r0.f154k     // Catch:{ all -> 0x0139 }
            int r4 = r4.size()     // Catch:{ all -> 0x0139 }
            if (r4 == 0) goto L_0x00f5
            java.lang.String r4 = r6.f4667b     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r3.f4667b     // Catch:{ all -> 0x0139 }
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch:{ all -> 0x0139 }
            if (r4 != 0) goto L_0x00f5
            java.util.HashSet r4 = r0.f154k     // Catch:{ all -> 0x0139 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0139 }
        L_0x00e5:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0139 }
            if (r5 == 0) goto L_0x00f5
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0139 }
            bb.a r5 = (bb.a) r5     // Catch:{ all -> 0x0139 }
            r5.a()     // Catch:{ all -> 0x0139 }
            goto L_0x00e5
        L_0x00f5:
            monitor-exit(r0)
            int r4 = r3.f()
            r5 = 4
            if (r4 != r5) goto L_0x00ff
            r4 = r2
            goto L_0x0100
        L_0x00ff:
            r4 = r1
        L_0x0100:
            if (r4 == 0) goto L_0x010c
            java.lang.String r4 = r3.f4667b
            monitor-enter(r0)
            r0.f153j = r4     // Catch:{ all -> 0x0109 }
            monitor-exit(r0)
            goto L_0x010c
        L_0x0109:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x010c:
            int r4 = r3.f()
            if (r4 != r7) goto L_0x0114
            r4 = r2
            goto L_0x0115
        L_0x0114:
            r4 = r1
        L_0x0115:
            if (r4 == 0) goto L_0x0120
            com.google.firebase.installations.FirebaseInstallationsException r1 = new com.google.firebase.installations.FirebaseInstallationsException
            r1.<init>()
            r0.g(r1)
            goto L_0x0149
        L_0x0120:
            int r4 = r3.f4668c
            r5 = 2
            if (r4 == r5) goto L_0x0127
            if (r4 != r2) goto L_0x0128
        L_0x0127:
            r1 = r2
        L_0x0128:
            if (r1 == 0) goto L_0x0135
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.g(r1)
            goto L_0x0149
        L_0x0135:
            r0.h(r3)
            goto L_0x0149
        L_0x0139:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x013c:
            r0 = move-exception
            if (r5 == 0) goto L_0x0142
            r5.p()     // Catch:{ all -> 0x0143 }
        L_0x0142:
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0143 }
            throw r0
        L_0x0146:
            r0.g(r1)
        L_0x0149:
            return
        L_0x014a:
            r0 = move-exception
            if (r5 == 0) goto L_0x0150
            r5.p()     // Catch:{ all -> 0x0151 }
        L_0x0150:
            throw r0     // Catch:{ all -> 0x0151 }
        L_0x0151:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0151 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.a.run():void");
    }
}
