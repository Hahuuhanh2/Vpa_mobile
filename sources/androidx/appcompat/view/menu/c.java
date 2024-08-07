package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;

/* compiled from: CascadingMenuPopup */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.d f595a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MenuItem f596b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f597c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b.c f598d;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f598d = cVar;
        this.f595a = dVar;
        this.f596b = hVar;
        this.f597c = fVar;
    }

    public final void run() {
        b.d dVar = this.f595a;
        if (dVar != null) {
            b.this.H = true;
            dVar.f593b.c(false);
            b.this.H = false;
        }
        if (this.f596b.isEnabled() && this.f596b.hasSubMenu()) {
            this.f597c.q(this.f596b, (j) null, 4);
        }
    }
}
