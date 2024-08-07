package ka;

import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch */
public final class d extends b0.a.C0139a {

    /* renamed from: a  reason: collision with root package name */
    public final String f12283a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12284b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12285c;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch */
    public static final class a extends b0.a.C0139a.C0140a {

        /* renamed from: a  reason: collision with root package name */
        public String f12286a;

        /* renamed from: b  reason: collision with root package name */
        public String f12287b;

        /* renamed from: c  reason: collision with root package name */
        public String f12288c;

        public final d a() {
            String str;
            if (this.f12286a == null) {
                str = " arch";
            } else {
                str = "";
            }
            if (this.f12287b == null) {
                str = f0.b0.r(str, " libraryName");
            }
            if (this.f12288c == null) {
                str = f0.b0.r(str, " buildId");
            }
            if (str.isEmpty()) {
                return new d(this.f12286a, this.f12287b, this.f12288c);
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }
    }

    public d(String str, String str2, String str3) {
        this.f12283a = str;
        this.f12284b = str2;
        this.f12285c = str3;
    }

    public final String a() {
        return this.f12283a;
    }

    public final String b() {
        return this.f12285c;
    }

    public final String c() {
        return this.f12284b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.a.C0139a)) {
            return false;
        }
        b0.a.C0139a aVar = (b0.a.C0139a) obj;
        if (!this.f12283a.equals(aVar.a()) || !this.f12284b.equals(aVar.c()) || !this.f12285c.equals(aVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f12283a.hashCode() ^ 1000003) * 1000003) ^ this.f12284b.hashCode()) * 1000003) ^ this.f12285c.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("BuildIdMappingForArch{arch=");
        q10.append(this.f12283a);
        q10.append(", libraryName=");
        q10.append(this.f12284b);
        q10.append(", buildId=");
        return android.support.v4.media.a.o(q10, this.f12285c, "}");
    }
}
