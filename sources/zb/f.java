package zb;

import android.support.v4.media.a;
import sk.j;

/* compiled from: SettingsCache.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f17928a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f17929b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f17930c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f17931d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f17932e;

    public f(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f17928a = bool;
        this.f17929b = d10;
        this.f17930c = num;
        this.f17931d = num2;
        this.f17932e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return j.a(this.f17928a, fVar.f17928a) && j.a(this.f17929b, fVar.f17929b) && j.a(this.f17930c, fVar.f17930c) && j.a(this.f17931d, fVar.f17931d) && j.a(this.f17932e, fVar.f17932e);
    }

    public final int hashCode() {
        Boolean bool = this.f17928a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f17929b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f17930c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17931d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f17932e;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return hashCode4 + i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("SessionConfigs(sessionEnabled=");
        q10.append(this.f17928a);
        q10.append(", sessionSamplingRate=");
        q10.append(this.f17929b);
        q10.append(", sessionRestartTimeout=");
        q10.append(this.f17930c);
        q10.append(", cacheDuration=");
        q10.append(this.f17931d);
        q10.append(", cacheUpdatedTime=");
        q10.append(this.f17932e);
        q10.append(')');
        return q10.toString();
    }
}
