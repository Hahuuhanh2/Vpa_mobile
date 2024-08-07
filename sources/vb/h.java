package vb;

import ab.c;
import android.app.Application;
import android.content.Context;
import com.airbnb.lottie.k;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import da.i;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import m9.d;
import n9.b;
import w6.b;
import wb.f;
import x2.g;

/* compiled from: RemoteConfigComponent */
public final class h {

    /* renamed from: j  reason: collision with root package name */
    public static final Random f16154j = new Random();

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap f16155k = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f16156a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f16157b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f16158c;

    /* renamed from: d  reason: collision with root package name */
    public final d f16159d;

    /* renamed from: e  reason: collision with root package name */
    public final c f16160e;

    /* renamed from: f  reason: collision with root package name */
    public final b f16161f;

    /* renamed from: g  reason: collision with root package name */
    public final za.b<p9.a> f16162g;

    /* renamed from: h  reason: collision with root package name */
    public final String f16163h;

    /* renamed from: i  reason: collision with root package name */
    public HashMap f16164i;

    /* compiled from: RemoteConfigComponent */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static final AtomicReference<a> f16165a = new AtomicReference<>();

        public final void a(boolean z10) {
            Random random = h.f16154j;
            synchronized (h.class) {
                for (e e10 : h.f16155k.values()) {
                    e10.e(z10);
                }
            }
        }
    }

    public h() {
        throw null;
    }

    public h(Context context, @r9.b ScheduledExecutorService scheduledExecutorService, d dVar, c cVar, n9.b bVar, za.b<p9.a> bVar2) {
        boolean z10;
        this.f16156a = new HashMap();
        this.f16164i = new HashMap();
        this.f16157b = context;
        this.f16158c = scheduledExecutorService;
        this.f16159d = dVar;
        this.f16160e = cVar;
        this.f16161f = bVar;
        this.f16162g = bVar2;
        dVar.a();
        this.f16163h = dVar.f13220c.f13232b;
        AtomicReference<a> atomicReference = a.f16165a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference<a> atomicReference2 = a.f16165a;
        if (atomicReference2.get() == null) {
            a aVar = new a();
            while (true) {
                if (!atomicReference2.compareAndSet((Object) null, aVar)) {
                    if (atomicReference2.get() != null) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                w6.b.b(application);
                w6.b.f16541e.a(aVar);
            }
        }
        Tasks.call(scheduledExecutorService, new k(this, 2));
    }

    public final synchronized e a(String str) {
        wb.c c10;
        wb.c c11;
        wb.c c12;
        com.google.firebase.remoteconfig.internal.c cVar;
        f fVar;
        g gVar;
        c10 = c(str, "fetch");
        c11 = c(str, "activate");
        c12 = c(str, "defaults");
        cVar = new com.google.firebase.remoteconfig.internal.c(this.f16157b.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", this.f16163h, str, "settings"}), 0));
        fVar = new f(this.f16158c, c11, c12);
        d dVar = this.f16159d;
        za.b<p9.a> bVar = this.f16162g;
        dVar.a();
        if (!dVar.f13219b.equals("[DEFAULT]") || !str.equals("firebase")) {
            gVar = null;
        } else {
            gVar = new g((za.b) bVar);
        }
        if (gVar != null) {
            g gVar2 = new g(gVar);
            synchronized (fVar.f16778a) {
                fVar.f16778a.add(gVar2);
            }
        }
        return b(this.f16159d, str, this.f16160e, this.f16161f, this.f16158c, c10, c11, c12, d(str, c10, cVar), fVar, cVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized vb.e b(m9.d r17, java.lang.String r18, ab.c r19, n9.b r20, java.util.concurrent.ScheduledExecutorService r21, wb.c r22, wb.c r23, wb.c r24, com.google.firebase.remoteconfig.internal.b r25, wb.f r26, com.google.firebase.remoteconfig.internal.c r27) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            monitor-enter(r16)
            java.util.HashMap r2 = r1.f16156a     // Catch:{ all -> 0x0083 }
            boolean r2 = r2.containsKey(r0)     // Catch:{ all -> 0x0083 }
            if (r2 != 0) goto L_0x0079
            vb.e r15 = new vb.e     // Catch:{ all -> 0x0083 }
            android.content.Context r11 = r1.f16157b     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "firebase"
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x002a
            r17.a()     // Catch:{ all -> 0x0083 }
            r3 = r17
            java.lang.String r2 = r3.f13219b     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "[DEFAULT]"
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x002c
            r2 = 1
            goto L_0x002d
        L_0x002a:
            r3 = r17
        L_0x002c:
            r2 = 0
        L_0x002d:
            if (r2 == 0) goto L_0x0032
            r12 = r20
            goto L_0x0034
        L_0x0032:
            r2 = 0
            r12 = r2
        L_0x0034:
            android.content.Context r7 = r1.f16157b     // Catch:{ all -> 0x0083 }
            monitor-enter(r16)     // Catch:{ all -> 0x0083 }
            wb.g r14 = new wb.g     // Catch:{ all -> 0x0076 }
            java.util.concurrent.ScheduledExecutorService r10 = r1.f16158c     // Catch:{ all -> 0x0076 }
            r2 = r14
            r3 = r17
            r4 = r19
            r5 = r25
            r6 = r23
            r8 = r18
            r9 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0076 }
            monitor-exit(r16)     // Catch:{ all -> 0x0083 }
            r3 = r15
            r4 = r11
            r5 = r19
            r6 = r12
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0083 }
            r23.b()     // Catch:{ all -> 0x0083 }
            r24.b()     // Catch:{ all -> 0x0083 }
            r22.b()     // Catch:{ all -> 0x0083 }
            java.util.HashMap r2 = r1.f16156a     // Catch:{ all -> 0x0083 }
            r2.put(r0, r15)     // Catch:{ all -> 0x0083 }
            java.util.HashMap r2 = f16155k     // Catch:{ all -> 0x0083 }
            r2.put(r0, r15)     // Catch:{ all -> 0x0083 }
            goto L_0x0079
        L_0x0076:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0079:
            java.util.HashMap r2 = r1.f16156a     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x0083 }
            vb.e r0 = (vb.e) r0     // Catch:{ all -> 0x0083 }
            monitor-exit(r16)
            return r0
        L_0x0083:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.h.b(m9.d, java.lang.String, ab.c, n9.b, java.util.concurrent.ScheduledExecutorService, wb.c, wb.c, wb.c, com.google.firebase.remoteconfig.internal.b, wb.f, com.google.firebase.remoteconfig.internal.c):vb.e");
    }

    public final wb.c c(String str, String str2) {
        wb.h hVar;
        wb.c cVar;
        String format = String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f16163h, str, str2});
        ScheduledExecutorService scheduledExecutorService = this.f16158c;
        Context context = this.f16157b;
        HashMap hashMap = wb.h.f16785c;
        synchronized (wb.h.class) {
            HashMap hashMap2 = wb.h.f16785c;
            if (!hashMap2.containsKey(format)) {
                hashMap2.put(format, new wb.h(context, format));
            }
            hVar = (wb.h) hashMap2.get(format);
        }
        HashMap hashMap3 = wb.c.f16758d;
        synchronized (wb.c.class) {
            String str3 = hVar.f16787b;
            HashMap hashMap4 = wb.c.f16758d;
            if (!hashMap4.containsKey(str3)) {
                hashMap4.put(str3, new wb.c(scheduledExecutorService, hVar));
            }
            cVar = (wb.c) hashMap4.get(str3);
        }
        return cVar;
    }

    public final synchronized com.google.firebase.remoteconfig.internal.b d(String str, wb.c cVar, com.google.firebase.remoteconfig.internal.c cVar2) {
        za.b bVar;
        com.google.firebase.remoteconfig.internal.b bVar2;
        com.google.firebase.remoteconfig.internal.c cVar3 = cVar2;
        synchronized (this) {
            c cVar4 = this.f16160e;
            d dVar = this.f16159d;
            dVar.a();
            if (dVar.f13219b.equals("[DEFAULT]")) {
                bVar = this.f16162g;
            } else {
                bVar = new i(2);
            }
            za.b bVar3 = bVar;
            ScheduledExecutorService scheduledExecutorService = this.f16158c;
            Random random = f16154j;
            d dVar2 = this.f16159d;
            dVar2.a();
            String str2 = dVar2.f13220c.f13231a;
            d dVar3 = this.f16159d;
            dVar3.a();
            wb.c cVar5 = cVar;
            com.google.firebase.remoteconfig.internal.c cVar6 = cVar2;
            bVar2 = new com.google.firebase.remoteconfig.internal.b(cVar4, bVar3, scheduledExecutorService, random, cVar5, new ConfigFetchHttpClient(this.f16157b, dVar3.f13220c.f13232b, str2, str, cVar3.f7700a.getLong("fetch_timeout_in_seconds", 60), cVar3.f7700a.getLong("fetch_timeout_in_seconds", 60)), cVar6, this.f16164i);
        }
        return bVar2;
    }
}
