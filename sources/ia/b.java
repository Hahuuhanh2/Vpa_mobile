package ia;

import android.support.v4.media.a;
import java.io.File;
import ka.b0;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId */
public final class b extends e0 {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f11258a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11259b;

    /* renamed from: c  reason: collision with root package name */
    public final File f11260c;

    public b(ka.b bVar, String str, File file) {
        this.f11258a = bVar;
        if (str != null) {
            this.f11259b = str;
            if (file != null) {
                this.f11260c = file;
                return;
            }
            throw new NullPointerException("Null reportFile");
        }
        throw new NullPointerException("Null sessionId");
    }

    public final b0 a() {
        return this.f11258a;
    }

    public final File b() {
        return this.f11260c;
    }

    public final String c() {
        return this.f11259b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (!this.f11258a.equals(e0Var.a()) || !this.f11259b.equals(e0Var.c()) || !this.f11260c.equals(e0Var.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f11258a.hashCode() ^ 1000003) * 1000003) ^ this.f11259b.hashCode()) * 1000003) ^ this.f11260c.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("CrashlyticsReportWithSessionId{report=");
        q10.append(this.f11258a);
        q10.append(", sessionId=");
        q10.append(this.f11259b);
        q10.append(", reportFile=");
        q10.append(this.f11260c);
        q10.append("}");
        return q10.toString();
    }
}
