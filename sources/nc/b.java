package nc;

import java.util.Arrays;
import java.util.concurrent.Executor;
import y6.i;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f13565a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13566b = false;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f13567c = null;

    /* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f13568a = 0;
    }

    public /* synthetic */ b(int i10) {
        this.f13565a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f13565a == bVar.f13565a && this.f13566b == bVar.f13566b && i.a(this.f13567c, bVar.f13567c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13565a), Boolean.valueOf(this.f13566b), this.f13567c});
    }
}
