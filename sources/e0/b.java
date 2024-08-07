package e0;

import android.support.v4.media.a;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import c0.n0;
import e0.l;
import n0.k;

/* compiled from: AutoValue_CaptureNode_In */
public final class b extends l.b {

    /* renamed from: c  reason: collision with root package name */
    public final Size f8976c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8977d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8978e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8979f;

    /* renamed from: g  reason: collision with root package name */
    public final n0 f8980g;

    /* renamed from: h  reason: collision with root package name */
    public final k<w> f8981h;

    /* renamed from: i  reason: collision with root package name */
    public final k<ImageCaptureException> f8982i;

    public b(Size size, int i10, int i11, boolean z10, n0 n0Var, k<w> kVar, k<ImageCaptureException> kVar2) {
        if (size != null) {
            this.f8976c = size;
            this.f8977d = i10;
            this.f8978e = i11;
            this.f8979f = z10;
            this.f8980g = n0Var;
            this.f8981h = kVar;
            this.f8982i = kVar2;
            return;
        }
        throw new NullPointerException("Null size");
    }

    public final k<ImageCaptureException> a() {
        return this.f8982i;
    }

    public final n0 b() {
        return this.f8980g;
    }

    public final int c() {
        return this.f8977d;
    }

    public final int d() {
        return this.f8978e;
    }

    public final k<w> e() {
        return this.f8981h;
    }

    public final boolean equals(Object obj) {
        n0 n0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l.b)) {
            return false;
        }
        l.b bVar = (l.b) obj;
        if (!this.f8976c.equals(bVar.f()) || this.f8977d != bVar.c() || this.f8978e != bVar.d() || this.f8979f != bVar.g() || ((n0Var = this.f8980g) != null ? !n0Var.equals(bVar.b()) : bVar.b() != null) || !this.f8981h.equals(bVar.e()) || !this.f8982i.equals(bVar.a())) {
            return false;
        }
        return true;
    }

    public final Size f() {
        return this.f8976c;
    }

    public final boolean g() {
        return this.f8979f;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (((((this.f8976c.hashCode() ^ 1000003) * 1000003) ^ this.f8977d) * 1000003) ^ this.f8978e) * 1000003;
        if (this.f8979f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode ^ i10) * 1000003;
        n0 n0Var = this.f8980g;
        if (n0Var == null) {
            i11 = 0;
        } else {
            i11 = n0Var.hashCode();
        }
        return ((((i12 ^ i11) * 1000003) ^ this.f8981h.hashCode()) * 1000003) ^ this.f8982i.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("In{size=");
        q10.append(this.f8976c);
        q10.append(", inputFormat=");
        q10.append(this.f8977d);
        q10.append(", outputFormat=");
        q10.append(this.f8978e);
        q10.append(", virtualCamera=");
        q10.append(this.f8979f);
        q10.append(", imageReaderProxyProvider=");
        q10.append(this.f8980g);
        q10.append(", requestEdge=");
        q10.append(this.f8981h);
        q10.append(", errorEdge=");
        q10.append(this.f8982i);
        q10.append("}");
        return q10.toString();
    }
}
