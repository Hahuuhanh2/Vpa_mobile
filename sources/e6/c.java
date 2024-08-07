package e6;

import android.support.v4.media.a;

/* compiled from: AutoValue_AndroidClientInfo */
public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f9191a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9192b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9193c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9194d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9195e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9196f;

    /* renamed from: g  reason: collision with root package name */
    public final String f9197g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9198h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9199i;

    /* renamed from: j  reason: collision with root package name */
    public final String f9200j;

    /* renamed from: k  reason: collision with root package name */
    public final String f9201k;

    /* renamed from: l  reason: collision with root package name */
    public final String f9202l;

    public c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f9191a = num;
        this.f9192b = str;
        this.f9193c = str2;
        this.f9194d = str3;
        this.f9195e = str4;
        this.f9196f = str5;
        this.f9197g = str6;
        this.f9198h = str7;
        this.f9199i = str8;
        this.f9200j = str9;
        this.f9201k = str10;
        this.f9202l = str11;
    }

    public final String a() {
        return this.f9202l;
    }

    public final String b() {
        return this.f9200j;
    }

    public final String c() {
        return this.f9194d;
    }

    public final String d() {
        return this.f9198h;
    }

    public final String e() {
        return this.f9193c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f9191a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f9192b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.f9193c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.f9194d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f9195e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f9196f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f9197g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f9198h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f9199i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f9200j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f9201k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f9202l;
                                                    if (str11 == null) {
                                                        if (aVar.a() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.a())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.f9199i;
    }

    public final String g() {
        return this.f9197g;
    }

    public final String h() {
        return this.f9201k;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Integer num = this.f9191a;
        int i21 = 0;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        int i22 = (i10 ^ 1000003) * 1000003;
        String str = this.f9192b;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i23 = (i22 ^ i11) * 1000003;
        String str2 = this.f9193c;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int i24 = (i23 ^ i12) * 1000003;
        String str3 = this.f9194d;
        if (str3 == null) {
            i13 = 0;
        } else {
            i13 = str3.hashCode();
        }
        int i25 = (i24 ^ i13) * 1000003;
        String str4 = this.f9195e;
        if (str4 == null) {
            i14 = 0;
        } else {
            i14 = str4.hashCode();
        }
        int i26 = (i25 ^ i14) * 1000003;
        String str5 = this.f9196f;
        if (str5 == null) {
            i15 = 0;
        } else {
            i15 = str5.hashCode();
        }
        int i27 = (i26 ^ i15) * 1000003;
        String str6 = this.f9197g;
        if (str6 == null) {
            i16 = 0;
        } else {
            i16 = str6.hashCode();
        }
        int i28 = (i27 ^ i16) * 1000003;
        String str7 = this.f9198h;
        if (str7 == null) {
            i17 = 0;
        } else {
            i17 = str7.hashCode();
        }
        int i29 = (i28 ^ i17) * 1000003;
        String str8 = this.f9199i;
        if (str8 == null) {
            i18 = 0;
        } else {
            i18 = str8.hashCode();
        }
        int i30 = (i29 ^ i18) * 1000003;
        String str9 = this.f9200j;
        if (str9 == null) {
            i19 = 0;
        } else {
            i19 = str9.hashCode();
        }
        int i31 = (i30 ^ i19) * 1000003;
        String str10 = this.f9201k;
        if (str10 == null) {
            i20 = 0;
        } else {
            i20 = str10.hashCode();
        }
        int i32 = (i31 ^ i20) * 1000003;
        String str11 = this.f9202l;
        if (str11 != null) {
            i21 = str11.hashCode();
        }
        return i32 ^ i21;
    }

    public final String i() {
        return this.f9192b;
    }

    public final String j() {
        return this.f9196f;
    }

    public final String k() {
        return this.f9195e;
    }

    public final Integer l() {
        return this.f9191a;
    }

    public final String toString() {
        StringBuilder q10 = a.q("AndroidClientInfo{sdkVersion=");
        q10.append(this.f9191a);
        q10.append(", model=");
        q10.append(this.f9192b);
        q10.append(", hardware=");
        q10.append(this.f9193c);
        q10.append(", device=");
        q10.append(this.f9194d);
        q10.append(", product=");
        q10.append(this.f9195e);
        q10.append(", osBuild=");
        q10.append(this.f9196f);
        q10.append(", manufacturer=");
        q10.append(this.f9197g);
        q10.append(", fingerprint=");
        q10.append(this.f9198h);
        q10.append(", locale=");
        q10.append(this.f9199i);
        q10.append(", country=");
        q10.append(this.f9200j);
        q10.append(", mccMnc=");
        q10.append(this.f9201k);
        q10.append(", applicationBuild=");
        return a.o(q10, this.f9202l, "}");
    }
}
