package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.support.v4.media.a;
import c0.d1;

/* compiled from: AutoValue_SurfaceRequest_TransformationInfo */
public final class i extends d1.d {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f4282a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4283b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4284c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4285d;

    /* renamed from: e  reason: collision with root package name */
    public final Matrix f4286e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4287f;

    public i(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect != null) {
            this.f4282a = rect;
            this.f4283b = i10;
            this.f4284c = i11;
            this.f4285d = z10;
            if (matrix != null) {
                this.f4286e = matrix;
                this.f4287f = z11;
                return;
            }
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        throw new NullPointerException("Null getCropRect");
    }

    public final Rect a() {
        return this.f4282a;
    }

    public final boolean b() {
        return this.f4287f;
    }

    public final int c() {
        return this.f4283b;
    }

    public final Matrix d() {
        return this.f4286e;
    }

    public final int e() {
        return this.f4284c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d1.d)) {
            return false;
        }
        d1.d dVar = (d1.d) obj;
        if (this.f4282a.equals(dVar.a()) && this.f4283b == dVar.c() && this.f4284c == dVar.e() && this.f4285d == dVar.f() && this.f4286e.equals(dVar.d()) && this.f4287f == dVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f4285d;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f4282a.hashCode() ^ 1000003) * 1000003) ^ this.f4283b) * 1000003) ^ this.f4284c) * 1000003;
        int i11 = 1231;
        if (this.f4285d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode2 = (((hashCode ^ i10) * 1000003) ^ this.f4286e.hashCode()) * 1000003;
        if (!this.f4287f) {
            i11 = 1237;
        }
        return hashCode2 ^ i11;
    }

    public final String toString() {
        StringBuilder q10 = a.q("TransformationInfo{getCropRect=");
        q10.append(this.f4282a);
        q10.append(", getRotationDegrees=");
        q10.append(this.f4283b);
        q10.append(", getTargetRotation=");
        q10.append(this.f4284c);
        q10.append(", hasCameraTransform=");
        q10.append(this.f4285d);
        q10.append(", getSensorToBufferTransform=");
        q10.append(this.f4286e);
        q10.append(", getMirroring=");
        q10.append(this.f4287f);
        q10.append("}");
        return q10.toString();
    }
}
