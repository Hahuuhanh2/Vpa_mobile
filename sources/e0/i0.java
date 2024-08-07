package e0;

import android.graphics.Matrix;
import android.graphics.Rect;
import c0.j0;
import f0.f;
import java.util.List;
import java.util.concurrent.Executor;
import k0.b;

/* compiled from: TakePictureRequest */
public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public int f9013a;

    /* compiled from: TakePictureRequest */
    public interface a {
    }

    public i0() {
        int i10;
        k0.a aVar = (k0.a) b.a(k0.a.class);
        if (aVar == null) {
            i10 = 0;
        } else {
            aVar.getClass();
            i10 = 1;
        }
        this.f9013a = i10;
    }

    public abstract Executor a();

    public abstract int b();

    public abstract Rect c();

    public abstract j0.d d();

    public abstract int e();

    public abstract j0.e f();

    public abstract j0.f g();

    public abstract int h();

    public abstract Matrix i();

    public abstract List<f> j();
}
