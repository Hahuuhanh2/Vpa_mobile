package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.j;

/* compiled from: MenuDialogHelper */
public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a  reason: collision with root package name */
    public f f639a;

    /* renamed from: b  reason: collision with root package name */
    public b f640b;

    /* renamed from: c  reason: collision with root package name */
    public d f641c;

    public g(f fVar) {
        this.f639a = fVar;
    }

    public final void c(f fVar, boolean z10) {
        b bVar;
        if ((z10 || fVar == this.f639a) && (bVar = this.f640b) != null) {
            bVar.dismiss();
        }
    }

    public final boolean d(f fVar) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        f fVar = this.f639a;
        d dVar = this.f641c;
        if (dVar.f605n == null) {
            dVar.f605n = new d.a();
        }
        fVar.q(dVar.f605n.getItem(i10), (j) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f641c.c(this.f639a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f640b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f640b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f639a.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f639a.performShortcut(i10, keyEvent, 0);
    }
}
