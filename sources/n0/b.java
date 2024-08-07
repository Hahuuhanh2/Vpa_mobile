package n0;

import android.opengl.EGLSurface;
import android.support.v4.media.a;
import n0.m;
import v.v;

/* compiled from: AutoValue_OpenGlRenderer_OutputSurface */
public final class b extends m.a {

    /* renamed from: a  reason: collision with root package name */
    public final EGLSurface f13306a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13307b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13308c;

    public b(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface != null) {
            this.f13306a = eGLSurface;
            this.f13307b = i10;
            this.f13308c = i11;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    public final EGLSurface a() {
        return this.f13306a;
    }

    public final int b() {
        return this.f13308c;
    }

    public final int c() {
        return this.f13307b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m.a)) {
            return false;
        }
        m.a aVar = (m.a) obj;
        if (this.f13306a.equals(aVar.a()) && this.f13307b == aVar.c() && this.f13308c == aVar.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13306a.hashCode() ^ 1000003) * 1000003) ^ this.f13307b) * 1000003) ^ this.f13308c;
    }

    public final String toString() {
        StringBuilder q10 = a.q("OutputSurface{eglSurface=");
        q10.append(this.f13306a);
        q10.append(", width=");
        q10.append(this.f13307b);
        q10.append(", height=");
        return v.e(q10, this.f13308c, "}");
    }
}
