package j$.util;

import j$.util.function.C0382k;
import j$.util.function.C0388n;
import j$.util.function.Consumer;

/* renamed from: j$.util.l  reason: case insensitive filesystem */
public final /* synthetic */ class C0406l implements C0388n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f18569a;

    public /* synthetic */ C0406l(Consumer consumer) {
        this.f18569a = consumer;
    }

    public final void accept(double d10) {
        this.f18569a.accept(Double.valueOf(d10));
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }
}
