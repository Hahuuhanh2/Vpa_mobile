package y0;

import ek.i;
import java.util.ArrayList;
import java.util.List;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: Snapshot.kt */
public final class a extends k implements l<Object, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List<l<Object, i>> f17357a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ArrayList arrayList) {
        super(1);
        this.f17357a = arrayList;
    }

    public final Object invoke(Object obj) {
        j.f(obj, "state");
        List<l<Object, i>> list = this.f17357a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).invoke(obj);
        }
        return i.f20112a;
    }
}
