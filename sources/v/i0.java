package v;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.v;
import b0.f;
import c0.p0;
import f0.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: Camera2CaptureRequestBuilder */
public final class i0 {

    /* compiled from: Camera2CaptureRequestBuilder */
    public static class a {
        public static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    public static void a(CaptureRequest.Builder builder, i iVar) {
        f c10 = f.a.d(iVar).c();
        for (i.a next : c10.b().d()) {
            CaptureRequest.Key key = (CaptureRequest.Key) next.c();
            try {
                builder.set(key, c10.b().a(next));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
                p0.b("Camera2CaptureRequestBuilder");
            }
        }
    }

    public static CaptureRequest b(g gVar, CameraDevice cameraDevice, HashMap hashMap) {
        CaptureRequest.Builder builder;
        if (cameraDevice == null) {
            return null;
        }
        List<DeferrableSurface> a10 = gVar.a();
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : a10) {
            Surface surface = (Surface) hashMap.get(deferrableSurface);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        k kVar = gVar.f1364h;
        if (gVar.f1359c != 5 || kVar == null || !(kVar.g() instanceof TotalCaptureResult)) {
            p0.a("Camera2CaptureRequestBuilder");
            builder = cameraDevice.createCaptureRequest(gVar.f1359c);
        } else {
            p0.a("Camera2CaptureRequestBuilder");
            builder = a.a(cameraDevice, (TotalCaptureResult) kVar.g());
        }
        a(builder, gVar.f1358b);
        f c10 = f.a.d(gVar.f1358b).c();
        if (!c10.b().c(u.a.K(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) && !gVar.f1360d.equals(v.f1409a)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, gVar.f1360d);
        }
        i iVar = gVar.f1358b;
        c cVar = g.f1355i;
        if (iVar.c(cVar)) {
            builder.set(CaptureRequest.JPEG_ORIENTATION, (Integer) gVar.f1358b.a(cVar));
        }
        i iVar2 = gVar.f1358b;
        c cVar2 = g.f1356j;
        if (iVar2.c(cVar2)) {
            builder.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) gVar.f1358b.a(cVar2)).byteValue()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            builder.addTarget((Surface) it.next());
        }
        builder.setTag(gVar.f1363g);
        return builder.build();
    }
}
