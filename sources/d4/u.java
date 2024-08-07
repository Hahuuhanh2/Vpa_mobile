package d4;

import e4.a;
import e4.d;
import i4.q;
import j4.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent */
public final class u implements c, a.C0097a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8736a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8737b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final int f8738c;

    /* renamed from: d  reason: collision with root package name */
    public final d f8739d;

    /* renamed from: e  reason: collision with root package name */
    public final d f8740e;

    /* renamed from: f  reason: collision with root package name */
    public final d f8741f;

    public u(b bVar, q qVar) {
        qVar.getClass();
        this.f8736a = qVar.f11159e;
        this.f8738c = qVar.f11155a;
        a<Float, Float> a10 = qVar.f11156b.a();
        this.f8739d = (d) a10;
        a<Float, Float> a11 = qVar.f11157c.a();
        this.f8740e = (d) a11;
        a<Float, Float> a12 = qVar.f11158d.a();
        this.f8741f = (d) a12;
        bVar.e(a10);
        bVar.e(a11);
        bVar.e(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f8737b.size(); i10++) {
            ((a.C0097a) this.f8737b.get(i10)).a();
        }
    }

    public final void b(List<c> list, List<c> list2) {
    }

    public final void e(a.C0097a aVar) {
        this.f8737b.add(aVar);
    }
}
