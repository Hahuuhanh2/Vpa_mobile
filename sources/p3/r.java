package p3;

import a4.b;
import al.g0;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import o3.d;
import o3.j;
import w3.a;
import y3.t;
import z3.a;

/* compiled from: Processor */
public final class r implements a {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f14010l = 0;

    /* renamed from: a  reason: collision with root package name */
    public PowerManager.WakeLock f14011a = null;

    /* renamed from: b  reason: collision with root package name */
    public Context f14012b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.work.a f14013c;

    /* renamed from: d  reason: collision with root package name */
    public b f14014d;

    /* renamed from: e  reason: collision with root package name */
    public WorkDatabase f14015e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap f14016f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public HashMap f14017g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public HashMap f14018h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public HashSet f14019i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f14020j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final Object f14021k = new Object();

    static {
        j.b("Processor");
    }

    public r(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase) {
        this.f14012b = context;
        this.f14013c = aVar;
        this.f14014d = bVar;
        this.f14015e = workDatabase;
    }

    public static boolean d(o0 o0Var, int i10) {
        if (o0Var != null) {
            o0Var.f13993x = i10;
            o0Var.i();
            o0Var.f13992w.cancel(true);
            if (o0Var.f13980d == null || !(o0Var.f13992w.f17841a instanceof a.b)) {
                Objects.toString(o0Var.f13979c);
                j.a().getClass();
            } else {
                o0Var.f13980d.d(i10);
            }
            j.a().getClass();
            return true;
        }
        j.a().getClass();
        return false;
    }

