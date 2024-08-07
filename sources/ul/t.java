package ul;

import java.lang.reflect.Array;

/* compiled from: ParameterHandler */
public final class t extends u<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f23151a;

    public t(u uVar) {
        this.f23151a = uVar;
    }

    public final void a(w wVar, Object obj) {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                this.f23151a.a(wVar, Array.get(obj, i10));
            }
        }
    }
}
