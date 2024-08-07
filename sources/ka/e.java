package ka;

import android.support.v4.media.a;
import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute */
public final class e extends b0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f12289a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12290b;

    public e(String str, String str2) {
        this.f12289a = str;
        this.f12290b = str2;
    }

    public final String a() {
        return this.f12289a;
    }

    public final String b() {
        return this.f12290b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.c)) {
            return false;
        }
        b0.c cVar = (b0.c) obj;
        if (!this.f12289a.equals(cVar.a()) || !this.f12290b.equals(cVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f12289a.hashCode() ^ 1000003) * 1000003) ^ this.f12290b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("CustomAttribute{key=");
        q10.append(this.f12289a);
        q10.append(", value=");
        return a.o(q10, this.f12290b, "}");
    }
}
