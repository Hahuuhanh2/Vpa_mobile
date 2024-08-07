package lc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class p extends PhantomReference {

    /* renamed from: a  reason: collision with root package name */
    public final Set f12934a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f12935b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(a aVar, ReferenceQueue referenceQueue, Set set) {
        super(aVar, referenceQueue);
        o oVar = o.f12933a;
        this.f12934a = set;
        this.f12935b = oVar;
    }
}
