package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.biometric.R$drawable;
import k1.a;
import q.r;
import r2.q;

/* compiled from: FingerprintDialogFragment */
public final class t implements q<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f14261a;

    public t(r rVar) {
        this.f14261a = rVar;
    }

    public final void b(Object obj) {
        int i10;
        boolean z10;
        int i11;
        Integer num = (Integer) obj;
        r rVar = this.f14261a;
        rVar.f14253u0.removeCallbacks(rVar.f14254v0);
        r rVar2 = this.f14261a;
        int intValue = num.intValue();
        boolean z11 = false;
        if (rVar2.f14258z0 != null) {
            int i12 = rVar2.f14255w0.f14246z;
            Context r10 = rVar2.r();
            Drawable drawable = null;
            if (r10 != null) {
                if (i12 == 0 && intValue == 1) {
                    i11 = R$drawable.fingerprint_dialog_fp_icon;
                } else if (i12 == 1 && intValue == 2) {
                    i11 = R$drawable.fingerprint_dialog_error;
                } else if (i12 == 2 && intValue == 1) {
                    i11 = R$drawable.fingerprint_dialog_fp_icon;
                } else if (i12 == 1 && intValue == 3) {
                    i11 = R$drawable.fingerprint_dialog_fp_icon;
                }
                drawable = a.getDrawable(r10, i11);
            }
            if (drawable != null) {
                rVar2.f14258z0.setImageDrawable(drawable);
                if (!(i12 == 0 && intValue == 1) && ((i12 == 1 && intValue == 2) || (i12 == 2 && intValue == 1))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    r.b.a(drawable);
                }
                rVar2.f14255w0.f14246z = intValue;
            }
        }
        r rVar3 = this.f14261a;
        int intValue2 = num.intValue();
        TextView textView = rVar3.A0;
        if (textView != null) {
            if (intValue2 == 2) {
                z11 = true;
            }
            if (z11) {
                i10 = rVar3.f14256x0;
            } else {
                i10 = rVar3.f14257y0;
            }
            textView.setTextColor(i10);
        }
        r rVar4 = this.f14261a;
        rVar4.f14253u0.postDelayed(rVar4.f14254v0, 2000);
    }
}
