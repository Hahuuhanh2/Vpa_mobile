package vb;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import da.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l6.i;
import n9.b;
import org.json.JSONArray;
import org.json.JSONObject;
import v.g0;
import wb.c;
import wb.f;
import wb.g;

/* compiled from: FirebaseRemoteConfig */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16142a;

    /* renamed from: b  reason: collision with root package name */
    public final b f16143b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f16144c;

    /* renamed from: d  reason: collision with root package name */
    public final c f16145d;

    /* renamed from: e  reason: collision with root package name */
    public final c f16146e;

    /* renamed from: f  reason: collision with root package name */
    public final c f16147f;

    /* renamed from: g  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.b f16148g;

    /* renamed from: h  reason: collision with root package name */
    public final f f16149h;

    /* renamed from: i  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f16150i;

    /* renamed from: j  reason: collision with root package name */
    public final ab.c f16151j;

    /* renamed from: k  reason: collision with root package name */
    public final g f16152k;

    public e(Context context, ab.c cVar, b bVar, ScheduledExecutorService scheduledExecutorService, c cVar2, c cVar3, c cVar4, com.google.firebase.remoteconfig.internal.b bVar2, f fVar, com.google.firebase.remoteconfig.internal.c cVar5, g gVar) {
        this.f16142a = context;
        this.f16151j = cVar;
        this.f16143b = bVar;
        this.f16144c = scheduledExecutorService;
        this.f16145d = cVar2;
        this.f16146e = cVar3;
        this.f16147f = cVar4;
        this.f16148g = bVar2;
        this.f16149h = fVar;
        this.f16150i = cVar5;
        this.f16152k = gVar;
    }

    public static ArrayList f(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final Task<Boolean> a() {
        com.google.firebase.remoteconfig.internal.b bVar = this.f16148g;
        long j10 = bVar.f7693g.f7700a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.b.f7685i);
        HashMap hashMap = new HashMap(bVar.f7694h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return bVar.f7691e.b().continueWithTask(bVar.f7689c, new i(bVar, j10, hashMap)).onSuccessTask(j.f8852a, new g0(27)).onSuccessTask(this.f16144c, new ea.c(this, 24));
    }

    public final HashMap b() {
        wb.i iVar;
        f fVar = this.f16149h;
        fVar.getClass();
        HashSet hashSet = new HashSet();
        hashSet.addAll(f.c(fVar.f16780c));
        hashSet.addAll(f.c(fVar.f16781d));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String d10 = f.d(fVar.f16780c, str);
            if (d10 != null) {
                fVar.a(f.b(fVar.f16780c), str);
                iVar = new wb.i(d10, 2);
            } else {
                String d11 = f.d(fVar.f16781d, str);
                if (d11 != null) {
                    iVar = new wb.i(d11, 1);
                } else {
                    f.e(str, "FirebaseRemoteConfigValue");
                    iVar = new wb.i("", 0);
                }
            }
            hashMap.put(str, iVar);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (wb.f.f16777f.matcher(r0).matches() != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r4 = this;
            wb.f r0 = r4.f16149h
            wb.c r1 = r0.f16780c
            java.lang.String r2 = "VPA_maintainMode"
            java.lang.String r1 = wb.f.d(r1, r2)
            if (r1 == 0) goto L_0x0038
            java.util.regex.Pattern r3 = wb.f.f16776e
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L_0x0022
            wb.c r1 = r0.f16780c
            wb.d r1 = wb.f.b(r1)
            r0.a(r1, r2)
            goto L_0x004c
        L_0x0022:
            java.util.regex.Pattern r3 = wb.f.f16777f
            java.util.regex.Matcher r1 = r3.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x0038
            wb.c r1 = r0.f16780c
            wb.d r1 = wb.f.b(r1)
            r0.a(r1, r2)
            goto L_0x0060
        L_0x0038:
            wb.c r0 = r0.f16781d
            java.lang.String r0 = wb.f.d(r0, r2)
            if (r0 == 0) goto L_0x005b
            java.util.regex.Pattern r1 = wb.f.f16776e
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x004e
        L_0x004c:
            r0 = 1
            goto L_0x0061
        L_0x004e:
            java.util.regex.Pattern r1 = wb.f.f16777f
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            java.lang.String r0 = "Boolean"
            wb.f.e(r2, r0)
        L_0x0060:
            r0 = 0
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.e.c():boolean");
    }

    public final gl.i d() {
        gl.i iVar;
        com.google.firebase.remoteconfig.internal.c cVar = this.f16150i;
        synchronized (cVar.f7701b) {
            cVar.f7700a.getLong("last_fetch_time_in_millis", -1);
            int i10 = cVar.f7700a.getInt("last_fetch_status", 0);
            int[] iArr = com.google.firebase.remoteconfig.internal.b.f7686j;
            long j10 = cVar.f7700a.getLong("fetch_timeout_in_seconds", 60);
            if (j10 >= 0) {
                long j11 = cVar.f7700a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.b.f7685i);
                if (j11 >= 0) {
                    iVar = new gl.i(i10);
                } else {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j11 + " is an invalid argument");
                }
            } else {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j10)}));
            }
        }
        return iVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void e(boolean r4) {
        /*
            r3 = this;
            wb.g r0 = r3.f16152k
            monitor-enter(r0)
            com.google.firebase.remoteconfig.internal.d r1 = r0.f16783b     // Catch:{ all -> 0x0020 }
            r1.f7714e = r4     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x001e
            monitor-enter(r0)     // Catch:{ all -> 0x0020 }
            java.util.LinkedHashSet r4 = r0.f16782a     // Catch:{ all -> 0x001b }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x001b }
            if (r4 != 0) goto L_0x0019
            com.google.firebase.remoteconfig.internal.d r4 = r0.f16783b     // Catch:{ all -> 0x001b }
            r1 = 0
            r4.d(r1)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            goto L_0x001e
        L_0x001b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r4     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)
            return
        L_0x0020:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.e.e(boolean):void");
    }
}
