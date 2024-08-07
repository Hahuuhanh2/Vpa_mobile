package al;

import ik.d;
import java.util.Iterator;
import java.util.List;
import kk.c;

@kk.e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {66}, m = "joinAll")
/* compiled from: Await.kt */
public final class e extends c {

    /* renamed from: a  reason: collision with root package name */
    public Iterator f19010a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f19011b;

    /* renamed from: c  reason: collision with root package name */
    public int f19012c;

    public e(d<? super e> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f19011b = obj;
        this.f19012c |= Integer.MIN_VALUE;
        return d.b((List) null, this);
    }
}
