package in.aabhasjindal.otptextview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import sk.j;

/* compiled from: OTPChildEditText.kt */
public final class OTPChildEditText extends AppCompatEditText {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OTPChildEditText(Context context) {
        super(context);
        j.g(context, "context");
        c(context);
    }

    public final void c(Context context) {
        setCursorVisible(false);
        setTextColor(context.getResources().getColor(R$color.transparent));
        setBackgroundDrawable((Drawable) null);
        setInputType(2);
        setSelectAllOnFocus(false);
        setTextIsSelectable(false);
    }

    public final void onSelectionChanged(int i10, int i11) {
        Editable text = getText();
        if (text == null || (i10 == text.length() && i11 == text.length())) {
            super.onSelectionChanged(i10, i11);
        } else {
            setSelection(text.length(), text.length());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OTPChildEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.g(context, "context");
        j.g(attributeSet, "attrs");
        c(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OTPChildEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.g(context, "context");
        j.g(attributeSet, "attrs");
        c(context);
    }
}
