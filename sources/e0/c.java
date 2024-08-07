package e0;

import android.support.v4.media.a;
import androidx.camera.core.d;
import e0.l;
import n0.k;
import v.v;

/* compiled from: AutoValue_CaptureNode_Out */
public final class c extends l.c {

    /* renamed from: a  reason: collision with root package name */
    public final k<d> f8985a;

    /* renamed from: b  reason: collision with root package name */
    public final k<w> f8986b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8987c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8988d;

    public c(k<d> kVar, k<w> kVar2, int i10, int i11) {
        this.f8985a = kVar;
        this.f8986b = kVar2;
        this.f8987c = i10;
        this.f8988d = i11;
    }

    public final k<d> a() {
        return this.f8985a;
    }

    public final int b() {
        return this.f8987c;
    }

    public final int c() {
        return this.f8988d;
    }

    public final k<w> d() {
        return this.f8986b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l.c)) {
            return false;
        }
        l.c cVar = (l.c) obj;
        if (!this.f8985a.equals(cVar.a()) || !this.f8986b.equals(cVar.d()) || this.f8987c != cVar.b() || this.f8988d != cVar.c()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.f8985a.hashCode() ^ 1000003) * 1000003) ^ this.f8986b.hashCode()) * 1000003) ^ this.f8987c) * 1000003) ^ this.f8988d;
    }

    public final String toString() {
        StringBuilder q10 = a.q("Out{imageEdge=");
        q10.append(this.f8985a);
        q10.append(", requestEdge=");
        q10.append(this.f8986b);
        q10.append(", inputFormat=");
        q10.append(this.f8987c);
        q10.append(", outputFormat=");
        return v.e(q10, this.f8988d, "}");
    }
}
