package androidx.camera.core.impl;

import androidx.camera.core.impl.DeferrableSurface;
import f0.x;
import i0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import z0.b;

/* compiled from: DeferrableSurfaces */
public final class j {
    public static void a(List<DeferrableSurface> list) {
        for (DeferrableSurface b10 : list) {
            b10.b();
        }
    }

    public static void b(List<DeferrableSurface> list) {
        if (!list.isEmpty()) {
            int i10 = 0;
            do {
                try {
                    list.get(i10).e();
                    i10++;
                } catch (DeferrableSurface.SurfaceClosedException e10) {
                    for (int i11 = i10 - 1; i11 >= 0; i11--) {
                        list.get(i11).b();
                    }
                    throw e10;
                }
            } while (i10 < list.size());
        }
    }

    public static b.d c(List list, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f.d(((DeferrableSurface) it.next()).c()));
        }
        return b.a(new x(arrayList, scheduledExecutorService, executor));
    }
}
