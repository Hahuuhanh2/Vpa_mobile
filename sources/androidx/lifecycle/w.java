package androidx.lifecycle;

import androidx.lifecycle.i;
import r2.l;
import r2.s;

/* compiled from: SavedStateHandleSupport.kt */
public final class w implements n {

    /* renamed from: a  reason: collision with root package name */
    public final s f2835a;

    public w(s sVar) {
        this.f2835a = sVar;
    }

    public final void q(l lVar, i.a aVar) {
        boolean z10;
        if (aVar == i.a.ON_CREATE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lVar.B().c(this);
            this.f2835a.b();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
