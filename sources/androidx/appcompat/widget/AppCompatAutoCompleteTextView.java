package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.appcompat.R$attr;
import androidx.core.widget.k;
import androidx.core.widget.n;
import h.a;
import p3.l0;
import vl.d;

public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements n {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f795d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final d f796a;

    /* renamed from: b  reason: collision with root package name */
    public final p f797b;

    /* renamed from: c  reason: collision with root package name */
    public final d f798c;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f796a;
        if (dVar != null) {
            dVar.a();
        }
        p pVar = this.f797b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f796a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f796a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f797b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f797b.e();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l0.n0(this, editorInfo, onCreateInputConnection);
        return this.f798c.o(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f796a;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f796a;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f797b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f797b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.f(callback, this));
    }

    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(a.a(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f798c.q(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f798c.h(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f796a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f796a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f797b.l(colorStateList);
        this.f797b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f797b.m(mode);
        this.f797b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f797b;
        if (pVar != null) {
            pVar.g(context, i10);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.autoCompleteTextViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        k0.a(context);
        i0.a(getContext(), this);
        n0 m10 = n0.m(getContext(), attributeSet, f795d, i10);
        if (m10.l(0)) {
            setDropDownBackgroundDrawable(m10.e(0));
        }
        m10.n();
        d dVar = new d(this);
        this.f796a = dVar;
        dVar.d(attributeSet, i10);
        p pVar = new p(this);
        this.f797b = pVar;
        pVar.f(attributeSet, i10);
        pVar.b();
        d dVar2 = new d((EditText) this);
        this.f798c = dVar2;
        dVar2.k(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener h10 = dVar2.h(keyListener);
            if (h10 != keyListener) {
                super.setKeyListener(h10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }
}
