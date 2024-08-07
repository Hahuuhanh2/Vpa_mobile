package b0;

import c0.d1;
import c0.u;
import com.google.android.gms.tasks.Continuation;
import f6.s;
import i0.d;
import i0.f;
import java.util.concurrent.atomic.AtomicReference;
import l6.j;
import n6.a;
import q0.f;
import z0.b;
import za.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements b.c, a.C0164a, a.C0251a, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3871a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3872b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3873c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f3871a = i10;
        this.f3872b = obj;
        this.f3873c = obj2;
    }

    public final Object d() {
        return ((j) this.f3872b).f12745c.z0((s) this.f3873c);
    }

    public final String e(b.a aVar) {
        switch (this.f3871a) {
            case 1:
                int i10 = d1.f4212m;
                ((AtomicReference) this.f3872b).set(aVar);
                return ((String) this.f3873c) + "-cancellation";
            case 2:
                d1 d1Var = (d1) this.f3872b;
                int i11 = d1.f4212m;
                d1Var.getClass();
                ((AtomicReference) this.f3873c).set(aVar);
                return "SurfaceRequest-surface-recreation(" + d1Var.hashCode() + ")";
            default:
                f fVar = (f) this.f3872b;
                u uVar = (u) this.f3873c;
                synchronized (fVar.f14280a) {
                    d d10 = d.a(fVar.f14282c).d(new q0.d(uVar), j7.a.x());
                    q0.e eVar = new q0.e(uVar, aVar);
                    d10.b(new f.b(d10, eVar), j7.a.x());
                }
                return "ProcessCameraProvider-initializeCameraX";
        }
    }

    public final void f(za.b bVar) {
        ((a.C0251a) this.f3872b).f(bVar);
        ((a.C0251a) this.f3873c).f(bVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final java.lang.Object then(com.google.android.gms.tasks.Task r13) {
        /*
            r12 = this;
            int r0 = r12.f3871a
            switch(r0) {
                case 6: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0019
        L_0x0006:
            java.lang.Object r0 = r12.f3872b
            fb.u r0 = (fb.u) r0
            java.lang.Object r1 = r12.f3873c
            java.lang.String r1 = (java.lang.String) r1
            monitor-enter(r0)
            v0.b r2 = r0.f10166b     // Catch:{ all -> 0x0016 }
            r2.remove(r1)     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r13
        L_0x0016:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r13
        L_0x0019:
            java.lang.Object r13 = r12.f3872b
            com.google.firebase.remoteconfig.internal.d r13 = (com.google.firebase.remoteconfig.internal.d) r13
            java.lang.Object r0 = r12.f3873c
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0
            int[] r1 = com.google.firebase.remoteconfig.internal.d.f7708p
            r13.getClass()
            r1 = 403(0x193, float:5.65E-43)
            r2 = 0
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 1
            r5 = 0
            boolean r6 = r0.isSuccessful()     // Catch:{ IOException -> 0x0130, all -> 0x00d0 }
            if (r6 == 0) goto L_0x00c6
            monitor-enter(r13)     // Catch:{ IOException -> 0x0130, all -> 0x00d0 }
            r13.f7711b = r4     // Catch:{ all -> 0x00c3 }
            monitor-exit(r13)     // Catch:{ IOException -> 0x0130, all -> 0x00d0 }
            java.lang.Object r0 = r0.getResult()     // Catch:{ IOException -> 0x0130, all -> 0x00d0 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0130, all -> 0x00d0 }
            int r6 = r0.getResponseCode()     // Catch:{ IOException -> 0x00c0, all -> 0x00ba }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00c0, all -> 0x00ba }
            int r7 = r6.intValue()     // Catch:{ IOException -> 0x0132, all -> 0x00b5 }
            if (r7 != r3) goto L_0x0063
            monitor-enter(r13)     // Catch:{ IOException -> 0x0132, all -> 0x00b5 }
            r7 = 8
            r13.f7712c = r7     // Catch:{ all -> 0x0060 }
            monitor-exit(r13)     // Catch:{ IOException -> 0x0132, all -> 0x00b5 }
            com.google.firebase.remoteconfig.internal.c r7 = r13.f7724o     // Catch:{ IOException -> 0x0132, all -> 0x00b5 }
            java.util.Date r8 = com.google.firebase.remoteconfig.internal.c.f7699f     // Catch:{ IOException -> 0x0132, all -> 0x00b5 }
            r7.d(r5, r8)     // Catch:{ IOException -> 0x0132, all -> 0x00b5 }
            com.google.firebase.remoteconfig.internal.a r7 = r13.i(r0)     // Catch:{ IOException -> 0x0132, all -> 0x00b5 }
            r7.c()     // Catch:{ IOException -> 0x0132, all -> 0x00b5 }
            goto L_0x0063
        L_0x0060:
            r7 = move-exception
            monitor-exit(r13)     // Catch:{ IOException -> 0x0132, all -> 0x00b5 }
            throw r7     // Catch:{ IOException -> 0x0132, all -> 0x00b5 }
        L_0x0063:
            com.google.firebase.remoteconfig.internal.d.b(r0)
            monitor-enter(r13)
            r13.f7711b = r5     // Catch:{ all -> 0x00b2 }
            monitor-exit(r13)
            int r7 = r6.intValue()
            boolean r7 = com.google.firebase.remoteconfig.internal.d.c(r7)
            if (r7 == 0) goto L_0x0085
            java.util.Date r8 = new java.util.Date
            h7.d r9 = r13.f7723n
            r9.getClass()
            long r9 = java.lang.System.currentTimeMillis()
            r8.<init>(r9)
            r13.j(r8)
        L_0x0085:
            if (r7 != 0) goto L_0x018a
            int r7 = r6.intValue()
            if (r7 != r3) goto L_0x008f
            goto L_0x018a
        L_0x008f:
            java.lang.String r3 = "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r6
            java.lang.String r3 = java.lang.String.format(r3, r4)
            int r4 = r6.intValue()
            if (r4 != r1) goto L_0x00a7
            java.io.InputStream r0 = r0.getErrorStream()
            java.lang.String r3 = com.google.firebase.remoteconfig.internal.d.e(r0)
        L_0x00a7:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r0 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r1 = r6.intValue()
            r0.<init>((int) r1, (java.lang.String) r3, (int) r5)
            goto L_0x0186
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x00b5:
            r2 = move-exception
            r11 = r2
            r2 = r0
            r0 = r11
            goto L_0x00d2
        L_0x00ba:
            r6 = move-exception
            r11 = r2
            r2 = r0
            r0 = r6
            r6 = r11
            goto L_0x00d2
        L_0x00c0:
            r6 = r2
            goto L_0x0132
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ IOException -> 0x0130, all -> 0x00d0 }
            throw r0     // Catch:{ IOException -> 0x0130, all -> 0x00d0 }
        L_0x00c6:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ IOException -> 0x0130, all -> 0x00d0 }
            java.lang.Exception r0 = r0.getException()     // Catch:{ IOException -> 0x0130, all -> 0x00d0 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0130, all -> 0x00d0 }
            throw r6     // Catch:{ IOException -> 0x0130, all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            r6 = r2
        L_0x00d2:
            com.google.firebase.remoteconfig.internal.d.b(r2)
            monitor-enter(r13)
            r13.f7711b = r5     // Catch:{ all -> 0x012d }
            monitor-exit(r13)
            if (r6 == 0) goto L_0x00e8
            int r7 = r6.intValue()
            boolean r7 = com.google.firebase.remoteconfig.internal.d.c(r7)
            if (r7 == 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            r7 = r5
            goto L_0x00e9
        L_0x00e8:
            r7 = r4
        L_0x00e9:
            if (r7 == 0) goto L_0x00fc
            java.util.Date r8 = new java.util.Date
            h7.d r9 = r13.f7723n
            r9.getClass()
            long r9 = java.lang.System.currentTimeMillis()
            r8.<init>(r9)
            r13.j(r8)
        L_0x00fc:
            if (r7 != 0) goto L_0x0129
            int r7 = r6.intValue()
            if (r7 == r3) goto L_0x0129
            java.lang.String r3 = "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r6
            java.lang.String r3 = java.lang.String.format(r3, r4)
            int r4 = r6.intValue()
            if (r4 != r1) goto L_0x011c
            java.io.InputStream r1 = r2.getErrorStream()
            java.lang.String r3 = com.google.firebase.remoteconfig.internal.d.e(r1)
        L_0x011c:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r1 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r2 = r6.intValue()
            r1.<init>((int) r2, (java.lang.String) r3, (int) r5)
            r13.f(r1)
            goto L_0x012c
        L_0x0129:
            r13.g()
        L_0x012c:
            throw r0
        L_0x012d:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0130:
            r0 = r2
            r6 = r0
        L_0x0132:
            com.google.firebase.remoteconfig.internal.d.b(r0)
            monitor-enter(r13)
            r13.f7711b = r5     // Catch:{ all -> 0x0192 }
            monitor-exit(r13)
            if (r6 == 0) goto L_0x0148
            int r7 = r6.intValue()
            boolean r7 = com.google.firebase.remoteconfig.internal.d.c(r7)
            if (r7 == 0) goto L_0x0146
            goto L_0x0148
        L_0x0146:
            r7 = r5
            goto L_0x0149
        L_0x0148:
            r7 = r4
        L_0x0149:
            if (r7 == 0) goto L_0x015c
            java.util.Date r8 = new java.util.Date
            h7.d r9 = r13.f7723n
            r9.getClass()
            long r9 = java.lang.System.currentTimeMillis()
            r8.<init>(r9)
            r13.j(r8)
        L_0x015c:
            if (r7 != 0) goto L_0x018a
            int r7 = r6.intValue()
            if (r7 != r3) goto L_0x0165
            goto L_0x018a
        L_0x0165:
            java.lang.String r3 = "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r6
            java.lang.String r3 = java.lang.String.format(r3, r4)
            int r4 = r6.intValue()
            if (r4 != r1) goto L_0x017d
            java.io.InputStream r0 = r0.getErrorStream()
            java.lang.String r3 = com.google.firebase.remoteconfig.internal.d.e(r0)
        L_0x017d:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r0 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r1 = r6.intValue()
            r0.<init>((int) r1, (java.lang.String) r3, (int) r5)
        L_0x0186:
            r13.f(r0)
            goto L_0x018d
        L_0x018a:
            r13.g()
        L_0x018d:
            com.google.android.gms.tasks.Task r13 = com.google.android.gms.tasks.Tasks.forResult(r2)
            return r13
        L_0x0192:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.e.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
