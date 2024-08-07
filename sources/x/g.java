package x;

import al.g0;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* compiled from: OutputConfigurationCompatApi24Impl */
public class g extends k {

    /* compiled from: OutputConfigurationCompatApi24Impl */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final OutputConfiguration f16829a;

        /* renamed from: b  reason: collision with root package name */
        public String f16830b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f16831c;

        /* renamed from: d  reason: collision with root package name */
        public long f16832d = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f16829a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Objects.equals(this.f16829a, aVar.f16829a) || this.f16831c != aVar.f16831c || this.f16832d != aVar.f16832d || !Objects.equals(this.f16830b, aVar.f16830b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i10;
            int hashCode = this.f16829a.hashCode() ^ 31;
            boolean z10 = this.f16831c ^ ((hashCode << 5) - hashCode);
            int i11 = ((z10 ? 1 : 0) << true) - z10;
            String str = this.f16830b;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            int i12 = i10 ^ i11;
            int i13 = (i12 << 5) - i12;
            long j10 = this.f16832d;
            return ((int) (j10 ^ (j10 >>> 32))) ^ i13;
        }
    }

    public g(int i10, Surface surface) {
        super((Object) new a(new OutputConfiguration(i10, surface)));
    }

    public void c(long j10) {
        ((a) this.f16838a).f16832d = j10;
    }

    public String d() {
        return ((a) this.f16838a).f16830b;
    }

    public void e() {
        ((a) this.f16838a).f16831c = true;
    }

    public void f(String str) {
        ((a) this.f16838a).f16830b = str;
    }

    public Object g() {
        g0.z(this.f16838a instanceof a);
        return ((a) this.f16838a).f16829a;
    }

    public final Surface getSurface() {
        return ((OutputConfiguration) g()).getSurface();
    }

    public boolean h() {
        return ((a) this.f16838a).f16831c;
    }

    public g(Object obj) {
        super(obj);
    }
}
