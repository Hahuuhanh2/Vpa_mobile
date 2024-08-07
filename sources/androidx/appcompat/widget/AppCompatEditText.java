package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.o;
import androidx.core.widget.k;
import androidx.core.widget.l;
import androidx.core.widget.n;
import p3.l0;
import vl.d;
import w1.c;
import w1.d0;
import w1.s;
import z1.b;

public class AppCompatEditText extends EditText implements s, n {

    /* renamed from: a  reason: collision with root package name */
    public final d f810a;

    /* renamed from: b  reason: collision with root package name */
    public final p f811b;

    /* renamed from: c  reason: collision with root package name */
    public final o f812c;

    /* renamed from: d  reason: collision with root package name */
    public final l f813d;

    /* renamed from: e  reason: collision with root package name */
    public final d f814e;

    /* renamed from: f  reason: collision with root package name */
    public a f815f;

    public class a {
        public a() {
        }
    }

    public AppCompatEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    private a getSuperCaller() {
        if (this.f815f == null) {
            this.f815f = new a();
        }
        return this.f815f;
    }

    public final c a(c cVar) {
        return this.f813d.a(this, cVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f810a;
        if (dVar != null) {
            dVar.a();
        }
        p pVar = this.f811b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f810a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f810a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f811b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f811b.e();
    }

    public TextClassifier getTextClassifier() {
        o oVar;
        if (Build.VERSION.SDK_INT >= 28 || (oVar = this.f812c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = oVar.f1160b;
        if (textClassifier == null) {
            return o.a.a(oVar.f1159a);
        }
        return textClassifier;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        String[] g2;
        InputConnection cVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f811b.getClass();
        p.h(this, onCreateInputConnection, editorInfo);
        l0.n0(this, editorInfo, onCreateInputConnection);
        if (!(onCreateInputConnection == null || (i10 = Build.VERSION.SDK_INT) > 30 || (g2 = d0.g(this)) == null)) {
            z1.a.b(editorInfo, g2);
            ca.a aVar = new ca.a(this, 10);
            if (i10 >= 25) {
                cVar = new b(onCreateInputConnection, aVar);
            } else if (z1.a.a(editorInfo).length != 0) {
                cVar = new z1.c(onCreateInputConnection, aVar);
            }
            onCreateInputConnection = cVar;
        }
        return this.f814e.o(onCreateInputConnection, editorInfo);
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && d0.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = l.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i10) {
        ClipData clipData;
        c.b bVar;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 < 31 && d0.g(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                clipData = null;
            } else {
                clipData = clipboardManager.getPrimaryClip();
            }
            if (clipData != null && clipData.getItemCount() > 0) {
                if (i11 >= 31) {
                    bVar = new c.a(clipData, 1);
                } else {
                    bVar = new c.C0211c(clipData, 1);
                }
                if (i10 != 16908322) {
                    i12 = 1;
                }
                bVar.b(i12);
                d0.k(this, bVar.build());
            }
            i12 = 1;
        }
        if (i12 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f810a;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f810a;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f811b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f811b;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f814e.q(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f814e.h(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f810a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f810a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f811b.l(colorStateList);
        this.f811b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f811b.m(mode);
        this.f811b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f811b;
        if (pVar != null) {
            pVar.g(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        o oVar;
        if (Build.VERSION.SDK_INT >= 28 || (oVar = this.f812c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            oVar.f1160b = textClassifier;
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.editTextStyle);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        k0.a(context);
        i0.a(getContext(), this);
        d dVar = new d(this);
        this.f810a = dVar;
        dVar.d(attributeSet, i10);
        p pVar = new p(this);
        this.f811b = pVar;
        pVar.f(attributeSet, i10);
        pVar.b();
        this.f812c = new o(this);
        this.f813d = new l();
        d dVar2 = new d((EditText) this);
        this.f814e = dVar2;
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
