package i4;

import android.support.v4.media.a;
import com.airbnb.lottie.c0;
import d4.c;
import d4.l;
import f0.b0;
import j4.b;

/* compiled from: MergePaths */
public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f11105a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11106b;

    public g(String str, int i10, boolean z10) {
        this.f11105a = i10;
        this.f11106b = z10;
    }

    public final c a(c0 c0Var, b bVar) {
        if (c0Var.f4782r) {
            return new l(this);
        }
        n4.c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder q10 = a.q("MergePaths{mode=");
        q10.append(b0.G(this.f11105a));
        q10.append('}');
        return q10.toString();
    }
}
