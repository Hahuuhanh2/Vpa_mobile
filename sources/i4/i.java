package i4;

import android.graphics.PointF;
import android.support.v4.media.a;
import com.airbnb.lottie.c0;
import d4.o;
import h4.b;
import h4.c;
import h4.h;

/* compiled from: RectangleShape */
public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f11118a;

    /* renamed from: b  reason: collision with root package name */
    public final h<PointF, PointF> f11119b;

    /* renamed from: c  reason: collision with root package name */
    public final h<PointF, PointF> f11120c;

    /* renamed from: d  reason: collision with root package name */
    public final b f11121d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11122e;

    public i(String str, h hVar, c cVar, b bVar, boolean z10) {
        this.f11118a = str;
        this.f11119b = hVar;
        this.f11120c = cVar;
        this.f11121d = bVar;
        this.f11122e = z10;
    }

    public final d4.c a(c0 c0Var, j4.b bVar) {
        return new o(c0Var, bVar, this);
    }

    public final String toString() {
        StringBuilder q10 = a.q("RectangleShape{position=");
        q10.append(this.f11119b);
        q10.append(", size=");
        q10.append(this.f11120c);
        q10.append('}');
        return q10.toString();
    }
}
