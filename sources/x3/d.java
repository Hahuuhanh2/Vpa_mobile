package x3;

import android.support.v4.media.a;
import sk.j;

/* compiled from: Preference.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f16999a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f17000b;

    public d(String str, Long l10) {
        this.f16999a = str;
        this.f17000b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f16999a, dVar.f16999a) && j.a(this.f17000b, dVar.f17000b);
    }

    public final int hashCode() {
        int hashCode = this.f16999a.hashCode() * 31;
        Long l10 = this.f17000b;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        StringBuilder q10 = a.q("Preference(key=");
        q10.append(this.f16999a);
        q10.append(", value=");
        q10.append(this.f17000b);
        q10.append(')');
        return q10.toString();
    }
}
