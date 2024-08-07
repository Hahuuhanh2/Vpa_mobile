package xe;

import android.content.Context;
import ee.t;
import we.b;

/* compiled from: MediaUtils */
public final class f extends b.C0217b<oe.b> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f17325c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f17326d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ qe.b f17327e;

    public f(Context context, String str, t.c cVar) {
        this.f17325c = context;
        this.f17326d = str;
        this.f17327e = cVar;
    }

    public final Object a() {
        return g.g(this.f17325c, this.f17326d);
    }

    public final void f(Object obj) {
        oe.b bVar = (oe.b) obj;
        b.a(this);
        qe.b bVar2 = this.f17327e;
        if (bVar2 != null) {
            bVar2.a(bVar);
        }
    }
}
