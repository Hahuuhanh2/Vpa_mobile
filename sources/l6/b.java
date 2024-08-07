package l6;

import c6.d;
import java.util.Map;
import l6.e;
import o6.a;

/* compiled from: AutoValue_SchedulerConfig */
public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public final a f12714a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<d, e.a> f12715b;

    public b(a aVar, Map<d, e.a> map) {
        if (aVar != null) {
            this.f12714a = aVar;
            if (map != null) {
                this.f12715b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public final a a() {
        return this.f12714a;
    }

    public final Map<d, e.a> c() {
        return this.f12715b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f12714a.equals(eVar.a()) || !this.f12715b.equals(eVar.c())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f12714a.hashCode() ^ 1000003) * 1000003) ^ this.f12715b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("SchedulerConfig{clock=");
        q10.append(this.f12714a);
        q10.append(", values=");
        q10.append(this.f12715b);
        q10.append("}");
        return q10.toString();
    }
}
