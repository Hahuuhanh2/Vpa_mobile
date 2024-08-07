package e0;

import al.g0;
import e0.i0;
import ea.c;
import v8.a;
import z0.b;

/* compiled from: RequestWithCallback */
public final class x implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f9059a;

    /* renamed from: b  reason: collision with root package name */
    public final i0.a f9060b;

    /* renamed from: c  reason: collision with root package name */
    public final b.d f9061c;

    /* renamed from: d  reason: collision with root package name */
    public final b.d f9062d;

    /* renamed from: e  reason: collision with root package name */
    public b.a<Void> f9063e;

    /* renamed from: f  reason: collision with root package name */
    public b.a<Void> f9064f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9065g = false;

    /* renamed from: h  reason: collision with root package name */
    public a<Void> f9066h;

    public x(i0 i0Var, i0.a aVar) {
        this.f9059a = i0Var;
        this.f9060b = aVar;
        this.f9061c = b.a(new ca.a(this, 6));
        this.f9062d = b.a(new c(this, 5));
    }

    public final void a() {
        g0.E("The callback can only complete once.", !this.f9062d.isDone());
        this.f9064f.a(null);
    }
}
