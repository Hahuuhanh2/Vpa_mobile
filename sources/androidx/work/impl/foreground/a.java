package androidx.work.impl.foreground;

import a4.b;
import al.g0;
import al.i1;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import o3.j;
import p3.j0;
import p3.r;
import p3.w;
import t3.b;
import t3.d;
import t3.e;
import w3.c;
import x3.l;
import x3.s;

/* compiled from: SystemForegroundDispatcher */
public final class a implements d, p3.d {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f3832q = 0;

    /* renamed from: a  reason: collision with root package name */
    public j0 f3833a;

    /* renamed from: b  reason: collision with root package name */
    public final b f3834b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3835c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public l f3836d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f3837e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f3838f;

    /* renamed from: n  reason: collision with root package name */
    public final HashMap f3839n;

    /* renamed from: o  reason: collision with root package name */
    public final e f3840o;

    /* renamed from: p  reason: collision with root package name */
    public C0038a f3841p;

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* compiled from: SystemForegroundDispatcher */
    public interface C0038a {
    }

    static {
        j.b("SystemFgDispatcher");
    }

    public a(Context context) {
        j0 b10 = j0.b(context);
        this.f3833a = b10;
        this.f3834b = b10.f13940d;
        this.f3836d = null;
        this.f3837e = new LinkedHashMap();
        this.f3839n = new HashMap();
        this.f3838f = new HashMap();
        this.f3840o = new e(this.f3833a.f13946j);
        this.f3833a.f13942f.a(this);
    }

    public static Intent a(Context context, l lVar, o3.d dVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f13676a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f13677b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f13678c);
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f17010a);
        intent.putExtra("KEY_GENERATION", lVar.f17011b);
        return intent;
    }

    public static Intent b(Context context, l lVar, o3.d dVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f17010a);
        intent.putExtra("KEY_GENERATION", lVar.f17011b);
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f13676a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f13677b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f13678c);
        return intent;
    }

    public final void c(l lVar, boolean z10) {
        i1 i1Var;
        Map.Entry entry;
        synchronized (this.f3835c) {
            if (((s) this.f3838f.remove(lVar)) != null) {
                i1Var = (i1) this.f3839n.remove(lVar);
            } else {
                i1Var = null;
            }
            if (i1Var != null) {
                i1Var.cancel((CancellationException) null);
            }
        }
        o3.d dVar = (o3.d) this.f3837e.remove(lVar);
        if (lVar.equals(this.f3836d)) {
            if (this.f3837e.size() > 0) {
                Iterator it = this.f3837e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                }
                this.f3836d = (l) entry.getKey();
                if (this.f3841p != null) {
                    o3.d dVar2 = (o3.d) entry.getValue();
                    C0038a aVar = this.f3841p;
                    SystemForegroundService systemForegroundService = (SystemForegroundService) aVar;
                    systemForegroundService.f3828b.post(new b(systemForegroundService, dVar2.f13676a, dVar2.f13678c, dVar2.f13677b));
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f3841p;
                    systemForegroundService2.f3828b.post(new w3.d(systemForegroundService2, dVar2.f13676a));
                }
            } else {
                this.f3836d = null;
            }
        }
        C0038a aVar2 = this.f3841p;
        if (dVar != null && aVar2 != null) {
            j a10 = j.a();
            lVar.toString();
            a10.getClass();
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) aVar2;
            systemForegroundService3.f3828b.post(new w3.d(systemForegroundService3, dVar.f13676a));
        }
    }

    public final void d(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        l lVar = new l(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        j.a().getClass();
        if (notification != null && this.f3841p != null) {
            this.f3837e.put(lVar, new o3.d(intExtra, intExtra2, notification));
            if (this.f3836d == null) {
                this.f3836d = lVar;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f3841p;
                systemForegroundService.f3828b.post(new b(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f3841p;
            systemForegroundService2.f3828b.post(new c(systemForegroundService2, intExtra, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry value : this.f3837e.entrySet()) {
                    i10 |= ((o3.d) value.getValue()).f13677b;
                }
                o3.d dVar = (o3.d) this.f3837e.get(this.f3836d);
                if (dVar != null) {
                    C0038a aVar = this.f3841p;
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) aVar;
                    systemForegroundService3.f3828b.post(new b(systemForegroundService3, dVar.f13676a, dVar.f13678c, i10));
                }
            }
        }
    }

    public final void e(s sVar, t3.b bVar) {
        if (bVar instanceof b.C0193b) {
            String str = sVar.f17019a;
            j.a().getClass();
            j0 j0Var = this.f3833a;
            l Q = g0.Q(sVar);
            a4.b bVar2 = j0Var.f13940d;
            r rVar = j0Var.f13942f;
            w wVar = new w(Q);
            sk.j.f(rVar, "processor");
            bVar2.d(new y3.r(rVar, wVar, true, -512));
        }
    }

    public final void f() {
        this.f3841p = null;
        synchronized (this.f3835c) {
            for (i1 cancel : this.f3839n.values()) {
                cancel.cancel((CancellationException) null);
            }
        }
        r rVar = this.f3833a.f13942f;
        synchronized (rVar.f14021k) {
            rVar.f14020j.remove(this);
        }
    }
}
