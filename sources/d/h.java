package d;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.r0;
import androidx.camera.core.c;
import androidx.camera.core.d;
import androidx.camera.core.f;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.emoji2.text.g;
import androidx.fragment.app.b0;
import androidx.lifecycle.i;
import androidx.lifecycle.s;
import c0.q0;
import ce.b;
import com.google.android.material.search.o;
import com.google.android.material.textfield.e;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.kizitonwose.calendar.view.WeekCalendarView;
import com.ots.base.utils.customview.DebugView;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import com.vpa.daugia.module.payment.ui.activity.PaymentActivity;
import e0.h0;
import f0.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l6.l;
import n0.u;
import q.j;
import rb.c;
import sb.g;
import tb.m;
import v.b1;
import v.r1;
import v.u;
import v.u1;
import x2.h;
import x2.k;
import x2.m;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8432a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8433b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f8432a = i10;
        this.f8433b = obj;
    }

    public final void run() {
        g gVar;
        long j10;
        g gVar2;
        long j11;
        androidx.appcompat.view.menu.h hVar = null;
        switch (this.f8432a) {
            case 0:
                ComponentActivity.i iVar = (ComponentActivity.i) this.f8433b;
                Runnable runnable = iVar.f294b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f294b = null;
                    return;
                }
                return;
            case 1:
                Toolbar.f fVar = ((Toolbar) this.f8433b).T;
                if (fVar != null) {
                    hVar = fVar.f1037b;
                }
                if (hVar != null) {
                    hVar.collapseActionView();
                    return;
                }
                return;
            case 2:
                ((r0) this.f8433b).c(false);
                return;
            case 3:
                ((j) this.f8433b).f14194e0.f14244x = false;
                return;
            case 4:
                int i10 = b1.a.f15596b;
                for (u1 u1Var : (LinkedHashSet) this.f8433b) {
                    u1Var.b().m(u1Var);
                }
                return;
            case 5:
                r1.f15815l.remove((DeferrableSurface) this.f8433b);
                return;
            case 6:
                ((f) this.f8433b).a();
                return;
            case 7:
                c cVar = (c) this.f8433b;
                synchronized (cVar.B) {
                    cVar.D = null;
                    d dVar = cVar.C;
                    if (dVar != null) {
                        cVar.C = null;
                        cVar.e(dVar);
                    }
                }
                return;
            case 9:
                h0 h0Var = (h0) this.f8433b;
                h0Var.f9008d = null;
                h0Var.c();
                return;
            case 10:
                u.c cVar2 = (u.c) ((t.b) this.f8433b);
                if (u.this.f15867e == 4) {
                    u.this.A();
                    return;
                }
                return;
            case 11:
                ((u.a) this.f8433b).b();
                return;
            case 12:
                int i11 = ContentLoadingProgressBar.f2130c;
                ((ContentLoadingProgressBar) this.f8433b).setVisibility(8);
                return;
            case 13:
                ((g.b) this.f8433b).c();
                return;
            case 14:
                ArrayList arrayList = (ArrayList) this.f8433b;
                sk.j.f(arrayList, "$transitioningViews");
                b0.b(4, arrayList);
                return;
            case 15:
                s sVar = (s) this.f8433b;
                s sVar2 = s.f2817p;
                sk.j.f(sVar, "this$0");
                if (sVar.f2819b == 0) {
                    sVar.f2820c = true;
                    sVar.f2823f.f(i.a.ON_PAUSE);
                }
                if (sVar.f2818a == 0 && sVar.f2820c) {
                    sVar.f2823f.f(i.a.ON_STOP);
                    sVar.f2821d = true;
                    return;
                }
                return;
            case 16:
                new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new i((Context) this.f8433b, 8));
                return;
            case 17:
                x2.h hVar2 = (x2.h) this.f8433b;
                synchronized (hVar2.f16918l) {
                    hVar2.f16913g = false;
                    h.b bVar = hVar2.f16915i;
                    synchronized (bVar) {
                        Arrays.fill(bVar.f16921b, false);
                        bVar.f16923d = true;
                        ek.i iVar2 = ek.i.f20112a;
                    }
                    c3.f fVar2 = hVar2.f16914h;
                    if (fVar2 != null) {
                        fVar2.close();
                    }
                }
                return;
            case 18:
                k kVar = (k) this.f8433b;
                sk.j.f(kVar, "this$0");
                kVar.getClass();
                throw null;
            case 19:
                m mVar = (m) this.f8433b;
                sk.j.f(mVar, "this$0");
                mVar.getClass();
                throw null;
            case 20:
                l lVar = (l) this.f8433b;
                lVar.f12764d.h(new q0(lVar, 8));
                return;
            case 21:
                o oVar = (o) this.f8433b;
                AnimatorSet d10 = oVar.d(true);
                d10.addListener(new com.google.android.material.search.k(oVar));
                d10.start();
                return;
            case 22:
                ((e) this.f8433b).t(true);
                return;
            case 23:
                AppStartTrace appStartTrace = (AppStartTrace) this.f8433b;
                if (appStartTrace.f7637v == null) {
                    appStartTrace.f7625c.getClass();
                    appStartTrace.f7637v = new Timer();
                    m.a aVar = appStartTrace.f7627e;
                    aVar.y(appStartTrace.b().f7662a);
                    Timer b10 = appStartTrace.b();
                    Timer timer = appStartTrace.f7637v;
                    b10.getClass();
                    aVar.z(timer.f7663b - b10.f7663b);
                    appStartTrace.d(appStartTrace.f7627e);
                    return;
                }
                return;
            case 24:
                rb.d dVar2 = (rb.d) this.f8433b;
                rb.c cVar3 = dVar2.f14558s;
                boolean z10 = dVar2.f14563x;
                c.a aVar2 = cVar3.f14530d;
                synchronized (aVar2) {
                    if (z10) {
                        gVar = aVar2.f14541g;
                    } else {
                        gVar = aVar2.f14542h;
                    }
                    aVar2.f14538d = gVar;
                    if (z10) {
                        j10 = aVar2.f14543i;
                    } else {
                        j10 = aVar2.f14544j;
                    }
                    aVar2.f14539e = j10;
                }
                c.a aVar3 = cVar3.f14531e;
                synchronized (aVar3) {
                    if (z10) {
                        gVar2 = aVar3.f14541g;
                    } else {
                        gVar2 = aVar3.f14542h;
                    }
                    aVar3.f14538d = gVar2;
                    if (z10) {
                        j11 = aVar3.f14543i;
                    } else {
                        j11 = aVar3.f14544j;
                    }
                    aVar3.f14539e = j11;
                }
                return;
            case 25:
                WeekCalendarView.r0((WeekCalendarView) this.f8433b);
                return;
            case 26:
                b bVar2 = (b) this.f8433b;
                sk.j.f(bVar2, "this$0");
                bVar2.t();
                return;
            case 27:
                de.b bVar3 = (de.b) this.f8433b;
                sk.j.f(bVar3, "this$0");
                bVar3.t();
                return;
            case 28:
                DebugView debugView = (DebugView) this.f8433b;
                int i12 = DebugView.f8249f;
                sk.j.f(debugView, "this$0");
                debugView.f8252e = 0;
                return;
            default:
                AnnouncementListActivity announcementListActivity = (AnnouncementListActivity) this.f8433b;
                sk.j.f(announcementListActivity, "this$0");
                Intent intent = new Intent(announcementListActivity, PaymentActivity.class);
                intent.putExtra("DATA_CART", announcementListActivity.S);
                announcementListActivity.startActivity(intent);
                return;
        }
    }
}
