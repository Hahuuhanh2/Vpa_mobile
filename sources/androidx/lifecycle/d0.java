package androidx.lifecycle;

import androidx.lifecycle.f0;
import ek.c;
import r2.v;
import r2.w;
import rk.a;
import sk.d;
import sk.j;
import wk.b;

/* compiled from: ViewModelLazy.kt */
public final class d0<VM extends v> implements c<VM> {

    /* renamed from: a  reason: collision with root package name */
    public final b<VM> f2751a;

    /* renamed from: b  reason: collision with root package name */
    public final a<w> f2752b;

    /* renamed from: c  reason: collision with root package name */
    public final a<f0.b> f2753c;

    /* renamed from: d  reason: collision with root package name */
    public final a<s2.a> f2754d;

    /* renamed from: e  reason: collision with root package name */
    public VM f2755e;

    public d0(d dVar, a aVar, a aVar2, a aVar3) {
        this.f2751a = dVar;
        this.f2752b = aVar;
        this.f2753c = aVar2;
        this.f2754d = aVar3;
    }

    public final Object getValue() {
        VM vm = this.f2755e;
        if (vm != null) {
            return vm;
        }
        f0 f0Var = new f0(this.f2752b.invoke(), this.f2753c.invoke(), this.f2754d.invoke());
        b<VM> bVar = this.f2751a;
        j.f(bVar, "<this>");
        Class<?> a10 = ((sk.c) bVar).a();
        j.d(a10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        VM a11 = f0Var.a(a10);
        this.f2755e = a11;
        return a11;
    }
}
