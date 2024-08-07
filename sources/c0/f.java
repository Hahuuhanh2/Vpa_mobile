package c0;

import android.graphics.Matrix;
import android.support.v4.media.a;
import f0.u0;

/* compiled from: AutoValue_ImmutableImageInfo */
public final class f extends o0 {

    /* renamed from: a  reason: collision with root package name */
    public final u0 f4249a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4250b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4251c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f4252d;

    public f(u0 u0Var, long j10, int i10, Matrix matrix) {
        if (u0Var != null) {
            this.f4249a = u0Var;
            this.f4250b = j10;
            this.f4251c = i10;
            if (matrix != null) {
                this.f4252d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    public final u0 a() {
        return this.f4249a;
    }

    public final long c() {
        return this.f4250b;
    }

    public final int d() {
        return this.f4251c;
    }

    public final Matrix e() {
        return this.f4252d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (!this.f4249a.equals(o0Var.a()) || this.f4250b != o0Var.c() || this.f4251c != o0Var.d() || !this.f4252d.equals(o0Var.e())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f4250b;
        return ((((((this.f4249a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f4251c) * 1000003) ^ this.f4252d.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("ImmutableImageInfo{tagBundle=");
        q10.append(this.f4249a);
        q10.append(", timestamp=");
        q10.append(this.f4250b);
        q10.append(", rotationDegrees=");
        q10.append(this.f4251c);
        q10.append(", sensorToBufferTransformMatrix=");
        q10.append(this.f4252d);
        q10.append("}");
        return q10.toString();
    }
}
