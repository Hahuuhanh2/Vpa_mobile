package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import java.util.WeakHashMap;
import o1.a;
import w1.d0;
import w1.q0;
import w1.u;
import x1.f;

public abstract class NavigationBarItemView extends FrameLayout implements k.a {
    public static final int[] N = {16842912};
    public static final c O = new c();
    public static final d P = new d();
    public h A;
    public ColorStateList B;
    public Drawable C;
    public Drawable D;
    public ValueAnimator E;
    public c F = O;
    public float G = 0.0f;
    public boolean H = false;
    public int I = 0;
    public int J = 0;
    public boolean K = false;
    public int L = 0;
    public com.google.android.material.badge.a M;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6531a = false;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f6532b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f6533c;

    /* renamed from: d  reason: collision with root package name */
    public int f6534d;

    /* renamed from: e  reason: collision with root package name */
    public int f6535e;

    /* renamed from: f  reason: collision with root package name */
    public int f6536f;

    /* renamed from: n  reason: collision with root package name */
    public float f6537n;

    /* renamed from: o  reason: collision with root package name */
    public float f6538o;

    /* renamed from: p  reason: collision with root package name */
    public float f6539p;

    /* renamed from: q  reason: collision with root package name */
    public int f6540q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6541r;

    /* renamed from: s  reason: collision with root package name */
    public final FrameLayout f6542s;

    /* renamed from: t  reason: collision with root package name */
    public final View f6543t;

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f6544u;

    /* renamed from: v  reason: collision with root package name */
    public final ViewGroup f6545v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f6546w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f6547x;

    /* renamed from: y  reason: collision with root package name */
    public int f6548y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f6549z = 0;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            boolean z10;
            if (NavigationBarItemView.this.f6544u.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                ImageView imageView = navigationBarItemView.f6544u;
                com.google.android.material.badge.a aVar = navigationBarItemView.M;
                if (aVar != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.i(imageView, (FrameLayout) null);
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6551a;

        public b(int i10) {
            this.f6551a = i10;
        }

        public final void run() {
            NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
            int i10 = this.f6551a;
            int[] iArr = NavigationBarItemView.N;
            navigationBarItemView.h(i10);
        }
    }

    public static class c {
        public float a(float f10, float f11) {
            return 1.0f;
        }
    }

    public static class d extends c {
        public final float a(float f10, float f11) {
            LinearInterpolator linearInterpolator = t7.b.f14885a;
            return (f10 * 0.6f) + 0.4f;
        }
    }

    public NavigationBarItemView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.f6542s = (FrameLayout) findViewById(R$id.navigation_bar_item_icon_container);
        this.f6543t = findViewById(R$id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R$id.navigation_bar_item_icon_view);
        this.f6544u = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R$id.navigation_bar_item_labels_group);
        this.f6545v = viewGroup;
        TextView textView = (TextView) findViewById(R$id.navigation_bar_item_small_label_view);
        this.f6546w = textView;
        TextView textView2 = (TextView) findViewById(R$id.navigation_bar_item_large_label_view);
        this.f6547x = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f6534d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f6535e = viewGroup.getPaddingBottom();
        this.f6536f = getResources().getDimensionPixelSize(R$dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.s(textView, 2);
        d0.d.s(textView2, 2);
        setFocusable(true);
        float textSize = textView.getTextSize();
        float textSize2 = textView2.getTextSize();
        this.f6537n = textSize - textSize2;
        this.f6538o = (textSize2 * 1.0f) / textSize;
        this.f6539p = (textSize * 1.0f) / textSize2;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto L_0x000c
        L_0x000a:
            r5 = r1
            goto L_0x004e
        L_0x000c:
            int[] r2 = com.google.android.material.R$styleable.TextAppearance
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            int r3 = com.google.android.material.R$styleable.TextAppearance_android_textSize
            boolean r3 = r5.getValue(r3, r2)
            r5.recycle()
            if (r3 != 0) goto L_0x0023
            goto L_0x000a
        L_0x0023:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L_0x0040
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L_0x004e
        L_0x0040:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L_0x004e:
            if (r5 == 0) goto L_0x0054
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.e(android.widget.TextView, int):void");
    }

