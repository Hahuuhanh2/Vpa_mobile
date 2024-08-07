package c0;

import android.util.Size;
import android.view.Surface;
import h0.b;
import java.io.Closeable;
import n0.g;

/* compiled from: SurfaceOutput */
public interface x0 extends Closeable {

    /* compiled from: SurfaceOutput */
    public static abstract class a {
        public abstract int a();

        public abstract x0 b();
    }

    void close();

    Size g();

    int getFormat();

    void r(float[] fArr, float[] fArr2);

    Surface y(b bVar, g gVar);
}
