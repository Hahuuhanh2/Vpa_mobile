package fl;

import ek.i;
import ik.f;
import m9.b;
import rk.l;
import sk.k;

/* compiled from: OnUndeliveredElement.kt */
public final class n extends k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l<Object, i> f20255a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f20256b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f20257c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(l<Object, i> lVar, Object obj, f fVar) {
        super(1);
        this.f20255a = lVar;
        this.f20256b = obj;
        this.f20257c = fVar;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        b.f(this.f20255a, this.f20256b, this.f20257c);
        return i.f20112a;
    }
}
