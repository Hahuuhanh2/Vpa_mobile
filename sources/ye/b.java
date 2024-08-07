package ye;

import android.support.v4.media.a;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.ots.base.ui.AddressEdittext;
import lf.h;
import sk.j;
import yk.l;

/* compiled from: AddressEdittext.kt */
public final class b implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AddressEdittext f17722a;

    public b(AddressEdittext addressEdittext) {
        this.f17722a = addressEdittext;
    }

    public final void afterTextChanged(Editable editable) {
        j.f(editable, "editable");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        j.f(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        CharSequence charSequence2;
        j.f(charSequence, "charSequence");
        StringBuilder p10 = a.p('(');
        p10.append(l.k1(charSequence.toString()).toString().length());
        p10.append("/100)");
        ((TextView) this.f17722a.findViewById(2131362780)).setText(p10.toString());
        AddressEdittext addressEdittext = this.f17722a;
        TextView textView = addressEdittext.f8216e;
        if (textView != null) {
            charSequence2 = textView.getText();
        } else {
            charSequence2 = null;
        }
        String a10 = h.a(String.valueOf(charSequence2), addressEdittext.f8222r);
        if (a10 != null) {
            addressEdittext.f8223s = a10;
            ((TextView) addressEdittext.findViewById(2131361895)).setText(a10);
            TextView textView2 = addressEdittext.f8216e;
            if (textView2 != null) {
                textView2.requestFocus();
                return;
            }
            return;
        }
        ((TextView) addressEdittext.findViewById(2131361895)).setText("");
        addressEdittext.f8223s = "";
    }
}
