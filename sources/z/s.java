package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import i0.d;
import i0.f;
import i0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v.q1;
import v.u1;
import x.l;
import y.h;
import z0.b;

/* compiled from: WaitForRepeatingRequestStart */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17767a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17768b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final v8.a<Void> f17769c;

    /* renamed from: d  reason: collision with root package name */
    public b.a<Void> f17770d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17771e;

    /* renamed from: f  reason: collision with root package name */
    public final a f17772f = new a();

    /* compiled from: WaitForRepeatingRequestStart */
    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            b.a<Void> aVar = s.this.f17770d;
            if (aVar != null) {
                boolean z10 = true;
                aVar.f17801d = true;
                b.d<T> dVar = aVar.f17799b;
                if (dVar == null || !dVar.f17803b.cancel(true)) {
                    z10 = false;
                }
                if (z10) {
                    aVar.f17798a = null;
                    aVar.f17799b = null;
                    aVar.f17800c = null;
                }
                s.this.f17770d = null;
            }
        }

        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            b.a<Void> aVar = s.this.f17770d;
            if (aVar != null) {
                aVar.a(null);
                s.this.f17770d = null;
            }
        }
    }

    @FunctionalInterface
    /* compiled from: WaitForRepeatingRequestStart */
    public interface b {
    }

    public s(d dVar) {
        boolean a10 = dVar.a(h.class);
        this.f17767a = a10;
        if (a10) {
            this.f17769c = z0.b.a(new ca.a(this, 4));
        } else {
            this.f17769c = f.c((Object) null);
        }
    }

    public static d a(CameraDevice cameraDevice, l lVar, ca.a aVar, List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((u1) it.next()).i());
        }
        return d.a(new m(new ArrayList(arrayList2), false, j7.a.x())).d(new q1(aVar, cameraDevice, lVar, list), j7.a.x());
    }
}
