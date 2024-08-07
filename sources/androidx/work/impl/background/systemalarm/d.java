package androidx.work.impl.background.systemalarm;

import a4.c;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import o3.j;
import p3.h0;
import p3.i0;
import p3.j0;
import p3.r;
import x3.l;
import y0.h;
import y3.p;
import y3.t;
import y3.z;

/* compiled from: SystemAlarmDispatcher */
public final class d implements p3.d {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f3803s = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3804a;

    /* renamed from: b  reason: collision with root package name */
    public final a4.b f3805b;

    /* renamed from: c  reason: collision with root package name */
    public final z f3806c;

    /* renamed from: d  reason: collision with root package name */
    public final r f3807d;

    /* renamed from: e  reason: collision with root package name */
    public final j0 f3808e;

    /* renamed from: f  reason: collision with root package name */
    public final a f3809f;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f3810n;

    /* renamed from: o  reason: collision with root package name */
    public Intent f3811o;

    /* renamed from: p  reason: collision with root package name */
    public c f3812p;

    /* renamed from: q  reason: collision with root package name */
    public h f3813q = new h(1);

    /* renamed from: r  reason: collision with root package name */
    public final h0 f3814r;

    /* compiled from: SystemAlarmDispatcher */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r1 = o3.j.a();
            r2 = androidx.work.impl.background.systemalarm.d.f3803s;
            r1.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0094, code lost:
            r1 = o3.j.a();
            r0.toString();
            r1.getClass();
            r0.release();
            r0 = r5.f3815a.f3805b.b();
            r1 = new androidx.work.impl.background.systemalarm.d.C0037d(r5.f3815a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b4, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b5, code lost:
            r2 = o3.j.a();
            r3 = androidx.work.impl.background.systemalarm.d.f3803s;
            r0.toString();
            r2.getClass();
            r0.release();
            r5.f3815a.f3805b.b().execute(new androidx.work.impl.background.systemalarm.d.C0037d(r5.f3815a));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d6, code lost:
            throw r1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x008b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                androidx.work.impl.background.systemalarm.d r0 = androidx.work.impl.background.systemalarm.d.this
                java.util.ArrayList r0 = r0.f3810n
                monitor-enter(r0)
                androidx.work.impl.background.systemalarm.d r1 = androidx.work.impl.background.systemalarm.d.this     // Catch:{ all -> 0x00d8 }
                java.util.ArrayList r2 = r1.f3810n     // Catch:{ all -> 0x00d8 }
                r3 = 0
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00d8 }
                android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ all -> 0x00d8 }
                r1.f3811o = r2     // Catch:{ all -> 0x00d8 }
                monitor-exit(r0)     // Catch:{ all -> 0x00d8 }
                androidx.work.impl.background.systemalarm.d r0 = androidx.work.impl.background.systemalarm.d.this
                android.content.Intent r0 = r0.f3811o
                if (r0 == 0) goto L_0x00d7
                java.lang.String r0 = r0.getAction()
                androidx.work.impl.background.systemalarm.d r1 = androidx.work.impl.background.systemalarm.d.this
                android.content.Intent r1 = r1.f3811o
                java.lang.String r2 = "KEY_START_ID"
                int r1 = r1.getIntExtra(r2, r3)
                o3.j r2 = o3.j.a()
                int r3 = androidx.work.impl.background.systemalarm.d.f3803s
                androidx.work.impl.background.systemalarm.d r3 = androidx.work.impl.background.systemalarm.d.this
                android.content.Intent r3 = r3.f3811o
                java.util.Objects.toString(r3)
                r2.getClass()
                androidx.work.impl.background.systemalarm.d r2 = androidx.work.impl.background.systemalarm.d.this
                android.content.Context r2 = r2.f3804a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                java.lang.String r0 = " ("
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = ")"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                android.os.PowerManager$WakeLock r0 = y3.t.a(r2, r0)
                o3.j r2 = o3.j.a()     // Catch:{ all -> 0x008b }
                r0.toString()     // Catch:{ all -> 0x008b }
                r2.getClass()     // Catch:{ all -> 0x008b }
                r0.acquire()     // Catch:{ all -> 0x008b }
                androidx.work.impl.background.systemalarm.d r2 = androidx.work.impl.background.systemalarm.d.this     // Catch:{ all -> 0x008b }
                androidx.work.impl.background.systemalarm.a r3 = r2.f3809f     // Catch:{ all -> 0x008b }
                android.content.Intent r4 = r2.f3811o     // Catch:{ all -> 0x008b }
                r3.a(r1, r4, r2)     // Catch:{ all -> 0x008b }
                o3.j r1 = o3.j.a()
                r0.toString()
                r1.getClass()
                r0.release()
                androidx.work.impl.background.systemalarm.d r0 = androidx.work.impl.background.systemalarm.d.this
                a4.b r0 = r0.f3805b
                a4.c$a r0 = r0.b()
                androidx.work.impl.background.systemalarm.d$d r1 = new androidx.work.impl.background.systemalarm.d$d
                androidx.work.impl.background.systemalarm.d r2 = androidx.work.impl.background.systemalarm.d.this
                r1.<init>(r2)
                goto L_0x00b0
            L_0x008b:
                o3.j r1 = o3.j.a()     // Catch:{ all -> 0x00b4 }
                int r2 = androidx.work.impl.background.systemalarm.d.f3803s     // Catch:{ all -> 0x00b4 }
                r1.getClass()     // Catch:{ all -> 0x00b4 }
                o3.j r1 = o3.j.a()
                r0.toString()
                r1.getClass()
                r0.release()
                androidx.work.impl.background.systemalarm.d r0 = androidx.work.impl.background.systemalarm.d.this
                a4.b r0 = r0.f3805b
                a4.c$a r0 = r0.b()
                androidx.work.impl.background.systemalarm.d$d r1 = new androidx.work.impl.background.systemalarm.d$d
                androidx.work.impl.background.systemalarm.d r2 = androidx.work.impl.background.systemalarm.d.this
                r1.<init>(r2)
            L_0x00b0:
                r0.execute(r1)
                goto L_0x00d7
            L_0x00b4:
                r1 = move-exception
                o3.j r2 = o3.j.a()
                int r3 = androidx.work.impl.background.systemalarm.d.f3803s
                r0.toString()
                r2.getClass()
                r0.release()
                androidx.work.impl.background.systemalarm.d r0 = androidx.work.impl.background.systemalarm.d.this
                a4.b r0 = r0.f3805b
                a4.c$a r0 = r0.b()
                androidx.work.impl.background.systemalarm.d$d r2 = new androidx.work.impl.background.systemalarm.d$d
                androidx.work.impl.background.systemalarm.d r3 = androidx.work.impl.background.systemalarm.d.this
                r2.<init>(r3)
                r0.execute(r2)
                throw r1
            L_0x00d7:
                return
            L_0x00d8:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00d8 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.d.a.run():void");
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final d f3816a;

        /* renamed from: b  reason: collision with root package name */
        public final Intent f3817b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3818c;

        public b(int i10, Intent intent, d dVar) {
            this.f3816a = dVar;
            this.f3817b = intent;
            this.f3818c = i10;
        }

        public final void run() {
            this.f3816a.a(this.f3817b, this.f3818c);
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    public interface c {
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    /* compiled from: SystemAlarmDispatcher */
    public static class C0037d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final d f3819a;

        public C0037d(d dVar) {
            this.f3819a = dVar;
        }

        public final void run() {
            boolean z10;
            boolean z11;
            d dVar = this.f3819a;
            dVar.getClass();
            j.a().getClass();
            d.b();
            synchronized (dVar.f3810n) {
                if (dVar.f3811o != null) {
                    j a10 = j.a();
                    Objects.toString(dVar.f3811o);
                    a10.getClass();
                    if (((Intent) dVar.f3810n.remove(0)).equals(dVar.f3811o)) {
                        dVar.f3811o = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                p c10 = dVar.f3805b.c();
                a aVar = dVar.f3809f;
                synchronized (aVar.f3781c) {
                    z10 = !aVar.f3780b.isEmpty();
                }
                if (!z10) {
                    if (dVar.f3810n.isEmpty()) {
                        synchronized (c10.f17408d) {
                            z11 = !c10.f17405a.isEmpty();
                        }
                        if (!z11) {
                            j.a().getClass();
                            c cVar = dVar.f3812p;
                            if (cVar != null) {
                                ((SystemAlarmService) cVar).a();
                            }
                        }
                    }
                }
                if (!dVar.f3810n.isEmpty()) {
                    dVar.d();
                }
            }
        }
    }

    static {
        j.b("SystemAlarmDispatcher");
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f3804a = applicationContext;
        j0 b10 = j0.b(context);
        this.f3808e = b10;
        this.f3809f = new a(applicationContext, b10.f13938b.f3743c, this.f3813q);
        this.f3806c = new z(b10.f13938b.f3746f);
        r rVar = b10.f13942f;
        this.f3807d = rVar;
        a4.b bVar = b10.f13940d;
        this.f3805b = bVar;
        this.f3814r = new i0(rVar, bVar);
        rVar.a(this);
        this.f3810n = new ArrayList();
        this.f3811o = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i10) {
        boolean z10;
        j a10 = j.a();
        Objects.toString(intent);
        a10.getClass();
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            j.a().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f3810n) {
                Iterator it = this.f3810n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f3810n) {
            boolean z11 = !this.f3810n.isEmpty();
            this.f3810n.add(intent);
            if (!z11) {
                d();
            }
        }
    }

    public final void c(l lVar, boolean z10) {
        c.a b10 = this.f3805b.b();
        Context context = this.f3804a;
        int i10 = a.f3778f;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        a.d(intent, lVar);
        b10.execute(new b(0, intent, this));
    }

    public final void d() {
        b();
        PowerManager.WakeLock a10 = t.a(this.f3804a, "ProcessCommand");
        try {
            a10.acquire();
            this.f3808e.f13940d.d(new a());
        } finally {
            a10.release();
        }
    }
}
