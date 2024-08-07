package kf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.b;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import com.ots.core.R$layout;
import d2.e;
import d2.f;
import hf.g;

/* compiled from: Widget.kt */
public final class j {
    public static void a(Context context, String str, String str2, int i10, Integer num, LinearLayout linearLayout) {
        Spanned spanned;
        sk.j.f(context, "mContext");
        g gVar = (g) f.c(LayoutInflater.from(context), R$layout.empty_state_layout, linearLayout, false, (e) null);
        if (num != null) {
            try {
                if (num.intValue() == -1) {
                    l f10 = b.c(context).f(context);
                    Integer valueOf = Integer.valueOf(i10);
                    f10.getClass();
                    new k(f10.f4948a, f10, Drawable.class, f10.f4949b).D(valueOf).B(gVar.f10789w);
                    gVar.f10789w.setVisibility(0);
                }
            } catch (Exception unused) {
            }
        }
        l f11 = b.c(context).f(context);
        Integer valueOf2 = Integer.valueOf(i10);
        f11.getClass();
        new k(f11.f4948a, f11, Drawable.class, f11.f4949b).D(valueOf2).B(gVar.f10789w);
        gVar.f10789w.setVisibility(0);
        TextView textView = gVar.f10790x;
        if (Build.VERSION.SDK_INT >= 24) {
            spanned = Html.fromHtml(str2, 0);
        } else {
            spanned = Html.fromHtml(str2);
        }
        textView.setText(spanned);
        gVar.f10791y.setText(str);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        if (linearLayout != null) {
            linearLayout.addView(gVar.f8554e);
        }
        sk.j.e(gVar.f8554e, "getRoot(...)");
    }
}
