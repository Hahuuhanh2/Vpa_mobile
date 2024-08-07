package ka;

import android.support.v4.media.a;
import ka.d0;

/* compiled from: AutoValue_StaticSessionData */
public final class x extends d0 {

    /* renamed from: a  reason: collision with root package name */
    public final d0.a f12431a;

    /* renamed from: b  reason: collision with root package name */
    public final d0.c f12432b;

    /* renamed from: c  reason: collision with root package name */
    public final d0.b f12433c;

    public x(y yVar, a0 a0Var, z zVar) {
        this.f12431a = yVar;
        this.f12432b = a0Var;
        this.f12433c = zVar;
    }

    public final d0.a a() {
        return this.f12431a;
    }

    public final d0.b b() {
        return this.f12433c;
    }

    public final d0.c c() {
        return this.f12432b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!this.f12431a.equals(d0Var.a()) || !this.f12432b.equals(d0Var.c()) || !this.f12433c.equals(d0Var.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f12431a.hashCode() ^ 1000003) * 1000003) ^ this.f12432b.hashCode()) * 1000003) ^ this.f12433c.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("StaticSessionData{appData=");
        q10.append(this.f12431a);
        q10.append(", osData=");
        q10.append(this.f12432b);
        q10.append(", deviceData=");
        q10.append(this.f12433c);
        q10.append("}");
        return q10.toString();
    }
}
