package androidx.lifecycle;

import a3.c;
import androidx.lifecycle.i;
import r2.l;

/* compiled from: LegacySavedStateHandleController.kt */
public final class h implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f2764a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f2765b;

    public h(i iVar, c cVar) {
        this.f2764a = iVar;
        this.f2765b = cVar;
    }

    public final void q(l lVar, i.a aVar) {
        if (aVar == i.a.ON_START) {
            this.f2764a.c(this);
            this.f2765b.d();
        }
    }
}
