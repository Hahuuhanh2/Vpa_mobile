package d;

import ek.i;
import fk.g;
import java.util.ListIterator;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: OnBackPressedDispatcher.kt */
public final class t extends k implements l<b, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f8454a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(y yVar) {
        super(1);
        this.f8454a = yVar;
    }

    public final Object invoke(Object obj) {
        r rVar;
        j.f((b) obj, "backEvent");
        g<r> gVar = this.f8454a.f8462c;
        ListIterator<r> listIterator = gVar.listIterator(gVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                rVar = null;
                break;
            }
            rVar = listIterator.previous();
            if (rVar.f8450a) {
                break;
            }
        }
        r rVar2 = rVar;
        return i.f20112a;
    }
}
