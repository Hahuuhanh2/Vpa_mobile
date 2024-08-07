package ia;

import android.support.v4.media.a;
import ia.l0;

/* compiled from: AutoValue_InstallIdProvider_InstallIds */
public final class c extends l0.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f11277a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11278b;

    public c(String str, String str2) {
        if (str != null) {
            this.f11277a = str;
            this.f11278b = str2;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final String a() {
        return this.f11277a;
    }

    public final String b() {
        return this.f11278b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l0.a)) {
            return false;
        }
        l0.a aVar = (l0.a) obj;
        if (this.f11277a.equals(aVar.a())) {
            String str = this.f11278b;
            if (str == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (str.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f11277a.hashCode() ^ 1000003) * 1000003;
        String str = this.f11278b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("InstallIds{crashlyticsInstallId=");
        q10.append(this.f11277a);
        q10.append(", firebaseInstallationId=");
        return a.o(q10, this.f11278b, "}");
    }
}
