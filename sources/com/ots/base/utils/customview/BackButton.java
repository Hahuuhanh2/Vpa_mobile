package com.ots.base.utils.customview;

import android.content.Context;
import android.widget.ImageButton;
import com.google.android.material.textfield.b;
import com.vpa.daugia.C0531R$drawable;
import k1.a;
import sk.j;

/* compiled from: BackButton.kt */
public final class BackButton extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f8248a = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackButton(Context context) {
        super(context);
        j.f(context, "context");
        setBackground(a.getDrawable(context, C0531R$drawable.ic_back));
        setOnClickListener(new b(context, 4));
    }
}
