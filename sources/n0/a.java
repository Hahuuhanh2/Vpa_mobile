package n0;

import n0.j;
import z0.b;

/* compiled from: AutoValue_DefaultSurfaceProcessor_PendingSnapshot */
public final class a extends j.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f13303a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13304b;

    /* renamed from: c  reason: collision with root package name */
    public final b.a<Void> f13305c;

    public a(int i10, int i11, b.a<Void> aVar) {
        this.f13303a = i10;
        this.f13304b = i11;
        this.f13305c = aVar;
    }

    public final b.a<Void> a() {
        return this.f13305c;
    }

    public final int b() {
        return this.f13303a;
    }

    public final int c() {
        return this.f13304b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j.b)) {
            return false;
        }
        j.b bVar = (j.b) obj;
        if (this.f13303a == bVar.b() && this.f13304b == bVar.c() && this.f13305c.equals(bVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13303a ^ 1000003) * 1000003) ^ this.f13304b) * 1000003) ^ this.f13305c.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("PendingSnapshot{jpegQuality=");
        q10.append(this.f13303a);
        q10.append(", rotationDegrees=");
        q10.append(this.f13304b);
        q10.append(", completer=");
        q10.append(this.f13305c);
        q10.append("}");
        return q10.toString();
    }
}
