package x;

import android.os.Build;
import android.view.Surface;

/* compiled from: OutputConfigurationCompat */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final a f16828a;

    /* compiled from: OutputConfigurationCompat */
    public interface a {
        void a(long j10);

        void b(Surface surface);

        void c(long j10);

        String d();

        void e();

        void f(String str);

        Object g();

        Surface getSurface();
    }

    public f(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.f16828a = new j(i10, surface);
        } else if (i11 >= 28) {
            this.f16828a = new i(i10, surface);
        } else if (i11 >= 26) {
            this.f16828a = new h(i10, surface);
        } else if (i11 >= 24) {
            this.f16828a = new g(i10, surface);
        } else {
            this.f16828a = new k(surface);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f16828a.equals(((f) obj).f16828a);
    }

    public final int hashCode() {
        return this.f16828a.hashCode();
    }

    public f(g gVar) {
        this.f16828a = gVar;
    }
}
