package com.ots.core.utils.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.material.search.h;
import com.ots.core.R$layout;
import com.ots.core.R$styleable;
import d2.e;
import d2.f;
import d2.l;
import ek.i;
import hf.d0;
import sk.j;
import sk.k;

/* compiled from: MenuItemLayout.kt */
public final class MenuItemLayout extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f8373d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ck.a<Boolean> f8374a = new ck.a<>();

    /* renamed from: b  reason: collision with root package name */
    public d0 f8375b;

    /* renamed from: c  reason: collision with root package name */
    public rk.a<i> f8376c = a.f8377a;

    /* compiled from: MenuItemLayout.kt */
    public static final class a extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8377a = new a();

        public a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuItemLayout(Context context) {
        super(context);
        j.f(context, "context");
        a(context, (AttributeSet) null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CustomMenuWidget, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(R$styleable.CustomMenuWidget_menuTitle);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.CustomMenuWidget_menuIconStart);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R$styleable.CustomMenuWidget_menuIconEnd);
        int color = obtainStyledAttributes.getColor(R$styleable.CustomMenuWidget_menuBackgroundColor, -1);
        obtainStyledAttributes.recycle();
        Object systemService = context.getSystemService("layout_inflater");
        j.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        l c10 = f.c((LayoutInflater) systemService, R$layout.widget_menu_item, this, true, (e) null);
        j.e(c10, "inflate(...)");
        setBinding((d0) c10);
        getBinding().f10782x.setBackground(drawable2);
        getBinding().f10783y.setBackground(drawable);
        getBinding().f10784z.setText(string);
        getBinding().f10781w.setCardBackgroundColor(color);
        getBinding().f10781w.setOnClickListener(new h(this, 7));
    }

    public final d0 getBinding() {
        d0 d0Var = this.f8375b;
        if (d0Var != null) {
            return d0Var;
        }
        j.l("binding");
        throw null;
    }

    public final ck.a<Boolean> getItemClickStream() {
        return this.f8374a;
    }

    public final rk.a<i> getOnItemClickAction() {
        return this.f8376c;
    }

    public final void setBinding(d0 d0Var) {
        j.f(d0Var, "<set-?>");
        this.f8375b = d0Var;
    }

    public final void setOnItemClickAction(rk.a<i> aVar) {
        j.f(aVar, "<set-?>");
        this.f8376c = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        a(context, attributeSet);
    }
}
