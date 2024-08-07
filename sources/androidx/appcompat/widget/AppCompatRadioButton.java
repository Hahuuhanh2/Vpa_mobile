package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.appcompat.R$attr;
import androidx.core.widget.m;
import androidx.core.widget.n;
import h.a;

public class AppCompatRadioButton extends RadioButton implements m, n {

    /* renamed from: a  reason: collision with root package name */
    public final f f827a;

    /* renamed from: b  reason: collision with root package name */
    public final d f828b;

    /* renamed from: c  reason: collision with root package name */
    public final p f829c;

    /* renamed from: d  reason: collision with root package name */
    public h f830d;

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private h getEmojiTextViewHelper() {
        if (this.f830d == null) {
            this.f830d = new h(this);
        }
        return this.f830d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f828b;
        if (dVar != null) {
            dVar.a();
        }
        p pVar = this.f829c;
        if (pVar != null) {
            pVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        f fVar = this.f827a;
        if (fVar != null) {
            fVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f828b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f828b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        f fVar = this.f827a;
        if (fVar != null) {
            return fVar.f1090b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        f fVar = this.f827a;
        if (fVar != null) {
            return fVar.f1091c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f829c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f829c.e();
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f828b;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f828b;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        f fVar = this.f827a;
        if (fVar == null) {
            return;
        }
        if (fVar.f1094f) {
            fVar.f1094f = false;
            return;
        }
        fVar.f1094f = true;
        fVar.a();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f829c;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f829c;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f828b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f828b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        f fVar = this.f827a;
        if (fVar != null) {
            fVar.f1090b = colorStateList;
            fVar.f1092d = true;
            fVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        f fVar = this.f827a;
        if (fVar != null) {
            fVar.f1091c = mode;
            fVar.f1093e = true;
            fVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f829c.l(colorStateList);
        this.f829c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f829c.m(mode);
        this.f829c.b();
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.radioButtonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        k0.a(context);
        i0.a(getContext(), this);
        f fVar = new f(this);
        this.f827a = fVar;
        fVar.b(attributeSet, i10);
        d dVar = new d(this);
        this.f828b = dVar;
        dVar.d(attributeSet, i10);
        p pVar = new p(this);
        this.f829c = pVar;
        pVar.f(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(a.a(getContext(), i10));
    }
}
