package rh;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity;
import sk.j;

/* compiled from: ProfileState.kt */
public final class d extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f22790a;

    public d(f fVar) {
        this.f22790a = fVar;
    }

    public final void onClick(View view) {
        j.f(view, "widget");
        this.f22790a.f22792a.startActivity(new Intent(this.f22790a.f22792a, RegisterAccountActivity.class));
    }

    public final void updateDrawState(TextPaint textPaint) {
        j.f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
