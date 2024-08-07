package n0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.support.v4.media.a;
import android.util.Size;
import f0.k;
import g0.e;

/* compiled from: AutoValue_Packet */
public final class c<T> extends n<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f13309a;

    /* renamed from: b  reason: collision with root package name */
    public final e f13310b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13311c;

    /* renamed from: d  reason: collision with root package name */
    public final Size f13312d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f13313e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13314f;

    /* renamed from: g  reason: collision with root package name */
    public final Matrix f13315g;

    /* renamed from: h  reason: collision with root package name */
    public final k f13316h;

    public c(T t10, e eVar, int i10, Size size, Rect rect, int i11, Matrix matrix, k kVar) {
        if (t10 != null) {
            this.f13309a = t10;
            this.f13310b = eVar;
            this.f13311c = i10;
            if (size != null) {
                this.f13312d = size;
                if (rect != null) {
                    this.f13313e = rect;
                    this.f13314f = i11;
                    if (matrix != null) {
                        this.f13315g = matrix;
                        if (kVar != null) {
                            this.f13316h = kVar;
                            return;
                        }
                        throw new NullPointerException("Null cameraCaptureResult");
                    }
                    throw new NullPointerException("Null sensorToBufferTransform");
                }
                throw new NullPointerException("Null cropRect");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null data");
    }

    public final k a() {
        return this.f13316h;
    }

    public final Rect b() {
        return this.f13313e;
    }

    public final T c() {
        return this.f13309a;
    }

    public final e d() {
        return this.f13310b;
    }

    public final int e() {
        return this.f13311c;
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f13309a.equals(nVar.c()) || ((eVar = this.f13310b) != null ? !eVar.equals(nVar.d()) : nVar.d() != null) || this.f13311c != nVar.e() || !this.f13312d.equals(nVar.h()) || !this.f13313e.equals(nVar.b()) || this.f13314f != nVar.f() || !this.f13315g.equals(nVar.g()) || !this.f13316h.equals(nVar.a())) {
            return false;
        }
        return true;
    }

    public final int f() {
        return this.f13314f;
    }

    public final Matrix g() {
        return this.f13315g;
    }

    public final Size h() {
        return this.f13312d;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f13309a.hashCode() ^ 1000003) * 1000003;
        e eVar = this.f13310b;
        if (eVar == null) {
            i10 = 0;
        } else {
            i10 = eVar.hashCode();
        }
        return ((((((((((((hashCode ^ i10) * 1000003) ^ this.f13311c) * 1000003) ^ this.f13312d.hashCode()) * 1000003) ^ this.f13313e.hashCode()) * 1000003) ^ this.f13314f) * 1000003) ^ this.f13315g.hashCode()) * 1000003) ^ this.f13316h.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("Packet{data=");
        q10.append(this.f13309a);
        q10.append(", exif=");
        q10.append(this.f13310b);
        q10.append(", format=");
        q10.append(this.f13311c);
        q10.append(", size=");
        q10.append(this.f13312d);
        q10.append(", cropRect=");
        q10.append(this.f13313e);
        q10.append(", rotationDegrees=");
        q10.append(this.f13314f);
        q10.append(", sensorToBufferTransform=");
        q10.append(this.f13315g);
        q10.append(", cameraCaptureResult=");
        q10.append(this.f13316h);
        q10.append("}");
        return q10.toString();
    }
}
