package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import h0.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import v.u;
import w.u;
import w.z;

/* compiled from: CameraManagerCompatBaseImpl */
public class d0 implements z.b {

    /* renamed from: a  reason: collision with root package name */
    public final CameraManager f16196a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16197b;

    /* compiled from: CameraManagerCompatBaseImpl */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f16198a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Handler f16199b;

        public a(Handler handler) {
            this.f16199b = handler;
        }
    }

    public d0(Context context, a aVar) {
        this.f16196a = (CameraManager) context.getSystemService("camera");
        this.f16197b = aVar;
    }

    public void a(u.b bVar) {
        z.a aVar;
        if (bVar != null) {
            a aVar2 = (a) this.f16197b;
            synchronized (aVar2.f16198a) {
                aVar = (z.a) aVar2.f16198a.remove(bVar);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            synchronized (aVar.f16263c) {
                aVar.f16264d = true;
            }
        }
        this.f16196a.unregisterAvailabilityCallback(aVar);
    }

    public void b(String str, g gVar, CameraDevice.StateCallback stateCallback) {
        gVar.getClass();
        stateCallback.getClass();
        try {
            this.f16196a.openCamera(str, new u.b(gVar, stateCallback), ((a) this.f16197b).f16199b);
        } catch (CameraAccessException e10) {
            throw new CameraAccessExceptionCompat(e10);
        }
    }

    public void c(g gVar, u.b bVar) {
        z.a aVar;
        a aVar2 = (a) this.f16197b;
        synchronized (aVar2.f16198a) {
            aVar = (z.a) aVar2.f16198a.get(bVar);
            if (aVar == null) {
                aVar = new z.a(gVar, bVar);
                aVar2.f16198a.put(bVar, aVar);
            }
        }
        this.f16196a.registerAvailabilityCallback(aVar, aVar2.f16199b);
    }

    public CameraCharacteristics d(String str) {
        try {
            return this.f16196a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.a(e10);
        }
    }

    public Set<Set<String>> e() {
        return Collections.emptySet();
    }
}
