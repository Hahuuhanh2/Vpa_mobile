package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.appcompat.R$attr;
import androidx.core.widget.k;
import androidx.core.widget.n;
import h.a;
import p3.l0;

public class AppCompatCheckedTextView extends CheckedTextView implements n {

    /* renamed from: a  reason: collision with root package name */
    public final e f806a;

    /* renamed from: b  reason: collision with root package name */
    public final d f807b;

    /* renamed from: c  reason: collision with root package name */
    public final p f808c;

    /* renamed from: d  reason: collision with root package name */
    public h f809d;

    public AppCompatCheckedTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private h getEmojiTextViewHelper() {
        if (this.f809d == null) {
            this.f809d = new h(this);
        }
        return this.f809d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f808c;
        if (pVar != null) {
            pVar.b();
        }
        d dVar = this.f807b;
        if (dVar != null) {
            dVar.a();
        }
        e eVar = this.f806a;
        if (eVar != null) {
            eVar.a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f807b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f807b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        e eVar = this.f806a;
        if (eVar != null) {
            return eVar.f1084b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        e eVar = this.f806a;
        if (eVar != null) {
            return eVar.f1085c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f808c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f808c.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l0.n0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f807b;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f807b;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        e eVar = this.f806a;
        if (eVar == null) {
            return;
        }
        if (eVar.f1088f) {
            eVar.f1088f = false;
            return;
        }
        eVar.f1088f = true;
        eVar.a();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f808c;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f808c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f807b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f807b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        e eVar = this.f806a;
        if (eVar != null) {
            eVar.f1084b = colorStateList;
            eVar.f1086d = true;
            eVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        e eVar = this.f806a;
        if (eVar != null) {
            eVar.f1085c = mode;
            eVar.f1087e = true;
            eVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f808c.l(colorStateList);
        this.f808c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f808c.m(mode);
        this.f808c.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f808c;
        if (pVar != null) {
            pVar.g(context, i10);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.checkedTextViewStyle);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060 A[SYNTHETIC, Splitter:B:12:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083 A[Catch:{ all -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094 A[Catch:{ all -> 0x00ae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatCheckedTextView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.k0.a(r8)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            androidx.appcompat.widget.i0.a(r8, r7)
            androidx.appcompat.widget.p r8 = new androidx.appcompat.widget.p
            r8.<init>(r7)
            r7.f808c = r8
            r8.f(r9, r10)
            r8.b()
            androidx.appcompat.widget.d r8 = new androidx.appcompat.widget.d
            r8.<init>(r7)
            r7.f807b = r8
            r8.d(r9, r10)
            androidx.appcompat.widget.e r8 = new androidx.appcompat.widget.e
            r8.<init>(r7)
            r7.f806a = r8
            android.content.Context r0 = r7.getContext()
            int[] r3 = androidx.appcompat.R$styleable.CheckedTextView
            androidx.appcompat.widget.n0 r0 = androidx.appcompat.widget.n0.m(r0, r9, r3, r10)
            android.content.Context r2 = r7.getContext()
            android.content.res.TypedArray r5 = r0.f1157b
            r1 = r7
            r4 = r9
            r6 = r10
            w1.d0.n(r1, r2, r3, r4, r5, r6)
            int r1 = androidx.appcompat.R$styleable.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x00ae }
            boolean r2 = r0.l(r1)     // Catch:{ all -> 0x00ae }
            r3 = 0
            if (r2 == 0) goto L_0x005d
            int r1 = r0.i(r1, r3)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x005d
            android.content.Context r2 = r7.getContext()     // Catch:{ NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable r1 = h.a.a(r2, r1)     // Catch:{ NotFoundException -> 0x005d }
            r7.setCheckMarkDrawable((android.graphics.drawable.Drawable) r1)     // Catch:{ NotFoundException -> 0x005d }
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = r3
        L_0x005e:
            if (r1 != 0) goto L_0x007b
            int r1 = androidx.appcompat.R$styleable.CheckedTextView_android_checkMark     // Catch:{ all -> 0x00ae }
            boolean r2 = r0.l(r1)     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x007b
            int r1 = r0.i(r1, r3)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x007b
            android.widget.CheckedTextView r2 = r8.f1083a     // Catch:{ all -> 0x00ae }
            android.content.Context r3 = r2.getContext()     // Catch:{ all -> 0x00ae }
            android.graphics.drawable.Drawable r1 = h.a.a(r3, r1)     // Catch:{ all -> 0x00ae }
            r2.setCheckMarkDrawable(r1)     // Catch:{ all -> 0x00ae }
        L_0x007b:
            int r1 = androidx.appcompat.R$styleable.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x00ae }
            boolean r2 = r0.l(r1)     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x008c
            android.widget.CheckedTextView r2 = r8.f1083a     // Catch:{ all -> 0x00ae }
            android.content.res.ColorStateList r1 = r0.b(r1)     // Catch:{ all -> 0x00ae }
            r2.setCheckMarkTintList(r1)     // Catch:{ all -> 0x00ae }
        L_0x008c:
            int r1 = androidx.appcompat.R$styleable.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x00ae }
            boolean r2 = r0.l(r1)     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x00a3
            android.widget.CheckedTextView r8 = r8.f1083a     // Catch:{ all -> 0x00ae }
            r2 = -1
            int r1 = r0.h(r1, r2)     // Catch:{ all -> 0x00ae }
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.x.c(r1, r2)     // Catch:{ all -> 0x00ae }
            r8.setCheckMarkTintMode(r1)     // Catch:{ all -> 0x00ae }
        L_0x00a3:
            r0.n()
            androidx.appcompat.widget.h r8 = r7.getEmojiTextViewHelper()
            r8.b(r9, r10)
            return
        L_0x00ae:
            r8 = move-exception
            r0.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(a.a(getContext(), i10));
    }
}
