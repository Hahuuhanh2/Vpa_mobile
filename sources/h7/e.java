package h7;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class e {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
