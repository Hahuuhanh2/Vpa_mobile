package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import x1.d;
import x1.f;

/* compiled from: EndIconDelegate */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f7074a;

    /* renamed from: b  reason: collision with root package name */
    public final l f7075b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7076c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f7077d;

    public m(l lVar) {
        this.f7074a = lVar.f7048a;
        this.f7075b = lVar;
        this.f7076c = lVar.getContext();
        this.f7077d = lVar.f7054n;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public d h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(f fVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }

    public final void q() {
        this.f7075b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
