package com.bumptech.glide.integration.okhttp3;

import i5.c;

@Deprecated
public class OkHttpGlideModule implements c {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(com.bumptech.glide.Registry r7) {
        /*
            r6 = this;
            java.lang.Class<y4.f> r0 = y4.f.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            com.bumptech.glide.integration.okhttp3.a$a r2 = new com.bumptech.glide.integration.okhttp3.a$a
            r2.<init>()
            y4.p r7 = r7.f4904a
            monitor-enter(r7)
            y4.r r3 = r7.f17488a     // Catch:{ all -> 0x0048 }
            monitor-enter(r3)     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r4 = r3.e(r1)     // Catch:{ all -> 0x0041 }
            monitor-enter(r3)     // Catch:{ all -> 0x0041 }
            y4.r$b r5 = new y4.r$b     // Catch:{ all -> 0x0043 }
            r5.<init>(r0, r1, r2)     // Catch:{ all -> 0x0043 }
            java.util.ArrayList r0 = r3.f17503a     // Catch:{ all -> 0x0043 }
            int r1 = r0.size()     // Catch:{ all -> 0x0043 }
            r0.add(r1, r5)     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            java.util.Iterator r0 = r4.iterator()     // Catch:{ all -> 0x0048 }
        L_0x0028:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0048 }
            y4.o r1 = (y4.o) r1     // Catch:{ all -> 0x0048 }
            r1.b()     // Catch:{ all -> 0x0048 }
            goto L_0x0028
        L_0x0038:
            y4.p$a r0 = r7.f17489b     // Catch:{ all -> 0x0048 }
            java.util.HashMap r0 = r0.f17490a     // Catch:{ all -> 0x0048 }
            r0.clear()     // Catch:{ all -> 0x0048 }
            monitor-exit(r7)
            return
        L_0x0041:
            r0 = move-exception
            goto L_0x0046
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0046:
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.okhttp3.OkHttpGlideModule.a(com.bumptech.glide.Registry):void");
    }

    public final void b() {
    }
}
