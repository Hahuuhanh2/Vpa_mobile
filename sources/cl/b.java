package cl;

import ek.i;
import hl.f;
import rk.l;
import sk.k;

/* compiled from: BufferedChannel.kt */
public final class b extends k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f19228a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a<Object> f19229b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f<?> f19230c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Object obj, a<Object> aVar, f<?> fVar) {
        super(1);
        this.f19228a = obj;
        this.f19229b = aVar;
        this.f19230c = fVar;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        Object obj2 = this.f19228a;
        if (obj2 != d.f19243l) {
            m9.b.f(this.f19229b.f19217b, obj2, this.f19230c.getContext());
        }
        return i.f20112a;
    }
}
