package xa;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_HeartBeatResult */
public final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17164a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f17165b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f17164a = str;
            this.f17165b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final List<String> a() {
        return this.f17165b;
    }

    public final String b() {
        return this.f17164a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f17164a.equals(gVar.b()) || !this.f17165b.equals(gVar.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f17164a.hashCode() ^ 1000003) * 1000003) ^ this.f17165b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("HeartBeatResult{userAgent=");
        q10.append(this.f17164a);
        q10.append(", usedDates=");
        q10.append(this.f17165b);
        q10.append("}");
        return q10.toString();
    }
}
