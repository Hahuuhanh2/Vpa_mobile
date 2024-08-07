package ka;

import android.support.v4.media.a;
import fa.d;
import ka.d0;

/* compiled from: AutoValue_StaticSessionData_AppData */
public final class y extends d0.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f12434a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12435b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12436c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12437d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12438e;

    /* renamed from: f  reason: collision with root package name */
    public final d f12439f;

    public y(String str, String str2, String str3, String str4, int i10, d dVar) {
        if (str != null) {
            this.f12434a = str;
            if (str2 != null) {
                this.f12435b = str2;
                if (str3 != null) {
                    this.f12436c = str3;
                    if (str4 != null) {
                        this.f12437d = str4;
                        this.f12438e = i10;
                        if (dVar != null) {
                            this.f12439f = dVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public final String a() {
        return this.f12434a;
    }

    public final int b() {
        return this.f12438e;
    }

    public final d c() {
        return this.f12439f;
    }

    public final String d() {
        return this.f12437d;
    }

    public final String e() {
        return this.f12435b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.a)) {
            return false;
        }
        d0.a aVar = (d0.a) obj;
        if (!this.f12434a.equals(aVar.a()) || !this.f12435b.equals(aVar.e()) || !this.f12436c.equals(aVar.f()) || !this.f12437d.equals(aVar.d()) || this.f12438e != aVar.b() || !this.f12439f.equals(aVar.c())) {
            return false;
        }
        return true;
    }

    public final String f() {
        return this.f12436c;
    }

    public final int hashCode() {
        return ((((((((((this.f12434a.hashCode() ^ 1000003) * 1000003) ^ this.f12435b.hashCode()) * 1000003) ^ this.f12436c.hashCode()) * 1000003) ^ this.f12437d.hashCode()) * 1000003) ^ this.f12438e) * 1000003) ^ this.f12439f.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("AppData{appIdentifier=");
        q10.append(this.f12434a);
        q10.append(", versionCode=");
        q10.append(this.f12435b);
        q10.append(", versionName=");
        q10.append(this.f12436c);
        q10.append(", installUuid=");
        q10.append(this.f12437d);
        q10.append(", deliveryMechanism=");
        q10.append(this.f12438e);
        q10.append(", developmentPlatformProvider=");
        q10.append(this.f12439f);
        q10.append("}");
        return q10.toString();
    }
}
