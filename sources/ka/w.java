package ka;

import android.support.v4.media.a;
import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_User */
public final class w extends b0.e.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f12430a;

    public w(String str) {
        this.f12430a = str;
    }

    public final String a() {
        return this.f12430a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.f) {
            return this.f12430a.equals(((b0.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f12430a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.o(a.q("User{identifier="), this.f12430a, "}");
    }
}
