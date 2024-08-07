package com.ots.core.utils.customview.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.ots.core.R$font;
import com.ots.core.R$styleable;
import m1.e;
import sk.j;

/* compiled from: AppTextView.kt */
public final class AppTextView extends AppCompatTextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppTextView(Context context) {
        super(context);
        j.c(context);
        l(context, (AttributeSet) null);
    }

    public final void l(Context context, AttributeSet attributeSet) {
        Typeface a10 = e.a(context, R$font.sf_pro_display);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppTextViewWidget);
            j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int i10 = obtainStyledAttributes.getInt(R$styleable.AppTextViewWidget_styleText, 0);
            obtainStyledAttributes.recycle();
            setTypeface(Typeface.create(a10, i10));
            return;
        }
        setTypeface(a10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.c(context);
        l(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.c(context);
        l(context, attributeSet);
    }
}
