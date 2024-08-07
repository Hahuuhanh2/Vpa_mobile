package zd;

import fk.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sk.j;

/* compiled from: Week.kt */
public final class e implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f17988a;

    public e(ArrayList arrayList) {
        this.f17988a = arrayList;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<e> cls2 = e.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!j.a(cls2, cls)) {
            return false;
        }
        j.d(obj, "null cannot be cast to non-null type com.kizitonwose.calendar.core.Week");
        e eVar = (e) obj;
        if (j.a(p.M0(this.f17988a), p.M0(eVar.f17988a)) && j.a(p.R0(this.f17988a), p.R0(eVar.f17988a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((f) p.R0(this.f17988a)).hashCode() + (((f) p.M0(this.f17988a)).hashCode() * 31);
    }

    public final String toString() {
        Object M0 = p.M0(this.f17988a);
        Object R0 = p.R0(this.f17988a);
        return "Week { first = " + M0 + ", last = " + R0 + " } ";
    }
}
