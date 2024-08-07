package xe;

import android.content.Context;
import ee.t;
import we.b;

/* compiled from: MediaUtils */
public final class e extends b.C0217b<oe.b> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f17322c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f17323d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ qe.b f17324e;

    public e(Context context, String str, t.b bVar) {
        this.f17322c = context;
        this.f17323d = str;
        this.f17324e = bVar;
    }

    public final Object a() {
        return g.d(this.f17322c, this.f17323d);
    }

    public final void f(Object obj) {
        oe.b bVar = (oe.b) obj;
        b.a(this);
        qe.b bVar2 = this.f17324e;
        if (bVar2 != null) {
            bVar2.a(bVar);
        }
    }
}
