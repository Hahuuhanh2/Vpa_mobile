package f0;

import android.view.Surface;
import androidx.camera.core.d;
import java.util.concurrent.Executor;

/* compiled from: ImageReaderProxy */
public interface d0 {

    /* compiled from: ImageReaderProxy */
    public interface a {
        void f(d0 d0Var);
    }

    int b();

    int c();

    void close();

    d d();

    int e();

    void f();

    void g(a aVar, Executor executor);

    Surface getSurface();

    int h();

    d i();
}
