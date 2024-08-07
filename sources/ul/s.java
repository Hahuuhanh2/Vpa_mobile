package ul;

/* compiled from: ParameterHandler */
public final class s extends u<Iterable<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f23150a;

    public s(u uVar) {
        this.f23150a = uVar;
    }

    public final void a(w wVar, Object obj) {
        Iterable<Object> iterable = (Iterable) obj;
        if (iterable != null) {
            for (Object a10 : iterable) {
                this.f23150a.a(wVar, a10);
            }
        }
    }
}
