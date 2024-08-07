package f0;

import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.f;
import c0.f1;
import c0.j;
import c0.o;
import java.util.ArrayList;

/* compiled from: CameraInternal */
public interface r extends j, f1.b {

    /* compiled from: CameraInternal */
    public enum a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9580a;

        /* access modifiers changed from: public */
        a(boolean z10) {
            this.f9580a = z10;
        }
    }

    o a();

    boolean e();

    void f(f fVar);

    j0<a> g();

    CameraControlInternal h();

    f i();

    void j(boolean z10);

    void k(ArrayList arrayList);

    void l(ArrayList arrayList);

    boolean m();

    q n();
}