    public final void a(d dVar) {
        synchronized (this.f14021k) {
            this.f14020j.add(dVar);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:13|14|15|16|17|18|(1:20)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3.o0 b(java.lang.String r5) {
        /*
            r4 = this;
            java.util.HashMap r0 = r4.f14016f
            java.lang.Object r0 = r0.remove(r5)
            p3.o0 r0 = (p3.o0) r0
            r1 = 1
            if (r0 == 0) goto L_0x000d
            r2 = r1
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            if (r2 != 0) goto L_0x0018
            java.util.HashMap r0 = r4.f14017g
            java.lang.Object r0 = r0.remove(r5)
            p3.o0 r0 = (p3.o0) r0
        L_0x0018:
            java.util.HashMap r3 = r4.f14018h
            r3.remove(r5)
            if (r2 == 0) goto L_0x0057
            java.lang.Object r5 = r4.f14021k
            monitor-enter(r5)
            java.util.HashMap r2 = r4.f14016f     // Catch:{ all -> 0x0054 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0054 }
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0052
            android.content.Context r1 = r4.f14012b     // Catch:{ all -> 0x0054 }
            int r2 = androidx.work.impl.foreground.a.f3832q     // Catch:{ all -> 0x0054 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0054 }
            java.lang.Class<androidx.work.impl.foreground.SystemForegroundService> r3 = androidx.work.impl.foreground.SystemForegroundService.class
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "ACTION_STOP_FOREGROUND"
            r2.setAction(r1)     // Catch:{ all -> 0x0054 }
            android.content.Context r1 = r4.f14012b     // Catch:{ all -> 0x0041 }
            r1.startService(r2)     // Catch:{ all -> 0x0041 }
            goto L_0x0048
        L_0x0041:
            o3.j r1 = o3.j.a()     // Catch:{ all -> 0x0054 }
            r1.getClass()     // Catch:{ all -> 0x0054 }
        L_0x0048:
            android.os.PowerManager$WakeLock r1 = r4.f14011a     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0052
            r1.release()     // Catch:{ all -> 0x0054 }
            r1 = 0
            r4.f14011a = r1     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r5)     // Catch:{ all -> 0x0054 }
            goto L_0x0057
        L_0x0054:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0054 }
            throw r0
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.r.b(java.lang.String):p3.o0");
    }

    public final o0 c(String str) {
        o0 o0Var = (o0) this.f14016f.get(str);
        if (o0Var == null) {
            return (o0) this.f14017g.get(str);
        }
        return o0Var;
    }

    public final void e(String str, d dVar) {
        synchronized (this.f14021k) {
            j.a().getClass();
            o0 o0Var = (o0) this.f14017g.remove(str);
            if (o0Var != null) {
                if (this.f14011a == null) {
                    PowerManager.WakeLock a10 = t.a(this.f14012b, "ProcessorForegroundLck");
                    this.f14011a = a10;
                    a10.acquire();
                }
                this.f14016f.put(str, o0Var);
                k1.a.startForegroundService(this.f14012b, androidx.work.impl.foreground.a.b(this.f14012b, g0.Q(o0Var.f13979c), dVar));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(p3.w r14, androidx.work.WorkerParameters.a r15) {
        /*
            r13 = this;
            x3.l r0 = r14.f14028a
            java.lang.String r1 = r0.f17010a
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            androidx.work.impl.WorkDatabase r2 = r13.f14015e
            p3.p r3 = new p3.p
            r3.<init>((p3.r) r13, (java.util.ArrayList) r9, (java.lang.String) r1)
            java.lang.Object r2 = r2.m(r3)
            r8 = r2
            x3.s r8 = (x3.s) r8
            r2 = 0
            if (r8 != 0) goto L_0x0033
            o3.j r14 = o3.j.a()
            r0.toString()
            r14.getClass()
            a4.b r14 = r13.f14014d
            a4.c$a r14 = r14.b()
            p3.q r15 = new p3.q
            r15.<init>(r13, r0)
            r14.execute(r15)
            return r2
        L_0x0033:
            java.lang.Object r10 = r13.f14021k
            monitor-enter(r10)
            java.lang.Object r3 = r13.f14021k     // Catch:{ all -> 0x007e }
            monitor-enter(r3)     // Catch:{ all -> 0x007e }
            p3.o0 r4 = r13.c(r1)     // Catch:{ all -> 0x00e6 }
            r11 = 1
            if (r4 == 0) goto L_0x0042
            r4 = r11
            goto L_0x0043
        L_0x0042:
            r4 = r2
        L_0x0043:
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            if (r4 == 0) goto L_0x0080
            java.util.HashMap r15 = r13.f14018h     // Catch:{ all -> 0x007e }
            java.lang.Object r15 = r15.get(r1)     // Catch:{ all -> 0x007e }
            java.util.Set r15 = (java.util.Set) r15     // Catch:{ all -> 0x007e }
            java.util.Iterator r1 = r15.iterator()     // Catch:{ all -> 0x007e }
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x007e }
            p3.w r1 = (p3.w) r1     // Catch:{ all -> 0x007e }
            x3.l r1 = r1.f14028a     // Catch:{ all -> 0x007e }
            int r1 = r1.f17011b     // Catch:{ all -> 0x007e }
            int r3 = r0.f17011b     // Catch:{ all -> 0x007e }
            if (r1 != r3) goto L_0x006e
            r15.add(r14)     // Catch:{ all -> 0x007e }
            o3.j r14 = o3.j.a()     // Catch:{ all -> 0x007e }
            r0.toString()     // Catch:{ all -> 0x007e }
            r14.getClass()     // Catch:{ all -> 0x007e }
            goto L_0x007c
        L_0x006e:
            a4.b r14 = r13.f14014d     // Catch:{ all -> 0x007e }
            a4.c$a r14 = r14.b()     // Catch:{ all -> 0x007e }
            p3.q r15 = new p3.q     // Catch:{ all -> 0x007e }
            r15.<init>(r13, r0)     // Catch:{ all -> 0x007e }
            r14.execute(r15)     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r10)     // Catch:{ all -> 0x007e }
            return r2
        L_0x007e:
            r14 = move-exception
            goto L_0x00e9
        L_0x0080:
            int r3 = r8.f17038t     // Catch:{ all -> 0x007e }
            int r4 = r0.f17011b     // Catch:{ all -> 0x007e }
            if (r3 == r4) goto L_0x0096
            a4.b r14 = r13.f14014d     // Catch:{ all -> 0x007e }
            a4.c$a r14 = r14.b()     // Catch:{ all -> 0x007e }
            p3.q r15 = new p3.q     // Catch:{ all -> 0x007e }
            r15.<init>(r13, r0)     // Catch:{ all -> 0x007e }
            r14.execute(r15)     // Catch:{ all -> 0x007e }
            monitor-exit(r10)     // Catch:{ all -> 0x007e }
            return r2
        L_0x0096:
            p3.o0$a r12 = new p3.o0$a     // Catch:{ all -> 0x007e }
            android.content.Context r3 = r13.f14012b     // Catch:{ all -> 0x007e }
            androidx.work.a r4 = r13.f14013c     // Catch:{ all -> 0x007e }
            a4.b r5 = r13.f14014d     // Catch:{ all -> 0x007e }
            androidx.work.impl.WorkDatabase r7 = r13.f14015e     // Catch:{ all -> 0x007e }
            r2 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007e }
            if (r15 == 0) goto L_0x00a9
            r12.f14001h = r15     // Catch:{ all -> 0x007e }
        L_0x00a9:
            p3.o0 r15 = new p3.o0     // Catch:{ all -> 0x007e }
            r15.<init>(r12)     // Catch:{ all -> 0x007e }
            z3.c<java.lang.Boolean> r2 = r15.f13991v     // Catch:{ all -> 0x007e }
            w.o r3 = new w.o     // Catch:{ all -> 0x007e }
            r4 = 5
            r3.<init>(r4, r13, r2, r15)     // Catch:{ all -> 0x007e }
            a4.b r4 = r13.f14014d     // Catch:{ all -> 0x007e }
            a4.c$a r4 = r4.b()     // Catch:{ all -> 0x007e }
            r2.b(r3, r4)     // Catch:{ all -> 0x007e }
            java.util.HashMap r2 = r13.f14017g     // Catch:{ all -> 0x007e }
            r2.put(r1, r15)     // Catch:{ all -> 0x007e }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x007e }
            r2.<init>()     // Catch:{ all -> 0x007e }
            r2.add(r14)     // Catch:{ all -> 0x007e }
            java.util.HashMap r14 = r13.f14018h     // Catch:{ all -> 0x007e }
            r14.put(r1, r2)     // Catch:{ all -> 0x007e }
            monitor-exit(r10)     // Catch:{ all -> 0x007e }
            a4.b r14 = r13.f14014d
            y3.p r14 = r14.c()
            r14.execute(r15)
            o3.j r14 = o3.j.a()
            r0.toString()
            r14.getClass()
            return r11
        L_0x00e6:
            r14 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            throw r14     // Catch:{ all -> 0x007e }
        L_0x00e9:
            monitor-exit(r10)     // Catch:{ all -> 0x007e }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.r.f(p3.w, androidx.work.WorkerParameters$a):boolean");
    }
}
