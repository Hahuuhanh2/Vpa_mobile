package z;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.r;
import java.util.ArrayList;
import java.util.Iterator;
import u.a;
import y.f0;
import y.k;

/* compiled from: TorchStateReset */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17765a;

    public q() {
        boolean z10;
        if (k.a(f0.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17765a = z10;
    }

    public static g a(g gVar) {
        g.a aVar = new g.a();
        aVar.f1367c = gVar.f1359c;
        for (DeferrableSurface add : gVar.a()) {
            aVar.f1365a.add(add);
        }
        aVar.c(gVar.f1358b);
        androidx.camera.core.impl.q L = androidx.camera.core.impl.q.L();
        L.O(a.K(CaptureRequest.FLASH_MODE), 0);
        aVar.c(new a(r.K(L)));
        return aVar.d();
    }

    public final boolean b(ArrayList arrayList, boolean z10) {
        if (!this.f17765a || !z10) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
