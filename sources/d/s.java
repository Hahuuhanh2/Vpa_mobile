package d;

import ek.i;
import fk.g;
import java.util.ListIterator;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: OnBackPressedDispatcher.kt */
public final class s extends k implements l<b, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f8453a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(y yVar) {
        super(1);
        this.f8453a = yVar;
    }

    public final Object invoke(Object obj) {
        r rVar;
        j.f((b) obj, "backEvent");
        y yVar = this.f8453a;
        g<r> gVar = yVar.f8462c;
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
        yVar.f8463d = rVar;
        return i.f20112a;
    }
}
