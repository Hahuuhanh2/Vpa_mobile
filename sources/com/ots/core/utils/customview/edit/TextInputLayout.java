package com.ots.core.utils.customview.edit;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ots.core.R$drawable;
import com.ots.core.R$id;
import com.ots.core.R$layout;
import com.ots.core.R$styleable;
import com.ots.core.utils.customview.textview.AppTitleTextView;
import ek.i;
import kf.h;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: TextInputLayout.kt */
public final class TextInputLayout extends FrameLayout {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f8398q = 0;

    /* renamed from: a  reason: collision with root package name */
    public Animator f8399a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8400b;

    /* renamed from: c  reason: collision with root package name */
    public rk.a<i> f8401c = c.f8410a;

    /* renamed from: d  reason: collision with root package name */
    public EditText f8402d;

    /* renamed from: e  reason: collision with root package name */
    public AppTitleTextView f8403e;

    /* renamed from: f  reason: collision with root package name */
    public nf.a f8404f = new nf.a();

    /* renamed from: n  reason: collision with root package name */
    public String f8405n = "text";

    /* renamed from: o  reason: collision with root package name */
    public boolean f8406o = true;

    /* renamed from: p  reason: collision with root package name */
    public String f8407p = "";

    /* compiled from: TextInputLayout.kt */
    public static final class a extends k implements l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f8408a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(TextInputLayout textInputLayout) {
            super(1);
            this.f8408a = textInputLayout;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            this.f8408a.getOnRightDrawableClicked().invoke();
            return i.f20112a;
        }
    }

    /* compiled from: TextInputLayout.kt */
    public static final class b extends k implements l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f8409a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(TextInputLayout textInputLayout) {
            super(1);
            this.f8409a = textInputLayout;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            this.f8409a.getOnRightDrawableClicked().invoke();
            return i.f20112a;
        }
    }

    /* compiled from: TextInputLayout.kt */
    public static final class c extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8410a = new c();

        public c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputLayout(Context context) {
        super(context);
        j.f(context, "context");
        a(context, (AttributeSet) null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        int i10;
        boolean z10;
        Editable editable;
        String str;
        int i11;
        AppTitleTextView appTitleTextView;
        Spanned spanned;
        Spanned spanned2;
        AppTitleTextView appTitleTextView2;
        Spanned spanned3;
        Object systemService = context.getSystemService("layout_inflater");
        j.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        boolean z11 = true;
        ((LayoutInflater) systemService).inflate(R$layout.widget_text_input_layout, this, true);
        this.f8403e = (AppTitleTextView) findViewById(R$id.tvEdittextTitle);
        int i12 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CustomEditTextWidget, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(R$styleable.CustomEditTextWidget_edtTitle);
        if (string != null) {
            nf.a aVar = this.f8404f;
            aVar.getClass();
            aVar.f13594b = string;
            this.f8404f.f13593a = obtainStyledAttributes.getBoolean(R$styleable.CustomEditTextWidget_edtRequired, false);
            if (this.f8404f.f13593a) {
                AppTitleTextView appTitleTextView3 = this.f8403e;
                if (appTitleTextView3 != null) {
                    String str2 = "<strong>" + string + "</strong> <font color = '#FC0808'>*</font>";
                    j.f(str2, "string");
                    if (Build.VERSION.SDK_INT >= 24) {
                        spanned3 = Html.fromHtml(str2, 0);
                        j.c(spanned3);
                    } else {
                        spanned3 = Html.fromHtml(str2);
                        j.c(spanned3);
                    }
                    appTitleTextView3.setText(spanned3);
                }
            } else {
                AppTitleTextView appTitleTextView4 = this.f8403e;
                if (appTitleTextView4 != null) {
                    appTitleTextView4.setText(string);
                }
            }
        }
        String string2 = obtainStyledAttributes.getString(R$styleable.CustomEditTextWidget_edtHintTitle);
        if (!(string2 == null || (appTitleTextView2 = this.f8403e) == null)) {
            appTitleTextView2.setText(string2);
        }
        String string3 = obtainStyledAttributes.getString(R$styleable.CustomEditTextWidget_edtHint);
        if (string3 != null) {
            nf.a aVar2 = this.f8404f;
            if (aVar2.f13593a) {
                String str3 = "<strong>" + string3 + "</strong> <font color = '#FC0808'>*</font>";
                j.f(str3, "string");
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 24) {
                    spanned = Html.fromHtml(str3, 0);
                    j.c(spanned);
                } else {
                    spanned = Html.fromHtml(str3);
                    j.c(spanned);
                }
                aVar2.f13595c = spanned;
                AppTitleTextView appTitleTextView5 = this.f8403e;
                if (appTitleTextView5 != null) {
                    String str4 = "<strong>" + string3 + "</strong> <font color = '#FC0808'>*</font>";
                    j.f(str4, "string");
                    if (i13 >= 24) {
                        spanned2 = Html.fromHtml(str4, 0);
                        j.c(spanned2);
                    } else {
                        spanned2 = Html.fromHtml(str4);
                        j.c(spanned2);
                    }
                    appTitleTextView5.setText(spanned2);
                }
                EditText editText = this.f8402d;
                int i14 = h.f12560a;
                if (editText != null) {
                    editText.setHint(this.f8404f.f13595c);
                }
            } else {
                AppTitleTextView appTitleTextView6 = this.f8403e;
                if (appTitleTextView6 != null) {
                    appTitleTextView6.setText(string3);
                }
            }
        }
        boolean z12 = obtainStyledAttributes.getBoolean(R$styleable.CustomEditTextWidget_isError, false);
        View findViewById = findViewById(R$id.lnError);
        j.e(findViewById, "findViewById(...)");
        if (z12) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        findViewById.setVisibility(i10);
        float dimension = obtainStyledAttributes.getDimension(R$styleable.CustomEditTextWidget_edtTitleSize, 0.0f);
        if (dimension == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (appTitleTextView = this.f8403e) != null) {
            appTitleTextView.setTextSize(dimension);
        }
        String string4 = obtainStyledAttributes.getString(R$styleable.CustomEditTextWidget_validatorType);
        if (string4 != null) {
            this.f8405n = string4;
            View findViewById2 = findViewById(R$id.tvLength);
            j.e(findViewById2, "findViewById(...)");
            if (j.a(string4, "content")) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            findViewById2.setVisibility(i11);
        }
        if (this.f8404f.f13593a) {
            this.f8405n = android.support.v4.media.a.o(new StringBuilder(), this.f8405n, "|required");
        }
        obtainStyledAttributes.getString(R$styleable.CustomEditTextWidget_edtFormText);
        this.f8404f.getClass();
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.CustomEditTextWidget_edtIconStart);
        if (drawable != null) {
            int i15 = R$id.iconStart;
            ((ImageView) findViewById(i15)).setImageDrawable(drawable);
            View findViewById3 = findViewById(i15);
            j.e(findViewById3, "findViewById(...)");
            findViewById3.setVisibility(0);
        } else {
            View findViewById4 = findViewById(R$id.iconStart);
            j.e(findViewById4, "findViewById(...)");
            findViewById4.setVisibility(8);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R$styleable.CustomEditTextWidget_edtIconEnd);
        if (drawable2 != null) {
            int i16 = R$id.iconEnd;
            ((ImageView) findViewById(i16)).setImageDrawable(drawable2);
            View findViewById5 = findViewById(i16);
            j.e(findViewById5, "findViewById(...)");
            findViewById5.setVisibility(0);
        } else {
            View findViewById6 = findViewById(R$id.iconEnd);
            j.e(findViewById6, "findViewById(...)");
            findViewById6.setVisibility(8);
        }
        obtainStyledAttributes.recycle();
        View findViewById7 = findViewById(R$id.iconEnd);
        j.e(findViewById7, "findViewById(...)");
        findViewById7.setOnClickListener(new kf.b(500, findViewById7, new a(this)));
        View findViewById8 = findViewById(R$id.iconStart);
        j.e(findViewById8, "findViewById(...)");
        findViewById8.setOnClickListener(new kf.b(500, findViewById8, new b(this)));
        AppTitleTextView appTitleTextView7 = this.f8403e;
        if (appTitleTextView7 != null) {
            EditText editText2 = this.f8402d;
            if (editText2 != null) {
                editable = editText2.getText();
            } else {
                editable = null;
            }
            if (editable == null) {
                str = "";
            } else {
                str = android.support.v4.media.a.j(editable);
            }
            if (str.length() <= 0) {
                z11 = false;
            }
            if (!z11) {
                i12 = 8;
            }
            appTitleTextView7.setVisibility(i12);
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        j.f(view, "child");
        j.f(layoutParams, "params");
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            ((FrameLayout) findViewById(R$id.textInputContainer)).addView(view, layoutParams);
            EditText editText = (EditText) view;
            this.f8402d = editText;
            editText.setHint(this.f8404f.f13595c);
            EditText editText2 = this.f8402d;
            if (editText2 != null) {
                editText2.addTextChangedListener(new nf.c(this));
            }
            LinearLayout linearLayout = (LinearLayout) findViewById(R$id.lnForm);
            EditText editText3 = this.f8402d;
            if (editText3 != null) {
                editText3.setOnFocusChangeListener(new nf.b(linearLayout, this));
                return;
            }
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    public final boolean b() {
        Editable editable;
        String str;
        EditText editText = this.f8402d;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        if (editable == null) {
            str = "";
        } else {
            str = android.support.v4.media.a.j(editable);
        }
        String a10 = lf.h.a(str, this.f8405n);
        boolean z10 = true;
        if (a10 != null) {
            this.f8407p = a10;
            ((TextView) findViewById(R$id.baseEditTextError)).setText(a10);
            EditText editText2 = this.f8402d;
            if (editText2 != null) {
                editText2.requestFocus();
            }
            ((LinearLayout) findViewById(R$id.lnForm)).setBackgroundResource(R$drawable.bg_form_plate_10dp_error);
            return true;
        }
        ((TextView) findViewById(R$id.baseEditTextError)).setText("");
        this.f8407p = "";
        EditText editText3 = this.f8402d;
        if (editText3 == null || !editText3.hasFocus()) {
            z10 = false;
        }
        if (z10) {
            ((LinearLayout) findViewById(R$id.lnForm)).setBackgroundResource(R$drawable.bg_form_plate_10dp_on);
        }
        return false;
    }

    public final boolean getChecked() {
        return this.f8406o;
    }

    public final EditText getEditText() {
        return this.f8402d;
    }

    public final AppTitleTextView getEditTextTitle() {
        return this.f8403e;
    }

    public final rk.a<i> getOnRightDrawableClicked() {
        return this.f8401c;
    }

    public final boolean getOnTextChange() {
        return this.f8400b;
    }

    public final String getValidatorTypeText() {
        return this.f8407p;
    }

    public final void setChecked(boolean z10) {
        this.f8406o = z10;
    }

    public final void setEditText(EditText editText) {
        this.f8402d = editText;
    }

    public final void setEditTextTitle(AppTitleTextView appTitleTextView) {
        this.f8403e = appTitleTextView;
    }

    public final void setOnRightDrawableClicked(rk.a<i> aVar) {
        j.f(aVar, "<set-?>");
        this.f8401c = aVar;
    }

    public final void setOnTextChange(boolean z10) {
        this.f8400b = z10;
    }

    public final void setValidatorTypeText(String str) {
        j.f(str, "<set-?>");
        this.f8407p = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        a(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
        a(context, attributeSet);
    }
}
