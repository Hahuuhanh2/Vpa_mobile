package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v.u1;
import w.b;
import w.d;

/* compiled from: SynchronizedCaptureSessionStateCallbacks */
public final class b2 extends u1.a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15598a;

    /* compiled from: SynchronizedCaptureSessionStateCallbacks */
    public static class a extends u1.a {

        /* renamed from: a  reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f15599a;

        public a(List<CameraCaptureSession.StateCallback> list) {
            CameraCaptureSession.StateCallback stateCallback;
            if (list.isEmpty()) {
                stateCallback = new p0();
            } else if (list.size() == 1) {
                stateCallback = list.get(0);
            } else {
                stateCallback = new o0(list);
            }
            this.f15599a = stateCallback;
        }

        public final void k(x1 x1Var) {
            this.f15599a.onActive(x1Var.f().f16204a.f16245a);
        }

        public final void l(x1 x1Var) {
            d.b(this.f15599a, x1Var.f().f16204a.f16245a);
        }

        public final void m(u1 u1Var) {
            this.f15599a.onClosed(u1Var.f().f16204a.f16245a);
        }

        public final void n(u1 u1Var) {
            this.f15599a.onConfigureFailed(u1Var.f().f16204a.f16245a);
        }

        public final void o(x1 x1Var) {
            this.f15599a.onConfigured(x1Var.f().f16204a.f16245a);
        }

        public final void p(x1 x1Var) {
            this.f15599a.onReady(x1Var.f().f16204a.f16245a);
        }

        public final void q(u1 u1Var) {
        }

        public final void r(x1 x1Var, Surface surface) {
            b.a(this.f15599a, x1Var.f().f16204a.f16245a, surface);
        }
    }

    public b2(List<u1.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f15598a = arrayList;
        arrayList.addAll(list);
    }

    public final void k(x1 x1Var) {
        Iterator it = this.f15598a.iterator();
        while (it.hasNext()) {
            ((u1.a) it.next()).k(x1Var);
        }
    }

    public final void l(x1 x1Var) {
        Iterator it = this.f15598a.iterator();
        while (it.hasNext()) {
            ((u1.a) it.next()).l(x1Var);
        }
    }

    public final void m(u1 u1Var) {
        Iterator it = this.f15598a.iterator();
        while (it.hasNext()) {
            ((u1.a) it.next()).m(u1Var);
        }
    }

    public final void n(u1 u1Var) {
        Iterator it = this.f15598a.iterator();
        while (it.hasNext()) {
            ((u1.a) it.next()).n(u1Var);
        }
    }

    public final void o(x1 x1Var) {
        Iterator it = this.f15598a.iterator();
        while (it.hasNext()) {
            ((u1.a) it.next()).o(x1Var);
        }
    }

    public final void p(x1 x1Var) {
        Iterator it = this.f15598a.iterator();
        while (it.hasNext()) {
            ((u1.a) it.next()).p(x1Var);
        }
    }

    public final void q(u1 u1Var) {
        Iterator it = this.f15598a.iterator();
        while (it.hasNext()) {
            ((u1.a) it.next()).q(u1Var);
        }
    }

    public final void r(x1 x1Var, Surface surface) {
        Iterator it = this.f15598a.iterator();
        while (it.hasNext()) {
            ((u1.a) it.next()).r(x1Var, surface);
        }
    }
}
