package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import ca.a;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.e;
import com.google.android.material.internal.CheckableImageButton;
import d.i;
import f8.j;
import java.util.WeakHashMap;
import t7.b;
import w1.d0;
import w1.q0;
import x1.d;
import x1.f;

/* compiled from: DropdownMenuEndIconDelegate */
public final class k extends m {

    /* renamed from: e  reason: collision with root package name */
    public final int f7034e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7035f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f7036g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f7037h;

    /* renamed from: i  reason: collision with root package name */
    public final b f7038i = new b(this, 1);

    /* renamed from: j  reason: collision with root package name */
    public final e f7039j = new e(this, 2);

    /* renamed from: k  reason: collision with root package name */
    public final a f7040k = new a(this, 14);

    /* renamed from: l  reason: collision with root package name */
    public boolean f7041l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7042m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7043n;

    /* renamed from: o  reason: collision with root package name */
    public long f7044o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f7045p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f7046q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f7047r;

    public k(l lVar) {
        super(lVar);
        Context context = lVar.getContext();
        int i10 = R$attr.motionDurationShort3;
        this.f7035f = j.c(context, i10, 67);
        this.f7034e = j.c(lVar.getContext(), i10, 50);
        this.f7036g = j.d(lVar.getContext(), R$attr.motionEasingLinearInterpolator, b.f14885a);
    }

    public final void a() {
        boolean z10;
        if (this.f7045p.isTouchExplorationEnabled()) {
            if (this.f7037h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f7077d.hasFocus()) {
                this.f7037h.dismissDropDown();
            }
        }
        this.f7037h.post(new i(this, 18));
    }

    public final int c() {
        return R$string.exposed_dropdown_menu_content_description;
    }

    public final int d() {
        return R$drawable.mtrl_dropdown_arrow;
    }

    public final View.OnFocusChangeListener e() {
        return this.f7039j;
    }

    public final View.OnClickListener f() {
        return this.f7038i;
    }

    public final d h() {
        return this.f7040k;
    }

    public final boolean i(int i10) {
        return i10 != 0;
    }

    public final boolean j() {
        return this.f7041l;
    }

    public final boolean l() {
        return this.f7043n;
    }

    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f7037h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new h(this));
            this.f7037h.setOnDismissListener(new i(this));
            boolean z10 = false;
            this.f7037h.setThreshold(0);
            this.f7074a.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z10 = true;
            }
            if (!z10 && this.f7045p.isTouchExplorationEnabled()) {
                CheckableImageButton checkableImageButton = this.f7077d;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.d.s(checkableImageButton, 2);
            }
            this.f7074a.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void n(f fVar) {
        boolean z10;
        boolean z11;
        if (this.f7037h.getInputType() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            fVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z11 = fVar.f16862a.isShowingHintText();
        } else {
            z11 = fVar.e(4);
        }
        if (z11) {
            fVar.l((String) null);
        }
    }

    @SuppressLint({"WrongConstant"})
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z10;
        if (this.f7045p.isEnabled()) {
            boolean z11 = false;
            if (this.f7037h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (accessibilityEvent.getEventType() == 32768 && this.f7043n && !this.f7037h.isPopupShowing()) {
                    z11 = true;
                }
                if (accessibilityEvent.getEventType() == 1 || z11) {
                    u();
                    this.f7042m = true;
                    this.f7044o = System.currentTimeMillis();
                }
            }
        }
    }

    public final void r() {
        int i10 = this.f7035f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(this.f7036g);
        ofFloat.setDuration((long) i10);
        ofFloat.addUpdateListener(new w7.a(this, 3));
        this.f7047r = ofFloat;
        int i11 = this.f7034e;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(this.f7036g);
        ofFloat2.setDuration((long) i11);
        ofFloat2.addUpdateListener(new w7.a(this, 3));
        this.f7046q = ofFloat2;
        ofFloat2.addListener(new j(this));
        this.f7045p = (AccessibilityManager) this.f7076c.getSystemService("accessibility");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f7037h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.f7037h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void t(boolean z10) {
        if (this.f7043n != z10) {
            this.f7043n = z10;
            this.f7047r.cancel();
            this.f7046q.start();
        }
    }

    public final void u() {
        boolean z10;
        if (this.f7037h != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f7044o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f7042m = false;
            }
            if (!this.f7042m) {
                t(!this.f7043n);
                if (this.f7043n) {
                    this.f7037h.requestFocus();
                    this.f7037h.showDropDown();
                    return;
                }
                this.f7037h.dismissDropDown();
                return;
            }
            this.f7042m = false;
        }
    }
}
