package nf;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.support.v4.media.a;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.ots.core.R$animator;
import com.ots.core.R$drawable;
import com.ots.core.utils.customview.edit.TextInputLayout;
import com.ots.core.utils.customview.textview.AppTitleTextView;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f13596a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f13597b;

    public /* synthetic */ b(LinearLayout linearLayout, TextInputLayout textInputLayout) {
        this.f13596a = linearLayout;
        this.f13597b = textInputLayout;
    }

    public final void onFocusChange(View view, boolean z10) {
        Editable editable;
        LinearLayout linearLayout = this.f13596a;
        TextInputLayout textInputLayout = this.f13597b;
        int i10 = TextInputLayout.f8398q;
        j.f(textInputLayout, "this$0");
        boolean z11 = true;
        int i11 = 0;
        String str = "";
        Editable editable2 = null;
        if (z10) {
            linearLayout.setBackgroundResource(R$drawable.bg_form_plate_10dp_on);
            EditText editText = textInputLayout.f8402d;
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            if (String.valueOf(editable).length() != 0) {
                z11 = false;
            }
            if (z11) {
                Animator loadAnimator = AnimatorInflater.loadAnimator(textInputLayout.getContext(), R$animator.fade_in);
                j.e(loadAnimator, "loadAnimator(...)");
                textInputLayout.f8399a = loadAnimator;
                loadAnimator.setTarget(textInputLayout.f8403e);
                Animator animator = textInputLayout.f8399a;
                if (animator != null) {
                    animator.start();
                } else {
                    j.l("fadeInAnimation");
                    throw null;
                }
            }
            EditText editText2 = textInputLayout.f8402d;
            if (editText2 != null) {
                editText2.setHint(str);
            }
            AppTitleTextView appTitleTextView = textInputLayout.f8403e;
            if (appTitleTextView != null) {
                appTitleTextView.setVisibility(0);
                return;
            }
            return;
        }
        AppTitleTextView appTitleTextView2 = textInputLayout.f8403e;
        if (appTitleTextView2 != null) {
            EditText editText3 = textInputLayout.f8402d;
            if (editText3 != null) {
                editable2 = editText3.getText();
            }
            if (editable2 != null) {
                str = a.j(editable2);
            }
            if (str.length() <= 0) {
                z11 = false;
            }
            if (!z11) {
                i11 = 8;
            }
            appTitleTextView2.setVisibility(i11);
        }
        EditText editText4 = textInputLayout.f8402d;
        if (editText4 != null) {
            editText4.setHint(textInputLayout.f8404f.f13595c);
        }
        linearLayout.setBackgroundResource(R$drawable.bg_form_plate_10dp);
    }
}
