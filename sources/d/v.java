package d;

import ek.i;
import fk.g;
import java.util.ListIterator;
import rk.a;
import sk.k;

/* compiled from: OnBackPressedDispatcher.kt */
public final class v extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f8456a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(y yVar) {
        super(0);
        this.f8456a = yVar;
    }

    public final Object invoke() {
        r rVar;
        y yVar = this.f8456a;
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
        r rVar2 = rVar;
        yVar.f8463d = null;
        return i.f20112a;
    }
}
