package gi;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vpa.daugia.module.profile.ui.activity.InstructVerifyActivity;
import sk.j;

/* compiled from: InstructVerifyActivity.kt */
public final class e extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InstructVerifyActivity f20363a;

    public e(InstructVerifyActivity instructVerifyActivity) {
        this.f20363a = instructVerifyActivity;
    }

    public final void onClick(View view) {
        j.f(view, "widget");
        this.f20363a.startActivity(new Intent(this.f20363a, InstructVerifyActivity.class));
    }

    public final void updateDrawState(TextPaint textPaint) {
        j.f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
