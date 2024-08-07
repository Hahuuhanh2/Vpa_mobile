package dl;

import ek.i;
import ik.d;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import sk.r;

/* compiled from: Limit.kt */
public final class n implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f20012a;

    public n(r rVar) {
        this.f20012a = rVar;
    }

    public final Object e(Object obj, d<? super i> dVar) {
        this.f20012a.f22931a = obj;
        throw new AbortFlowException(this);
    }
}
