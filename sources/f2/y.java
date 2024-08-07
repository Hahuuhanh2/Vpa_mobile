package f2;

import ik.d;
import ik.f;
import java.util.LinkedHashSet;
import kk.c;
import kk.e;
import rk.p;

@e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
/* compiled from: SingleProcessDataStore.kt */
public final class y extends c {

    /* renamed from: a  reason: collision with root package name */
    public p f9892a;

    /* renamed from: b  reason: collision with root package name */
    public Object f9893b;

    /* renamed from: c  reason: collision with root package name */
    public Object f9894c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f9895d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p<Object> f9896e;

    /* renamed from: f  reason: collision with root package name */
    public int f9897f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(p<Object> pVar, d<? super y> dVar) {
        super(dVar);
        this.f9896e = pVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9895d = obj;
        this.f9897f |= Integer.MIN_VALUE;
        p<Object> pVar = this.f9896e;
        LinkedHashSet linkedHashSet = p.f9807k;
        return pVar.j(this, (f) null, (p) null);
    }
}
