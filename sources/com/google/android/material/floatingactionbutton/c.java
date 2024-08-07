package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: ExtendedFloatingActionButton */
public final class c implements ExtendedFloatingActionButton.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.i f6281a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.i f6282b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f6283c;

    public c(ExtendedFloatingActionButton extendedFloatingActionButton, b bVar, a aVar) {
        this.f6283c = extendedFloatingActionButton;
        this.f6281a = bVar;
        this.f6282b = aVar;
    }

    public final ViewGroup.LayoutParams a() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6283c;
        int i10 = extendedFloatingActionButton.O;
        int i11 = -2;
        if (i10 == 0) {
            i10 = -2;
        }
        int i12 = extendedFloatingActionButton.P;
        if (i12 != 0) {
            i11 = i12;
        }
        return new ViewGroup.LayoutParams(i10, i11);
    }

    public final int b() {
        int i10 = this.f6283c.P;
        if (i10 == -1) {
            return this.f6281a.b();
        }
        if (i10 == 0 || i10 == -2) {
            return this.f6282b.b();
        }
        return i10;
    }

    public final int c() {
        int i10 = this.f6283c.O;
        if (i10 == -1) {
            return this.f6281a.c();
        }
        if (i10 == 0 || i10 == -2) {
            return this.f6282b.c();
        }
        return i10;
    }

    public final int getPaddingEnd() {
        return this.f6283c.I;
    }

    public final int getPaddingStart() {
        return this.f6283c.H;
    }
}
