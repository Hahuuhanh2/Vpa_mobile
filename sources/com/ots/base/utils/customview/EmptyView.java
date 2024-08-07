package com.ots.base.utils.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.R$styleable;
import j7.a;
import sk.j;

/* compiled from: EmptyView.kt */
public final class EmptyView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public String f8255a;

    /* renamed from: b  reason: collision with root package name */
    public String f8256b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f8257c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmptyView(Context context) {
        this(context, (AttributeSet) null);
        j.f(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EmptyView);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z10 = false;
        this.f8257c = obtainStyledAttributes.getDrawable(0);
        this.f8255a = obtainStyledAttributes.getString(2);
        this.f8256b = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        setOrientation(1);
        LayoutInflater.from(context).inflate(C0535R$layout.empty_view, this);
        int i10 = C0533R$id.imvIcon;
        ImageView imageView = (ImageView) a.D(C0533R$id.imvIcon, this);
        if (imageView != null) {
            i10 = 2131362781;
            AppTextView appTextView = (AppTextView) a.D(2131362781, this);
            if (appTextView != null) {
                i10 = 2131362806;
                AppTextView appTextView2 = (AppTextView) a.D(2131362806, this);
                if (appTextView2 != null) {
                    imageView.setImageDrawable(this.f8257c);
                    appTextView2.setText(this.f8255a);
                    appTextView.setText(this.f8256b);
                    String str = this.f8255a;
                    if ((str == null || str.length() == 0) ? true : z10) {
                        appTextView2.setVisibility(8);
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i10)));
    }
}
