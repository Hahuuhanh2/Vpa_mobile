package x;

import al.g0;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* compiled from: OutputConfigurationCompatApi28Impl */
public class i extends h {

    /* compiled from: OutputConfigurationCompatApi28Impl */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final OutputConfiguration f16836a;

        /* renamed from: b  reason: collision with root package name */
        public long f16837b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f16836a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Objects.equals(this.f16836a, aVar.f16836a) || this.f16837b != aVar.f16837b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = this.f16836a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            long j10 = this.f16837b;
            return ((int) (j10 ^ (j10 >>> 32))) ^ i10;
        }
    }

    public i(int i10, Surface surface) {
        super(new a(new OutputConfiguration(i10, surface)));
    }

    public void c(long j10) {
        ((a) this.f16838a).f16837b = j10;
    }

    public final String d() {
        return null;
    }

    public final void f(String str) {
        ((OutputConfiguration) g()).setPhysicalCameraId(str);
    }

    public Object g() {
        g0.z(this.f16838a instanceof a);
        return ((a) this.f16838a).f16836a;
    }

    public i(Object obj) {
        super(obj);
    }
}
