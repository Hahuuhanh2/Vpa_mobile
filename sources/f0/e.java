package f0;

import android.support.v4.media.a;
import android.util.Size;
import java.util.Map;

/* compiled from: AutoValue_SurfaceSizeDefinition */
public final class e extends t0 {

    /* renamed from: a  reason: collision with root package name */
    public final Size f9524a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, Size> f9525b;

    /* renamed from: c  reason: collision with root package name */
    public final Size f9526c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Integer, Size> f9527d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f9528e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Integer, Size> f9529f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<Integer, Size> f9530g;

    public e(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size != null) {
            this.f9524a = size;
            if (map != null) {
                this.f9525b = map;
                if (size2 != null) {
                    this.f9526c = size2;
                    if (map2 != null) {
                        this.f9527d = map2;
                        if (size3 != null) {
                            this.f9528e = size3;
                            if (map3 != null) {
                                this.f9529f = map3;
                                if (map4 != null) {
                                    this.f9530g = map4;
                                    return;
                                }
                                throw new NullPointerException("Null ultraMaximumSizeMap");
                            }
                            throw new NullPointerException("Null maximumSizeMap");
                        }
                        throw new NullPointerException("Null recordSize");
                    }
                    throw new NullPointerException("Null s1440pSizeMap");
                }
                throw new NullPointerException("Null previewSize");
            }
            throw new NullPointerException("Null s720pSizeMap");
        }
        throw new NullPointerException("Null analysisSize");
    }

    public final Size a() {
        return this.f9524a;
    }

    public final Map<Integer, Size> b() {
        return this.f9529f;
    }

    public final Size c() {
        return this.f9526c;
    }

    public final Size d() {
        return this.f9528e;
    }

    public final Map<Integer, Size> e() {
        return this.f9527d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (!this.f9524a.equals(t0Var.a()) || !this.f9525b.equals(t0Var.f()) || !this.f9526c.equals(t0Var.c()) || !this.f9527d.equals(t0Var.e()) || !this.f9528e.equals(t0Var.d()) || !this.f9529f.equals(t0Var.b()) || !this.f9530g.equals(t0Var.g())) {
            return false;
        }
        return true;
    }

    public final Map<Integer, Size> f() {
        return this.f9525b;
    }

    public final Map<Integer, Size> g() {
        return this.f9530g;
    }

    public final int hashCode() {
        return ((((((((((((this.f9524a.hashCode() ^ 1000003) * 1000003) ^ this.f9525b.hashCode()) * 1000003) ^ this.f9526c.hashCode()) * 1000003) ^ this.f9527d.hashCode()) * 1000003) ^ this.f9528e.hashCode()) * 1000003) ^ this.f9529f.hashCode()) * 1000003) ^ this.f9530g.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("SurfaceSizeDefinition{analysisSize=");
        q10.append(this.f9524a);
        q10.append(", s720pSizeMap=");
        q10.append(this.f9525b);
        q10.append(", previewSize=");
        q10.append(this.f9526c);
        q10.append(", s1440pSizeMap=");
        q10.append(this.f9527d);
        q10.append(", recordSize=");
        q10.append(this.f9528e);
        q10.append(", maximumSizeMap=");
        q10.append(this.f9529f);
        q10.append(", ultraMaximumSizeMap=");
        q10.append(this.f9530g);
        q10.append("}");
        return q10.toString();
    }
}