    public static void f(float f10, float f11, int i10, TextView textView) {
        textView.setScaleX(f10);
        textView.setScaleY(f11);
        textView.setVisibility(i10);
    }

    public static void g(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f6542s;
        if (frameLayout != null) {
            return frameLayout;
        }
        return this.f6544u;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < indexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        int i10;
        com.google.android.material.badge.a aVar = this.M;
        if (aVar == null) {
            i10 = 0;
        } else {
            i10 = aVar.getMinimumWidth() - this.M.f5711e.f5676b.D.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int max = Math.max(i10, layoutParams.leftMargin);
        return Math.max(i10, layoutParams.rightMargin) + this.f6544u.getMeasuredWidth() + max;
    }

    public static void i(int i10, ViewGroup viewGroup) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i10);
    }

    public final void a() {
        h hVar = this.A;
        if (hVar != null) {
            setChecked(hVar.isChecked());
        }
    }

    public final void b() {
        Drawable drawable = this.f6533c;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (this.f6532b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.H && getActiveIndicatorDrawable() != null && this.f6542s != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(j8.a.c(this.f6532b), (Drawable) null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(j8.a.a(this.f6532b), (Drawable) null, (Drawable) null);
            }
        }
        FrameLayout frameLayout = this.f6542s;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.f6542s.setForeground(rippleDrawable);
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.q(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    public final void c(h hVar) {
        CharSequence charSequence;
        int i10;
        this.A = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.f646e);
        setId(hVar.f642a);
        if (!TextUtils.isEmpty(hVar.f658q)) {
            setContentDescription(hVar.f658q);
        }
        if (!TextUtils.isEmpty(hVar.f659r)) {
            charSequence = hVar.f659r;
        } else {
            charSequence = hVar.f646e;
        }
        if (Build.VERSION.SDK_INT > 23) {
            androidx.appcompat.widget.q0.a(this, charSequence);
        }
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        this.f6531a = true;
    }

    public final void d(float f10, float f11) {
        float f12;
        float f13;
        View view = this.f6543t;
        if (view != null) {
            c cVar = this.F;
            cVar.getClass();
            LinearInterpolator linearInterpolator = t7.b.f14885a;
            view.setScaleX((0.6f * f10) + 0.4f);
            view.setScaleY(cVar.a(f10, f11));
            int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                f12 = 0.8f;
            } else {
                f12 = 0.0f;
            }
            if (i10 == 0) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            view.setAlpha(t7.b.a(0.0f, 1.0f, f12, f13, f10));
        }
        this.G = f10;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f6542s;
        if (frameLayout != null && this.H) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f6543t;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public com.google.android.material.badge.a getBadge() {
        return this.M;
    }

    public int getItemBackgroundResId() {
        return R$drawable.mtrl_navigation_bar_item_background;
    }

    public h getItemData() {
        return this.A;
    }

    public int getItemDefaultMarginResId() {
        return R$dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f6548y;
    }

    public int getSuggestedMinimumHeight() {
        int i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f6545v.getLayoutParams();
        int suggestedIconHeight = getSuggestedIconHeight();
        if (this.f6545v.getVisibility() == 0) {
            i10 = this.f6536f;
        } else {
            i10 = 0;
        }
        return this.f6545v.getMeasuredHeight() + suggestedIconHeight + i10 + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f6545v.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.f6545v.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void h(int i10) {
        boolean z10;
        int i11;
        if (this.f6543t != null && i10 > 0) {
            int min = Math.min(this.I, i10 - (this.L * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f6543t.getLayoutParams();
            if (!this.K || this.f6540q != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i11 = min;
            } else {
                i11 = this.J;
            }
            layoutParams.height = i11;
            layoutParams.width = min;
            this.f6543t.setLayoutParams(layoutParams);
        }
    }

    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        h hVar = this.A;
        if (hVar != null && hVar.isCheckable() && this.A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, N);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.M;
        if (aVar != null && aVar.isVisible()) {
            h hVar = this.A;
            CharSequence charSequence = hVar.f646e;
            if (!TextUtils.isEmpty(hVar.f658q)) {
                charSequence = this.A.f658q;
            }
            accessibilityNodeInfo.setContentDescription(charSequence + ", " + this.M.c());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.g.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f16881a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f16867g.f16876a);
        }
        f.b.c(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R$string.item_view_role_description));
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new b(i10));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f6543t;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
            b();
        }
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        int i10;
        this.H = z10;
        b();
        View view = this.f6543t;
        if (view != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.J = i10;
        h(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f6536f != i10) {
            this.f6536f = i10;
            a();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.L = i10;
        h(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.K = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.I = i10;
        h(getWidth());
    }

    public void setBadge(com.google.android.material.badge.a aVar) {
        boolean z10;
        ImageView imageView;
        boolean z11;
        com.google.android.material.badge.a aVar2 = this.M;
        if (aVar2 != aVar) {
            boolean z12 = true;
            if (aVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (imageView = this.f6544u) != null) {
                if (aVar2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    setClipChildren(true);
                    setClipToPadding(true);
                    com.google.android.material.badge.a aVar3 = this.M;
                    if (aVar3 != null) {
                        if (aVar3.d() != null) {
                            aVar3.d().setForeground((Drawable) null);
                        } else {
                            imageView.getOverlay().remove(aVar3);
                        }
                    }
                    this.M = null;
                }
            }
            this.M = aVar;
            ImageView imageView2 = this.f6544u;
            if (imageView2 != null) {
                if (aVar == null) {
                    z12 = false;
                }
                if (z12) {
                    setClipChildren(false);
                    setClipToPadding(false);
                    com.google.android.material.badge.a aVar4 = this.M;
                    Rect rect = new Rect();
                    imageView2.getDrawingRect(rect);
                    aVar4.setBounds(rect);
                    aVar4.i(imageView2, (FrameLayout) null);
                    if (aVar4.d() != null) {
                        aVar4.d().setForeground(aVar4);
                    } else {
                        imageView2.getOverlay().add(aVar4);
                    }
                }
            }
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r10) {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.f6547x
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f6547x
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r9.f6546w
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f6546w
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x0031
            r1 = r0
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            boolean r3 = r9.H
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0096
            boolean r3 = r9.f6531a
            if (r3 == 0) goto L_0x0096
            java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
            boolean r3 = w1.d0.g.b(r9)
            if (r3 != 0) goto L_0x0045
            goto L_0x0096
        L_0x0045:
            android.animation.ValueAnimator r3 = r9.E
            if (r3 == 0) goto L_0x004f
            r3.cancel()
            r3 = 0
            r9.E = r3
        L_0x004f:
            float[] r3 = new float[r2]
            float r6 = r9.G
            r3[r5] = r6
            r3[r4] = r1
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            r9.E = r3
            com.google.android.material.navigation.d r6 = new com.google.android.material.navigation.d
            r6.<init>(r9, r1)
            r3.addUpdateListener(r6)
            android.animation.ValueAnimator r1 = r9.E
            android.content.Context r3 = r9.getContext()
            int r6 = com.google.android.material.R$attr.motionEasingEmphasizedInterpolator
            q2.b r7 = t7.b.f14886b
            android.animation.TimeInterpolator r3 = f8.j.d(r3, r6, r7)
            r1.setInterpolator(r3)
            android.animation.ValueAnimator r1 = r9.E
            android.content.Context r3 = r9.getContext()
            int r6 = com.google.android.material.R$attr.motionDurationLong2
            android.content.res.Resources r7 = r9.getResources()
            int r8 = com.google.android.material.R$integer.material_motion_duration_long_1
            int r7 = r7.getInteger(r8)
            int r3 = f8.j.c(r3, r6, r7)
            long r6 = (long) r3
            r1.setDuration(r6)
            android.animation.ValueAnimator r1 = r9.E
            r1.start()
            goto L_0x0099
        L_0x0096:
            r9.d(r1, r1)
        L_0x0099:
            int r1 = r9.f6540q
            r3 = -1
            r6 = 17
            r7 = 49
            r8 = 4
            if (r1 == r3) goto L_0x012f
            if (r1 == 0) goto L_0x00fe
            if (r1 == r4) goto L_0x00c2
            if (r1 == r2) goto L_0x00ab
            goto L_0x019d
        L_0x00ab:
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f6534d
            g(r0, r1, r6)
            android.widget.TextView r0 = r9.f6547x
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.f6546w
            r0.setVisibility(r1)
            goto L_0x019d
        L_0x00c2:
            android.view.ViewGroup r1 = r9.f6545v
            int r2 = r9.f6535e
            i(r2, r1)
            if (r10 == 0) goto L_0x00e7
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f6534d
            float r2 = (float) r2
            float r3 = r9.f6537n
            float r2 = r2 + r3
            int r2 = (int) r2
            g(r1, r2, r7)
            android.widget.TextView r1 = r9.f6547x
            f(r0, r0, r5, r1)
            android.widget.TextView r0 = r9.f6546w
            float r1 = r9.f6538o
            f(r1, r1, r8, r0)
            goto L_0x019d
        L_0x00e7:
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f6534d
            g(r1, r2, r7)
            android.widget.TextView r1 = r9.f6547x
            float r2 = r9.f6539p
            f(r2, r2, r8, r1)
            android.widget.TextView r1 = r9.f6546w
            f(r0, r0, r5, r1)
            goto L_0x019d
        L_0x00fe:
            if (r10 == 0) goto L_0x0116
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f6534d
            g(r0, r1, r7)
            android.view.ViewGroup r0 = r9.f6545v
            int r1 = r9.f6535e
            i(r1, r0)
            android.widget.TextView r0 = r9.f6547x
            r0.setVisibility(r5)
            goto L_0x0129
        L_0x0116:
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f6534d
            g(r0, r1, r6)
            android.view.ViewGroup r0 = r9.f6545v
            i(r5, r0)
            android.widget.TextView r0 = r9.f6547x
            r0.setVisibility(r8)
        L_0x0129:
            android.widget.TextView r0 = r9.f6546w
            r0.setVisibility(r8)
            goto L_0x019d
        L_0x012f:
            boolean r1 = r9.f6541r
            if (r1 == 0) goto L_0x0164
            if (r10 == 0) goto L_0x014b
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f6534d
            g(r0, r1, r7)
            android.view.ViewGroup r0 = r9.f6545v
            int r1 = r9.f6535e
            i(r1, r0)
            android.widget.TextView r0 = r9.f6547x
            r0.setVisibility(r5)
            goto L_0x015e
        L_0x014b:
            android.view.View r0 = r9.getIconOrContainer()
            int r1 = r9.f6534d
            g(r0, r1, r6)
            android.view.ViewGroup r0 = r9.f6545v
            i(r5, r0)
            android.widget.TextView r0 = r9.f6547x
            r0.setVisibility(r8)
        L_0x015e:
            android.widget.TextView r0 = r9.f6546w
            r0.setVisibility(r8)
            goto L_0x019d
        L_0x0164:
            android.view.ViewGroup r1 = r9.f6545v
            int r2 = r9.f6535e
            i(r2, r1)
            if (r10 == 0) goto L_0x0188
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f6534d
            float r2 = (float) r2
            float r3 = r9.f6537n
            float r2 = r2 + r3
            int r2 = (int) r2
            g(r1, r2, r7)
            android.widget.TextView r1 = r9.f6547x
            f(r0, r0, r5, r1)
            android.widget.TextView r0 = r9.f6546w
            float r1 = r9.f6538o
            f(r1, r1, r8, r0)
            goto L_0x019d
        L_0x0188:
            android.view.View r1 = r9.getIconOrContainer()
            int r2 = r9.f6534d
            g(r1, r2, r7)
            android.widget.TextView r1 = r9.f6547x
            float r2 = r9.f6539p
            f(r2, r2, r8, r1)
            android.widget.TextView r1 = r9.f6546w
            f(r0, r0, r5, r1)
        L_0x019d:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.setChecked(boolean):void");
    }

    public void setEnabled(boolean z10) {
        u uVar;
        super.setEnabled(z10);
        this.f6546w.setEnabled(z10);
        this.f6547x.setEnabled(z10);
        this.f6544u.setEnabled(z10);
        if (z10) {
            Context context = getContext();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                uVar = new u(u.a.b(context, 1002));
            } else {
                uVar = new u((PointerIcon) null);
            }
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (i10 >= 24) {
                d0.k.d(this, uVar.f16353a);
                return;
            }
            return;
        }
        WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
        if (Build.VERSION.SDK_INT >= 24) {
            d0.k.d(this, (PointerIcon) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.C) {
            this.C = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                this.D = drawable;
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    a.b.h(drawable, colorStateList);
                }
            }
            this.f6544u.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f6544u.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f6544u.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.B = colorStateList;
        if (this.A != null && (drawable = this.D) != null) {
            a.b.h(drawable, colorStateList);
            this.D.invalidateSelf();
        }
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : k1.a.getDrawable(getContext(), i10));
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f6535e != i10) {
            this.f6535e = i10;
            a();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f6534d != i10) {
            this.f6534d = i10;
            a();
        }
    }

    public void setItemPosition(int i10) {
        this.f6548y = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f6532b = colorStateList;
        b();
    }

    public void setLabelVisibilityMode(int i10) {
        boolean z10;
        if (this.f6540q != i10) {
            this.f6540q = i10;
            if (!this.K || i10 != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.F = P;
            } else {
                this.F = O;
            }
            h(getWidth());
            a();
        }
    }

    public void setShifting(boolean z10) {
        if (this.f6541r != z10) {
            this.f6541r = z10;
            a();
        }
    }

    public void setShortcut(boolean z10, char c10) {
    }

    public void setTextAppearanceActive(int i10) {
        this.f6549z = i10;
        e(this.f6547x, i10);
        float textSize = this.f6546w.getTextSize();
        float textSize2 = this.f6547x.getTextSize();
        this.f6537n = textSize - textSize2;
        this.f6538o = (textSize2 * 1.0f) / textSize;
        this.f6539p = (textSize * 1.0f) / textSize2;
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        setTextAppearanceActive(this.f6549z);
        TextView textView = this.f6547x;
        textView.setTypeface(textView.getTypeface(), z10 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i10) {
        e(this.f6546w, i10);
        float textSize = this.f6546w.getTextSize();
        float textSize2 = this.f6547x.getTextSize();
        this.f6537n = textSize - textSize2;
        this.f6538o = (textSize2 * 1.0f) / textSize;
        this.f6539p = (textSize * 1.0f) / textSize2;
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f6546w.setTextColor(colorStateList);
            this.f6547x.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f6546w.setText(charSequence);
        this.f6547x.setText(charSequence);
        h hVar = this.A;
        if (hVar == null || TextUtils.isEmpty(hVar.f658q)) {
            setContentDescription(charSequence);
        }
        h hVar2 = this.A;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.f659r)) {
            charSequence = this.A.f659r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            androidx.appcompat.widget.q0.a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f6533c = drawable;
        b();
    }
}
