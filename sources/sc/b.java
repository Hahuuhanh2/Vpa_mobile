package sc;

import android.support.v4.media.a;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public final class b {
    public static int a(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 90) {
            return 1;
        }
        if (i10 == 180) {
            return 2;
        }
        if (i10 == 270) {
            return 3;
        }
        throw new IllegalArgumentException(a.m("Invalid rotation: ", i10));
    }
}
