package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.x;
import b0.f;
import u.a;
import u.b;
import y.a0;
import y.k;
import z.m;

/* compiled from: Camera2SessionOptionUnpacker */
public final class l0 implements u.d {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f15733a = new l0();

    public final void a(Size size, x<?> xVar, u.b bVar) {
        u o10 = xVar.o();
        i iVar = r.G;
        int i10 = u.a().f1396f.f1359c;
        if (o10 != null) {
            i10 = o10.f1396f.f1359c;
            for (CameraDevice.StateCallback next : o10.f1392b) {
                if (!bVar.f1400c.contains(next)) {
                    bVar.f1400c.add(next);
                }
            }
            for (CameraCaptureSession.StateCallback a10 : o10.f1393c) {
                bVar.a(a10);
            }
            bVar.f1399b.a(o10.f1396f.f1361e);
            iVar = o10.f1396f.f1358b;
        }
        g.a aVar = bVar.f1399b;
        aVar.getClass();
        aVar.f1366b = q.M(iVar);
        if (xVar instanceof s) {
            Rational rational = m.f17759a;
            if (((a0) k.a(a0.class)) != null && !m.f17759a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                q L = q.L();
                L.O(a.K(CaptureRequest.TONEMAP_MODE), 2);
                bVar.f1399b.c(new a(r.K(L)));
            }
        }
        bVar.f1399b.f1367c = ((Integer) xVar.e(a.F, Integer.valueOf(i10))).intValue();
        CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) xVar.e(a.H, new r0());
        if (!bVar.f1400c.contains(stateCallback)) {
            bVar.f1400c.add(stateCallback);
        }
        bVar.a((CameraCaptureSession.StateCallback) xVar.e(a.I, new p0()));
        v0 v0Var = new v0((CameraCaptureSession.CaptureCallback) xVar.e(a.J, new z()));
        bVar.f1399b.b(v0Var);
        if (!bVar.f1403f.contains(v0Var)) {
            bVar.f1403f.add(v0Var);
        }
        q L2 = q.L();
        c cVar = a.K;
        L2.O(cVar, (u.c) xVar.e(cVar, new u.c(new b[0])));
        c cVar2 = a.M;
        L2.O(cVar2, (String) xVar.e(cVar2, null));
        c cVar3 = a.G;
        L2.O(cVar3, Long.valueOf(((Long) xVar.e(cVar3, -1L)).longValue()));
        bVar.f1399b.c(L2);
        bVar.f1399b.c(f.a.d(xVar).c());
    }
}
