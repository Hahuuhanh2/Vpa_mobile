package i4;

import android.graphics.Path;
import com.airbnb.lottie.c0;
import d4.c;
import d4.g;
import h4.a;
import h4.d;
import j4.b;

/* compiled from: ShapeFill */
public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11132a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f11133b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11134c;

    /* renamed from: d  reason: collision with root package name */
    public final a f11135d;

    /* renamed from: e  reason: collision with root package name */
    public final d f11136e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11137f;

    public m(String str, boolean z10, Path.FillType fillType, a aVar, d dVar, boolean z11) {
        this.f11134c = str;
        this.f11132a = z10;
        this.f11133b = fillType;
        this.f11135d = aVar;
        this.f11136e = dVar;
        this.f11137f = z11;
    }

    public final c a(c0 c0Var, b bVar) {
        return new g(c0Var, bVar, this);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ShapeFill{color=, fillEnabled=");
        q10.append(this.f11132a);
        q10.append('}');
        return q10.toString();
    }
}
