package okhttp3.logging;

import java.io.EOFException;
import ll.f;
import sk.j;

/* compiled from: utf8.kt */
public final class Utf8Kt {
    public static final boolean a(f fVar) {
        long j10;
        j.f(fVar, "$this$isProbablyUtf8");
        try {
            f fVar2 = new f();
            long j11 = fVar.f20878b;
            if (j11 > 64) {
                j10 = 64;
            } else {
                j10 = j11;
            }
            fVar.z(0, j10, fVar2);
            for (int i10 = 0; i10 < 16; i10++) {
                if (fVar2.A()) {
                    return true;
                }
                int a02 = fVar2.a0();
                if (Character.isISOControl(a02) && !Character.isWhitespace(a02)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
