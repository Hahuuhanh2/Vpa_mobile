package ka;

import android.support.v4.media.a;
import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log */
public final class u extends b0.e.d.C0152d {

    /* renamed from: a  reason: collision with root package name */
    public final String f12421a;

    public u(String str) {
        this.f12421a = str;
    }

    public final String a() {
        return this.f12421a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.C0152d) {
            return this.f12421a.equals(((b0.e.d.C0152d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f12421a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.o(a.q("Log{content="), this.f12421a, "}");
    }
}
