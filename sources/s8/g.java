package s8;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final class g implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f14687c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile j f14688a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f14689b = f14687c;

    public g(h hVar) {
        this.f14688a = hVar;
    }

    public static j b(h hVar) {
        return hVar instanceof g ? hVar : new g(hVar);
    }

    public final Object a() {
        Object obj = this.f14689b;
        Object obj2 = f14687c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f14689b;
                if (obj == obj2) {
                    obj = this.f14688a.a();
                    Object obj3 = this.f14689b;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f14689b = obj;
                    this.f14688a = null;
                }
            }
        }
        return obj;
    }
}
