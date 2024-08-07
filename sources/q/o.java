package q;

import android.os.CancellationSignal;
import s1.e;

/* compiled from: CancellationSignalProvider */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final a f14250a = new a();

    /* renamed from: b  reason: collision with root package name */
    public CancellationSignal f14251b;

    /* renamed from: c  reason: collision with root package name */
    public e f14252c;

    /* compiled from: CancellationSignalProvider */
    public class a {
    }

    /* compiled from: CancellationSignalProvider */
    public static class b {
        public static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }
}
