package zg;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vpa.daugia.module.auth.ui.activity.StepTwoActivity;
import com.vpa.daugia.ui.policy.PrivacyPolicyActivity;
import sk.j;

/* compiled from: StepTwoActivity.kt */
public final class g2 extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23668a;

    public g2(StepTwoActivity stepTwoActivity) {
        this.f23668a = stepTwoActivity;
    }

    public final void onClick(View view) {
        j.f(view, "widget");
        this.f23668a.startActivity(new Intent(this.f23668a, PrivacyPolicyActivity.class));
    }

    public final void updateDrawState(TextPaint textPaint) {
        j.f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
