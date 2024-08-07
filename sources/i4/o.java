package i4;

import com.airbnb.lottie.c0;
import d4.c;
import d4.r;
import h4.a;
import j4.b;

/* compiled from: ShapePath */
public final class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f11141a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11142b;

    /* renamed from: c  reason: collision with root package name */
    public final a f11143c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11144d;

    public o(String str, int i10, a aVar, boolean z10) {
        this.f11141a = str;
        this.f11142b = i10;
        this.f11143c = aVar;
        this.f11144d = z10;
    }

    public final c a(c0 c0Var, b bVar) {
        return new r(c0Var, bVar, this);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ShapePath{name=");
        q10.append(this.f11141a);
        q10.append(", index=");
        q10.append(this.f11142b);
        q10.append('}');
        return q10.toString();
    }
}
