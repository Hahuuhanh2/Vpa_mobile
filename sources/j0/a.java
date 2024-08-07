package j0;

/* compiled from: AutoValue_ImmutableZoomState */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final float f11447a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11448b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11449c;

    /* renamed from: d  reason: collision with root package name */
    public final float f11450d;

    public a(float f10, float f11, float f12, float f13) {
        this.f11447a = f10;
        this.f11448b = f11;
        this.f11449c = f12;
        this.f11450d = f13;
    }

    public final float a() {
        return this.f11450d;
    }

    public final float b() {
        return this.f11448b;
    }

    public final float c() {
        return this.f11449c;
    }

    public final float d() {
        return this.f11447a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Float.floatToIntBits(this.f11447a) == Float.floatToIntBits(dVar.d()) && Float.floatToIntBits(this.f11448b) == Float.floatToIntBits(dVar.b()) && Float.floatToIntBits(this.f11449c) == Float.floatToIntBits(dVar.c()) && Float.floatToIntBits(this.f11450d) == Float.floatToIntBits(dVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f11447a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f11448b)) * 1000003) ^ Float.floatToIntBits(this.f11449c)) * 1000003) ^ Float.floatToIntBits(this.f11450d);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ImmutableZoomState{zoomRatio=");
        q10.append(this.f11447a);
        q10.append(", maxZoomRatio=");
        q10.append(this.f11448b);
        q10.append(", minZoomRatio=");
        q10.append(this.f11449c);
        q10.append(", linearZoom=");
        q10.append(this.f11450d);
        q10.append("}");
        return q10.toString();
    }
}
