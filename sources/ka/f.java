package ka;

import android.support.v4.media.a;
import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload */
public final class f extends b0.d {

    /* renamed from: a  reason: collision with root package name */
    public final c0<b0.d.a> f12291a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12292b;

    public f() {
        throw null;
    }

    public f(c0 c0Var, String str) {
        this.f12291a = c0Var;
        this.f12292b = str;
    }

    public final c0<b0.d.a> a() {
        return this.f12291a;
    }

    public final String b() {
        return this.f12292b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.d)) {
            return false;
        }
        b0.d dVar = (b0.d) obj;
        if (this.f12291a.equals(dVar.a())) {
            String str = this.f12292b;
            if (str == null) {
                if (dVar.b() == null) {
                    return true;
                }
            } else if (str.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f12291a.hashCode() ^ 1000003) * 1000003;
        String str = this.f12292b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("FilesPayload{files=");
        q10.append(this.f12291a);
        q10.append(", orgId=");
        return a.o(q10, this.f12292b, "}");
    }
}
