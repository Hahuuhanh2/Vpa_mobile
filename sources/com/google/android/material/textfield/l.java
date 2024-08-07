package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.n0;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.t;
import com.google.android.material.internal.x;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import w1.d0;
import w1.g;
import w1.q0;

@SuppressLint({"ViewConstructor"})
/* compiled from: EndCompoundLayout */
public final class l extends LinearLayout {
    public final AccessibilityManager A;
    public x1.d B;
    public final a C = new a();

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f7048a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f7049b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckableImageButton f7050c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f7051d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f7052e;

    /* renamed from: f  reason: collision with root package name */
    public View.OnLongClickListener f7053f;

    /* renamed from: n  reason: collision with root package name */
    public final CheckableImageButton f7054n;

    /* renamed from: o  reason: collision with root package name */
    public final d f7055o;

    /* renamed from: p  reason: collision with root package name */
    public int f7056p = 0;

    /* renamed from: q  reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.g> f7057q = new LinkedHashSet<>();

    /* renamed from: r  reason: collision with root package name */
    public ColorStateList f7058r;

    /* renamed from: s  reason: collision with root package name */
    public PorterDuff.Mode f7059s;

    /* renamed from: t  reason: collision with root package name */
    public int f7060t;

    /* renamed from: u  reason: collision with root package name */
    public ImageView.ScaleType f7061u;

    /* renamed from: v  reason: collision with root package name */
    public View.OnLongClickListener f7062v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f7063w;

    /* renamed from: x  reason: collision with root package name */
    public final AppCompatTextView f7064x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f7065y;

    /* renamed from: z  reason: collision with root package name */
    public EditText f7066z;

