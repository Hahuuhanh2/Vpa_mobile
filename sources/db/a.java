package db;

import v.v;

/* compiled from: AutoValue_InstallationResponse */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f8866a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8867b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8868c;

    /* renamed from: d  reason: collision with root package name */
    public final f f8869d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8870e;

    public a(String str, String str2, String str3, f fVar, int i10) {
        this.f8866a = str;
        this.f8867b = str2;
        this.f8868c = str3;
        this.f8869d = fVar;
        this.f8870e = i10;
    }

    public final f a() {
        return this.f8869d;
    }

    public final String b() {
        return this.f8867b;
    }

    public final String c() {
        return this.f8868c;
    }

    public final int d() {
        return this.f8870e;
    }

    public final String e() {
        return this.f8866a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f8866a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f8867b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f8868c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.f8869d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        int i10 = this.f8870e;
                        if (i10 == 0) {
                            if (dVar.d() == 0) {
                                return true;
                            }
                        } else if (v.a(i10, dVar.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        String str = this.f8866a;
        int i14 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = (i10 ^ 1000003) * 1000003;
        String str2 = this.f8867b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i16 = (i15 ^ i11) * 1000003;
        String str3 = this.f8868c;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i17 = (i16 ^ i12) * 1000003;
        f fVar = this.f8869d;
        if (fVar == null) {
            i13 = 0;
        } else {
            i13 = fVar.hashCode();
        }
        int i18 = (i17 ^ i13) * 1000003;
        int i19 = this.f8870e;
        if (i19 != 0) {
            i14 = v.g(i19);
        }
        return i18 ^ i14;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("InstallationResponse{uri=");
        q10.append(this.f8866a);
        q10.append(", fid=");
        q10.append(this.f8867b);
        q10.append(", refreshToken=");
        q10.append(this.f8868c);
        q10.append(", authToken=");
        q10.append(this.f8869d);
        q10.append(", responseCode=");
        q10.append(android.support.v4.media.a.D(this.f8870e));
        q10.append("}");
        return q10.toString();
    }
}
