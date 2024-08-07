package com.google.android.material.appbar;

import al.g0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o1.a;
import w1.d0;
import w1.q;
import w1.q0;
import w1.w0;

public class CollapsingToolbarLayout extends FrameLayout {
    public static final int M = R$style.Widget_Design_CollapsingToolbar;
    public long A;
    public final TimeInterpolator B;
    public final TimeInterpolator C;
    public int D;
    public b E;
    public int F;
    public int G;
    public w0 H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5606a;

    /* renamed from: b  reason: collision with root package name */
    public int f5607b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f5608c;

    /* renamed from: d  reason: collision with root package name */
    public View f5609d;

    /* renamed from: e  reason: collision with root package name */
    public View f5610e;

    /* renamed from: f  reason: collision with root package name */
    public int f5611f;

    /* renamed from: n  reason: collision with root package name */
    public int f5612n;

    /* renamed from: o  reason: collision with root package name */
    public int f5613o;

    /* renamed from: p  reason: collision with root package name */
    public int f5614p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f5615q;

    /* renamed from: r  reason: collision with root package name */
    public final com.google.android.material.internal.c f5616r;

    /* renamed from: s  reason: collision with root package name */
    public final c8.a f5617s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5618t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5619u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f5620v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f5621w;

    /* renamed from: x  reason: collision with root package name */
    public int f5622x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5623y;

    /* renamed from: z  reason: collision with root package name */
    public ValueAnimator f5624z;

    public class a implements q {
        public a() {
        }

