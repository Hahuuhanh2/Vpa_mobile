package com.google.android.material.bottomsheet;

import android.app.Dialog;
import androidx.appcompat.app.n;

/* compiled from: BottomSheetDialogFragment */
public class c extends n {
    public final Dialog k0() {
        return new b(r(), this.f2624j0);
    }

    public final void o0() {
        Dialog dialog = this.f2630p0;
        if (dialog instanceof b) {
            b bVar = (b) dialog;
            if (bVar.f5863f == null) {
                bVar.f();
            }
            boolean z10 = bVar.f5863f.P;
        }
        j0(false, false);
    }
}
