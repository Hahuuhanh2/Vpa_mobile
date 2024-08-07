package androidx.work.impl.background.systemalarm;

import al.g0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o3.c;
import o3.j;
import p3.d;
import p3.w;
import x3.i;
import x3.l;
import x3.s;
import y0.h;

/* compiled from: CommandHandler */
public final class a implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f3778f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3779a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f3780b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Object f3781c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final o3.a f3782d;

    /* renamed from: e  reason: collision with root package name */
    public final h f3783e;

    static {
        j.b("CommandHandler");
    }

    public a(Context context, j7.a aVar, h hVar) {
        this.f3779a = context;
        this.f3782d = aVar;
        this.f3783e = hVar;
    }

    public static l b(Intent intent) {
        return new l(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, l lVar) {
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f17010a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", lVar.f17011b);
    }

    public final void a(int i10, Intent intent, d dVar) {
        boolean z10;
        List<w> list;
        boolean z11;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            j a10 = j.a();
            Objects.toString(intent);
            a10.getClass();
            Context context = this.f3779a;
            b bVar = new b(context, this.f3782d, i10, dVar);
            ArrayList<s> k10 = dVar.f3808e.f13939c.u().k();
            int i11 = ConstraintProxy.f3771a;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            for (s sVar : k10) {
                c cVar = sVar.f17028j;
                z12 |= cVar.f13669d;
                z13 |= cVar.f13667b;
                z14 |= cVar.f13670e;
                if (cVar.f13666a != 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z15 |= z11;
                if (z12 && z13 && z14 && z15) {
                    break;
                }
            }
            int i12 = ConstraintProxyUpdateReceiver.f3772a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z13).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z14).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z15);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(k10.size());
            long a11 = bVar.f3785b.a();
            for (s sVar2 : k10) {
                if (a11 >= sVar2.a() && (!sVar2.b() || bVar.f3788e.a(sVar2))) {
                    arrayList.add(sVar2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s sVar3 = (s) it.next();
                String str = sVar3.f17019a;
                Context context2 = bVar.f3784a;
                l Q = g0.Q(sVar3);
                Intent intent3 = new Intent(context2, SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, Q);
                j.a().getClass();
                bVar.f3787d.f3805b.b().execute(new d.b(bVar.f3786c, intent3, bVar.f3787d));
            }
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            j a12 = j.a();
            Objects.toString(intent);
            a12.getClass();
            dVar.f3808e.e();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras != null && !extras.isEmpty()) {
                int i13 = 0;
                while (true) {
                    if (i13 >= 1) {
                        z10 = true;
                        break;
                    } else if (extras.get(strArr[i13]) == null) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                j.a().getClass();
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                l b10 = b(intent);
                j a13 = j.a();
                b10.toString();
                a13.getClass();
                WorkDatabase workDatabase = dVar.f3808e.f13939c;
                workDatabase.c();
                try {
                    s t10 = workDatabase.u().t(b10.f17010a);
                    if (t10 == null) {
                        j a14 = j.a();
                        b10.toString();
                        a14.getClass();
                    } else if (t10.f17020b.b()) {
                        j a15 = j.a();
                        b10.toString();
                        a15.getClass();
                    } else {
                        long a16 = t10.a();
                        if (!t10.b()) {
                            j a17 = j.a();
                            b10.toString();
                            a17.getClass();
                            r3.a.b(this.f3779a, workDatabase, b10, a16);
                        } else {
                            j a18 = j.a();
                            b10.toString();
                            a18.getClass();
                            r3.a.b(this.f3779a, workDatabase, b10, a16);
                            Intent intent4 = new Intent(this.f3779a, SystemAlarmService.class);
                            intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                            dVar.f3805b.b().execute(new d.b(i10, intent4, dVar));
                        }
                        workDatabase.n();
                    }
                } finally {
                    workDatabase.j();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.f3781c) {
                    l b11 = b(intent);
                    j a19 = j.a();
                    b11.toString();
                    a19.getClass();
                    if (!this.f3780b.containsKey(b11)) {
                        c cVar2 = new c(this.f3779a, i10, dVar, this.f3783e.m(b11));
                        this.f3780b.put(b11, cVar2);
                        cVar2.f();
                    } else {
                        j a20 = j.a();
                        b11.toString();
                        a20.getClass();
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                    int i14 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    ArrayList arrayList2 = new ArrayList(1);
                    w i15 = this.f3783e.i(new l(string, i14));
                    list = arrayList2;
                    if (i15 != null) {
                        arrayList2.add(i15);
                        list = arrayList2;
                    }
                } else {
                    list = this.f3783e.h(string);
                }
                for (w wVar : list) {
                    j.a().getClass();
                    dVar.f3814r.d(wVar);
                    Context context3 = this.f3779a;
                    WorkDatabase workDatabase2 = dVar.f3808e.f13939c;
                    l lVar = wVar.f14028a;
                    int i16 = r3.a.f14501a;
                    x3.j r10 = workDatabase2.r();
                    i e10 = r10.e(lVar);
                    if (e10 != null) {
                        r3.a.a(context3, lVar, e10.f17005c);
                        j a21 = j.a();
                        lVar.toString();
                        a21.getClass();
                        r10.b(lVar);
                    }
                    dVar.c(wVar.f14028a, false);
                }
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                l b12 = b(intent);
                boolean z16 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                j a22 = j.a();
                intent.toString();
                a22.getClass();
                c(b12, z16);
            } else {
                j a23 = j.a();
                intent.toString();
                a23.getClass();
            }
        }
    }

    public final void c(l lVar, boolean z10) {
        synchronized (this.f3781c) {
            c cVar = (c) this.f3780b.remove(lVar);
            this.f3783e.i(lVar);
            if (cVar != null) {
                cVar.g(z10);
            }
        }
    }
}
