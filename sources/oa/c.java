package oa;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.SQLException;
import android.util.Log;
import android.util.Size;
import android.widget.LinearLayout;
import androidx.camera.core.impl.o;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.s;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.recyclerview.widget.RecyclerView;
import c0.a0;
import c0.b0;
import c0.e0;
import c0.p;
import c0.t0;
import c6.d;
import c6.f;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.firebase.perf.util.Timer;
import com.ots.core.base.BaseRecyclerView;
import com.vpa.daugia.data.model.LastNotification;
import com.vpa.daugia.module.home.data.model.Action;
import com.vpa.daugia.ui.MainActivity;
import f0.c0;
import f6.u;
import f6.w;
import g0.m;
import io.github.g00fy2.quickie.QROverlayView;
import io.github.g00fy2.quickie.QRScannerActivity;
import j6.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import jb.v;
import ka.b0;
import mj.g;
import mj.h;
import mj.i;
import mj.k;
import q0.c;
import r2.l;
import sk.j;
import tb.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13773a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13774b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13775c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f13773a = i10;
        this.f13774b = obj;
        this.f13775c = obj2;
    }

    public final void run() {
        p pVar;
        l lVar;
        boolean z10 = true;
        switch (this.f13773a) {
            case 0:
                d dVar = (d) this.f13774b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f13775c;
                dVar.getClass();
                try {
                    f<b0> fVar = dVar.f13783h;
                    d dVar2 = d.HIGHEST;
                    if (fVar instanceof u) {
                        w.a().f10033d.a(((u) fVar).f10024a.e(dVar2), 1);
                    } else if (Log.isLoggable(a.b("ForcedSender"), 5)) {
                        String.format("Expected instance of `TransportImpl`, got `%s`.", new Object[]{fVar});
                    }
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
            case 1:
                v vVar = (v) this.f13774b;
                Context context = (Context) this.f13775c;
                if (vVar.f11865a == null && context != null) {
                    vVar.f11865a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                    return;
                }
                return;
            case 2:
                qb.c cVar = (qb.c) this.f13774b;
                lb.a aVar = qb.c.f14399f;
                b b10 = cVar.b((Timer) this.f13775c);
                if (b10 != null) {
                    cVar.f14401b.add(b10);
                    return;
                }
                return;
            case 3:
                List list = (List) this.f13774b;
                BaseRecyclerView baseRecyclerView = (BaseRecyclerView) this.f13775c;
                int i10 = BaseRecyclerView.f8338p;
                j.f(list, "$list");
                j.f(baseRecyclerView, "this$0");
                if (list.isEmpty()) {
                    LinearLayout linearLayout = baseRecyclerView.getBinding().f10823w;
                    j.e(linearLayout, "emptyStateView");
                    linearLayout.setVisibility(0);
                    RecyclerView recyclerView = baseRecyclerView.getBinding().f10824x;
                    j.e(recyclerView, "recyclerView");
                    recyclerView.setVisibility(8);
                    ShimmerFrameLayout shimmerFrameLayout = baseRecyclerView.getBinding().f10825y;
                    j.e(shimmerFrameLayout, "shimmerViewContainer");
                    shimmerFrameLayout.setVisibility(8);
                    return;
                }
                LinearLayout linearLayout2 = baseRecyclerView.getBinding().f10823w;
                j.e(linearLayout2, "emptyStateView");
                linearLayout2.setVisibility(8);
                q5.a aVar2 = baseRecyclerView.getBinding().f10825y.f5013b;
                ValueAnimator valueAnimator = aVar2.f14368e;
                if (valueAnimator != null) {
                    if (!valueAnimator.isStarted()) {
                        z10 = false;
                    }
                    if (z10) {
                        aVar2.f14368e.cancel();
                    }
                }
                ShimmerFrameLayout shimmerFrameLayout2 = baseRecyclerView.getBinding().f10825y;
                j.e(shimmerFrameLayout2, "shimmerViewContainer");
                shimmerFrameLayout2.setVisibility(8);
                RecyclerView recyclerView2 = baseRecyclerView.getBinding().f10824x;
                j.e(recyclerView2, "recyclerView");
                recyclerView2.setVisibility(0);
                return;
            case 4:
                MainActivity mainActivity = (MainActivity) this.f13774b;
                LastNotification lastNotification = (LastNotification) this.f13775c;
                int i11 = MainActivity.Z;
                j.f(mainActivity, "this$0");
                j.f(lastNotification, "$it");
                j7.a.d(mainActivity, new Action(lastNotification.getClickAction(), lastNotification.getValue()), false);
                lg.b bVar = mainActivity.W;
                if (bVar != null) {
                    bVar.f();
                    return;
                } else {
                    j.l("sharedPrefsHelper");
                    throw null;
                }
            default:
                v8.a aVar3 = (v8.a) this.f13774b;
                QRScannerActivity qRScannerActivity = (QRScannerActivity) this.f13775c;
                int i12 = QRScannerActivity.Q;
                j.f(aVar3, "$cameraProviderFuture");
                j.f(qRScannerActivity, "this$0");
                try {
                    q0.f fVar2 = (q0.f) aVar3.get();
                    s sVar = new s(r.K(new t0.a().f4342a));
                    c0.f(sVar);
                    t0 t0Var = new t0(sVar);
                    pj.a aVar4 = qRScannerActivity.I;
                    if (aVar4 != null) {
                        t0Var.E(aVar4.f22660b.getSurfaceProvider());
                        b0.c cVar2 = new b0.c();
                        cVar2.f4190a.O(o.f1385j, new Size(1280, 720));
                        androidx.camera.core.impl.l lVar2 = new androidx.camera.core.impl.l(r.K(cVar2.f4190a));
                        c0.f(lVar2);
                        c0.b0 b0Var = new c0.b0(lVar2);
                        ExecutorService executorService = qRScannerActivity.J;
                        if (executorService != null) {
                            mj.d dVar3 = new mj.d(qRScannerActivity.K, new mj.j(b0Var, qRScannerActivity), new k(qRScannerActivity), new mj.l(qRScannerActivity));
                            synchronized (b0Var.f4186o) {
                                try {
                                    e0 e0Var = b0Var.f4185n;
                                    a0 a0Var = new a0(dVar3);
                                    synchronized (e0Var.f4246y) {
                                        e0Var.f4229a = a0Var;
                                        e0Var.f4235n = executorService;
                                    }
                                    if (b0Var.f4187p == null) {
                                        b0Var.f4256c = 1;
                                        b0Var.p();
                                    }
                                    b0Var.f4187p = dVar3;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            fVar2.getClass();
                            m.a();
                            fVar2.c(0);
                            q0.c cVar3 = fVar2.f14283d;
                            synchronized (cVar3.f14269a) {
                                for (c.a aVar5 : cVar3.f14270b.keySet()) {
                                    q0.b bVar2 = (q0.b) cVar3.f14270b.get(aVar5);
                                    synchronized (bVar2.f14265a) {
                                        CameraUseCaseAdapter cameraUseCaseAdapter = bVar2.f14267c;
                                        ArrayList arrayList = (ArrayList) cameraUseCaseAdapter.v();
                                        synchronized (cameraUseCaseAdapter.f1443r) {
                                            LinkedHashSet linkedHashSet = new LinkedHashSet(cameraUseCaseAdapter.f1437e);
                                            linkedHashSet.removeAll(arrayList);
                                            cameraUseCaseAdapter.z(linkedHashSet, false);
                                        }
                                    }
                                    synchronized (bVar2.f14265a) {
                                        lVar = bVar2.f14266b;
                                    }
                                    cVar3.f(lVar);
                                }
                            }
                            if (qRScannerActivity.O) {
                                pVar = p.f4311b;
                            } else {
                                pVar = p.f4312c;
                            }
                            j.c(pVar);
                            try {
                                q0.b a10 = fVar2.a(qRScannerActivity, pVar, t0Var, b0Var);
                                pj.a aVar6 = qRScannerActivity.I;
                                if (aVar6 != null) {
                                    aVar6.f22659a.setVisibility(0);
                                    pj.a aVar7 = qRScannerActivity.I;
                                    if (aVar7 != null) {
                                        aVar7.f22659a.setCloseVisibilityAndOnClick(qRScannerActivity.N, new g(qRScannerActivity));
                                        if (!qRScannerActivity.M || !a10.f14267c.f1449x.k()) {
                                            pj.a aVar8 = qRScannerActivity.I;
                                            if (aVar8 != null) {
                                                QROverlayView qROverlayView = aVar8.f22659a;
                                                j.e(qROverlayView, "overlayView");
                                                QROverlayView.setTorchVisibilityAndOnClick$default(qROverlayView, false, (rk.l) null, 2, (Object) null);
                                                return;
                                            }
                                            j.l("binding");
                                            throw null;
                                        }
                                        pj.a aVar9 = qRScannerActivity.I;
                                        if (aVar9 != null) {
                                            aVar9.f22659a.setTorchVisibilityAndOnClick(true, new h(a10));
                                            a10.f14267c.f1449x.d().e(qRScannerActivity, new v.w(new i(qRScannerActivity), 1));
                                            return;
                                        }
                                        j.l("binding");
                                        throw null;
                                    }
                                    j.l("binding");
                                    throw null;
                                }
                                j.l("binding");
                                throw null;
                            } catch (Exception e10) {
                                pj.a aVar10 = qRScannerActivity.I;
                                if (aVar10 != null) {
                                    aVar10.f22659a.setVisibility(4);
                                    qRScannerActivity.L(e10);
                                    return;
                                }
                                j.l("binding");
                                throw null;
                            }
                        } else {
                            j.l("analysisExecutor");
                            throw null;
                        }
                    } else {
                        j.l("binding");
                        throw null;
                    }
                } catch (Exception e11) {
                    qRScannerActivity.L(e11);
                    return;
                }
        }
    }
}
