package al;

import android.support.v4.media.a;
import n0.l;

/* compiled from: JobSupport.kt */
public final class w0 implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19100a;

    public w0(boolean z10) {
        this.f19100a = z10;
    }

    public final r1 a() {
        return null;
    }

    public final boolean isActive() {
        return this.f19100a;
    }

    public final String toString() {
        String str;
        StringBuilder q10 = a.q("Empty{");
        if (this.f19100a) {
            str = "Active";
        } else {
            str = "New";
        }
        return l.k(q10, str, '}');
    }
}
