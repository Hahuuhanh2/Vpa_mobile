package ka;

import android.support.v4.media.a;
import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application */
public final class i extends b0.e.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f12319a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12320b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12321c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.a.C0141a f12322d = null;

    /* renamed from: e  reason: collision with root package name */
    public final String f12323e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12324f;

    /* renamed from: g  reason: collision with root package name */
    public final String f12325g;

    public i(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f12319a = str;
        this.f12320b = str2;
        this.f12321c = str3;
        this.f12323e = str4;
        this.f12324f = str5;
        this.f12325g = str6;
    }

    public final String a() {
        return this.f12324f;
    }

    public final String b() {
        return this.f12325g;
    }

    public final String c() {
        return this.f12321c;
    }

    public final String d() {
        return this.f12319a;
    }

    public final String e() {
        return this.f12323e;
    }

    public final boolean equals(Object obj) {
        String str;
        b0.e.a.C0141a aVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.a)) {
            return false;
        }
        b0.e.a aVar2 = (b0.e.a) obj;
        if (this.f12319a.equals(aVar2.d()) && this.f12320b.equals(aVar2.g()) && ((str = this.f12321c) != null ? str.equals(aVar2.c()) : aVar2.c() == null) && ((aVar = this.f12322d) != null ? aVar.equals(aVar2.f()) : aVar2.f() == null) && ((str2 = this.f12323e) != null ? str2.equals(aVar2.e()) : aVar2.e() == null) && ((str3 = this.f12324f) != null ? str3.equals(aVar2.a()) : aVar2.a() == null)) {
            String str4 = this.f12325g;
            if (str4 == null) {
                if (aVar2.b() == null) {
                    return true;
                }
            } else if (str4.equals(aVar2.b())) {
                return true;
            }
        }
        return false;
    }

    public final b0.e.a.C0141a f() {
        return this.f12322d;
    }

    public final String g() {
        return this.f12320b;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int hashCode = (((this.f12319a.hashCode() ^ 1000003) * 1000003) ^ this.f12320b.hashCode()) * 1000003;
        String str = this.f12321c;
        int i14 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = (hashCode ^ i10) * 1000003;
        b0.e.a.C0141a aVar = this.f12322d;
        if (aVar == null) {
            i11 = 0;
        } else {
            i11 = aVar.hashCode();
        }
        int i16 = (i15 ^ i11) * 1000003;
        String str2 = this.f12323e;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int i17 = (i16 ^ i12) * 1000003;
        String str3 = this.f12324f;
        if (str3 == null) {
            i13 = 0;
        } else {
            i13 = str3.hashCode();
        }
        int i18 = (i17 ^ i13) * 1000003;
        String str4 = this.f12325g;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i18 ^ i14;
    }

    public final String toString() {
        StringBuilder q10 = a.q("Application{identifier=");
        q10.append(this.f12319a);
        q10.append(", version=");
        q10.append(this.f12320b);
        q10.append(", displayVersion=");
        q10.append(this.f12321c);
        q10.append(", organization=");
        q10.append(this.f12322d);
        q10.append(", installationUuid=");
        q10.append(this.f12323e);
        q10.append(", developmentPlatform=");
        q10.append(this.f12324f);
        q10.append(", developmentPlatformVersion=");
        return a.o(q10, this.f12325g, "}");
    }
}
