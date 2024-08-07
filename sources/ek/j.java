package ek;

import java.io.Serializable;
import m9.b;
import rk.a;

/* compiled from: Lazy.kt */
public final class j<T> implements c<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public a<? extends T> f20113a;

    /* renamed from: b  reason: collision with root package name */
    public Object f20114b = b.f13209u;

    public j(a<? extends T> aVar) {
        this.f20113a = aVar;
    }

    public final T getValue() {
        if (this.f20114b == b.f13209u) {
            a<? extends T> aVar = this.f20113a;
            sk.j.c(aVar);
            this.f20114b = aVar.invoke();
            this.f20113a = null;
        }
        return this.f20114b;
    }

    public final String toString() {
        boolean z10;
        if (this.f20114b != b.f13209u) {
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
