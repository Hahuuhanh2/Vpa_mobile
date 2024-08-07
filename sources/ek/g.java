package ek;

import java.io.Serializable;
import m9.b;
import rk.a;
import sk.j;

/* compiled from: LazyJVM.kt */
public final class g<T> implements c<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public a<? extends T> f20106a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f20107b = b.f13209u;

    /* renamed from: c  reason: collision with root package name */
    public final Object f20108c = this;

    public g(a aVar) {
        j.f(aVar, "initializer");
        this.f20106a = aVar;
    }

    public final T getValue() {
        T t10;
        T t11 = this.f20107b;
        T t12 = b.f13209u;
        if (t11 != t12) {
            return t11;
        }
        synchronized (this.f20108c) {
            t10 = this.f20107b;
            if (t10 == t12) {
                a aVar = this.f20106a;
                j.c(aVar);
                t10 = aVar.invoke();
                this.f20107b = t10;
                this.f20106a = null;
            }
        }
        return t10;
    }

    public final String toString() {
        boolean z10;
        if (this.f20107b != b.f13209u) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
