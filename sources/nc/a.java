package nc;

import androidx.lifecycle.i;
import androidx.lifecycle.q;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.util.List;
import r2.k;
import v6.b;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public interface a extends Closeable, k, b {
    Task<List<oc.a>> D(rc.a aVar);

    @q(i.a.ON_DESTROY)
    void close();
}
