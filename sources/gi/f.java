package gi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import sk.j;

/* compiled from: InstructVerifyActivity.kt */
public final class f extends ClickableSpan {
    public final void onClick(View view) {
        j.f(view, "widget");
    }

    public final void updateDrawState(TextPaint textPaint) {
        j.f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