        public final w0 g(View view, w0 w0Var) {
            w0 w0Var2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.getClass();
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.d.b(collapsingToolbarLayout)) {
                w0Var2 = w0Var;
            } else {
                w0Var2 = null;
            }
            if (!v1.b.a(collapsingToolbarLayout.H, w0Var2)) {
                collapsingToolbarLayout.H = w0Var2;
                collapsingToolbarLayout.requestLayout();
            }
            return w0Var.f16391a.c();
        }
    }

    public class b implements AppBarLayout.b {
        public b() {
        }

        public final void a(int i10) {
            int i11;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.F = i10;
            w0 w0Var = collapsingToolbarLayout.H;
            if (w0Var != null) {
                i11 = w0Var.e();
            } else {
                i11 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i12);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                g b10 = CollapsingToolbarLayout.b(childAt);
                int i13 = layoutParams.f5625a;
                if (i13 == 1) {
                    CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
                    collapsingToolbarLayout2.getClass();
                    b10.b(g0.G(-i10, 0, ((collapsingToolbarLayout2.getHeight() - CollapsingToolbarLayout.b(childAt).f5671b) - childAt.getHeight()) - ((LayoutParams) childAt.getLayoutParams()).bottomMargin));
                } else if (i13 == 2) {
                    b10.b(Math.round(((float) (-i10)) * layoutParams.f5626b));
                }
            }
            CollapsingToolbarLayout.this.d();
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout3.f5621w != null && i11 > 0) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.d.k(collapsingToolbarLayout3);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            CollapsingToolbarLayout collapsingToolbarLayout4 = CollapsingToolbarLayout.this;
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            int d10 = (height - d0.d.d(collapsingToolbarLayout4)) - i11;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            com.google.android.material.internal.c cVar = CollapsingToolbarLayout.this.f5616r;
            float f10 = (float) d10;
            float min = Math.min(1.0f, ((float) scrimVisibleHeightTrigger) / f10);
            cVar.f6394d = min;
            cVar.f6396e = android.support.v4.media.a.e(1.0f, min, 0.5f, min);
            CollapsingToolbarLayout collapsingToolbarLayout5 = CollapsingToolbarLayout.this;
            com.google.android.material.internal.c cVar2 = collapsingToolbarLayout5.f5616r;
            cVar2.f6398f = collapsingToolbarLayout5.F + d10;
            cVar2.p(((float) Math.abs(i10)) / f10);
        }
    }

    public interface c extends com.google.android.material.internal.q {
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public static g b(View view) {
        int i10 = R$id.view_offset_helper;
        g gVar = (g) view.getTag(i10);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(view);
        view.setTag(i10, gVar2);
        return gVar2;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        Context context = getContext();
        TypedValue a10 = i8.b.a(context, R$attr.colorSurfaceContainer);
        ColorStateList colorStateList = null;
        if (a10 != null) {
            int i10 = a10.resourceId;
            if (i10 != 0) {
                colorStateList = k1.a.getColorStateList(context, i10);
            } else {
                int i11 = a10.data;
                if (i11 != 0) {
                    colorStateList = ColorStateList.valueOf(i11);
                }
            }
        }
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        float dimension = getResources().getDimension(R$dimen.design_appbar_elevation);
        c8.a aVar = this.f5617s;
        return aVar.a(aVar.f4589d, dimension);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            boolean r0 = r6.f5606a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f5608c = r0
            r6.f5609d = r0
            int r1 = r6.f5607b
            r2 = -1
            if (r1 == r2) goto L_0x002f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.f5608c = r1
            if (r1 == 0) goto L_0x002f
            android.view.ViewParent r2 = r1.getParent()
        L_0x001d:
            if (r2 == r6) goto L_0x002d
            if (r2 == 0) goto L_0x002d
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x0028
            r1 = r2
            android.view.View r1 = (android.view.View) r1
        L_0x0028:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x001d
        L_0x002d:
            r6.f5609d = r1
        L_0x002f:
            android.view.ViewGroup r1 = r6.f5608c
            r2 = 0
            if (r1 != 0) goto L_0x0056
            int r1 = r6.getChildCount()
            r3 = r2
        L_0x0039:
            if (r3 >= r1) goto L_0x0054
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 != 0) goto L_0x004a
            boolean r5 = r4 instanceof android.widget.Toolbar
            if (r5 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r5 = r2
            goto L_0x004b
        L_0x004a:
            r5 = 1
        L_0x004b:
            if (r5 == 0) goto L_0x0051
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0054
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0039
        L_0x0054:
            r6.f5608c = r0
        L_0x0056:
            r6.c()
            r6.f5606a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.a():void");
    }

    public final void c() {
        View view;
        if (!this.f5618t && (view = this.f5610e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f5610e);
            }
        }
        if (this.f5618t && this.f5608c != null) {
            if (this.f5610e == null) {
                this.f5610e = new View(getContext());
            }
            if (this.f5610e.getParent() == null) {
                this.f5608c.addView(this.f5610e, -1, -1);
            }
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d() {
        boolean z10;
        if (this.f5620v != null || this.f5621w != null) {
            if (getHeight() + this.F < getScrimVisibleHeightTrigger()) {
                z10 = true;
            } else {
                z10 = false;
            }
            setScrimsShown(z10);
        }
    }

    public final void draw(Canvas canvas) {
        int i10;
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f5608c == null && (drawable = this.f5620v) != null && this.f5622x > 0) {
            drawable.mutate().setAlpha(this.f5622x);
            this.f5620v.draw(canvas);
        }
        if (this.f5618t && this.f5619u) {
            if (!(this.f5608c == null || this.f5620v == null || this.f5622x <= 0)) {
                boolean z10 = true;
                if (this.G != 1) {
                    z10 = false;
                }
                if (z10) {
                    com.google.android.material.internal.c cVar = this.f5616r;
                    if (cVar.f6390b < cVar.f6396e) {
                        int save = canvas.save();
                        canvas.clipRect(this.f5620v.getBounds(), Region.Op.DIFFERENCE);
                        this.f5616r.d(canvas);
                        canvas.restoreToCount(save);
                    }
                }
            }
            this.f5616r.d(canvas);
        }
        if (this.f5621w != null && this.f5622x > 0) {
            w0 w0Var = this.H;
            if (w0Var != null) {
                i10 = w0Var.e();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f5621w.setBounds(0, -this.F, getWidth(), i10 - this.F);
                this.f5621w.mutate().setAlpha(this.f5622x);
                this.f5621w.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean drawChild(android.graphics.Canvas r7, android.view.View r8, long r9) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f5620v
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004d
            int r3 = r6.f5622x
            if (r3 <= 0) goto L_0x004d
            android.view.View r3 = r6.f5609d
            if (r3 == 0) goto L_0x0014
            if (r3 != r6) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            if (r8 != r3) goto L_0x001a
            goto L_0x0018
        L_0x0014:
            android.view.ViewGroup r3 = r6.f5608c
            if (r8 != r3) goto L_0x001a
        L_0x0018:
            r3 = r2
            goto L_0x001b
        L_0x001a:
            r3 = r1
        L_0x001b:
            if (r3 == 0) goto L_0x004d
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            int r5 = r6.G
            if (r5 != r2) goto L_0x002b
            r5 = r2
            goto L_0x002c
        L_0x002b:
            r5 = r1
        L_0x002c:
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0038
            boolean r5 = r6.f5618t
            if (r5 == 0) goto L_0x0038
            int r4 = r8.getBottom()
        L_0x0038:
            r0.setBounds(r1, r1, r3, r4)
            android.graphics.drawable.Drawable r0 = r6.f5620v
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r6.f5622x
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r6.f5620v
            r0.draw(r7)
            r0 = r2
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            boolean r7 = super.drawChild(r7, r8, r9)
            if (r7 != 0) goto L_0x0056
            if (r0 == 0) goto L_0x0057
        L_0x0056:
            r1 = r2
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5621w;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f5620v;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.c cVar = this.f5616r;
        if (cVar != null) {
            z10 |= cVar.r(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i20;
        boolean z14 = z10;
        if (this.f5618t && (view = this.f5610e) != null) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            boolean z15 = false;
            if (!d0.g.b(view) || this.f5610e.getVisibility() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f5619u = z11;
            if (z11 || z14) {
                if (d0.e.d(this) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                View view2 = this.f5609d;
                if (view2 == null) {
                    view2 = this.f5608c;
                }
                int height = ((getHeight() - b(view2).f5671b) - view2.getHeight()) - ((LayoutParams) view2.getLayoutParams()).bottomMargin;
                d.a(this, this.f5610e, this.f5615q);
                ViewGroup viewGroup = this.f5608c;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i16 = toolbar.getTitleMarginStart();
                    i15 = toolbar.getTitleMarginEnd();
                    i14 = toolbar.getTitleMarginTop();
                    i17 = toolbar.getTitleMarginBottom();
                } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
                    i17 = 0;
                    i16 = 0;
                    i15 = 0;
                    i14 = 0;
                } else {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    i16 = toolbar2.getTitleMarginStart();
                    i15 = toolbar2.getTitleMarginEnd();
                    i14 = toolbar2.getTitleMarginTop();
                    i17 = toolbar2.getTitleMarginBottom();
                }
                com.google.android.material.internal.c cVar = this.f5616r;
                Rect rect = this.f5615q;
                int i21 = rect.left;
                if (z12) {
                    i18 = i15;
                } else {
                    i18 = i16;
                }
                int i22 = i21 + i18;
                int i23 = rect.top + height + i14;
                int i24 = rect.right;
                if (!z12) {
                    i16 = i15;
                }
                int i25 = i24 - i16;
                int i26 = (rect.bottom + height) - i17;
                Rect rect2 = cVar.f6402h;
                if (rect2.left == i22 && rect2.top == i23 && rect2.right == i25 && rect2.bottom == i26) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    rect2.set(i22, i23, i25, i26);
                    cVar.S = true;
                }
                com.google.android.material.internal.c cVar2 = this.f5616r;
                if (z12) {
                    i19 = this.f5613o;
                } else {
                    i19 = this.f5611f;
                }
                int i27 = this.f5615q.top + this.f5612n;
                int i28 = i12 - i10;
                if (z12) {
                    i20 = this.f5611f;
                } else {
                    i20 = this.f5613o;
                }
                int i29 = i28 - i20;
                int i30 = (i13 - i11) - this.f5614p;
                Rect rect3 = cVar2.f6400g;
                if (rect3.left == i19 && rect3.top == i27 && rect3.right == i29 && rect3.bottom == i30) {
                    z15 = true;
                }
                if (!z15) {
                    rect3.set(i19, i27, i29, i30);
                    cVar2.S = true;
                }
                this.f5616r.i(z14);
            }
        }
    }

    public final void f() {
        CharSequence charSequence;
        if (this.f5608c != null && this.f5618t && TextUtils.isEmpty(this.f5616r.G)) {
            ViewGroup viewGroup = this.f5608c;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).getTitle();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public int getCollapsedTitleGravity() {
        return this.f5616r.f6408k;
    }

    public float getCollapsedTitleTextSize() {
        return this.f5616r.f6412m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f5616r.f6427w;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f5620v;
    }

    public int getExpandedTitleGravity() {
        return this.f5616r.f6406j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f5614p;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f5613o;
    }

    public int getExpandedTitleMarginStart() {
        return this.f5611f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f5612n;
    }

    public float getExpandedTitleTextSize() {
        return this.f5616r.f6410l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f5616r.f6430z;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.f5616r.f6421q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f5616r.f6405i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f5616r.f6405i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f5616r.f6405i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f5616r.f6415n0;
    }

    public int getScrimAlpha() {
        return this.f5622x;
    }

    public long getScrimAnimationDuration() {
        return this.A;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10;
        int i11 = this.D;
        if (i11 >= 0) {
            return i11 + this.I + this.K;
        }
        w0 w0Var = this.H;
        if (w0Var != null) {
            i10 = w0Var.e();
        } else {
            i10 = 0;
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int d10 = d0.d.d(this);
        if (d10 > 0) {
            return Math.min((d10 * 2) + i10, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f5621w;
    }

    public CharSequence getTitle() {
        if (this.f5618t) {
            return this.f5616r.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.G;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f5616r.V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f5616r.F;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            boolean z10 = true;
            if (this.G != 1) {
                z10 = false;
            }
            if (z10) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            setFitsSystemWindows(d0.d.b(appBarLayout));
            if (this.E == null) {
                this.E = new b();
            }
            b bVar = this.E;
            if (appBarLayout.f5576o == null) {
                appBarLayout.f5576o = new ArrayList();
            }
            if (bVar != null && !appBarLayout.f5576o.contains(bVar)) {
                appBarLayout.f5576o.add(bVar);
            }
            d0.h.c(this);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5616r.h(configuration);
    }

    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        b bVar = this.E;
        if (!(bVar == null || !(parent instanceof AppBarLayout) || (arrayList = ((AppBarLayout) parent).f5576o) == null)) {
            arrayList.remove(bVar);
        }
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        w0 w0Var = this.H;
        if (w0Var != null) {
            int e10 = w0Var.e();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (!d0.d.b(childAt) && childAt.getTop() < e10) {
                    childAt.offsetTopAndBottom(e10);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            g b10 = b(getChildAt(i15));
            b10.f5671b = b10.f5670a.getTop();
            b10.f5672c = b10.f5670a.getLeft();
        }
        e(i10, i11, i12, i13, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            b(getChildAt(i16)).a();
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        a();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        w0 w0Var = this.H;
        if (w0Var != null) {
            i12 = w0Var.e();
        } else {
            i12 = 0;
        }
        if ((mode == 0 || this.J) && i12 > 0) {
            this.I = i12;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i12, 1073741824));
        }
        if (this.L && this.f5616r.f6415n0 > 1) {
            f();
            e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            com.google.android.material.internal.c cVar = this.f5616r;
            int i15 = cVar.f6418p;
            if (i15 > 1) {
                TextPaint textPaint = cVar.U;
                textPaint.setTextSize(cVar.f6410l);
                textPaint.setTypeface(cVar.f6430z);
                textPaint.setLetterSpacing(cVar.f6401g0);
                int i16 = i15 - 1;
                this.K = i16 * Math.round(cVar.U.descent() + (-cVar.U.ascent()));
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.K, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f5608c;
        if (viewGroup != null) {
            View view = this.f5609d;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i13 = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(i13);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                i14 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                i14 = view.getMeasuredHeight();
            }
            setMinimumHeight(i14);
        }
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f5620v;
        if (drawable != null) {
            ViewGroup viewGroup = this.f5608c;
            boolean z10 = true;
            if (this.G != 1) {
                z10 = false;
            }
            if (z10 && viewGroup != null && this.f5618t) {
                i11 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i10, i11);
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f5616r.l(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.f5616r.k(i10);
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextSize(float f10) {
        com.google.android.material.internal.c cVar = this.f5616r;
        if (cVar.f6412m != f10) {
            cVar.f6412m = f10;
            cVar.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        com.google.android.material.internal.c cVar = this.f5616r;
        if (cVar.m(typeface)) {
            cVar.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f5620v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f5620v = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f5608c;
                boolean z10 = true;
                if (this.G != 1) {
                    z10 = false;
                }
                if (z10 && viewGroup != null && this.f5618t) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.f5620v.setCallback(this);
                this.f5620v.setAlpha(this.f5622x);
            }
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(this);
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        setContentScrim(k1.a.getDrawable(getContext(), i10));
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        com.google.android.material.internal.c cVar = this.f5616r;
        if (cVar.f6406j != i10) {
            cVar.f6406j = i10;
            cVar.i(false);
        }
    }

    public void setExpandedTitleMargin(int i10, int i11, int i12, int i13) {
        this.f5611f = i10;
        this.f5612n = i11;
        this.f5613o = i12;
        this.f5614p = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f5614p = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f5613o = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f5611f = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f5612n = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.f5616r.n(i10);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.c cVar = this.f5616r;
        if (cVar.f6414n != colorStateList) {
            cVar.f6414n = colorStateList;
            cVar.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f10) {
        com.google.android.material.internal.c cVar = this.f5616r;
        if (cVar.f6410l != f10) {
            cVar.f6410l = f10;
            cVar.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        com.google.android.material.internal.c cVar = this.f5616r;
        if (cVar.o(typeface)) {
            cVar.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.L = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.J = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.f5616r.f6421q0 = i10;
    }

    public void setLineSpacingAdd(float f10) {
        this.f5616r.f6417o0 = f10;
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f5616r.f6419p0 = f10;
    }

    public void setMaxLines(int i10) {
        com.google.android.material.internal.c cVar = this.f5616r;
        if (i10 != cVar.f6415n0) {
            cVar.f6415n0 = i10;
            Bitmap bitmap = cVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                cVar.K = null;
            }
            cVar.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f5616r.J = z10;
    }

    public void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f5622x) {
            if (!(this.f5620v == null || (viewGroup = this.f5608c) == null)) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.d.k(viewGroup);
            }
            this.f5622x = i10;
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            d0.d.k(this);
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.A = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.D != i10) {
            this.D = i10;
            d();
        }
    }

    public void setScrimsShown(boolean z10) {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        setScrimsShown(z10, d0.g.c(this) && !isInEditMode());
    }

    public void setStaticLayoutBuilderConfigurer(c cVar) {
        com.google.android.material.internal.c cVar2 = this.f5616r;
        cVar2.getClass();
        if (cVar != null) {
            cVar2.getClass();
            cVar2.i(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f5621w;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f5621w = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f5621w.setState(getDrawableState());
                }
                Drawable drawable4 = this.f5621w;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                a.c.b(drawable4, d0.e.d(this));
                Drawable drawable5 = this.f5621w;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f5621w.setCallback(this);
                this.f5621w.setAlpha(this.f5622x);
            }
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            d0.d.k(this);
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        setStatusBarScrim(k1.a.getDrawable(getContext(), i10));
    }

    public void setTitle(CharSequence charSequence) {
        com.google.android.material.internal.c cVar = this.f5616r;
        if (charSequence == null || !TextUtils.equals(cVar.G, charSequence)) {
            cVar.G = charSequence;
            cVar.H = null;
            Bitmap bitmap = cVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                cVar.K = null;
            }
            cVar.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i10) {
        boolean z10;
        this.G = i10;
        boolean z11 = true;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5616r.f6392c = z10;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.G != 1) {
                z11 = false;
            }
            if (z11) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z10 && this.f5620v == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        com.google.android.material.internal.c cVar = this.f5616r;
        cVar.F = truncateAt;
        cVar.i(false);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f5618t) {
            this.f5618t = z10;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        com.google.android.material.internal.c cVar = this.f5616r;
        cVar.V = timeInterpolator;
        cVar.i(false);
    }

    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f5621w;
        if (!(drawable == null || drawable.isVisible() == z10)) {
            this.f5621w.setVisible(z10, false);
        }
        Drawable drawable2 = this.f5620v;
        if (drawable2 != null && drawable2.isVisible() != z10) {
            this.f5620v.setVisible(z10, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f5620v || drawable == this.f5621w) {
            return true;
        }
        return false;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.collapsingToolbarLayoutStyle);
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final FrameLayout.LayoutParams m3generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.c cVar = this.f5616r;
        if (cVar.f6416o != colorStateList) {
            cVar.f6416o = colorStateList;
            cVar.i(false);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = M
            android.content.Context r11 = p8.a.a(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = 1
            r10.f5606a = r11
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f5615q = r0
            r6 = -1
            r10.D = r6
            r7 = 0
            r10.I = r7
            r10.K = r7
            android.content.Context r8 = r10.getContext()
            com.google.android.material.internal.c r9 = new com.google.android.material.internal.c
            r9.<init>(r10)
            r10.f5616r = r9
            android.view.animation.DecelerateInterpolator r0 = t7.b.f14889e
            r9.W = r0
            r9.i(r7)
            r9.J = r7
            c8.a r0 = new c8.a
            r0.<init>(r8)
            r10.f5617s = r0
            int[] r2 = com.google.android.material.R$styleable.CollapsingToolbarLayout
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_expandedTitleGravity
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r13 = r12.getInt(r13, r0)
            int r0 = r9.f6406j
            if (r0 == r13) goto L_0x0053
            r9.f6406j = r13
            r9.i(r7)
        L_0x0053:
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_collapsedTitleGravity
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r13 = r12.getInt(r13, r0)
            r9.l(r13)
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_expandedTitleMargin
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f5614p = r13
            r10.f5613o = r13
            r10.f5612n = r13
            r10.f5611f = r13
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x007b
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f5611f = r13
        L_0x007b:
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0089
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f5613o = r13
        L_0x0089:
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0097
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f5612n = r13
        L_0x0097:
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00a5
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f5614p = r13
        L_0x00a5:
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_titleEnabled
            boolean r13 = r12.getBoolean(r13, r11)
            r10.f5618t = r13
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_title
            java.lang.CharSequence r13 = r12.getText(r13)
            r10.setTitle(r13)
            int r13 = com.google.android.material.R$style.TextAppearance_Design_CollapsingToolbar_Expanded
            r9.n(r13)
            int r13 = androidx.appcompat.R$style.TextAppearance_AppCompat_Widget_ActionBar_Title
            r9.k(r13)
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00cf
            int r13 = r12.getResourceId(r13, r7)
            r9.n(r13)
        L_0x00cf:
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00de
            int r13 = r12.getResourceId(r13, r7)
            r9.k(r13)
        L_0x00de:
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_titleTextEllipsize
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00ff
            int r13 = r12.getInt(r13, r6)
            if (r13 == 0) goto L_0x00fa
            if (r13 == r11) goto L_0x00f7
            r0 = 3
            if (r13 == r0) goto L_0x00f4
            android.text.TextUtils$TruncateAt r13 = android.text.TextUtils.TruncateAt.END
            goto L_0x00fc
        L_0x00f4:
            android.text.TextUtils$TruncateAt r13 = android.text.TextUtils.TruncateAt.MARQUEE
            goto L_0x00fc
        L_0x00f7:
            android.text.TextUtils$TruncateAt r13 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00fc
        L_0x00fa:
            android.text.TextUtils$TruncateAt r13 = android.text.TextUtils.TruncateAt.START
        L_0x00fc:
            r10.setTitleEllipsize(r13)
        L_0x00ff:
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_expandedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0114
            android.content.res.ColorStateList r13 = i8.c.a(r8, r12, r13)
            android.content.res.ColorStateList r0 = r9.f6414n
            if (r0 == r13) goto L_0x0114
            r9.f6414n = r13
            r9.i(r7)
        L_0x0114:
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_collapsedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0129
            android.content.res.ColorStateList r13 = i8.c.a(r8, r12, r13)
            android.content.res.ColorStateList r0 = r9.f6416o
            if (r0 == r13) goto L_0x0129
            r9.f6416o = r13
            r9.i(r7)
        L_0x0129:
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r13 = r12.getDimensionPixelSize(r13, r6)
            r10.D = r13
            int r13 = com.google.android.material.R$styleable.CollapsingToolbarLayout_maxLines
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0150
            int r11 = r12.getInt(r13, r11)
            int r13 = r9.f6415n0
            if (r11 == r13) goto L_0x0150
            r9.f6415n0 = r11
            android.graphics.Bitmap r11 = r9.K
            if (r11 == 0) goto L_0x014d
            r11.recycle()
            r11 = 0
            r9.K = r11
        L_0x014d:
            r9.i(r7)
        L_0x0150:
            int r11 = com.google.android.material.R$styleable.CollapsingToolbarLayout_titlePositionInterpolator
            boolean r13 = r12.hasValue(r11)
            if (r13 == 0) goto L_0x0165
            int r11 = r12.getResourceId(r11, r7)
            android.view.animation.Interpolator r11 = android.view.animation.AnimationUtils.loadInterpolator(r8, r11)
            r9.V = r11
            r9.i(r7)
        L_0x0165:
            int r11 = com.google.android.material.R$styleable.CollapsingToolbarLayout_scrimAnimationDuration
            r13 = 600(0x258, float:8.41E-43)
            int r11 = r12.getInt(r11, r13)
            long r0 = (long) r11
            r10.A = r0
            int r11 = com.google.android.material.R$attr.motionEasingStandardInterpolator
            q2.a r13 = t7.b.f14887c
            android.animation.TimeInterpolator r13 = f8.j.d(r8, r11, r13)
            r10.B = r13
            q2.c r13 = t7.b.f14888d
            android.animation.TimeInterpolator r11 = f8.j.d(r8, r11, r13)
            r10.C = r11
            int r11 = com.google.android.material.R$styleable.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setContentScrim(r11)
            int r11 = com.google.android.material.R$styleable.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarScrim(r11)
            int r11 = com.google.android.material.R$styleable.CollapsingToolbarLayout_titleCollapseMode
            int r11 = r12.getInt(r11, r7)
            r10.setTitleCollapseMode(r11)
            int r11 = com.google.android.material.R$styleable.CollapsingToolbarLayout_toolbarId
            int r11 = r12.getResourceId(r11, r6)
            r10.f5607b = r11
            int r11 = com.google.android.material.R$styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop
            boolean r11 = r12.getBoolean(r11, r7)
            r10.J = r11
            int r11 = com.google.android.material.R$styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled
            boolean r11 = r12.getBoolean(r11, r7)
            r10.L = r11
            r12.recycle()
            r10.setWillNotDraw(r7)
            com.google.android.material.appbar.CollapsingToolbarLayout$a r11 = new com.google.android.material.appbar.CollapsingToolbarLayout$a
            r11.<init>()
            java.util.WeakHashMap<android.view.View, w1.q0> r12 = w1.d0.f16298a
            w1.d0.i.u(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setScrimsShown(boolean z10, boolean z11) {
        TimeInterpolator timeInterpolator;
        if (this.f5623y != z10) {
            int i10 = 255;
            if (z11) {
                if (!z10) {
                    i10 = 0;
                }
                a();
                ValueAnimator valueAnimator = this.f5624z;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f5624z = valueAnimator2;
                    if (i10 > this.f5622x) {
                        timeInterpolator = this.B;
                    } else {
                        timeInterpolator = this.C;
                    }
                    valueAnimator2.setInterpolator(timeInterpolator);
                    this.f5624z.addUpdateListener(new f(this));
                } else if (valueAnimator.isRunning()) {
                    this.f5624z.cancel();
                }
                this.f5624z.setDuration(this.A);
                this.f5624z.setIntValues(new int[]{this.f5622x, i10});
                this.f5624z.start();
            } else {
                if (!z10) {
                    i10 = 0;
                }
                setScrimAlpha(i10);
            }
            this.f5623y = z10;
        }
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f5625a = 0;

        /* renamed from: b  reason: collision with root package name */
        public float f5626b = 0.5f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CollapsingToolbarLayout_Layout);
            this.f5625a = obtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.f5626b = obtainStyledAttributes.getFloat(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
