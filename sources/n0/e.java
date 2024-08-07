package n0;

import android.graphics.Rect;
import android.support.v4.media.a;
import android.util.Size;
import java.util.UUID;
import n0.x;

/* compiled from: AutoValue_SurfaceProcessorNode_OutConfig */
public final class e extends x.d {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f13319a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13320b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13321c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f13322d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f13323e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13324f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13325g;

    public e(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10) {
        if (uuid != null) {
            this.f13319a = uuid;
            this.f13320b = i10;
            this.f13321c = i11;
            if (rect != null) {
                this.f13322d = rect;
                if (size != null) {
                    this.f13323e = size;
                    this.f13324f = i12;
                    this.f13325g = z10;
                    return;
                }
                throw new NullPointerException("Null size");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null uuid");
    }

    public final Rect a() {
        return this.f13322d;
    }

    public final int b() {
        return this.f13321c;
    }

    public final boolean c() {
        return this.f13325g;
    }

    public final int d() {
        return this.f13324f;
    }

    public final Size e() {
        return this.f13323e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x.d)) {
            return false;
        }
        x.d dVar = (x.d) obj;
        if (this.f13319a.equals(dVar.g()) && this.f13320b == dVar.f() && this.f13321c == dVar.b() && this.f13322d.equals(dVar.a()) && this.f13323e.equals(dVar.e()) && this.f13324f == dVar.d() && this.f13325g == dVar.c()) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f13320b;
    }

    public final UUID g() {
        return this.f13319a;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((((((((this.f13319a.hashCode() ^ 1000003) * 1000003) ^ this.f13320b) * 1000003) ^ this.f13321c) * 1000003) ^ this.f13322d.hashCode()) * 1000003) ^ this.f13323e.hashCode()) * 1000003) ^ this.f13324f) * 1000003;
        if (this.f13325g) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("OutConfig{uuid=");
        q10.append(this.f13319a);
        q10.append(", targets=");
        q10.append(this.f13320b);
        q10.append(", format=");
        q10.append(this.f13321c);
        q10.append(", cropRect=");
        q10.append(this.f13322d);
        q10.append(", size=");
        q10.append(this.f13323e);
        q10.append(", rotationDegrees=");
        q10.append(this.f13324f);
        q10.append(", mirroring=");
        q10.append(this.f13325g);
        q10.append("}");
        return q10.toString();
    }
}
