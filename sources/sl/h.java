package sl;

import f0.b0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.threeten.bp.zone.ZoneRulesException;
import p3.l0;

/* compiled from: ZoneRulesProvider */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList<h> f22963a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap f22964b = new ConcurrentHashMap(512, 0.75f, 2);

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0024 A[LOOP:0: B:3:0x0024->B:6:0x002f, LOOP_START] */
    static {
        /*
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            f22963a = r0
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r1 = 512(0x200, float:7.175E-43)
            r2 = 1061158912(0x3f400000, float:0.75)
            r3 = 2
            r0.<init>(r1, r2, r3)
            f22964b = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = sl.g.f22961a
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicReference<sl.g> r0 = sl.g.f22962b
            r1 = 0
            sl.g$b r2 = new sl.g$b
            r2.<init>()
        L_0x0024:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x002b
            goto L_0x0031
        L_0x002b:
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L_0x0024
        L_0x0031:
            java.util.concurrent.atomic.AtomicReference<sl.g> r0 = sl.g.f22962b
            java.lang.Object r0 = r0.get()
            sl.g r0 = (sl.g) r0
            r0.a()
            return
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.h.<clinit>():void");
    }

    public static f a(String str, boolean z10) {
        l0.y0(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f22964b;
        h hVar = (h) concurrentHashMap.get(str);
        if (hVar != null) {
            return hVar.b(str, z10);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        throw new ZoneRulesException(b0.r("Unknown time-zone ID: ", str));
    }

    public static void d(h hVar) {
        l0.y0(hVar, "provider");
        for (String next : hVar.c()) {
            l0.y0(next, "zoneId");
            if (((h) f22964b.putIfAbsent(next, hVar)) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + next + ", currently loading from provider: " + hVar);
            }
        }
        f22963a.add(hVar);
    }

    public abstract f b(String str, boolean z10);

    public abstract Set<String> c();
}
