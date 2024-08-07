package w8;

import i9.c0;
import java.util.Collections;

/* compiled from: KeysetManager */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final c0.a f16727a;

    public j(c0.a aVar) {
        this.f16727a = aVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    @java.lang.Deprecated
    public final synchronized void a(i9.a0 r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0020 }
            i9.y r0 = w8.q.d(r2)     // Catch:{ all -> 0x001d }
            i9.i0 r2 = r2.I()     // Catch:{ all -> 0x001d }
            i9.c0$b r2 = r1.b(r0, r2)     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            i9.c0$a r0 = r1.f16727a     // Catch:{ all -> 0x0020 }
            r0.o()     // Catch:{ all -> 0x0020 }
            MessageType r0 = r0.f7405b     // Catch:{ all -> 0x0020 }
            i9.c0 r0 = (i9.c0) r0     // Catch:{ all -> 0x0020 }
            i9.c0.F(r0, r2)     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)
            return
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r2     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.j.a(i9.a0):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized i9.c0.b b(i9.y r4, i9.i0 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x0055 }
            int r0 = d9.w.a()     // Catch:{ all -> 0x0052 }
        L_0x0006:
            boolean r1 = r3.d(r0)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0011
            int r0 = d9.w.a()     // Catch:{ all -> 0x0052 }
            goto L_0x0006
        L_0x0011:
            monitor-exit(r3)     // Catch:{ all -> 0x0055 }
            i9.i0 r1 = i9.i0.UNKNOWN_PREFIX     // Catch:{ all -> 0x0055 }
            if (r5 == r1) goto L_0x004a
            i9.c0$b$a r1 = i9.c0.b.N()     // Catch:{ all -> 0x0055 }
            r1.o()     // Catch:{ all -> 0x0055 }
            MessageType r2 = r1.f7405b     // Catch:{ all -> 0x0055 }
            i9.c0$b r2 = (i9.c0.b) r2     // Catch:{ all -> 0x0055 }
            i9.c0.b.E(r2, r4)     // Catch:{ all -> 0x0055 }
            r1.o()     // Catch:{ all -> 0x0055 }
            MessageType r4 = r1.f7405b     // Catch:{ all -> 0x0055 }
            i9.c0$b r4 = (i9.c0.b) r4     // Catch:{ all -> 0x0055 }
            i9.c0.b.H(r4, r0)     // Catch:{ all -> 0x0055 }
            r1.o()     // Catch:{ all -> 0x0055 }
            MessageType r4 = r1.f7405b     // Catch:{ all -> 0x0055 }
            i9.c0$b r4 = (i9.c0.b) r4     // Catch:{ all -> 0x0055 }
            i9.c0.b.G(r4)     // Catch:{ all -> 0x0055 }
            r1.o()     // Catch:{ all -> 0x0055 }
            MessageType r4 = r1.f7405b     // Catch:{ all -> 0x0055 }
            i9.c0$b r4 = (i9.c0.b) r4     // Catch:{ all -> 0x0055 }
            i9.c0.b.F(r4, r5)     // Catch:{ all -> 0x0055 }
            com.google.crypto.tink.shaded.protobuf.n r4 = r1.build()     // Catch:{ all -> 0x0055 }
            i9.c0$b r4 = (i9.c0.b) r4     // Catch:{ all -> 0x0055 }
            monitor-exit(r3)
            return r4
        L_0x004a:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0055 }
            java.lang.String r5 = "unknown output prefix type"
            r4.<init>(r5)     // Catch:{ all -> 0x0055 }
            throw r4     // Catch:{ all -> 0x0055 }
        L_0x0052:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0055 }
            throw r4     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.j.b(i9.y, i9.i0):i9.c0$b");
    }

    public final synchronized i c() {
        return i.a((c0) this.f16727a.build());
    }

    public final synchronized boolean d(int i10) {
        for (T J : Collections.unmodifiableList(((c0) this.f16727a.f7405b).I())) {
            if (J.J() == i10) {
                return true;
            }
        }
        return false;
    }
}
