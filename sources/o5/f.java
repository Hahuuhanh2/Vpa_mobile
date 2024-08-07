package o5;

import h5.n;
import j7.a;

/* compiled from: GlideSuppliers */
public final class f implements g<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f13742a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f13743b;

    public f(n.a aVar) {
        this.f13743b = aVar;
    }

    public final Object get() {
        if (this.f13742a == null) {
            synchronized (this) {
                if (this.f13742a == null) {
                    Object obj = this.f13743b.get();
                    a.r(obj);
                    this.f13742a = obj;
                }
            }
        }
        return this.f13742a;
    }
}
