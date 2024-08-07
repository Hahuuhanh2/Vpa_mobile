package androidx.work.impl.background.systemalarm;

import a4.a;
import al.a0;
import al.k1;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.d;
import d.i;
import f0.b0;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import o3.j;
import p3.r;
import p3.w;
import r3.b;
import t3.b;
import t3.d;
import t3.e;
import t3.h;
import x3.l;
import x3.s;
import y3.p;
import y3.t;
import y3.z;

/* compiled from: DelayMetCommandHandler */
public final class c implements d, z.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3789a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3790b;

    /* renamed from: c  reason: collision with root package name */
    public final l f3791c;

    /* renamed from: d  reason: collision with root package name */
    public final d f3792d;

    /* renamed from: e  reason: collision with root package name */
    public final e f3793e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3794f = new Object();

    /* renamed from: n  reason: collision with root package name */
    public int f3795n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final a f3796o;

    /* renamed from: p  reason: collision with root package name */
    public final Executor f3797p;

    /* renamed from: q  reason: collision with root package name */
    public PowerManager.WakeLock f3798q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3799r = false;

    /* renamed from: s  reason: collision with root package name */
    public final w f3800s;

    /* renamed from: t  reason: collision with root package name */
    public final a0 f3801t;

    /* renamed from: u  reason: collision with root package name */
    public volatile k1 f3802u;

    static {
        j.b("DelayMetCommandHandler");
    }

    public c(Context context, int i10, d dVar, w wVar) {
        this.f3789a = context;
        this.f3790b = i10;
        this.f3792d = dVar;
        this.f3791c = wVar.f14028a;
        this.f3800s = wVar;
        v3.l lVar = dVar.f3808e.f13946j;
        this.f3796o = dVar.f3805b.c();
        this.f3797p = dVar.f3805b.b();
        this.f3801t = dVar.f3805b.a();
        this.f3793e = new e(lVar);
    }

    public static void b(c cVar) {
        if (cVar.f3795n == 0) {
            cVar.f3795n = 1;
            j a10 = j.a();
            Objects.toString(cVar.f3791c);
            a10.getClass();
            if (cVar.f3792d.f3807d.f(cVar.f3800s, (WorkerParameters.a) null)) {
                z zVar = cVar.f3792d.f3806c;
                l lVar = cVar.f3791c;
                synchronized (zVar.f17441d) {
                    j a11 = j.a();
                    Objects.toString(lVar);
                    a11.getClass();
                    zVar.a(lVar);
                    z.b bVar = new z.b(zVar, lVar);
                    zVar.f17439b.put(lVar, bVar);
                    zVar.f17440c.put(lVar, cVar);
                    zVar.f17438a.a(bVar, 600000);
                }
                return;
            }
            cVar.d();
            return;
        }
        j a12 = j.a();
        Objects.toString(cVar.f3791c);
        a12.getClass();
    }

    public static void c(c cVar) {
        boolean z10;
        String str = cVar.f3791c.f17010a;
        if (cVar.f3795n < 2) {
            cVar.f3795n = 2;
            j.a().getClass();
            Context context = cVar.f3789a;
            l lVar = cVar.f3791c;
            int i10 = a.f3778f;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_STOP_WORK");
            a.d(intent, lVar);
            cVar.f3797p.execute(new d.b(cVar.f3790b, intent, cVar.f3792d));
            r rVar = cVar.f3792d.f3807d;
            String str2 = cVar.f3791c.f17010a;
            synchronized (rVar.f14021k) {
                if (rVar.c(str2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                j.a().getClass();
                Context context2 = cVar.f3789a;
                l lVar2 = cVar.f3791c;
                Intent intent2 = new Intent(context2, SystemAlarmService.class);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                a.d(intent2, lVar2);
                cVar.f3797p.execute(new d.b(cVar.f3790b, intent2, cVar.f3792d));
                return;
            }
            j.a().getClass();
            return;
        }
        j.a().getClass();
    }

    public final void a(l lVar) {
        j a10 = j.a();
        Objects.toString(lVar);
        a10.getClass();
        ((p) this.f3796o).execute(new b(this, 0));
    }

    public final void d() {
        synchronized (this.f3794f) {
            if (this.f3802u != null) {
                this.f3802u.cancel((CancellationException) null);
            }
            this.f3792d.f3806c.a(this.f3791c);
            PowerManager.WakeLock wakeLock = this.f3798q;
            if (wakeLock != null && wakeLock.isHeld()) {
                j a10 = j.a();
                Objects.toString(this.f3798q);
                Objects.toString(this.f3791c);
                a10.getClass();
                this.f3798q.release();
            }
        }
    }

    public final void e(s sVar, t3.b bVar) {
        if (bVar instanceof b.a) {
            ((p) this.f3796o).execute(new r3.b(this, 1));
            return;
        }
        ((p) this.f3796o).execute(new r3.c(this, 1));
    }

    public final void f() {
        String str = this.f3791c.f17010a;
        Context context = this.f3789a;
        StringBuilder v2 = b0.v(str, " (");
        v2.append(this.f3790b);
        v2.append(")");
        this.f3798q = t.a(context, v2.toString());
        j a10 = j.a();
        Objects.toString(this.f3798q);
        a10.getClass();
        this.f3798q.acquire();
        s t10 = this.f3792d.f3808e.f13939c.u().t(str);
        if (t10 == null) {
            ((p) this.f3796o).execute(new r3.c(this, 0));
            return;
        }
        boolean b10 = t10.b();
        this.f3799r = b10;
        if (!b10) {
            j.a().getClass();
            ((p) this.f3796o).execute(new i(this, 12));
            return;
        }
        this.f3802u = h.a(this.f3793e, t10, this.f3801t, this);
    }

    public final void g(boolean z10) {
        j a10 = j.a();
        Objects.toString(this.f3791c);
        a10.getClass();
        d();
        if (z10) {
            Context context = this.f3789a;
            l lVar = this.f3791c;
            int i10 = a.f3778f;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            a.d(intent, lVar);
            this.f3797p.execute(new d.b(this.f3790b, intent, this.f3792d));
        }
        if (this.f3799r) {
            Context context2 = this.f3789a;
            int i11 = a.f3778f;
            Intent intent2 = new Intent(context2, SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            this.f3797p.execute(new d.b(this.f3790b, intent2, this.f3792d));
        }
    }
}
