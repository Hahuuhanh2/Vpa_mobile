package mb;

import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import java.util.ArrayList;
import tb.d;
import tb.k;
import tb.m;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13241a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppStartTrace f13242b;

    public /* synthetic */ a(AppStartTrace appStartTrace, int i10) {
        this.f13241a = i10;
        this.f13242b = appStartTrace;
    }

    public final void run() {
        String str;
        switch (this.f13241a) {
            case 0:
                AppStartTrace appStartTrace = this.f13242b;
                if (appStartTrace.f7639x == null) {
                    appStartTrace.f7625c.getClass();
                    appStartTrace.f7639x = new Timer();
                    m.a aVar = appStartTrace.f7627e;
                    m.a Z = m.Z();
                    Z.A("_experiment_onDrawFoQ");
                    Z.y(appStartTrace.b().f7662a);
                    Timer b10 = appStartTrace.b();
                    Timer timer = appStartTrace.f7639x;
                    b10.getClass();
                    Z.z(timer.f7663b - b10.f7663b);
                    aVar.w((m) Z.q());
                    if (appStartTrace.f7630o != null) {
                        m.a aVar2 = appStartTrace.f7627e;
                        m.a Z2 = m.Z();
                        Z2.A("_experiment_procStart_to_classLoad");
                        Z2.y(appStartTrace.b().f7662a);
                        Timer b11 = appStartTrace.b();
                        Timer a10 = appStartTrace.a();
                        b11.getClass();
                        Z2.z(a10.f7663b - b11.f7663b);
                        aVar2.w((m) Z2.q());
                    }
                    m.a aVar3 = appStartTrace.f7627e;
                    if (appStartTrace.C) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    aVar3.getClass();
                    aVar3.s();
                    m.K((m) aVar3.f7906b).put("systemDeterminedForeground", str);
                    appStartTrace.f7627e.x((long) appStartTrace.A, "onDrawCount");
                    m.a aVar4 = appStartTrace.f7627e;
                    k a11 = appStartTrace.f7640y.a();
                    aVar4.s();
                    m.L((m) aVar4.f7906b, a11);
                    appStartTrace.d(appStartTrace.f7627e);
                    return;
                }
                return;
            default:
                AppStartTrace appStartTrace2 = this.f13242b;
                Timer timer2 = AppStartTrace.D;
                appStartTrace2.getClass();
                m.a Z3 = m.Z();
                Z3.A("_as");
                Z3.y(appStartTrace2.a().f7662a);
                Timer a12 = appStartTrace2.a();
                Timer timer3 = appStartTrace2.f7634s;
                a12.getClass();
                Z3.z(timer3.f7663b - a12.f7663b);
                ArrayList arrayList = new ArrayList(3);
                m.a Z4 = m.Z();
                Z4.A("_astui");
                Z4.y(appStartTrace2.a().f7662a);
                Timer a13 = appStartTrace2.a();
                Timer timer4 = appStartTrace2.f7632q;
                a13.getClass();
                Z4.z(timer4.f7663b - a13.f7663b);
                arrayList.add((m) Z4.q());
                if (appStartTrace2.f7633r != null) {
                    m.a Z5 = m.Z();
                    Z5.A("_astfd");
                    Z5.y(appStartTrace2.f7632q.f7662a);
                    Timer timer5 = appStartTrace2.f7632q;
                    Timer timer6 = appStartTrace2.f7633r;
                    timer5.getClass();
                    Z5.z(timer6.f7663b - timer5.f7663b);
                    arrayList.add((m) Z5.q());
                    m.a Z6 = m.Z();
                    Z6.A("_asti");
                    Z6.y(appStartTrace2.f7633r.f7662a);
                    Timer timer7 = appStartTrace2.f7633r;
                    Timer timer8 = appStartTrace2.f7634s;
                    timer7.getClass();
                    Z6.z(timer8.f7663b - timer7.f7663b);
                    arrayList.add((m) Z6.q());
                }
                Z3.s();
                m.J((m) Z3.f7906b, arrayList);
                k a14 = appStartTrace2.f7640y.a();
                Z3.s();
                m.L((m) Z3.f7906b, a14);
                appStartTrace2.f7624b.d((m) Z3.q(), d.FOREGROUND_BACKGROUND);
                return;
        }
    }
}
