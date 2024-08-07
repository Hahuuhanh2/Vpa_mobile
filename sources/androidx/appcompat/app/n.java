package androidx.appcompat.app;

import android.app.Dialog;
import androidx.fragment.app.g;

/* compiled from: AppCompatDialogFragment */
public class n extends g {
    public Dialog k0() {
        return new m(r(), this.f2624j0);
    }

    public final void m0(Dialog dialog, int i10) {
        if (dialog instanceof m) {
            m mVar = (m) dialog;
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            mVar.d().s(1);
            return;
        }
        super.m0(dialog, i10);
    }
}
