package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

final class g implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f18323a;

    g(ArrayList arrayList) {
        this.f18323a = arrayList;
    }

    public final Object run() {
        Class<i> cls = i.class;
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                i cast = cls.cast(Class.forName(property, true, cls.getClassLoader()).newInstance());
                i.e(cast);
                this.f18323a.add(cast);
                return null;
            } catch (Exception e10) {
                throw new Error(e10);
            }
        } else {
            i.e(new h());
            return null;
        }
    }
}
