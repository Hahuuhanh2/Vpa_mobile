package v;

import android.support.v4.media.a;
import android.util.Size;
import androidx.camera.core.impl.x;
import v.u;

/* compiled from: AutoValue_Camera2CameraImpl_UseCaseInfo */
public final class b extends u.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f15583a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f15584b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.camera.core.impl.u f15585c;

    /* renamed from: d  reason: collision with root package name */
    public final x<?> f15586d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f15587e;

    public b(String str, Class<?> cls, androidx.camera.core.impl.u uVar, x<?> xVar, Size size) {
        if (str != null) {
            this.f15583a = str;
            this.f15584b = cls;
            if (uVar != null) {
                this.f15585c = uVar;
                if (xVar != null) {
                    this.f15586d = xVar;
                    this.f15587e = size;
                    return;
                }
                throw new NullPointerException("Null useCaseConfig");
            }
            throw new NullPointerException("Null sessionConfig");
        }
        throw new NullPointerException("Null useCaseId");
    }

    public final androidx.camera.core.impl.u a() {
        return this.f15585c;
    }

    public final Size b() {
        return this.f15587e;
    }

    public final x<?> c() {
        return this.f15586d;
    }

    public final String d() {
        return this.f15583a;
    }

    public final Class<?> e() {
        return this.f15584b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u.f)) {
            return false;
        }
        u.f fVar = (u.f) obj;
        if (this.f15583a.equals(fVar.d()) && this.f15584b.equals(fVar.e()) && this.f15585c.equals(fVar.a()) && this.f15586d.equals(fVar.c())) {
            Size size = this.f15587e;
            if (size == null) {
                if (fVar.b() == null) {
                    return true;
                }
            } else if (size.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((((this.f15583a.hashCode() ^ 1000003) * 1000003) ^ this.f15584b.hashCode()) * 1000003) ^ this.f15585c.hashCode()) * 1000003) ^ this.f15586d.hashCode()) * 1000003;
        Size size = this.f15587e;
        if (size == null) {
            i10 = 0;
        } else {
            i10 = size.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("UseCaseInfo{useCaseId=");
        q10.append(this.f15583a);
        q10.append(", useCaseType=");
        q10.append(this.f15584b);
        q10.append(", sessionConfig=");
        q10.append(this.f15585c);
        q10.append(", useCaseConfig=");
        q10.append(this.f15586d);
        q10.append(", surfaceResolution=");
        q10.append(this.f15587e);
        q10.append("}");
        return q10.toString();
    }
}
