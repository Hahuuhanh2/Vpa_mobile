package t;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import f0.o;
import java.util.Set;
import v.j0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements o.a {
    public final j0 a(Context context, Object obj, Set set) {
        try {
            return new j0(context, obj, set);
        } catch (CameraUnavailableException e10) {
            throw new InitializationException(e10);
        }
    }
}
