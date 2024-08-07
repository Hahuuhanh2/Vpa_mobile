package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class FlexboxLayout extends ViewGroup implements a {

    /* renamed from: a  reason: collision with root package name */
    public int f5203a;

    /* renamed from: b  reason: collision with root package name */
    public int f5204b;

    /* renamed from: c  reason: collision with root package name */
    public int f5205c;

    /* renamed from: d  reason: collision with root package name */
    public int f5206d;

    /* renamed from: e  reason: collision with root package name */
    public int f5207e;

    /* renamed from: f  reason: collision with root package name */
    public int f5208f;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f5209n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f5210o;

    /* renamed from: p  reason: collision with root package name */
    public int f5211p;

    /* renamed from: q  reason: collision with root package name */
    public int f5212q;

    /* renamed from: r  reason: collision with root package name */
    public int f5213r;

    /* renamed from: s  reason: collision with root package name */
    public int f5214s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f5215t;

    /* renamed from: u  reason: collision with root package name */
    public SparseIntArray f5216u;

    /* renamed from: v  reason: collision with root package name */
    public c f5217v;

    /* renamed from: w  reason: collision with root package name */
    public List<b> f5218w;

    /* renamed from: x  reason: collision with root package name */
    public c.a f5219x;

    public FlexboxLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f5218w.size();
        for (int i14 = 0; i14 < size; i14++) {
            b bVar = this.f5218w.get(i14);
            for (int i15 = 0; i15 < bVar.f5269h; i15++) {
                int i16 = bVar.f5276o + i15;
                View o10 = o(i16);
                if (!(o10 == null || o10.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) o10.getLayoutParams();
                    if (p(i16, i15)) {
                        if (z10) {
                            i13 = o10.getRight() + layoutParams.rightMargin;
                        } else {
                            i13 = (o10.getLeft() - layoutParams.leftMargin) - this.f5214s;
                        }
                        n(canvas, i13, bVar.f5263b, bVar.f5268g);
                    }
                    if (i15 == bVar.f5269h - 1 && (this.f5212q & 4) > 0) {
                        if (z10) {
                            i12 = (o10.getLeft() - layoutParams.leftMargin) - this.f5214s;
                        } else {
                            i12 = o10.getRight() + layoutParams.rightMargin;
                        }
                        n(canvas, i12, bVar.f5263b, bVar.f5268g);
                    }
                }
            }
            if (q(i14)) {
                if (z11) {
                    i11 = bVar.f5265d;
                } else {
                    i11 = bVar.f5263b - this.f5213r;
                }
                m(canvas, paddingLeft, i11, max);
            }
            if (r(i14) && (this.f5211p & 4) > 0) {
                if (z11) {
                    i10 = bVar.f5263b - this.f5213r;
                } else {
                    i10 = bVar.f5265d;
                }
                m(canvas, paddingLeft, i10, max);
            }
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f5216u == null) {
            this.f5216u = new SparseIntArray(getChildCount());
        }
        c cVar = this.f5217v;
        SparseIntArray sparseIntArray = this.f5216u;
        int flexItemCount = cVar.f5280a.getFlexItemCount();
        ArrayList f10 = cVar.f(flexItemCount);
        c.b bVar = new c.b();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            bVar.f5288b = 1;
        } else {
            bVar.f5288b = ((FlexItem) layoutParams).getOrder();
        }
        if (i10 == -1 || i10 == flexItemCount) {
            bVar.f5287a = flexItemCount;
        } else if (i10 < cVar.f5280a.getFlexItemCount()) {
            bVar.f5287a = i10;
            for (int i11 = i10; i11 < flexItemCount; i11++) {
                ((c.b) f10.get(i11)).f5287a++;
            }
        } else {
            bVar.f5287a = flexItemCount;
        }
        f10.add(bVar);
        this.f5215t = c.r(flexItemCount + 1, f10, sparseIntArray);
        super.addView(view, i10, layoutParams);
    }

    public final void b(View view, int i10, int i11, b bVar) {
        if (!p(i10, i11)) {
            return;
        }
        if (j()) {
            int i12 = bVar.f5266e;
            int i13 = this.f5214s;
            bVar.f5266e = i12 + i13;
            bVar.f5267f += i13;
            return;
        }
        int i14 = bVar.f5266e;
        int i15 = this.f5213r;
        bVar.f5266e = i14 + i15;
        bVar.f5267f += i15;
    }

    public final void c(b bVar) {
        if (j()) {
            if ((this.f5212q & 4) > 0) {
                int i10 = bVar.f5266e;
                int i11 = this.f5214s;
                bVar.f5266e = i10 + i11;
                bVar.f5267f += i11;
            }
        } else if ((this.f5211p & 4) > 0) {
            int i12 = bVar.f5266e;
            int i13 = this.f5213r;
            bVar.f5266e = i12 + i13;
            bVar.f5267f += i13;
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final View d(int i10) {
        return o(i10);
    }

    public final int e(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    public final void f(int i10, View view) {
    }

    public final View g(int i10) {
        return getChildAt(i10);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getAlignContent() {
        return this.f5207e;
    }

    public int getAlignItems() {
        return this.f5206d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f5209n;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f5210o;
    }

    public int getFlexDirection() {
        return this.f5203a;
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f5218w.size());
        for (b next : this.f5218w) {
            if (next.f5269h - next.f5270i != 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List<b> getFlexLinesInternal() {
        return this.f5218w;
    }

    public int getFlexWrap() {
        return this.f5204b;
    }

    public int getJustifyContent() {
        return this.f5205c;
    }

    public int getLargestMainSize() {
        int i10 = Integer.MIN_VALUE;
        for (b bVar : this.f5218w) {
            i10 = Math.max(i10, bVar.f5266e);
        }
        return i10;
    }

    public int getMaxLine() {
        return this.f5208f;
    }

    public int getShowDividerHorizontal() {
        return this.f5211p;
    }

    public int getShowDividerVertical() {
        return this.f5212q;
    }

    public int getSumOfCrossSize() {
        int i10;
        int i11;
        int size = this.f5218w.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            b bVar = this.f5218w.get(i13);
            if (q(i13)) {
                if (j()) {
                    i11 = this.f5213r;
                } else {
                    i11 = this.f5214s;
                }
                i12 += i11;
            }
            if (r(i13)) {
                if (j()) {
                    i10 = this.f5213r;
                } else {
                    i10 = this.f5214s;
                }
                i12 += i10;
            }
            i12 += bVar.f5268g;
        }
        return i12;
    }

    public final int h(View view, int i10, int i11) {
        int i12;
        int i13 = 0;
        if (j()) {
            if (p(i10, i11)) {
                i13 = 0 + this.f5214s;
            }
            if ((this.f5212q & 4) <= 0) {
                return i13;
            }
            i12 = this.f5214s;
        } else {
            if (p(i10, i11)) {
                i13 = 0 + this.f5213r;
            }
            if ((this.f5211p & 4) <= 0) {
                return i13;
            }
            i12 = this.f5213r;
        }
        return i13 + i12;
    }

    public final int i(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    public final boolean j() {
        int i10 = this.f5203a;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final int k(View view) {
        return 0;
    }

    public final void l(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f5218w.size();
        for (int i14 = 0; i14 < size; i14++) {
            b bVar = this.f5218w.get(i14);
            for (int i15 = 0; i15 < bVar.f5269h; i15++) {
                int i16 = bVar.f5276o + i15;
                View o10 = o(i16);
                if (!(o10 == null || o10.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) o10.getLayoutParams();
                    if (p(i16, i15)) {
                        if (z11) {
                            i13 = o10.getBottom() + layoutParams.bottomMargin;
                        } else {
                            i13 = (o10.getTop() - layoutParams.topMargin) - this.f5213r;
                        }
                        m(canvas, bVar.f5262a, i13, bVar.f5268g);
                    }
                    if (i15 == bVar.f5269h - 1 && (this.f5211p & 4) > 0) {
                        if (z11) {
                            i12 = (o10.getTop() - layoutParams.topMargin) - this.f5213r;
                        } else {
                            i12 = o10.getBottom() + layoutParams.bottomMargin;
                        }
                        m(canvas, bVar.f5262a, i12, bVar.f5268g);
                    }
                }
            }
            if (q(i14)) {
                if (z10) {
                    i11 = bVar.f5264c;
                } else {
                    i11 = bVar.f5262a - this.f5214s;
                }
                n(canvas, i11, paddingTop, max);
            }
            if (r(i14) && (this.f5212q & 4) > 0) {
                if (z10) {
                    i10 = bVar.f5262a - this.f5214s;
                } else {
                    i10 = bVar.f5264c;
                }
                n(canvas, i10, paddingTop, max);
            }
        }
    }

    public final void m(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f5209n;
        if (drawable != null) {
            drawable.setBounds(i10, i11, i12 + i10, this.f5213r + i11);
            this.f5209n.draw(canvas);
        }
    }

    public final void n(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f5210o;
        if (drawable != null) {
            drawable.setBounds(i10, i11, this.f5214s + i10, i12 + i11);
            this.f5210o.draw(canvas);
        }
    }

    public final View o(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.f5215t;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    public final void onDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        if (this.f5210o != null || this.f5209n != null) {
            if (this.f5211p != 0 || this.f5212q != 0) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                int d10 = d0.e.d(this);
                int i10 = this.f5203a;
                boolean z12 = false;
                boolean z13 = true;
                if (i10 == 0) {
                    if (d10 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f5204b == 2) {
                        z12 = true;
                    }
                    a(canvas, z10, z12);
                } else if (i10 == 1) {
                    if (d10 != 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f5204b == 2) {
                        z12 = true;
                    }
                    a(canvas, z11, z12);
                } else if (i10 == 2) {
                    if (d10 != 1) {
                        z13 = false;
                    }
                    if (this.f5204b == 2) {
                        z13 = !z13;
                    }
                    l(canvas, z13, false);
                } else if (i10 == 3) {
                    if (d10 == 1) {
                        z12 = true;
                    }
                    if (this.f5204b == 2) {
                        z12 = !z12;
                    }
                    l(canvas, z12, true);
                }
            }
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int d10 = d0.e.d(this);
        int i14 = this.f5203a;
        boolean z15 = false;
        if (i14 == 0) {
            if (d10 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            s(i10, i11, i12, i13, z11);
        } else if (i14 == 1) {
            if (d10 != 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            s(i10, i11, i12, i13, z12);
        } else if (i14 == 2) {
            if (d10 == 1) {
                z15 = true;
            }
            if (this.f5204b == 2) {
                z13 = !z15;
            } else {
                z13 = z15;
            }
            t(i10, i11, i12, i13, z13, false);
        } else if (i14 == 3) {
            if (d10 == 1) {
                z15 = true;
            }
            if (this.f5204b == 2) {
                z14 = !z15;
            } else {
                z14 = z15;
            }
            t(i10, i11, i12, i13, z14, true);
        } else {
            StringBuilder q10 = a.q("Invalid flex direction is set: ");
            q10.append(this.f5203a);
            throw new IllegalStateException(q10.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r15, int r16) {
        /*
            r14 = this;
            r0 = r14
            r9 = r15
            r10 = r16
            android.util.SparseIntArray r1 = r0.f5216u
            if (r1 != 0) goto L_0x0013
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            int r2 = r14.getChildCount()
            r1.<init>(r2)
            r0.f5216u = r1
        L_0x0013:
            com.google.android.flexbox.c r1 = r0.f5217v
            android.util.SparseIntArray r2 = r0.f5216u
            com.google.android.flexbox.a r3 = r1.f5280a
            int r3 = r3.getFlexItemCount()
            int r4 = r2.size()
            r5 = 1
            r11 = 0
            if (r4 == r3) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            r4 = r11
        L_0x0027:
            if (r4 >= r3) goto L_0x0047
            com.google.android.flexbox.a r6 = r1.f5280a
            android.view.View r6 = r6.g(r4)
            if (r6 != 0) goto L_0x0032
            goto L_0x0044
        L_0x0032:
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.flexbox.FlexItem r6 = (com.google.android.flexbox.FlexItem) r6
            int r6 = r6.getOrder()
            int r7 = r2.get(r4)
            if (r6 == r7) goto L_0x0044
        L_0x0042:
            r1 = r5
            goto L_0x0048
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x0047:
            r1 = r11
        L_0x0048:
            if (r1 == 0) goto L_0x005e
            com.google.android.flexbox.c r1 = r0.f5217v
            android.util.SparseIntArray r2 = r0.f5216u
            com.google.android.flexbox.a r3 = r1.f5280a
            int r3 = r3.getFlexItemCount()
            java.util.ArrayList r1 = r1.f(r3)
            int[] r1 = com.google.android.flexbox.c.r(r3, r1, r2)
            r0.f5215t = r1
        L_0x005e:
            int r1 = r0.f5203a
            r12 = 3
            r13 = 2
            r2 = 0
            if (r1 == 0) goto L_0x00c4
            if (r1 == r5) goto L_0x00c4
            if (r1 == r13) goto L_0x0081
            if (r1 != r12) goto L_0x006c
            goto L_0x0081
        L_0x006c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid value for the flex direction is set: "
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            int r3 = r0.f5203a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0081:
            java.util.List<com.google.android.flexbox.b> r1 = r0.f5218w
            r1.clear()
            com.google.android.flexbox.c$a r3 = r0.f5219x
            r3.f5285a = r2
            r3.f5286b = r11
            com.google.android.flexbox.c r1 = r0.f5217v
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = -1
            r8 = 0
            r2 = r3
            r3 = r16
            r4 = r15
            r1.b(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.flexbox.c$a r1 = r0.f5219x
            java.util.List<com.google.android.flexbox.b> r1 = r1.f5285a
            r0.f5218w = r1
            com.google.android.flexbox.c r1 = r0.f5217v
            r1.h(r15, r10, r11)
            com.google.android.flexbox.c r1 = r0.f5217v
            int r2 = r14.getPaddingLeft()
            int r3 = r14.getPaddingRight()
            int r3 = r3 + r2
            r1.g(r15, r10, r3)
            com.google.android.flexbox.c r1 = r0.f5217v
            r1.u(r11)
            int r1 = r0.f5203a
            com.google.android.flexbox.c$a r2 = r0.f5219x
            int r2 = r2.f5286b
            r14.u(r1, r15, r10, r2)
            goto L_0x017c
        L_0x00c4:
            java.util.List<com.google.android.flexbox.b> r1 = r0.f5218w
            r1.clear()
            com.google.android.flexbox.c$a r3 = r0.f5219x
            r3.f5285a = r2
            r3.f5286b = r11
            com.google.android.flexbox.c r1 = r0.f5217v
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = -1
            r8 = 0
            r2 = r3
            r3 = r15
            r4 = r16
            r1.b(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.flexbox.c$a r1 = r0.f5219x
            java.util.List<com.google.android.flexbox.b> r1 = r1.f5285a
            r0.f5218w = r1
            com.google.android.flexbox.c r1 = r0.f5217v
            r1.h(r15, r10, r11)
            int r1 = r0.f5206d
            if (r1 != r12) goto L_0x0160
            java.util.List<com.google.android.flexbox.b> r1 = r0.f5218w
            java.util.Iterator r1 = r1.iterator()
        L_0x00f3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0160
            java.lang.Object r2 = r1.next()
            com.google.android.flexbox.b r2 = (com.google.android.flexbox.b) r2
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r11
        L_0x0102:
            int r5 = r2.f5269h
            if (r4 >= r5) goto L_0x015d
            int r5 = r2.f5276o
            int r5 = r5 + r4
            android.view.View r5 = r14.o(r5)
            if (r5 == 0) goto L_0x015a
            int r6 = r5.getVisibility()
            r7 = 8
            if (r6 != r7) goto L_0x0118
            goto L_0x015a
        L_0x0118:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            com.google.android.flexbox.FlexboxLayout$LayoutParams r6 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r6
            int r7 = r0.f5204b
            if (r7 == r13) goto L_0x013c
            int r7 = r2.f5273l
            int r8 = r5.getBaseline()
            int r7 = r7 - r8
            int r8 = r6.topMargin
            int r7 = java.lang.Math.max(r7, r8)
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r7
            int r6 = r6.bottomMargin
            int r5 = r5 + r6
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x015a
        L_0x013c:
            int r7 = r2.f5273l
            int r8 = r5.getMeasuredHeight()
            int r7 = r7 - r8
            int r8 = r5.getBaseline()
            int r8 = r8 + r7
            int r7 = r6.bottomMargin
            int r7 = java.lang.Math.max(r8, r7)
            int r5 = r5.getMeasuredHeight()
            int r6 = r6.topMargin
            int r5 = r5 + r6
            int r5 = r5 + r7
            int r3 = java.lang.Math.max(r3, r5)
        L_0x015a:
            int r4 = r4 + 1
            goto L_0x0102
        L_0x015d:
            r2.f5268g = r3
            goto L_0x00f3
        L_0x0160:
            com.google.android.flexbox.c r1 = r0.f5217v
            int r2 = r14.getPaddingTop()
            int r3 = r14.getPaddingBottom()
            int r3 = r3 + r2
            r1.g(r15, r10, r3)
            com.google.android.flexbox.c r1 = r0.f5217v
            r1.u(r11)
            int r1 = r0.f5203a
            com.google.android.flexbox.c$a r2 = r0.f5219x
            int r2 = r2.f5286b
            r14.u(r1, r15, r10, r2)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onMeasure(int, int):void");
    }

    public final boolean p(int i10, int i11) {
        boolean z10;
        int i12 = 1;
        while (true) {
            if (i12 > i11) {
                z10 = true;
                break;
            }
            View o10 = o(i10 - i12);
            if (o10 != null && o10.getVisibility() != 8) {
                z10 = false;
                break;
            }
            i12++;
        }
        if (z10) {
            if (j()) {
                if ((this.f5212q & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f5211p & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (j()) {
            if ((this.f5212q & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f5211p & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean q(int i10) {
        boolean z10;
        if (i10 < 0 || i10 >= this.f5218w.size()) {
            return false;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                z10 = true;
                break;
            }
            b bVar = this.f5218w.get(i11);
            if (bVar.f5269h - bVar.f5270i > 0) {
                z10 = false;
                break;
            }
            i11++;
        }
        if (z10) {
            if (j()) {
                if ((this.f5211p & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f5212q & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (j()) {
            if ((this.f5211p & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f5212q & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean r(int i10) {
        if (i10 < 0 || i10 >= this.f5218w.size()) {
            return false;
        }
        for (int i11 = i10 + 1; i11 < this.f5218w.size(); i11++) {
            b bVar = this.f5218w.get(i11);
            if (bVar.f5269h - bVar.f5270i > 0) {
                return false;
            }
        }
        if (j()) {
            if ((this.f5211p & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f5212q & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(int r27, int r28, int r29, int r30, boolean r31) {
        /*
            r26 = this;
            r0 = r26
            int r1 = r26.getPaddingLeft()
            int r2 = r26.getPaddingRight()
            int r3 = r30 - r28
            int r4 = r29 - r27
            int r5 = r26.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r26.getPaddingTop()
            java.util.List<com.google.android.flexbox.b> r6 = r0.f5218w
            int r6 = r6.size()
            r7 = 0
        L_0x001e:
            if (r7 >= r6) goto L_0x020e
            java.util.List<com.google.android.flexbox.b> r8 = r0.f5218w
            java.lang.Object r8 = r8.get(r7)
            com.google.android.flexbox.b r8 = (com.google.android.flexbox.b) r8
            boolean r9 = r0.q(r7)
            if (r9 == 0) goto L_0x0032
            int r9 = r0.f5213r
            int r3 = r3 - r9
            int r5 = r5 + r9
        L_0x0032:
            int r9 = r0.f5205c
            r10 = 4
            r11 = 2
            r12 = 0
            r15 = 1
            if (r9 == 0) goto L_0x00cb
            if (r9 == r15) goto L_0x00c0
            r13 = 1073741824(0x40000000, float:2.0)
            if (r9 == r11) goto L_0x00aa
            r11 = 3
            if (r9 == r11) goto L_0x0091
            if (r9 == r10) goto L_0x0077
            r10 = 5
            if (r9 != r10) goto L_0x0062
            int r9 = r8.f5269h
            int r10 = r8.f5270i
            int r9 = r9 - r10
            if (r9 == 0) goto L_0x0059
            int r10 = r8.f5266e
            int r10 = r4 - r10
            float r10 = (float) r10
            int r9 = r9 + 1
            float r9 = (float) r9
            float r10 = r10 / r9
            goto L_0x005a
        L_0x0059:
            r10 = r12
        L_0x005a:
            float r9 = (float) r1
            float r9 = r9 + r10
            int r11 = r4 - r2
            float r11 = (float) r11
            float r11 = r11 - r10
            goto L_0x00d1
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid justifyContent is set: "
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            int r3 = r0.f5205c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0077:
            int r9 = r8.f5269h
            int r10 = r8.f5270i
            int r9 = r9 - r10
            if (r9 == 0) goto L_0x0086
            int r10 = r8.f5266e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r9 = (float) r9
            float r10 = r10 / r9
            goto L_0x0087
        L_0x0086:
            r10 = r12
        L_0x0087:
            float r9 = (float) r1
            float r11 = r10 / r13
            float r9 = r9 + r11
            int r13 = r4 - r2
            float r13 = (float) r13
            float r11 = r13 - r11
            goto L_0x00d1
        L_0x0091:
            float r9 = (float) r1
            int r10 = r8.f5269h
            int r11 = r8.f5270i
            int r10 = r10 - r11
            if (r10 == r15) goto L_0x009d
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x009f
        L_0x009d:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x009f:
            int r11 = r8.f5266e
            int r11 = r4 - r11
            float r11 = (float) r11
            float r10 = r11 / r10
            int r11 = r4 - r2
            float r11 = (float) r11
            goto L_0x00d1
        L_0x00aa:
            float r9 = (float) r1
            int r10 = r8.f5266e
            int r11 = r4 - r10
            float r11 = (float) r11
            float r11 = r11 / r13
            float r11 = r11 + r9
            int r9 = r4 - r2
            float r9 = (float) r9
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r9 = r9 - r10
            r25 = r11
            r11 = r9
            r9 = r25
            goto L_0x00d0
        L_0x00c0:
            int r9 = r8.f5266e
            int r10 = r4 - r9
            int r10 = r10 + r2
            float r10 = (float) r10
            int r9 = r9 - r1
            float r9 = (float) r9
            r11 = r9
            r9 = r10
            goto L_0x00d0
        L_0x00cb:
            float r9 = (float) r1
            int r10 = r4 - r2
            float r10 = (float) r10
            r11 = r10
        L_0x00d0:
            r10 = r12
        L_0x00d1:
            float r16 = java.lang.Math.max(r10, r12)
            r10 = 0
            r14 = r10
        L_0x00d7:
            int r10 = r8.f5269h
            if (r14 >= r10) goto L_0x0202
            int r10 = r8.f5276o
            int r10 = r10 + r14
            android.view.View r17 = r0.o(r10)
            if (r17 == 0) goto L_0x01f4
            int r12 = r17.getVisibility()
            r13 = 8
            if (r12 != r13) goto L_0x00ee
            goto L_0x01f4
        L_0x00ee:
            android.view.ViewGroup$LayoutParams r12 = r17.getLayoutParams()
            r13 = r12
            com.google.android.flexbox.FlexboxLayout$LayoutParams r13 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r13
            int r12 = r13.leftMargin
            float r12 = (float) r12
            float r9 = r9 + r12
            int r12 = r13.rightMargin
            float r12 = (float) r12
            float r11 = r11 - r12
            boolean r10 = r0.p(r10, r14)
            if (r10 == 0) goto L_0x0109
            int r10 = r0.f5214s
            float r12 = (float) r10
            float r9 = r9 + r12
            float r11 = r11 - r12
            goto L_0x010a
        L_0x0109:
            r10 = 0
        L_0x010a:
            r18 = r9
            r20 = r10
            r19 = r11
            int r9 = r8.f5269h
            int r9 = r9 - r15
            if (r14 != r9) goto L_0x011e
            int r9 = r0.f5212q
            r9 = r9 & 4
            if (r9 <= 0) goto L_0x011e
            int r9 = r0.f5214s
            goto L_0x011f
        L_0x011e:
            r9 = 0
        L_0x011f:
            r21 = r9
            int r9 = r0.f5204b
            r10 = 2
            if (r9 != r10) goto L_0x0177
            if (r31 == 0) goto L_0x0152
            com.google.android.flexbox.c r9 = r0.f5217v
            int r10 = java.lang.Math.round(r19)
            int r11 = r17.getMeasuredWidth()
            int r12 = r10 - r11
            int r10 = r17.getMeasuredHeight()
            int r22 = r3 - r10
            int r23 = java.lang.Math.round(r19)
            r10 = r17
            r11 = r8
            r24 = r1
            r1 = r13
            r13 = r22
            r22 = r14
            r14 = r23
            r23 = r15
            r15 = r3
            r9.o(r10, r11, r12, r13, r14, r15)
            goto L_0x01bb
        L_0x0152:
            r24 = r1
            r1 = r13
            r22 = r14
            r23 = r15
            com.google.android.flexbox.c r9 = r0.f5217v
            int r12 = java.lang.Math.round(r18)
            int r10 = r17.getMeasuredHeight()
            int r13 = r3 - r10
            int r10 = java.lang.Math.round(r18)
            int r11 = r17.getMeasuredWidth()
            int r14 = r11 + r10
            r10 = r17
            r11 = r8
            r15 = r3
            r9.o(r10, r11, r12, r13, r14, r15)
            goto L_0x01bb
        L_0x0177:
            r24 = r1
            r1 = r13
            r22 = r14
            r23 = r15
            if (r31 == 0) goto L_0x019e
            com.google.android.flexbox.c r9 = r0.f5217v
            int r10 = java.lang.Math.round(r19)
            int r11 = r17.getMeasuredWidth()
            int r12 = r10 - r11
            int r14 = java.lang.Math.round(r19)
            int r10 = r17.getMeasuredHeight()
            int r15 = r10 + r5
            r10 = r17
            r11 = r8
            r13 = r5
            r9.o(r10, r11, r12, r13, r14, r15)
            goto L_0x01bb
        L_0x019e:
            com.google.android.flexbox.c r9 = r0.f5217v
            int r12 = java.lang.Math.round(r18)
            int r10 = java.lang.Math.round(r18)
            int r11 = r17.getMeasuredWidth()
            int r14 = r11 + r10
            int r10 = r17.getMeasuredHeight()
            int r15 = r10 + r5
            r10 = r17
            r11 = r8
            r13 = r5
            r9.o(r10, r11, r12, r13, r14, r15)
        L_0x01bb:
            int r9 = r17.getMeasuredWidth()
            float r9 = (float) r9
            float r9 = r9 + r16
            int r10 = r1.rightMargin
            float r10 = (float) r10
            float r9 = r9 + r10
            float r15 = r9 + r18
            int r9 = r17.getMeasuredWidth()
            float r9 = (float) r9
            float r9 = r9 + r16
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r9 = r9 + r1
            float r19 = r19 - r9
            if (r31 == 0) goto L_0x01e4
            r12 = 0
            r14 = 0
            r9 = r8
            r10 = r17
            r11 = r21
            r13 = r20
            r9.a(r10, r11, r12, r13, r14)
            goto L_0x01f0
        L_0x01e4:
            r12 = 0
            r14 = 0
            r9 = r8
            r10 = r17
            r11 = r20
            r13 = r21
            r9.a(r10, r11, r12, r13, r14)
        L_0x01f0:
            r9 = r15
            r11 = r19
            goto L_0x01fa
        L_0x01f4:
            r24 = r1
            r22 = r14
            r23 = r15
        L_0x01fa:
            int r14 = r22 + 1
            r15 = r23
            r1 = r24
            goto L_0x00d7
        L_0x0202:
            r24 = r1
            int r1 = r8.f5268g
            int r5 = r5 + r1
            int r3 = r3 - r1
            int r7 = r7 + 1
            r1 = r24
            goto L_0x001e
        L_0x020e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.s(int, int, int, int, boolean):void");
    }

    public void setAlignContent(int i10) {
        if (this.f5207e != i10) {
            this.f5207e = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.f5206d != i10) {
            this.f5206d = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.f5209n) {
            this.f5209n = drawable;
            if (drawable != null) {
                this.f5213r = drawable.getIntrinsicHeight();
            } else {
                this.f5213r = 0;
            }
            if (this.f5209n == null && this.f5210o == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.f5210o) {
            this.f5210o = drawable;
            if (drawable != null) {
                this.f5214s = drawable.getIntrinsicWidth();
            } else {
                this.f5214s = 0;
            }
            if (this.f5209n == null && this.f5210o == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setFlexDirection(int i10) {
        if (this.f5203a != i10) {
            this.f5203a = i10;
            requestLayout();
        }
    }

    public void setFlexLines(List<b> list) {
        this.f5218w = list;
    }

    public void setFlexWrap(int i10) {
        if (this.f5204b != i10) {
            this.f5204b = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.f5205c != i10) {
            this.f5205c = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.f5208f != i10) {
            this.f5208f = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.f5211p) {
            this.f5211p = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f5212q) {
            this.f5212q = i10;
            requestLayout();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        /*
            r27 = this;
            r0 = r27
            int r1 = r27.getPaddingTop()
            int r2 = r27.getPaddingBottom()
            int r3 = r27.getPaddingRight()
            int r4 = r27.getPaddingLeft()
            int r5 = r30 - r28
            int r6 = r31 - r29
            int r5 = r5 - r3
            java.util.List<com.google.android.flexbox.b> r3 = r0.f5218w
            int r3 = r3.size()
            r7 = 0
        L_0x001e:
            if (r7 >= r3) goto L_0x01fb
            java.util.List<com.google.android.flexbox.b> r8 = r0.f5218w
            java.lang.Object r8 = r8.get(r7)
            com.google.android.flexbox.b r8 = (com.google.android.flexbox.b) r8
            boolean r9 = r0.q(r7)
            if (r9 == 0) goto L_0x0032
            int r9 = r0.f5214s
            int r4 = r4 + r9
            int r5 = r5 - r9
        L_0x0032:
            int r9 = r0.f5205c
            r10 = 4
            r11 = 0
            r12 = 1
            if (r9 == 0) goto L_0x00c8
            if (r9 == r12) goto L_0x00c0
            r13 = 2
            r14 = 1073741824(0x40000000, float:2.0)
            if (r9 == r13) goto L_0x00aa
            r13 = 3
            if (r9 == r13) goto L_0x0091
            if (r9 == r10) goto L_0x0077
            r10 = 5
            if (r9 != r10) goto L_0x0062
            int r9 = r8.f5269h
            int r10 = r8.f5270i
            int r9 = r9 - r10
            if (r9 == 0) goto L_0x0059
            int r10 = r8.f5266e
            int r10 = r6 - r10
            float r10 = (float) r10
            int r9 = r9 + 1
            float r9 = (float) r9
            float r10 = r10 / r9
            goto L_0x005a
        L_0x0059:
            r10 = r11
        L_0x005a:
            float r9 = (float) r1
            float r9 = r9 + r10
            int r12 = r6 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00cf
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid justifyContent is set: "
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            int r3 = r0.f5205c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0077:
            int r9 = r8.f5269h
            int r10 = r8.f5270i
            int r9 = r9 - r10
            if (r9 == 0) goto L_0x0086
            int r10 = r8.f5266e
            int r10 = r6 - r10
            float r10 = (float) r10
            float r9 = (float) r9
            float r10 = r10 / r9
            goto L_0x0087
        L_0x0086:
            r10 = r11
        L_0x0087:
            float r9 = (float) r1
            float r12 = r10 / r14
            float r9 = r9 + r12
            int r13 = r6 - r2
            float r13 = (float) r13
            float r12 = r13 - r12
            goto L_0x00cf
        L_0x0091:
            float r9 = (float) r1
            int r10 = r8.f5269h
            int r13 = r8.f5270i
            int r10 = r10 - r13
            if (r10 == r12) goto L_0x009d
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x009f
        L_0x009d:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x009f:
            int r12 = r8.f5266e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r6 - r2
            float r12 = (float) r12
            goto L_0x00cf
        L_0x00aa:
            float r9 = (float) r1
            int r10 = r8.f5266e
            int r12 = r6 - r10
            float r12 = (float) r12
            float r12 = r12 / r14
            float r12 = r12 + r9
            int r9 = r6 - r2
            float r9 = (float) r9
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r14
            float r9 = r9 - r10
            r26 = r12
            r12 = r9
            r9 = r26
            goto L_0x00ce
        L_0x00c0:
            int r9 = r8.f5266e
            int r10 = r6 - r9
            int r10 = r10 + r2
            float r10 = (float) r10
            int r9 = r9 - r1
            goto L_0x00cb
        L_0x00c8:
            float r10 = (float) r1
            int r9 = r6 - r2
        L_0x00cb:
            float r9 = (float) r9
            r12 = r9
            r9 = r10
        L_0x00ce:
            r10 = r11
        L_0x00cf:
            float r17 = java.lang.Math.max(r10, r11)
            r10 = 0
            r15 = r10
        L_0x00d5:
            int r10 = r8.f5269h
            if (r15 >= r10) goto L_0x01f3
            int r10 = r8.f5276o
            int r10 = r10 + r15
            android.view.View r18 = r0.o(r10)
            if (r18 == 0) goto L_0x01ed
            int r11 = r18.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x00ec
            goto L_0x01ed
        L_0x00ec:
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r14 = r11
            com.google.android.flexbox.FlexboxLayout$LayoutParams r14 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r14
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r9 = r9 + r11
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.p(r10, r15)
            if (r10 == 0) goto L_0x0107
            int r10 = r0.f5213r
            float r11 = (float) r10
            float r9 = r9 + r11
            float r12 = r12 - r11
            goto L_0x0108
        L_0x0107:
            r10 = 0
        L_0x0108:
            r19 = r9
            r21 = r10
            r20 = r12
            int r9 = r8.f5269h
            int r9 = r9 + -1
            if (r15 != r9) goto L_0x011d
            int r9 = r0.f5211p
            r9 = r9 & 4
            if (r9 <= 0) goto L_0x011d
            int r9 = r0.f5213r
            goto L_0x011e
        L_0x011d:
            r9 = 0
        L_0x011e:
            r22 = r9
            if (r32 == 0) goto L_0x016f
            if (r33 == 0) goto L_0x014c
            com.google.android.flexbox.c r9 = r0.f5217v
            r12 = 1
            int r10 = r18.getMeasuredWidth()
            int r13 = r5 - r10
            int r10 = java.lang.Math.round(r20)
            int r11 = r18.getMeasuredHeight()
            int r16 = r10 - r11
            int r23 = java.lang.Math.round(r20)
            r10 = r18
            r11 = r8
            r24 = r14
            r14 = r16
            r25 = r15
            r15 = r5
            r16 = r23
            r9.p(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01b2
        L_0x014c:
            r24 = r14
            r25 = r15
            com.google.android.flexbox.c r9 = r0.f5217v
            r12 = 1
            int r10 = r18.getMeasuredWidth()
            int r13 = r5 - r10
            int r14 = java.lang.Math.round(r19)
            int r10 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r16 = r11 + r10
            r10 = r18
            r11 = r8
            r15 = r5
            r9.p(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01b2
        L_0x016f:
            r24 = r14
            r25 = r15
            if (r33 == 0) goto L_0x0194
            com.google.android.flexbox.c r9 = r0.f5217v
            r12 = 0
            int r10 = java.lang.Math.round(r20)
            int r11 = r18.getMeasuredHeight()
            int r14 = r10 - r11
            int r10 = r18.getMeasuredWidth()
            int r15 = r10 + r4
            int r16 = java.lang.Math.round(r20)
            r10 = r18
            r11 = r8
            r13 = r4
            r9.p(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01b2
        L_0x0194:
            com.google.android.flexbox.c r9 = r0.f5217v
            r12 = 0
            int r14 = java.lang.Math.round(r19)
            int r10 = r18.getMeasuredWidth()
            int r15 = r10 + r4
            int r10 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r16 = r11 + r10
            r10 = r18
            r11 = r8
            r13 = r4
            r9.p(r10, r11, r12, r13, r14, r15, r16)
        L_0x01b2:
            int r9 = r18.getMeasuredHeight()
            float r9 = (float) r9
            float r9 = r9 + r17
            r11 = r24
            int r10 = r11.bottomMargin
            float r10 = (float) r10
            float r9 = r9 + r10
            float r15 = r9 + r19
            int r9 = r18.getMeasuredHeight()
            float r9 = (float) r9
            float r9 = r9 + r17
            int r10 = r11.topMargin
            float r10 = (float) r10
            float r9 = r9 + r10
            float r20 = r20 - r9
            if (r33 == 0) goto L_0x01dd
            r11 = 0
            r13 = 0
            r9 = r8
            r10 = r18
            r12 = r22
            r14 = r21
            r9.a(r10, r11, r12, r13, r14)
            goto L_0x01e9
        L_0x01dd:
            r11 = 0
            r13 = 0
            r9 = r8
            r10 = r18
            r12 = r21
            r14 = r22
            r9.a(r10, r11, r12, r13, r14)
        L_0x01e9:
            r9 = r15
            r12 = r20
            goto L_0x01ef
        L_0x01ed:
            r25 = r15
        L_0x01ef:
            int r15 = r25 + 1
            goto L_0x00d5
        L_0x01f3:
            int r8 = r8.f5268g
            int r4 = r4 + r8
            int r5 = r5 - r8
            int r7 = r7 + 1
            goto L_0x001e
        L_0x01fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.t(int, int, int, int, boolean, boolean):void");
    }

    public final void u(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            i14 = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            i15 = getLargestMainSize();
        } else if (i10 == 2 || i10 == 3) {
            i14 = getLargestMainSize();
            i15 = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        } else {
            throw new IllegalArgumentException(a.m("Invalid flex direction: ", i10));
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i15) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = i15;
            }
            i16 = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            i16 = View.resolveSizeAndState(i15, i11, i13);
        } else if (mode == 1073741824) {
            if (size < i15) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            i16 = View.resolveSizeAndState(size, i11, i13);
        } else {
            throw new IllegalStateException(a.m("Unknown width mode is set: ", mode));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i14) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = i14;
            }
            i17 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            i17 = View.resolveSizeAndState(i14, i12, i13);
        } else if (mode2 == 1073741824) {
            if (size2 < i14) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            i17 = View.resolveSizeAndState(size2, i12, i13);
        } else {
            throw new IllegalStateException(a.m("Unknown height mode is set: ", mode2));
        }
        setMeasuredDimension(i16, i17);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5208f = -1;
        this.f5217v = new c(this);
        this.f5218w = new ArrayList();
        this.f5219x = new c.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlexboxLayout, i10, 0);
        this.f5203a = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_flexDirection, 0);
        this.f5204b = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_flexWrap, 0);
        this.f5205c = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_justifyContent, 0);
        this.f5206d = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_alignItems, 0);
        this.f5207e = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_alignContent, 0);
        this.f5208f = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i11 = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDivider, 0);
        if (i11 != 0) {
            this.f5212q = i11;
            this.f5211p = i11;
        }
        int i12 = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDividerVertical, 0);
        if (i12 != 0) {
            this.f5212q = i12;
        }
        int i13 = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i13 != 0) {
            this.f5211p = i13;
        }
        obtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f5220a = 1;

        /* renamed from: b  reason: collision with root package name */
        public float f5221b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f5222c = 1.0f;

        /* renamed from: d  reason: collision with root package name */
        public int f5223d = -1;

        /* renamed from: e  reason: collision with root package name */
        public float f5224e = -1.0f;

        /* renamed from: f  reason: collision with root package name */
        public int f5225f = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f5226n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f5227o = 16777215;

        /* renamed from: p  reason: collision with root package name */
        public int f5228p = 16777215;

        /* renamed from: q  reason: collision with root package name */
        public boolean f5229q;

        public static class a implements Parcelable.Creator<LayoutParams> {
            public final Object createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            public final Object[] newArray(int i10) {
                return new LayoutParams[i10];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlexboxLayout_Layout);
            this.f5220a = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_Layout_layout_order, 1);
            this.f5221b = obtainStyledAttributes.getFloat(R$styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f5222c = obtainStyledAttributes.getFloat(R$styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f5223d = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f5224e = obtainStyledAttributes.getFraction(R$styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f5225f = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f5226n = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f5227o = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f5228p = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f5229q = obtainStyledAttributes.getBoolean(R$styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        public final boolean A0() {
            return this.f5229q;
        }

        public final float B() {
            return this.f5222c;
        }

        public final int B0() {
            return this.f5228p;
        }

        public final int E() {
            return this.f5225f;
        }

        public final void K(int i10) {
            this.f5225f = i10;
        }

        public final int L() {
            return this.bottomMargin;
        }

        public final int N() {
            return this.leftMargin;
        }

        public final int N0() {
            return this.f5227o;
        }

        public final int W() {
            return this.topMargin;
        }

        public final void a0(int i10) {
            this.f5226n = i10;
        }

        public final int b() {
            return this.height;
        }

        public final int c() {
            return this.width;
        }

        public final float d0() {
            return this.f5221b;
        }

        public final int describeContents() {
            return 0;
        }

        public final int getOrder() {
            return this.f5220a;
        }

        public final float l0() {
            return this.f5224e;
        }

        public final int t0() {
            return this.rightMargin;
        }

        public final int w0() {
            return this.f5226n;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f5220a);
            parcel.writeFloat(this.f5221b);
            parcel.writeFloat(this.f5222c);
            parcel.writeInt(this.f5223d);
            parcel.writeFloat(this.f5224e);
            parcel.writeInt(this.f5225f);
            parcel.writeInt(this.f5226n);
            parcel.writeInt(this.f5227o);
            parcel.writeInt(this.f5228p);
            parcel.writeByte(this.f5229q ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public final int x() {
            return this.f5223d;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f5220a = layoutParams.f5220a;
            this.f5221b = layoutParams.f5221b;
            this.f5222c = layoutParams.f5222c;
            this.f5223d = layoutParams.f5223d;
            this.f5224e = layoutParams.f5224e;
            this.f5225f = layoutParams.f5225f;
            this.f5226n = layoutParams.f5226n;
            this.f5227o = layoutParams.f5227o;
            this.f5228p = layoutParams.f5228p;
            this.f5229q = layoutParams.f5229q;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z10 = false;
            this.f5220a = parcel.readInt();
            this.f5221b = parcel.readFloat();
            this.f5222c = parcel.readFloat();
            this.f5223d = parcel.readInt();
            this.f5224e = parcel.readFloat();
            this.f5225f = parcel.readInt();
            this.f5226n = parcel.readInt();
            this.f5227o = parcel.readInt();
            this.f5228p = parcel.readInt();
            this.f5229q = parcel.readByte() != 0 ? true : z10;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}
