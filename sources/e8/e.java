package e8;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.g;

/* compiled from: FloatingActionButtonImpl */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9265a;

    public e(g gVar) {
        this.f9265a = gVar;
    }

    public final boolean onPreDraw() {
        g gVar = this.f9265a;
        float rotation = gVar.f6314v.getRotation();
        if (gVar.f6307o == rotation) {
            return true;
        }
        gVar.f6307o = rotation;
        gVar.p();
        return true;
    }
}
