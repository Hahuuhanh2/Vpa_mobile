package androidx.appcompat.widget;

import al.g0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.o;
import androidx.core.widget.k;
import androidx.core.widget.n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import n1.h;
import p3.l0;
import u1.d;

public class AppCompatTextView extends TextView implements n {

    /* renamed from: a  reason: collision with root package name */
    public final d f854a;

    /* renamed from: b  reason: collision with root package name */
    public final p f855b;

    /* renamed from: c  reason: collision with root package name */
    public final o f856c;

    /* renamed from: d  reason: collision with root package name */
    public h f857d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f858e;

    /* renamed from: f  reason: collision with root package name */
    public b f859f;

    /* renamed from: n  reason: collision with root package name */
    public Future<d> f860n;

    public interface a {
        void a(int i10);

        void b(int i10);
    }

    public class b implements a {
        public b() {
        }

        public void a(int i10) {
        }

        public void b(int i10) {
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        public final void a(int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }

        public final void b(int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private h getEmojiTextViewHelper() {
        if (this.f857d == null) {
            this.f857d = new h(this);
        }
        return this.f857d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f854a;
        if (dVar != null) {
            dVar.a();
        }
        p pVar = this.f855b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (u0.f1236b) {
            return super.getAutoSizeMaxTextSize();
        }
        p pVar = this.f855b;
        if (pVar != null) {
            return Math.round(pVar.f1171i.f1227e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (u0.f1236b) {
            return super.getAutoSizeMinTextSize();
        }
        p pVar = this.f855b;
        if (pVar != null) {
            return Math.round(pVar.f1171i.f1226d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (u0.f1236b) {
            return super.getAutoSizeStepGranularity();
        }
        p pVar = this.f855b;
        if (pVar != null) {
            return Math.round(pVar.f1171i.f1225c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (u0.f1236b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        p pVar = this.f855b;
        if (pVar != null) {
            return pVar.f1171i.f1228f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!u0.f1236b) {
            p pVar = this.f855b;
            if (pVar != null) {
                return pVar.f1171i.f1223a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.e(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.f859f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f859f = new c();
            } else if (i10 >= 26) {
                this.f859f = new b();
            }
        }
        return this.f859f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f854a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f854a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f855b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f855b.e();
    }

    public CharSequence getText() {
        Future<d> future = this.f860n;
        if (future != null) {
            try {
                this.f860n = null;
                k.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        o oVar;
        if (Build.VERSION.SDK_INT >= 28 || (oVar = this.f856c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = oVar.f1160b;
        if (textClassifier == null) {
            return o.a.a(oVar.f1159a);
        }
        return textClassifier;
    }

    public d.a getTextMetricsParamsCompat() {
        return k.a(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f855b.getClass();
        p.h(this, onCreateInputConnection, editorInfo);
        l0.n0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        p pVar = this.f855b;
        if (pVar != null && !u0.f1236b) {
            pVar.f1171i.a();
        }
    }

    public void onMeasure(int i10, int i11) {
        Future<d> future = this.f860n;
        if (future != null) {
            try {
                this.f860n = null;
                k.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r1 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            androidx.appcompat.widget.p r1 = r0.f855b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001f
            boolean r4 = androidx.appcompat.widget.u0.f1236b
            if (r4 != 0) goto L_0x001f
            androidx.appcompat.widget.t r1 = r1.f1171i
            boolean r4 = r1.h()
            if (r4 == 0) goto L_0x001b
            int r1 = r1.f1223a
            if (r1 == 0) goto L_0x001b
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r1 = r3
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = r3
        L_0x0020:
            if (r2 == 0) goto L_0x0029
            androidx.appcompat.widget.p r1 = r0.f855b
            androidx.appcompat.widget.t r1 = r1.f1171i
            r1.a()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (u0.f1236b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        p pVar = this.f855b;
        if (pVar != null) {
            pVar.i(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (u0.f1236b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        p pVar = this.f855b;
        if (pVar != null) {
            pVar.j(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (u0.f1236b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        p pVar = this.f855b;
        if (pVar != null) {
            pVar.k(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f854a;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f854a;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f855b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f855b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f855b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f855b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            k.b(this, i10);
        }
    }

    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i10);
        } else {
            k.c(this, i10);
        }
    }

    public void setLineHeight(int i10) {
        g0.B(i10);
        int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i10 != fontMetricsInt) {
            setLineSpacing((float) (i10 - fontMetricsInt), 1.0f);
        }
    }

    public void setPrecomputedText(d dVar) {
        k.d(this, dVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f854a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f854a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f855b.l(colorStateList);
        this.f855b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f855b.m(mode);
        this.f855b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f855b;
        if (pVar != null) {
            pVar.g(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        o oVar;
        if (Build.VERSION.SDK_INT >= 28 || (oVar = this.f856c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            oVar.f1160b = textClassifier;
        }
    }

    public void setTextFuture(Future<d> future) {
        this.f860n = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(d.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f15053b;
        int i10 = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i10 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i10 = 7;
            }
        }
        k.b.h(this, i10);
        getPaint().set(aVar.f15052a);
        k.c.e(this, aVar.f15054c);
        k.c.h(this, aVar.f15055d);
    }

    public void setTextSize(int i10, float f10) {
        boolean z10;
        boolean z11 = u0.f1236b;
        if (z11) {
            super.setTextSize(i10, f10);
            return;
        }
        p pVar = this.f855b;
        if (pVar != null && !z11) {
            t tVar = pVar.f1171i;
            if (!tVar.h() || tVar.f1223a == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                pVar.f1171i.e(i10, f10);
            }
        }
    }

    public void setTypeface(Typeface typeface, int i10) {
        if (!this.f858e) {
            Typeface typeface2 = null;
            if (typeface != null && i10 > 0) {
                Context context = getContext();
                n1.o oVar = h.f13434a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i10);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f858e = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i10);
            } finally {
                this.f858e = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        k0.a(context);
        this.f858e = false;
        this.f859f = null;
        i0.a(getContext(), this);
        d dVar = new d(this);
        this.f854a = dVar;
        dVar.d(attributeSet, i10);
        p pVar = new p(this);
        this.f855b = pVar;
        pVar.f(attributeSet, i10);
        pVar.b();
        this.f856c = new o(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a10 = i10 != 0 ? h.a.a(context, i10) : null;
        Drawable a11 = i11 != 0 ? h.a.a(context, i11) : null;
        Drawable a12 = i12 != 0 ? h.a.a(context, i12) : null;
        if (i13 != 0) {
            drawable = h.a.a(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a10, a11, a12, drawable);
        p pVar = this.f855b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a10 = i10 != 0 ? h.a.a(context, i10) : null;
        Drawable a11 = i11 != 0 ? h.a.a(context, i11) : null;
        Drawable a12 = i12 != 0 ? h.a.a(context, i12) : null;
        if (i13 != 0) {
            drawable = h.a.a(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(a10, a11, a12, drawable);
        p pVar = this.f855b;
        if (pVar != null) {
            pVar.b();
        }
    }
}
