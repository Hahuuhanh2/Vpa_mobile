package f2;

import al.r;
import f2.p;
import ik.d;
import kk.c;
import kk.e;

@e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
/* compiled from: SingleProcessDataStore.kt */
public final class w extends c {

    /* renamed from: a  reason: collision with root package name */
    public Object f9878a;

    /* renamed from: b  reason: collision with root package name */
    public p f9879b;

    /* renamed from: c  reason: collision with root package name */
    public r f9880c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f9881d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p<Object> f9882e;

    /* renamed from: f  reason: collision with root package name */
    public int f9883f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(p<Object> pVar, d<? super w> dVar) {
        super(dVar);
        this.f9882e = pVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9881d = obj;
        this.f9883f |= Integer.MIN_VALUE;
        return p.c(this.f9882e, (p.a.b) null, this);
    }
}
