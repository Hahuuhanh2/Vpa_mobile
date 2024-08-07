package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: TooltipCompat */
public final class q0 {

    /* compiled from: TooltipCompat */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        r0 r0Var = r0.f1202r;
        if (r0Var != null && r0Var.f1204a == view) {
            r0.b((r0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            r0 r0Var2 = r0.f1203s;
            if (r0Var2 != null && r0Var2.f1204a == view) {
                r0Var2.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new r0(view, charSequence);
    }
}
