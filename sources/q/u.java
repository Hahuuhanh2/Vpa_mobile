package q;

import android.widget.TextView;
import r2.q;

/* compiled from: FingerprintDialogFragment */
public final class u implements q<CharSequence> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f14262a;

    public u(r rVar) {
        this.f14262a = rVar;
    }

    public final void b(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        r rVar = this.f14262a;
        rVar.f14253u0.removeCallbacks(rVar.f14254v0);
        TextView textView = this.f14262a.A0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        r rVar2 = this.f14262a;
        rVar2.f14253u0.postDelayed(rVar2.f14254v0, 2000);
    }
}
