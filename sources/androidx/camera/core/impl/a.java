package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.y;
import c0.x;
import f0.s0;
import java.util.List;

/* compiled from: AttachedSurfaceInfo */
public abstract class a {
    public abstract List<y.b> a();

    public abstract x b();

    public abstract int c();

    public abstract i d();

    public abstract Size e();

    public abstract s0 f();

    public abstract Range<Integer> g();

    public final e h(u.a aVar) {
        Size e10 = e();
        Range<Integer> range = v.f1409a;
        e.a aVar2 = new e.a();
        if (e10 != null) {
            aVar2.f1348a = e10;
            Range<Integer> range2 = v.f1409a;
            if (range2 != null) {
                aVar2.f1350c = range2;
                aVar2.f1349b = x.f4367d;
                x b10 = b();
                if (b10 != null) {
                    aVar2.f1349b = b10;
                    aVar2.f1351d = aVar;
                    if (g() != null) {
                        Range<Integer> g2 = g();
                        if (g2 != null) {
                            aVar2.f1350c = g2;
                        } else {
                            throw new NullPointerException("Null expectedFrameRateRange");
                        }
                    }
                    return aVar2.a();
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        throw new NullPointerException("Null resolution");
    }
}
