package fk;

import java.util.Iterator;
import java.util.List;
import rk.a;
import sk.k;

/* compiled from: _Collections.kt */
public final class o extends k implements a<Iterator<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterable<Object> f20211a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(List list) {
        super(0);
        this.f20211a = list;
    }

    public final Object invoke() {
        return this.f20211a.iterator();
    }
}
