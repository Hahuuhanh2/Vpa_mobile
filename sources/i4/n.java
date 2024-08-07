package i4;

import android.support.v4.media.a;
import com.airbnb.lottie.c0;
import d4.c;
import d4.d;
import j4.b;
import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup */
public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f11138a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f11139b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11140c;

    public n(String str, List<b> list, boolean z10) {
        this.f11138a = str;
        this.f11139b = list;
        this.f11140c = z10;
    }

    public final c a(c0 c0Var, b bVar) {
        return new d(c0Var, bVar, this);
    }

    public final String toString() {
        StringBuilder q10 = a.q("ShapeGroup{name='");
        q10.append(this.f11138a);
        q10.append("' Shapes: ");
        q10.append(Arrays.toString(this.f11139b.toArray()));
        q10.append('}');
        return q10.toString();
    }
}
