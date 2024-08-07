package w;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import c0.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.u;
import x.f;
import x.l;

/* compiled from: CameraDeviceCompatBaseImpl */
public class y implements u.a {

    /* renamed from: a  reason: collision with root package name */
    public final CameraDevice f16256a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16257b;

    /* compiled from: CameraDeviceCompatBaseImpl */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f16258a;

        public a(Handler handler) {
            this.f16258a = handler;
        }
    }

    public y(CameraDevice cameraDevice, a aVar) {
        cameraDevice.getClass();
        this.f16256a = cameraDevice;
        this.f16257b = aVar;
    }

    public static void b(CameraDevice cameraDevice, l lVar) {
        cameraDevice.getClass();
        lVar.getClass();
        lVar.f16846a.b().getClass();
        List<f> f10 = lVar.f16846a.f();
        if (f10 == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        } else if (lVar.f16846a.d() != null) {
            cameraDevice.getId();
            for (f fVar : f10) {
                String d10 = fVar.f16828a.d();
                if (d10 != null && !d10.isEmpty()) {
                    p0.g("CameraDeviceCompat");
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid executor");
        }
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) it.next()).f16828a.getSurface());
        }
        return arrayList;
    }
}
