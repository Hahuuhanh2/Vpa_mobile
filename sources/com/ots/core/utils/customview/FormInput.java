package com.ots.core.utils.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ots.core.R$layout;
import com.ots.core.R$styleable;
import d2.e;
import d2.f;
import d2.l;
import hf.b0;
import sk.j;

/* compiled from: FormInput.kt */
public final class FormInput extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public b0 f8361a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8362b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormInput(Context context) {
        super(context);
        j.f(context, "context");
        a(context, (AttributeSet) null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CustomFormWidget, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(R$styleable.CustomFormWidget_formTitle);
        String string2 = obtainStyledAttributes.getString(R$styleable.CustomFormWidget_formHint);
        String string3 = obtainStyledAttributes.getString(R$styleable.CustomFormWidget_formText);
        int i10 = obtainStyledAttributes.getInt(R$styleable.CustomFormWidget_android_inputType, 1);
        float dimension = obtainStyledAttributes.getDimension(R$styleable.CustomFormWidget_heightForm, 40.0f);
        obtainStyledAttributes.recycle();
        Object systemService = context.getSystemService("layout_inflater");
        j.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        l c10 = f.c((LayoutInflater) systemService, R$layout.widget_form_input, this, true, (e) null);
        j.e(c10, "inflate(...)");
        setBinding((b0) c10);
        getBinding().f10776x.setText(string);
        getBinding().f10775w.setHint(string2);
        getBinding().f10775w.setText(string3);
        getBinding().f10775w.setInputType(i10);
        ViewGroup.LayoutParams layoutParams = getBinding().f10775w.getLayoutParams();
        layoutParams.height = (int) dimension;
        getBinding().f10775w.setLayoutParams(layoutParams);
    }

    public final b0 getBinding() {
        b0 b0Var = this.f8361a;
        if (b0Var != null) {
            return b0Var;
        }
        j.l("binding");
        throw null;
    }

    public final boolean getOnTextChange() {
        return this.f8362b;
    }

    public final void setBinding(b0 b0Var) {
        j.f(b0Var, "<set-?>");
        this.f8361a = b0Var;
    }

    public final void setOnTextChange(boolean z10) {
        this.f8362b = z10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        a(context, attributeSet);
    }
}
