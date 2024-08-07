package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.R$attr;
import androidx.core.widget.k;
import androidx.core.widget.n;

public class AppCompatButton extends Button implements n {

    /* renamed from: a  reason: collision with root package name */
    public final d f799a;

    /* renamed from: b  reason: collision with root package name */
    public final p f800b;

    /* renamed from: c  reason: collision with root package name */
    public h f801c;

    public AppCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private h getEmojiTextViewHelper() {
        if (this.f801c == null) {
            this.f801c = new h(this);
        }
        return this.f801c;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f799a;
        if (dVar != null) {
            dVar.a();
        }
        p pVar = this.f800b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (u0.f1236b) {
            return super.getAutoSizeMaxTextSize();
        }
        p pVar = this.f800b;
        if (pVar != null) {
            return Math.round(pVar.f1171i.f1227e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (u0.f1236b) {
            return super.getAutoSizeMinTextSize();
        }
        p pVar = this.f800b;
        if (pVar != null) {
            return Math.round(pVar.f1171i.f1226d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (u0.f1236b) {
            return super.getAutoSizeStepGranularity();
        }
        p pVar = this.f800b;
        if (pVar != null) {
            return Math.round(pVar.f1171i.f1225c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (u0.f1236b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        p pVar = this.f800b;
        if (pVar != null) {
            return pVar.f1171i.f1228f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!u0.f1236b) {
            p pVar = this.f800b;
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

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f799a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f799a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f800b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f800b.e();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        p pVar = this.f800b;
        if (pVar != null && !u0.f1236b) {
            pVar.f1171i.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r1 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            androidx.appcompat.widget.p r1 = r0.f800b
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
            androidx.appcompat.widget.p r1 = r0.f800b
            androidx.appcompat.widget.t r1 = r1.f1171i
            r1.a()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatButton.onTextChanged(java.lang.CharSequence, int, int, int):void");
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
        p pVar = this.f800b;
        if (pVar != null) {
            pVar.i(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (u0.f1236b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        p pVar = this.f800b;
        if (pVar != null) {
            pVar.j(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (u0.f1236b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        p pVar = this.f800b;
        if (pVar != null) {
            pVar.k(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f799a;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f799a;
        if (dVar != null) {
            dVar.f(i10);
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

    public void setSupportAllCaps(boolean z10) {
        p pVar = this.f800b;
        if (pVar != null) {
            pVar.f1163a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f799a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f799a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f800b.l(colorStateList);
        this.f800b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f800b.m(mode);
        this.f800b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f800b;
        if (pVar != null) {
            pVar.g(context, i10);
        }
    }

    public void setTextSize(int i10, float f10) {
        boolean z10;
        boolean z11 = u0.f1236b;
        if (z11) {
            super.setTextSize(i10, f10);
            return;
        }
        p pVar = this.f800b;
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

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        k0.a(context);
        i0.a(getContext(), this);
        d dVar = new d(this);
        this.f799a = dVar;
        dVar.d(attributeSet, i10);
        p pVar = new p(this);
        this.f800b = pVar;
        pVar.f(attributeSet, i10);
        pVar.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
