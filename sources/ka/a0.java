package ka;

import android.support.v4.media.a;
import ka.d0;

/* compiled from: AutoValue_StaticSessionData_OsData */
public final class a0 extends d0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f12238a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12239b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12240c;

    public a0(String str, String str2, boolean z10) {
        if (str != null) {
            this.f12238a = str;
            if (str2 != null) {
                this.f12239b = str2;
                this.f12240c = z10;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public final boolean a() {
        return this.f12240c;
    }

    public final String b() {
        return this.f12239b;
    }

    public final String c() {
        return this.f12238a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.c)) {
            return false;
        }
        d0.c cVar = (d0.c) obj;
        if (!this.f12238a.equals(cVar.c()) || !this.f12239b.equals(cVar.b()) || this.f12240c != cVar.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((this.f12238a.hashCode() ^ 1000003) * 1000003) ^ this.f12239b.hashCode()) * 1000003;
        if (this.f12240c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("OsData{osRelease=");
        q10.append(this.f12238a);
        q10.append(", osCodeName=");
        q10.append(this.f12239b);
        q10.append(", isRooted=");
        q10.append(this.f12240c);
        q10.append("}");
        return q10.toString();
    }
}
