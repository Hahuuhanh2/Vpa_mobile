package gi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import sk.j;

/* compiled from: PolicyAndTermActivity.kt */
public final class i0 extends ClickableSpan {
    public final void onClick(View view) {
        j.f(view, "widget");
    }

    public final void updateDrawState(TextPaint textPaint) {
        j.f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
