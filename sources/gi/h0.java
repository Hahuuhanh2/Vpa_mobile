package gi;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vpa.daugia.module.profile.ui.activity.PolicyAndTermActivity;
import com.vpa.daugia.ui.policy.TermsOfUseActivity;
import sk.j;

/* compiled from: PolicyAndTermActivity.kt */
public final class h0 extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PolicyAndTermActivity f20383a;

    public h0(PolicyAndTermActivity policyAndTermActivity) {
        this.f20383a = policyAndTermActivity;
    }

    public final void onClick(View view) {
        j.f(view, "widget");
        this.f20383a.startActivity(new Intent(this.f20383a, TermsOfUseActivity.class));
    }

    public final void updateDrawState(TextPaint textPaint) {
        j.f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
