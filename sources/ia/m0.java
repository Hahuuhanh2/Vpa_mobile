package ia;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f6.w;
import ja.c;
import ja.h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import ka.b;
import ka.b0;
import ka.c0;
import ka.l;
import ka.m;
import ka.n;
import ka.p;
import ka.q;
import ka.u;
import na.b;
import oa.a;
import oa.d;
import pa.e;
import vl.d;

/* compiled from: SessionReportingCoordinator */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f11338a;

    /* renamed from: b  reason: collision with root package name */
    public final b f11339b;

    /* renamed from: c  reason: collision with root package name */
    public final a f11340c;

    /* renamed from: d  reason: collision with root package name */
    public final c f11341d;

    /* renamed from: e  reason: collision with root package name */
    public final h f11342e;

    /* renamed from: f  reason: collision with root package name */
    public final k0 f11343f;

    public m0(d0 d0Var, b bVar, a aVar, c cVar, h hVar, k0 k0Var) {
        this.f11338a = d0Var;
        this.f11339b = bVar;
        this.f11340c = aVar;
        this.f11341d = cVar;
        this.f11342e = hVar;
        this.f11343f = k0Var;
    }

    public static l a(l lVar, c cVar, h hVar) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        l.a aVar = new l.a(lVar);
        String b10 = cVar.f11803b.b();
        if (b10 != null) {
            aVar.f12353e = new u(b10);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        ja.b reference = hVar.f11830d.f11833a.getReference();
        synchronized (reference) {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f11798a));
        }
        ArrayList c10 = c(unmodifiableMap);
        ja.b reference2 = hVar.f11831e.f11833a.getReference();
        synchronized (reference2) {
            unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(reference2.f11798a));
        }
        ArrayList c11 = c(unmodifiableMap2);
        if (!c10.isEmpty() || !c11.isEmpty()) {
            m.a f10 = lVar.f12346c.f();
            f10.f12360b = new c0<>(c10);
            f10.f12361c = new c0<>(c11);
            aVar.f12351c = f10.a();
        }
        return aVar.a();
    }

    public static m0 b(Context context, k0 k0Var, na.c cVar, a aVar, c cVar2, h hVar, qa.a aVar2, e eVar, d dVar, k kVar) {
        d0 d0Var = new d0(context, k0Var, aVar, aVar2, eVar);
        na.c cVar3 = cVar;
        e eVar2 = eVar;
        b bVar = new b(cVar, eVar, kVar);
        la.a aVar3 = a.f13764b;
        w.b(context);
        return new m0(d0Var, bVar, new a(new oa.d(w.a().c(new d6.a(a.f13765c, a.f13766d)).a("FIREBASE_CRASHLYTICS_REPORT", new c6.b("json"), a.f13767e), eVar.b(), dVar)), cVar2, hVar, k0Var);
    }

    public static ArrayList c(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new ka.e(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new t1.d(1));
        return arrayList;
    }

    public final void d(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        boolean z11;
        Thread thread2 = thread;
        String str3 = str2;
        boolean equals = str3.equals("crash");
        d0 d0Var = this.f11338a;
        int i10 = d0Var.f11282a.getResources().getConfiguration().orientation;
        a1.c cVar = new a1.c(th2, d0Var.f11285d);
        l.a aVar = new l.a();
        aVar.f12350b = str3;
        aVar.f12349a = Long.valueOf(j10);
        String str4 = d0Var.f11284c.f11252e;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) d0Var.f11282a.getSystemService("activity")).getRunningAppProcesses();
        Boolean bool = null;
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str4)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z11 = true;
            } else {
                z11 = false;
            }
            bool = Boolean.valueOf(z11);
        }
        Boolean bool2 = bool;
        Integer valueOf = Integer.valueOf(i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d0.e(thread2, (StackTraceElement[]) cVar.f26c, 4));
        if (z10) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread3 = (Thread) next.getKey();
                if (!thread3.equals(thread2)) {
                    arrayList.add(d0.e(thread3, d0Var.f11285d.j((StackTraceElement[]) next.getValue()), 0));
                }
            }
        }
        c0 c0Var = new c0(arrayList);
        p c10 = d0.c(cVar, 0);
        q.a aVar2 = new q.a();
        aVar2.f12390a = "0";
        aVar2.f12391b = "0";
        aVar2.f12392c = 0L;
        String str5 = "";
        n nVar = new n(c0Var, c10, (b0.a) null, aVar2.a(), d0Var.a());
        if (valueOf == null) {
            str5 = f0.b0.r(str5, " uiOrientation");
        }
        if (str5.isEmpty()) {
            aVar.f12351c = new m(nVar, (c0) null, (c0) null, bool2, valueOf.intValue());
            aVar.f12352d = d0Var.b(i10);
            this.f11339b.c(a(aVar.a(), this.f11341d, this.f11342e), str, equals);
            return;
        }
        throw new IllegalStateException(f0.b0.r("Missing required properties:", str5));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0211  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.String r21, java.util.List<android.app.ApplicationExitInfo> r22, ja.c r23, ja.h r24) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            na.b r0 = r1.f11339b
            na.c r0 = r0.f13548b
            java.lang.String r3 = "start-time"
            java.io.File r0 = r0.b(r2, r3)
            long r3 = r0.lastModified()
            java.util.Iterator r0 = r22.iterator()
        L_0x0016:
            boolean r5 = r0.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x0034
            java.lang.Object r5 = r0.next()
            android.app.ApplicationExitInfo r5 = (android.app.ApplicationExitInfo) r5
            long r7 = r5.getTimestamp()
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            int r7 = r5.getReason()
            r8 = 6
            if (r7 == r8) goto L_0x0035
            goto L_0x0016
        L_0x0034:
            r5 = r6
        L_0x0035:
            java.lang.String r3 = "FirebaseCrashlytics"
            if (r5 != 0) goto L_0x003e
            r0 = 2
            android.util.Log.isLoggable(r3, r0)
            return
        L_0x003e:
            ia.d0 r4 = r1.f11338a
            r7 = 0
            java.io.InputStream r0 = r5.getTraceInputStream()     // Catch:{ IOException -> 0x0066 }
            if (r0 == 0) goto L_0x006d
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0066 }
            r8.<init>()     // Catch:{ IOException -> 0x0066 }
            r9 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r9]     // Catch:{ IOException -> 0x0066 }
        L_0x0050:
            int r10 = r0.read(r9)     // Catch:{ IOException -> 0x0066 }
            r11 = -1
            if (r10 == r11) goto L_0x005b
            r8.write(r9, r7, r10)     // Catch:{ IOException -> 0x0066 }
            goto L_0x0050
        L_0x005b:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x0066 }
            java.lang.String r0 = r0.name()     // Catch:{ IOException -> 0x0066 }
            java.lang.String r0 = r8.toString(r0)     // Catch:{ IOException -> 0x0066 }
            goto L_0x006e
        L_0x0066:
            r0 = move-exception
            r5.toString()
            r0.toString()
        L_0x006d:
            r0 = r6
        L_0x006e:
            ka.c$a r8 = new ka.c$a
            r8.<init>()
            int r9 = r5.getImportance()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.f12276d = r9
            java.lang.String r9 = r5.getProcessName()
            java.lang.String r10 = "Null processName"
            if (r9 == 0) goto L_0x0211
            r8.f12274b = r9
            int r9 = r5.getReason()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.f12275c = r9
            long r11 = r5.getTimestamp()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r8.f12279g = r9
            int r9 = r5.getPid()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.f12273a = r9
            long r11 = r5.getPss()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r8.f12277e = r9
            long r11 = r5.getRss()
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r8.f12278f = r5
            r8.f12280h = r0
            ka.c r0 = r8.a()
            android.content.Context r5 = r4.f11282a
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            ka.l$a r8 = new ka.l$a
            r8.<init>()
            java.lang.String r9 = "anr"
            r8.f12350b = r9
            long r11 = r0.f12270g
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r8.f12349a = r9
            pa.g r9 = r4.f11286e
            pa.e r9 = (pa.e) r9
            pa.c r9 = r9.b()
            pa.c$a r9 = r9.f14112b
            boolean r9 = r9.f14119c
            if (r9 == 0) goto L_0x014a
            ia.a r9 = r4.f11284c
            java.util.List<ia.f> r9 = r9.f11250c
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x014a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            ia.a r9 = r4.f11284c
            java.util.List<ia.f> r9 = r9.f11250c
            java.util.Iterator r9 = r9.iterator()
        L_0x0101:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0144
            java.lang.Object r11 = r9.next()
            ia.f r11 = (ia.f) r11
            ka.d$a r12 = new ka.d$a
            r12.<init>()
            java.lang.String r13 = r11.f11289a
            if (r13 == 0) goto L_0x013c
            r12.f12287b = r13
            java.lang.String r13 = r11.f11290b
            if (r13 == 0) goto L_0x0134
            r12.f12286a = r13
            java.lang.String r11 = r11.f11291c
            if (r11 == 0) goto L_0x012c
            r12.f12288c = r11
            ka.d r11 = r12.a()
            r6.add(r11)
            goto L_0x0101
        L_0x012c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null buildId"
            r0.<init>(r2)
            throw r0
        L_0x0134:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null arch"
            r0.<init>(r2)
            throw r0
        L_0x013c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null libraryName"
            r0.<init>(r2)
            throw r0
        L_0x0144:
            ka.c0 r9 = new ka.c0
            r9.<init>(r6)
            r6 = r9
        L_0x014a:
            ka.c$a r9 = new ka.c$a
            r9.<init>()
            int r11 = r0.f12267d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9.f12276d = r11
            java.lang.String r11 = r0.f12265b
            if (r11 == 0) goto L_0x020b
            r9.f12274b = r11
            int r10 = r0.f12266c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.f12275c = r10
            long r10 = r0.f12270g
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.f12279g = r10
            int r10 = r0.f12264a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.f12273a = r10
            long r10 = r0.f12268e
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.f12277e = r10
            long r10 = r0.f12269f
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.f12278f = r10
            java.lang.String r0 = r0.f12271h
            r9.f12280h = r0
            r9.f12281i = r6
            ka.c r13 = r9.a()
            int r0 = r13.f12267d
            r6 = 100
            r9 = 1
            if (r0 == r6) goto L_0x0197
            r7 = r9
        L_0x0197:
            r17 = 0
            r16 = 0
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r12 = 0
            r11 = 0
            ka.q$a r6 = new ka.q$a
            r6.<init>()
            java.lang.String r7 = "0"
            r6.f12390a = r7
            r6.f12391b = r7
            r14 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r14)
            r6.f12392c = r7
            ka.q r14 = r6.a()
            ka.c0 r15 = r4.a()
            java.lang.String r6 = ""
            ka.n r7 = new ka.n
            r10 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            if (r0 != 0) goto L_0x01d0
            java.lang.String r10 = " uiOrientation"
            java.lang.String r6 = f0.b0.r(r6, r10)
        L_0x01d0:
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L_0x01ff
            ka.m r6 = new ka.m
            int r19 = r0.intValue()
            r14 = r6
            r15 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            r8.f12351c = r6
            ka.t r0 = r4.b(r5)
            r8.f12352d = r0
            ka.l r0 = r8.a()
            r4 = 3
            android.util.Log.isLoggable(r3, r4)
            na.b r3 = r1.f11339b
            r4 = r23
            r5 = r24
            ka.l r0 = a(r0, r4, r5)
            r3.c(r0, r2, r9)
            return
        L_0x01ff:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r2 = f0.b0.r(r2, r6)
            r0.<init>(r2)
            throw r0
        L_0x020b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r10)
            throw r0
        L_0x0211:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.m0.e(java.lang.String, java.util.List, ja.c, ja.h):void");
    }

    public final Task f(String str, Executor executor) {
        boolean z10;
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = this.f11339b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                la.a aVar = b.f13544g;
                String d10 = b.d(file);
                aVar.getClass();
                arrayList.add(new b(la.a.h(d10), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            e0 e0Var = (e0) it2.next();
            if (str == null || str.equals(e0Var.c())) {
                a aVar2 = this.f11340c;
                if (e0Var.a().e() == null) {
                    try {
                        str2 = (String) o0.a(this.f11343f.f11329d.getId());
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    b.a l10 = e0Var.a().l();
                    l10.f12256e = str2;
                    e0Var = new b(l10.a(), e0Var.c(), e0Var.b());
                }
                boolean z11 = true;
                if (str != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                oa.d dVar = aVar2.f13768a;
                synchronized (dVar.f13781f) {
                    taskCompletionSource = new TaskCompletionSource();
                    if (z10) {
                        ((AtomicInteger) dVar.f13784i.f23362b).getAndIncrement();
                        if (dVar.f13781f.size() >= dVar.f13780e) {
                            z11 = false;
                        }
                        if (z11) {
                            e0Var.c();
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            dVar.f13781f.size();
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            dVar.f13782g.execute(new d.a(e0Var, taskCompletionSource));
                            e0Var.c();
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            taskCompletionSource.trySetResult(e0Var);
                        } else {
                            dVar.a();
                            e0Var.c();
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            ((AtomicInteger) dVar.f13784i.f23363c).getAndIncrement();
                            taskCompletionSource.trySetResult(e0Var);
                        }
                    } else {
                        dVar.b(e0Var, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new ea.c(this, 21)));
            }
        }
        return Tasks.whenAll((Collection<? extends Task<?>>) arrayList2);
    }
}
