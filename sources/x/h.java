package x;

import al.g0;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* compiled from: OutputConfigurationCompatApi26Impl */
public class h extends g {

    /* compiled from: OutputConfigurationCompatApi26Impl */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final OutputConfiguration f16833a;

        /* renamed from: b  reason: collision with root package name */
        public String f16834b;

        /* renamed from: c  reason: collision with root package name */
        public long f16835c = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f16833a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Objects.equals(this.f16833a, aVar.f16833a) || this.f16835c != aVar.f16835c || !Objects.equals(this.f16834b, aVar.f16834b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i10;
            int hashCode = this.f16833a.hashCode() ^ 31;
            int i11 = (hashCode << 5) - hashCode;
            String str = this.f16834b;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            int i12 = i10 ^ i11;
            int i13 = (i12 << 5) - i12;
            long j10 = this.f16835c;
            return ((int) (j10 ^ (j10 >>> 32))) ^ i13;
        }
    }

    public h(int i10, Surface surface) {
        super(new a(new OutputConfiguration(i10, surface)));
    }

    public final void b(Surface surface) {
        ((OutputConfiguration) g()).addSurface(surface);
    }

    public void c(long j10) {
        ((a) this.f16838a).f16835c = j10;
    }

    public String d() {
        return ((a) this.f16838a).f16834b;
    }

    public final void e() {
        ((OutputConfiguration) g()).enableSurfaceSharing();
    }

    public void f(String str) {
        ((a) this.f16838a).f16834b = str;
    }

    public Object g() {
        g0.z(this.f16838a instanceof a);
        return ((a) this.f16838a).f16833a;
    }

    public final boolean h() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    public h(Object obj) {
        super(obj);
    }
}
