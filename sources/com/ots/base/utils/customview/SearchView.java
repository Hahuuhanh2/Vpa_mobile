package com.ots.base.utils.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.q;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.R$styleable;
import d2.e;
import d2.f;
import java.util.Timer;
import java.util.TimerTask;
import mf.b;
import mg.y7;
import n0.l;
import sk.j;

/* compiled from: SearchView.kt */
public final class SearchView extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f8262b = 0;

    /* renamed from: a  reason: collision with root package name */
    public y7 f8263a;

    /* compiled from: EditTextExtensions.kt */
    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SearchView f8264a;

        /* renamed from: com.ots.base.utils.customview.SearchView$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0080a extends TimerTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f8265a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ SearchView f8266b;

            /* renamed from: com.ots.base.utils.customview.SearchView$a$a$a  reason: collision with other inner class name */
            /* compiled from: EditTextExtensions.kt */
            public static final class C0081a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Editable f8267a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ SearchView f8268b;

                public C0081a(Editable editable, SearchView searchView) {
                    this.f8267a = editable;
                    this.f8268b = searchView;
                }

                public final void run() {
                    String str;
                    boolean z10;
                    Editable editable = this.f8267a;
                    if (editable == null || (str = editable.toString()) == null) {
                        str = "";
                    }
                    ImageView imageView = this.f8268b.getBinding().f21504x;
                    j.e(imageView, "ivClose");
                    int i10 = 0;
                    if (str.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        i10 = 8;
                    }
                    imageView.setVisibility(i10);
                }
            }

            public C0080a(Editable editable, SearchView searchView) {
                this.f8265a = editable;
                this.f8266b = searchView;
            }

            public final void run() {
                new Handler(Looper.getMainLooper()).post(new C0081a(this.f8265a, this.f8266b));
            }
        }

        public a(SearchView searchView) {
            this.f8264a = searchView;
        }

        public final void afterTextChanged(Editable editable) {
            Timer n10 = l.n(b.f13286a);
            b.f13286a = n10;
            n10.schedule(new C0080a(editable, this.f8264a), 500);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context) {
        super(context);
        j.f(context, "context");
        a(context, (AttributeSet) null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CustomSearchViewWidget, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(2);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        Object systemService = context.getSystemService("layout_inflater");
        j.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        d2.l c10 = f.c((LayoutInflater) systemService, C0535R$layout.widget_search_view, this, true, (e) null);
        j.e(c10, "inflate(...)");
        setBinding((y7) c10);
        getBinding().f21503w.setHint(string);
        getBinding().f21505y.setBackground(drawable);
        getBinding().f21504x.setBackground(drawable2);
        EditText editText = getBinding().f21503w;
        j.e(editText, "edtForm");
        editText.addTextChangedListener(new a(this));
        getBinding().f21504x.setOnClickListener(new q(this, 1));
    }

    public final y7 getBinding() {
        y7 y7Var = this.f8263a;
        if (y7Var != null) {
            return y7Var;
        }
        j.l("binding");
        throw null;
    }

    public final void setBinding(y7 y7Var) {
        j.f(y7Var, "<set-?>");
        this.f8263a = y7Var;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        a(context, attributeSet);
    }
}
