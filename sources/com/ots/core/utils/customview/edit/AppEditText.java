package com.ots.core.utils.customview.edit;

import android.content.Context;
import android.util.AttributeSet;
import sk.j;

/* compiled from: AppEditText.kt */
public final class AppEditText extends RegexEditText {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppEditText(Context context) {
        super(context, (AttributeSet) null, 6, 0);
        j.c(context);
        setImeOptions(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        j.c(context);
        setImeOptions(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.c(context);
        setImeOptions(0);
    }
}
