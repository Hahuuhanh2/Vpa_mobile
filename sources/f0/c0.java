package f0;

import androidx.camera.core.impl.c;
import androidx.camera.core.impl.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageOutputConfig */
public final /* synthetic */ class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9520a = 0;

    static {
        c cVar = o.f1381f;
    }

    public static int a(o oVar) {
        return ((Integer) oVar.e(o.f1383h, -1)).intValue();
    }

    public static ArrayList b(o oVar) {
        List list = (List) oVar.e(o.f1390o, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static int c(o oVar) {
        return ((Integer) oVar.e(o.f1384i, 0)).intValue();
    }

    public static int d(o oVar) {
        return ((Integer) oVar.a(o.f1381f)).intValue();
    }

    public static int e(o oVar) {
        return ((Integer) oVar.e(o.f1382g, 0)).intValue();
    }

    public static void f(o oVar) {
        boolean z10;
        boolean E = oVar.E();
        if (oVar.y() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (E && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (oVar.s() == null) {
        } else {
            if (E || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
