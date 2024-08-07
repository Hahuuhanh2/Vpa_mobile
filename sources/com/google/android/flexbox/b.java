package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FlexLine */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f5262a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public int f5263b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f5264c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f5265d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f5266e;

    /* renamed from: f  reason: collision with root package name */
    public int f5267f;

    /* renamed from: g  reason: collision with root package name */
    public int f5268g;

    /* renamed from: h  reason: collision with root package name */
    public int f5269h;

    /* renamed from: i  reason: collision with root package name */
    public int f5270i;

    /* renamed from: j  reason: collision with root package name */
    public float f5271j;

    /* renamed from: k  reason: collision with root package name */
    public float f5272k;

    /* renamed from: l  reason: collision with root package name */
    public int f5273l;

    /* renamed from: m  reason: collision with root package name */
    public int f5274m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f5275n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public int f5276o;

    /* renamed from: p  reason: collision with root package name */
    public int f5277p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5278q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5279r;

    public final void a(View view, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f5262a = Math.min(this.f5262a, (view.getLeft() - flexItem.N()) - i10);
        this.f5263b = Math.min(this.f5263b, (view.getTop() - flexItem.W()) - i11);
        this.f5264c = Math.max(this.f5264c, view.getRight() + flexItem.t0() + i12);
        this.f5265d = Math.max(this.f5265d, view.getBottom() + flexItem.L() + i13);
    }
}
