package v;

import al.g0;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Process;
import android.os.StrictMode;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.view.Surface;
import androidx.fragment.app.strictmode.Violation;
import androidx.window.layout.t;
import androidx.work.d;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b0.c;
import c0.d1;
import c0.h;
import c0.j0;
import c0.t0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import da.g;
import e0.i0;
import ek.i;
import f0.d0;
import f0.f;
import f0.g0;
import f0.k;
import fb.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import n0.j;
import n0.m;
import o.b;
import p2.a;
import p3.w;
import q3.d;
import v.u;
import w.u;
import w.z;
import x2.h;
import x2.j;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15750a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15751b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15752c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f15750a = i10;
        this.f15751b = obj;
        this.f15752c = obj2;
    }

    public final void run() {
        boolean z10;
        boolean z11 = true;
        boolean z12 = false;
        switch (this.f15750a) {
            case 0:
                ((f) this.f15751b).b((k) this.f15752c);
                return;
            case 1:
                u uVar = (u) this.f15751b;
                b.a aVar = (b.a) this.f15752c;
                o1 o1Var = uVar.f15881z;
                if (o1Var == null) {
                    aVar.a(Boolean.FALSE);
                    return;
                }
                aVar.a(Boolean.valueOf(uVar.f15863a.d(u.v(o1Var))));
                return;
            case 2:
                u uVar2 = (u) this.f15751b;
                uVar2.getClass();
                ArrayList arrayList = new ArrayList();
                boolean z13 = false;
                for (u.f fVar : (List) this.f15752c) {
                    if (uVar2.f15863a.d(fVar.d())) {
                        uVar2.f15863a.f1410a.remove(fVar.d());
                        arrayList.add(fVar.d());
                        if (fVar.e() == t0.class) {
                            z13 = true;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    StringBuilder q10 = a.q("Use cases [");
                    q10.append(TextUtils.join(", ", arrayList));
                    q10.append("] now DETACHED for camera");
                    uVar2.s(q10.toString());
                    if (z13) {
                        uVar2.f15870o.f15762h.getClass();
                    }
                    uVar2.p();
                    if (uVar2.f15863a.c().isEmpty()) {
                        uVar2.f15870o.f15766l.f15738c = false;
                    } else {
                        uVar2.L();
                    }
                    if (uVar2.f15863a.b().isEmpty()) {
                        uVar2.f15870o.j();
                        uVar2.D();
                        uVar2.f15870o.q(false);
                        uVar2.f15875t = uVar2.y();
                        uVar2.s("Closing camera.");
                        int g2 = v.g(uVar2.f15867e);
                        if (g2 != 1) {
                            if (g2 != 2) {
                                if (g2 == 3 || g2 == 4) {
                                    uVar2.E(6);
                                    uVar2.q();
                                    return;
                                } else if (g2 != 6) {
                                    StringBuilder q11 = a.q("close() ignored due to being in state: ");
                                    q11.append(v.h(uVar2.f15867e));
                                    uVar2.s(q11.toString());
                                    return;
                                }
                            }
                            boolean a10 = uVar2.f15871p.a();
                            uVar2.E(6);
                            if (a10) {
                                g0.E((String) null, uVar2.x());
                                uVar2.t();
                                return;
                            }
                            return;
                        }
                        if (uVar2.f15873r == null) {
                            z12 = true;
                        }
                        g0.E((String) null, z12);
                        uVar2.E(1);
                        return;
                    }
                    uVar2.K();
                    uVar2.D();
                    if (uVar2.f15867e == 4) {
                        uVar2.A();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                x1 x1Var = (x1) this.f15751b;
                u1 u1Var = (u1) this.f15752c;
                b1 b1Var = x1Var.f15925b;
                synchronized (b1Var.f15591b) {
                    b1Var.f15592c.remove(x1Var);
                    b1Var.f15593d.remove(x1Var);
                }
                x1Var.q(u1Var);
                Objects.requireNonNull(x1Var.f15929f);
                x1Var.f15929f.m(u1Var);
                return;
            case 4:
                ((u.b) this.f15751b).f16254a.onClosed((CameraDevice) this.f15752c);
                return;
            case 5:
                ((z.a) this.f15751b).f16262b.onCameraUnavailable((String) this.f15752c);
                return;
            case 6:
                ((c) this.f15751b).b((b.a) this.f15752c);
                return;
            case 7:
                c0.b bVar = (c0.b) this.f15751b;
                bVar.getClass();
                ((d0.a) this.f15752c).f(bVar);
                return;
            case 8:
                t0.b bVar2 = t0.f4334t;
                ((t0.c) this.f15751b).a((d1) this.f15752c);
                return;
            case 9:
                int i10 = d1.f4212m;
                ((d1.e) this.f15751b).c((d1.d) this.f15752c);
                return;
            case 10:
                int i11 = d1.f4212m;
                ((v1.a) this.f15751b).accept(new h(4, (Surface) this.f15752c));
                return;
            case 12:
                i0 i0Var = (i0) this.f15751b;
                if (i0Var.d() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i0Var.f() == null) {
                    z11 = false;
                }
                if (z10 && !z11) {
                    Objects.requireNonNull(i0Var.d());
                    return;
                } else if (!z11 || z10) {
                    throw new IllegalStateException("One and only one callback is allowed.");
                } else {
                    j0.e f10 = i0Var.f();
                    Objects.requireNonNull(f10);
                    f10.a();
                    return;
                }
            case 13:
                ((f0.g0) this.f15751b).f9533a.i((g0.a) this.f15752c);
                return;
            case 14:
                j jVar = (j) this.f15751b;
                d1 d1Var = (d1) this.f15752c;
                jVar.f13346i++;
                m mVar = jVar.f13338a;
                mVar.d(true);
                mVar.c();
                SurfaceTexture surfaceTexture = new SurfaceTexture(mVar.f13367i);
                surfaceTexture.setDefaultBufferSize(d1Var.f4214b.getWidth(), d1Var.f4214b.getHeight());
                Surface surface = new Surface(surfaceTexture);
                d1Var.a(surface, jVar.f13340c, new n0.h(jVar, surfaceTexture, surface));
                surfaceTexture.setOnFrameAvailableListener(jVar, jVar.f13341d);
                return;
            case 16:
                Violation violation = (Violation) this.f15752c;
                a.c cVar = p2.a.f13907a;
                sk.j.f(violation, "$violation");
                throw violation;
            case 17:
                x2.j jVar2 = (x2.j) this.f15751b;
                String[] strArr = (String[]) this.f15752c;
                int i12 = j.b.f16941b;
                sk.j.f(jVar2, "this$0");
                sk.j.f(strArr, "$tables");
                x2.h hVar = jVar2.f16931b;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                hVar.getClass();
                sk.j.f(strArr2, "tables");
                synchronized (hVar.f16916j) {
                    Iterator<Map.Entry<h.c, h.d>> it = hVar.f16916j.iterator();
                    while (true) {
                        b.e eVar = (b.e) it;
                        if (eVar.hasNext()) {
                            Map.Entry entry = (Map.Entry) eVar.next();
                            sk.j.e(entry, "(observer, wrapper)");
                            h.c cVar2 = (h.c) entry.getKey();
                            h.d dVar = (h.d) entry.getValue();
                            cVar2.getClass();
                            if (!(cVar2 instanceof j.a)) {
                                dVar.b(strArr2);
                            }
                        } else {
                            i iVar = i.f20112a;
                        }
                    }
                }
                return;
            case 18:
                x2.k kVar = (x2.k) this.f15751b;
                sk.j.f(kVar, "this$0");
                sk.j.f((String) this.f15752c, "$query");
                kVar.getClass();
                throw null;
            case 19:
                android.support.v4.media.a.s(this.f15752c);
                sk.j.f((Runnable) this.f15751b, "$command");
                sk.j.f((Object) null, "this$0");
                throw null;
            case 20:
                t.b bVar3 = (t.b) this.f15751b;
                androidx.window.layout.z zVar = (androidx.window.layout.z) this.f15752c;
                sk.j.f(bVar3, "this$0");
                sk.j.f(zVar, "$newLayoutInfo");
                bVar3.f3709c.accept(zVar);
                return;
            case 21:
                d dVar2 = (d) this.f15751b;
                w wVar = (w) this.f15752c;
                sk.j.f(dVar2, "this$0");
                sk.j.f(wVar, "$token");
                dVar2.f14314b.a(wVar, 3);
                return;
            case 22:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f15751b;
                v8.a aVar2 = (v8.a) this.f15752c;
                sk.j.f(constraintTrackingWorker, "this$0");
                sk.j.f(aVar2, "$innerFuture");
                synchronized (constraintTrackingWorker.f3852f) {
                    if (constraintTrackingWorker.f3853n) {
                        z3.c<d.a> cVar3 = constraintTrackingWorker.f3854o;
                        sk.j.e(cVar3, "future");
                        int i13 = b4.a.f4000a;
                        cVar3.i(new d.a.b());
                    } else {
                        constraintTrackingWorker.f3854o.k(aVar2);
                    }
                    i iVar2 = i.f20112a;
                }
                return;
            case 23:
                m9.d dVar3 = (m9.d) this.f15751b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f15752c;
                int i14 = u9.a.f15399d;
                dVar3.a();
                u9.c cVar4 = new u9.c(dVar3.f13218a, dVar3.f());
                String string = cVar4.f15405a.getString("com.google.firebase.appcheck.debug.DEBUG_SECRET", (String) null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    cVar4.f15405a.edit().putString("com.google.firebase.appcheck.debug.DEBUG_SECRET", string).apply();
                }
                taskCompletionSource.setResult(string);
                return;
            case 24:
                da.a aVar3 = (da.a) this.f15751b;
                Runnable runnable = (Runnable) this.f15752c;
                Process.setThreadPriority(aVar3.f8827c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.f8828d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 25:
                Callable callable = (Callable) this.f15751b;
                g.b bVar4 = (g.b) this.f15752c;
                try {
                    g.this.p(callable.call());
                    return;
                } catch (Exception e10) {
                    g.this.q(e10);
                    return;
                }
            case 26:
                Runnable runnable2 = (Runnable) this.f15751b;
                g.b bVar5 = (g.b) this.f15752c;
                try {
                    runnable2.run();
                    return;
                } catch (Exception e11) {
                    g.this.q(e11);
                    return;
                }
            case 27:
                ((fb.k) this.f15751b).getClass();
                fb.k.a((Intent) this.f15752c);
                return;
            case 28:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f15751b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f15752c;
                com.google.firebase.messaging.a aVar4 = FirebaseMessaging.f7583m;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource2.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e12) {
                    taskCompletionSource2.setException(e12);
                    return;
                }
            default:
                o oVar = (o) this.f15751b;
                TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) this.f15752c;
                oVar.getClass();
                try {
                    taskCompletionSource3.setResult(oVar.d());
                    return;
                } catch (Exception e13) {
                    taskCompletionSource3.setException(e13);
                    return;
                }
        }
    }
}
