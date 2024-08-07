package ca;

import b0.e;
import v.g0;
import za.a;
import za.b;

/* compiled from: OptionalProvider */
public final class q<T> implements b<T>, a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final g0 f4655c = new g0(20);

    /* renamed from: d  reason: collision with root package name */
    public static final i f4656d = new i(1);

    /* renamed from: a  reason: collision with root package name */
    public a.C0251a<T> f4657a;

    /* renamed from: b  reason: collision with root package name */
    public volatile b<T> f4658b;

    public q(g0 g0Var, b bVar) {
        this.f4657a = g0Var;
        this.f4658b = bVar;
    }

    public final void a(a.C0251a<T> aVar) {
        b<T> bVar;
        b<T> bVar2 = this.f4658b;
        i iVar = f4656d;
        if (bVar2 != iVar) {
            aVar.f(bVar2);
            return;
        }
        b<T> bVar3 = null;
        synchronized (this) {
            bVar = this.f4658b;
            if (bVar != iVar) {
                bVar3 = bVar;
            } else {
                this.f4657a = new e(5, this.f4657a, aVar);
            }
        }
        if (bVar3 != null) {
            aVar.f(bVar);
        }
    }

    public final T get() {
        return this.f4658b.get();
    }
}
