package nf;

import android.support.v4.media.a;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.ots.core.R$id;
import com.ots.core.utils.customview.edit.TextInputLayout;
import com.ots.core.utils.customview.textview.AppTitleTextView;
import sk.j;
import yk.l;

/* compiled from: TextInputLayout.kt */
public final class c implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f13598a;

    public c(TextInputLayout textInputLayout) {
        this.f13598a = textInputLayout;
    }

    public final void afterTextChanged(Editable editable) {
        j.f(editable, "editable");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        j.f(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        AppTitleTextView editTextTitle;
        Editable editable;
        String str;
        boolean z10;
        int i13;
        j.f(charSequence, "charSequence");
        StringBuilder p10 = a.p('(');
        p10.append(l.k1(charSequence.toString()).toString().length());
        p10.append("/100)");
        ((TextView) this.f13598a.findViewById(R$id.tvLength)).setText(p10.toString());
        this.f13598a.b();
        AppTitleTextView editTextTitle2 = this.f13598a.getEditTextTitle();
        boolean z11 = true;
        if (editTextTitle2 != null) {
            EditText editText = this.f13598a.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            if (editable == null) {
                str = "";
            } else {
                str = a.j(editable);
            }
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            editTextTitle2.setVisibility(i13);
        }
        EditText editText2 = this.f13598a.getEditText();
        if (editText2 == null || !editText2.requestFocus()) {
            z11 = false;
        }
        if (z11 && (editTextTitle = this.f13598a.getEditTextTitle()) != null) {
            editTextTitle.setVisibility(0);
        }
    }
}
