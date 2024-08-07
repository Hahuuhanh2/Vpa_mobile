package ac;

import ca.b;
import ca.g;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import ub.e;

/* compiled from: ComponentMonitor */
public final class a implements g {
    public final List<b<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (b next : componentRegistrar.getComponents()) {
            String str = next.f4607a;
            if (str != null) {
                next = new b(str, next.f4608b, next.f4609c, next.f4610d, next.f4611e, new e(str, 1, next), next.f4613g);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
