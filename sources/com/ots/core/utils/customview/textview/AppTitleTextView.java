package com.ots.core.utils.customview.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.media.a;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.ots.core.R$font;
import com.ots.core.R$styleable;
import m1.e;
import sk.j;

/* compiled from: AppTitleTextView.kt */
public final class AppTitleTextView extends AppCompatTextView {

    /* renamed from: o  reason: collision with root package name */
    public Typeface f8411o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppTitleTextView(Context context) {
        super(context);
        j.c(context);
        Typeface a10 = e.a(getContext(), R$font.sf_pro_display);
        this.f8411o = a10;
        setTypeface(a10);
    }

    public final Typeface getTypeFont() {
        return this.f8411o;
    }

    public final void setTypeFont(Typeface typeface) {
        this.f8411o = typeface;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppTitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Spanned spanned;
        Spanned spanned2;
        j.c(context);
        this.f8411o = e.a(getContext(), R$font.sf_pro_display);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppTextViewWidget);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        if (obtainStyledAttributes.getBoolean(R$styleable.AppTextViewWidget_textRequired, false)) {
            if (getTypeface().getStyle() == 1) {
                StringBuilder q10 = a.q("<strong>");
                q10.append(getText());
                q10.append("</strong> <font color = '#FC0808'>*</font>");
                String sb2 = q10.toString();
                j.f(sb2, "string");
                if (Build.VERSION.SDK_INT >= 24) {
                    spanned2 = Html.fromHtml(sb2, 0);
                    j.c(spanned2);
                } else {
                    spanned2 = Html.fromHtml(sb2);
                    j.c(spanned2);
                }
                setText(spanned2);
            } else {
                String str = getText() + " <font color = '#FC0808'>*</font>";
                j.f(str, "string");
                if (Build.VERSION.SDK_INT >= 24) {
                    spanned = Html.fromHtml(str, 0);
                    j.c(spanned);
                } else {
                    spanned = Html.fromHtml(str);
                    j.c(spanned);
                }
                setText(spanned);
            }
        }
        setTypeface(this.f8411o);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppTitleTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.c(context);
        Typeface a10 = e.a(getContext(), R$font.sf_pro_display);
        this.f8411o = a10;
        setTypeface(a10);
    }
}
