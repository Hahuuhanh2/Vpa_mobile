package x;

import al.g0;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import c0.x;
import java.util.Set;
import w.t;

/* compiled from: DynamicRangesCompat */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f16822a;

    /* compiled from: DynamicRangesCompat */
    public interface a {
        DynamicRangeProfiles a();

        Set<x> b();

        Set<x> c(x xVar);
    }

    public b(a aVar) {
        this.f16822a = aVar;
    }

    public static b a(t tVar) {
        DynamicRangeProfiles dynamicRangeProfiles;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        b bVar = null;
        if (i10 >= 33 && (dynamicRangeProfiles = (DynamicRangeProfiles) tVar.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES)) != null) {
            if (i10 >= 33) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.E("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", z10);
            bVar = new b(new c(dynamicRangeProfiles));
        }
        if (bVar == null) {
            return d.f16824a;
        }
        return bVar;
    }
}
