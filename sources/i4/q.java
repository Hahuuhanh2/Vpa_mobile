package i4;

import android.support.v4.media.a;
import com.airbnb.lottie.c0;
import d4.c;
import d4.u;
import h4.b;

/* compiled from: ShapeTrimPath */
public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f11155a;

    /* renamed from: b  reason: collision with root package name */
    public final b f11156b;

    /* renamed from: c  reason: collision with root package name */
    public final b f11157c;

    /* renamed from: d  reason: collision with root package name */
    public final b f11158d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11159e;

    public q(String str, int i10, b bVar, b bVar2, b bVar3, boolean z10) {
        this.f11155a = i10;
        this.f11156b = bVar;
        this.f11157c = bVar2;
        this.f11158d = bVar3;
        this.f11159e = z10;
    }

    public final c a(c0 c0Var, j4.b bVar) {
        return new u(bVar, this);
    }

    public final String toString() {
        StringBuilder q10 = a.q("Trim Path: {start: ");
        q10.append(this.f11156b);
        q10.append(", end: ");
        q10.append(this.f11157c);
        q10.append(", offset: ");
        q10.append(this.f11158d);
        q10.append("}");
        return q10.toString();
    }
}
