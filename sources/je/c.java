package je;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: PictureCommonFragment */
public final class c implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f11867a;

    public c(h hVar) {
        this.f11867a = hVar;
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (i10 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        this.f11867a.C0();
        return true;
    }
}