    /* compiled from: EndCompoundLayout */
    public class a extends t {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            l.this.b().a();
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.this.b().b();
        }
    }

    /* compiled from: EndCompoundLayout */
    public class b implements TextInputLayout.f {
        public b() {
        }

        public final void a(TextInputLayout textInputLayout) {
            if (l.this.f7066z != textInputLayout.getEditText()) {
                l lVar = l.this;
                EditText editText = lVar.f7066z;
                if (editText != null) {
                    editText.removeTextChangedListener(lVar.C);
                    if (l.this.f7066z.getOnFocusChangeListener() == l.this.b().e()) {
                        l.this.f7066z.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    }
                }
                l.this.f7066z = textInputLayout.getEditText();
                l lVar2 = l.this;
                EditText editText2 = lVar2.f7066z;
                if (editText2 != null) {
                    editText2.addTextChangedListener(lVar2.C);
                }
                l.this.b().m(l.this.f7066z);
                l lVar3 = l.this;
                lVar3.j(lVar3.b());
            }
        }
    }

    /* compiled from: EndCompoundLayout */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        public final void onViewAttachedToWindow(View view) {
            l lVar = l.this;
            if (lVar.B != null && lVar.A != null) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (d0.g.b(lVar)) {
                    x1.c.a(lVar.A, lVar.B);
                }
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            l lVar = l.this;
            x1.d dVar = lVar.B;
            if (dVar != null && (accessibilityManager = lVar.A) != null) {
                x1.c.b(accessibilityManager, dVar);
            }
        }
    }

    /* compiled from: EndCompoundLayout */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<m> f7070a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public final l f7071b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7072c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7073d;

        public d(l lVar, n0 n0Var) {
            this.f7071b = lVar;
            this.f7072c = n0Var.i(R$styleable.TextInputLayout_endIconDrawable, 0);
            this.f7073d = n0Var.i(R$styleable.TextInputLayout_passwordToggleDrawable, 0);
        }
    }

    public l(TextInputLayout textInputLayout, n0 n0Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        b bVar = new b();
        this.A = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f7048a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f7049b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R$id.text_input_error_icon);
        this.f7050c = a10;
        CheckableImageButton a11 = a(frameLayout, from, R$id.text_input_end_icon);
        this.f7054n = a11;
        this.f7055o = new d(this, n0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f7064x = appCompatTextView;
        int i10 = R$styleable.TextInputLayout_errorIconTint;
        if (n0Var.l(i10)) {
            this.f7051d = i8.c.b(getContext(), n0Var, i10);
        }
        int i11 = R$styleable.TextInputLayout_errorIconTintMode;
        CharSequence charSequence = null;
        if (n0Var.l(i11)) {
            this.f7052e = x.h(n0Var.h(i11, -1), (PorterDuff.Mode) null);
        }
        int i12 = R$styleable.TextInputLayout_errorIconDrawable;
        if (n0Var.l(i12)) {
            i(n0Var.e(i12));
        }
        a10.setContentDescription(getResources().getText(R$string.error_icon_content_description));
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.s(a10, 2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setFocusable(false);
        int i13 = R$styleable.TextInputLayout_passwordToggleEnabled;
        if (!n0Var.l(i13)) {
            int i14 = R$styleable.TextInputLayout_endIconTint;
            if (n0Var.l(i14)) {
                this.f7058r = i8.c.b(getContext(), n0Var, i14);
            }
            int i15 = R$styleable.TextInputLayout_endIconTintMode;
            if (n0Var.l(i15)) {
                this.f7059s = x.h(n0Var.h(i15, -1), (PorterDuff.Mode) null);
            }
        }
        int i16 = R$styleable.TextInputLayout_endIconMode;
        if (n0Var.l(i16)) {
            g(n0Var.h(i16, 0));
            int i17 = R$styleable.TextInputLayout_endIconContentDescription;
            if (n0Var.l(i17) && a11.getContentDescription() != (k10 = n0Var.k(i17))) {
                a11.setContentDescription(k10);
            }
            a11.setCheckable(n0Var.a(R$styleable.TextInputLayout_endIconCheckable, true));
        } else if (n0Var.l(i13)) {
            int i18 = R$styleable.TextInputLayout_passwordToggleTint;
            if (n0Var.l(i18)) {
                this.f7058r = i8.c.b(getContext(), n0Var, i18);
            }
            int i19 = R$styleable.TextInputLayout_passwordToggleTintMode;
            if (n0Var.l(i19)) {
                this.f7059s = x.h(n0Var.h(i19, -1), (PorterDuff.Mode) null);
            }
            g(n0Var.a(i13, false) ? 1 : 0);
            CharSequence k11 = n0Var.k(R$styleable.TextInputLayout_passwordToggleContentDescription);
            if (a11.getContentDescription() != k11) {
                a11.setContentDescription(k11);
            }
        }
        int d10 = n0Var.d(R$styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.f7060t) {
                this.f7060t = d10;
                a11.setMinimumWidth(d10);
                a11.setMinimumHeight(d10);
                a10.setMinimumWidth(d10);
                a10.setMinimumHeight(d10);
            }
            int i20 = R$styleable.TextInputLayout_endIconScaleType;
            if (n0Var.l(i20)) {
                ImageView.ScaleType b10 = n.b(n0Var.h(i20, -1));
                this.f7061u = b10;
                a11.setScaleType(b10);
                a10.setScaleType(b10);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R$id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            d0.g.f(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(n0Var.i(R$styleable.TextInputLayout_suffixTextAppearance, 0));
            int i21 = R$styleable.TextInputLayout_suffixTextColor;
            if (n0Var.l(i21)) {
                appCompatTextView.setTextColor(n0Var.b(i21));
            }
            CharSequence k12 = n0Var.k(R$styleable.TextInputLayout_suffixText);
            this.f7063w = !TextUtils.isEmpty(k12) ? k12 : charSequence;
            appCompatTextView.setText(k12);
            n();
            frameLayout.addView(a11);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a10);
            textInputLayout.f6982l0.add(bVar);
            if (textInputLayout.f6971d != null) {
                bVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new c());
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R$layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (i8.c.e(getContext())) {
            g.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final m b() {
        d dVar = this.f7055o;
        int i10 = this.f7056p;
        m mVar = dVar.f7070a.get(i10);
        if (mVar == null) {
            if (i10 == -1) {
                mVar = new f(dVar.f7071b);
            } else if (i10 == 0) {
                mVar = new r(dVar.f7071b);
            } else if (i10 == 1) {
                mVar = new s(dVar.f7071b, dVar.f7073d);
            } else if (i10 == 2) {
                mVar = new e(dVar.f7071b);
            } else if (i10 == 3) {
                mVar = new k(dVar.f7071b);
            } else {
                throw new IllegalArgumentException(android.support.v4.media.a.m("Invalid end icon mode: ", i10));
            }
            dVar.f7070a.append(i10, mVar);
        }
        return mVar;
    }

    public final int c() {
        int i10;
        if (d() || e()) {
            i10 = this.f7054n.getMeasuredWidth() + g.c((ViewGroup.MarginLayoutParams) this.f7054n.getLayoutParams());
        } else {
            i10 = 0;
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        return d0.e.e(this.f7064x) + d0.e.e(this) + i10;
    }

    public final boolean d() {
        if (this.f7049b.getVisibility() == 0 && this.f7054n.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f7050c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        m b10 = b();
        boolean z12 = true;
        if (!b10.k() || (isChecked = this.f7054n.isChecked()) == b10.l()) {
            z11 = false;
        } else {
            this.f7054n.setChecked(!isChecked);
            z11 = true;
        }
        if (!(b10 instanceof k) || (isActivated = this.f7054n.isActivated()) == b10.j()) {
            z12 = z11;
        } else {
            this.f7054n.setActivated(!isActivated);
        }
        if (z10 || z12) {
            n.c(this.f7048a, this.f7054n, this.f7058r);
        }
    }

    public final void g(int i10) {
        boolean z10;
        Drawable drawable;
        AccessibilityManager accessibilityManager;
        if (this.f7056p != i10) {
            m b10 = b();
            x1.d dVar = this.B;
            if (!(dVar == null || (accessibilityManager = this.A) == null)) {
                x1.c.b(accessibilityManager, dVar);
            }
            CharSequence charSequence = null;
            this.B = null;
            b10.s();
            this.f7056p = i10;
            Iterator<TextInputLayout.g> it = this.f7057q.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h(z10);
            m b11 = b();
            int i11 = this.f7055o.f7072c;
            if (i11 == 0) {
                i11 = b11.d();
            }
            if (i11 != 0) {
                drawable = h.a.a(getContext(), i11);
            } else {
                drawable = null;
            }
            this.f7054n.setImageDrawable(drawable);
            if (drawable != null) {
                n.a(this.f7048a, this.f7054n, this.f7058r, this.f7059s);
                n.c(this.f7048a, this.f7054n, this.f7058r);
            }
            int c10 = b11.c();
            if (c10 != 0) {
                charSequence = getResources().getText(c10);
            }
            if (this.f7054n.getContentDescription() != charSequence) {
                this.f7054n.setContentDescription(charSequence);
            }
            this.f7054n.setCheckable(b11.k());
            if (b11.i(this.f7048a.getBoxBackgroundMode())) {
                b11.r();
                x1.d h10 = b11.h();
                this.B = h10;
                if (!(h10 == null || this.A == null)) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    if (d0.g.b(this)) {
                        x1.c.a(this.A, this.B);
                    }
                }
                View.OnClickListener f10 = b11.f();
                CheckableImageButton checkableImageButton = this.f7054n;
                View.OnLongClickListener onLongClickListener = this.f7062v;
                checkableImageButton.setOnClickListener(f10);
                n.d(checkableImageButton, onLongClickListener);
                EditText editText = this.f7066z;
                if (editText != null) {
                    b11.m(editText);
                    j(b11);
                }
                n.a(this.f7048a, this.f7054n, this.f7058r, this.f7059s);
                f(true);
                return;
            }
            StringBuilder q10 = android.support.v4.media.a.q("The current box background mode ");
            q10.append(this.f7048a.getBoxBackgroundMode());
            q10.append(" is not supported by the end icon mode ");
            q10.append(i10);
            throw new IllegalStateException(q10.toString());
        }
    }

    public final void h(boolean z10) {
        int i10;
        if (d() != z10) {
            CheckableImageButton checkableImageButton = this.f7054n;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            k();
            m();
            this.f7048a.q();
        }
    }

    public final void i(Drawable drawable) {
        this.f7050c.setImageDrawable(drawable);
        l();
        n.a(this.f7048a, this.f7050c, this.f7051d, this.f7052e);
    }

    public final void j(m mVar) {
        if (this.f7066z != null) {
            if (mVar.e() != null) {
                this.f7066z.setOnFocusChangeListener(mVar.e());
            }
            if (mVar.g() != null) {
                this.f7054n.setOnFocusChangeListener(mVar.g());
            }
        }
    }

    public final void k() {
        int i10;
        boolean z10;
        boolean z11;
        FrameLayout frameLayout = this.f7049b;
        int i11 = 8;
        if (this.f7054n.getVisibility() != 0 || e()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        frameLayout.setVisibility(i10);
        if (this.f7063w == null || this.f7065y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (d() || e() || !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i11 = 0;
        }
        setVisibility(i11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
            r4 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r4.f7050c
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            com.google.android.material.textfield.TextInputLayout r0 = r4.f7048a
            com.google.android.material.textfield.q r3 = r0.f6990q
            boolean r3 = r3.f7100q
            if (r3 == 0) goto L_0x001a
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x001a
            r0 = r1
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            com.google.android.material.internal.CheckableImageButton r3 = r4.f7050c
            if (r0 == 0) goto L_0x0021
            r0 = r2
            goto L_0x0023
        L_0x0021:
            r0 = 8
        L_0x0023:
            r3.setVisibility(r0)
            r4.k()
            r4.m()
            int r0 = r4.f7056p
            if (r0 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            if (r1 != 0) goto L_0x0039
            com.google.android.material.textfield.TextInputLayout r0 = r4.f7048a
            r0.q()
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.l.l():void");
    }

    public final void m() {
        int i10;
        if (this.f7048a.f6971d != null) {
            if (d() || e()) {
                i10 = 0;
            } else {
                EditText editText = this.f7048a.f6971d;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                i10 = d0.e.e(editText);
            }
            AppCompatTextView appCompatTextView = this.f7064x;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.f7048a.f6971d.getPaddingTop();
            int paddingBottom = this.f7048a.f6971d.getPaddingBottom();
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            d0.e.k(appCompatTextView, dimensionPixelSize, paddingTop, i10, paddingBottom);
        }
    }

    public final void n() {
        int i10;
        int visibility = this.f7064x.getVisibility();
        boolean z10 = false;
        if (this.f7063w == null || this.f7065y) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (visibility != i10) {
            m b10 = b();
            if (i10 == 0) {
                z10 = true;
            }
            b10.p(z10);
        }
        k();
        this.f7064x.setVisibility(i10);
        this.f7048a.q();
    }
}
