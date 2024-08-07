package f0;

import android.support.v4.media.a;
import f0.s0;
import v.v;

/* compiled from: AutoValue_SurfaceConfig */
public final class d extends s0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f9521a;

    /* renamed from: b  reason: collision with root package name */
    public final s0.a f9522b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9523c;

    public d(int i10, s0.a aVar, long j10) {
        if (i10 != 0) {
            this.f9521a = i10;
            this.f9522b = aVar;
            this.f9523c = j10;
            return;
        }
        throw new NullPointerException("Null configType");
    }

    public final s0.a b() {
        return this.f9522b;
    }

    public final int c() {
        return this.f9521a;
    }

    public final long d() {
        return this.f9523c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (!v.a(this.f9521a, s0Var.c()) || !this.f9522b.equals(s0Var.b()) || this.f9523c != s0Var.d()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f9523c;
        return ((((v.g(this.f9521a) ^ 1000003) * 1000003) ^ this.f9522b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder q10 = a.q("SurfaceConfig{configType=");
        q10.append(b0.D(this.f9521a));
        q10.append(", configSize=");
        q10.append(this.f9522b);
        q10.append(", streamUseCase=");
        q10.append(this.f9523c);
        q10.append("}");
        return q10.toString();
    }
}
