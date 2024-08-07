package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$layout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.u;
import com.google.android.material.internal.z;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.g;
import f8.j;
import java.util.List;
import java.util.WeakHashMap;
import l8.m;
import n8.e;
import n8.h;
import o1.a;
import w1.d0;
import w1.q0;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: u  reason: collision with root package name */
    public static final q2.b f6805u = t7.b.f14886b;

    /* renamed from: v  reason: collision with root package name */
    public static final LinearInterpolator f6806v = t7.b.f14885a;

    /* renamed from: w  reason: collision with root package name */
    public static final q2.c f6807w = t7.b.f14888d;

    /* renamed from: x  reason: collision with root package name */
    public static final Handler f6808x = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f6809y = {R$attr.snackbarStyle};

    /* renamed from: a  reason: collision with root package name */
    public final int f6810a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6811b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6812c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f6813d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f6814e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f6815f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f6816g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f6817h;

    /* renamed from: i  reason: collision with root package name */
    public final SnackbarBaseLayout f6818i;

    /* renamed from: j  reason: collision with root package name */
    public final h f6819j;

    /* renamed from: k  reason: collision with root package name */
    public int f6820k;

    /* renamed from: l  reason: collision with root package name */
    public final b f6821l = new b();

    /* renamed from: m  reason: collision with root package name */
    public int f6822m;

    /* renamed from: n  reason: collision with root package name */
    public int f6823n;

    /* renamed from: o  reason: collision with root package name */
    public int f6824o;

    /* renamed from: p  reason: collision with root package name */
    public int f6825p;

    /* renamed from: q  reason: collision with root package name */
    public int f6826q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6827r;

    /* renamed from: s  reason: collision with root package name */
    public final AccessibilityManager f6828s;

    /* renamed from: t  reason: collision with root package name */
    public c f6829t = new c();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: q  reason: collision with root package name */
        public final d f6830q = new d(this);

        public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            d dVar = this.f6830q;
            dVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    g b10 = g.b();
                    c cVar = dVar.f6845a;
                    synchronized (b10.f6858a) {
                        if (b10.c(cVar)) {
                            g.c cVar2 = b10.f6860c;
                            if (cVar2.f6865c) {
                                cVar2.f6865c = false;
                                b10.d(cVar2);
                            }
                        }
                    }
                }
            } else if (coordinatorLayout.s(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                g b11 = g.b();
                c cVar3 = dVar.f6845a;
                synchronized (b11.f6858a) {
                    if (b11.c(cVar3)) {
                        g.c cVar4 = b11.f6860c;
                        if (!cVar4.f6865c) {
                            cVar4.f6865c = true;
                            b11.f6859b.removeCallbacksAndMessages(cVar4);
                        }
                    }
                }
            }
            return super.k(coordinatorLayout, view, motionEvent);
        }

        public final boolean w(View view) {
            this.f6830q.getClass();
            return view instanceof SnackbarBaseLayout;
        }
    }

    public static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: s  reason: collision with root package name */
        public static final a f6831s = new a();

        /* renamed from: a  reason: collision with root package name */
        public BaseTransientBottomBar<?> f6832a;

        /* renamed from: b  reason: collision with root package name */
        public m f6833b;

        /* renamed from: c  reason: collision with root package name */
        public int f6834c;

        /* renamed from: d  reason: collision with root package name */
        public final float f6835d;

        /* renamed from: e  reason: collision with root package name */
        public final float f6836e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6837f;

        /* renamed from: n  reason: collision with root package name */
        public final int f6838n;

        /* renamed from: o  reason: collision with root package name */
        public ColorStateList f6839o;

        /* renamed from: p  reason: collision with root package name */
        public PorterDuff.Mode f6840p;

        /* renamed from: q  reason: collision with root package name */
        public Rect f6841q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f6842r;

        public class a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: l8.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SnackbarBaseLayout(android.content.Context r5, android.util.AttributeSet r6) {
            /*
                r4 = this;
                r0 = 0
                android.content.Context r5 = p8.a.a(r5, r6, r0, r0)
                r4.<init>(r5, r6)
                android.content.Context r5 = r4.getContext()
                int[] r1 = com.google.android.material.R$styleable.SnackbarLayout
                android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
                int r2 = com.google.android.material.R$styleable.SnackbarLayout_elevation
                boolean r3 = r1.hasValue(r2)
                if (r3 == 0) goto L_0x0024
                int r2 = r1.getDimensionPixelSize(r2, r0)
                float r2 = (float) r2
                java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
                w1.d0.i.s(r4, r2)
            L_0x0024:
                int r2 = com.google.android.material.R$styleable.SnackbarLayout_animationMode
                int r2 = r1.getInt(r2, r0)
                r4.f6834c = r2
                int r2 = com.google.android.material.R$styleable.SnackbarLayout_shapeAppearance
                boolean r2 = r1.hasValue(r2)
                if (r2 != 0) goto L_0x003c
                int r2 = com.google.android.material.R$styleable.SnackbarLayout_shapeAppearanceOverlay
                boolean r2 = r1.hasValue(r2)
                if (r2 == 0) goto L_0x0047
            L_0x003c:
                l8.m$a r6 = l8.m.c(r5, r6, r0, r0)
                l8.m r2 = new l8.m
                r2.<init>(r6)
                r4.f6833b = r2
            L_0x0047:
                int r6 = com.google.android.material.R$styleable.SnackbarLayout_backgroundOverlayColorAlpha
                r2 = 1065353216(0x3f800000, float:1.0)
                float r6 = r1.getFloat(r6, r2)
                r4.f6835d = r6
                int r6 = com.google.android.material.R$styleable.SnackbarLayout_backgroundTint
                android.content.res.ColorStateList r5 = i8.c.a(r5, r1, r6)
                r4.setBackgroundTintList(r5)
                int r5 = com.google.android.material.R$styleable.SnackbarLayout_backgroundTintMode
                r6 = -1
                int r5 = r1.getInt(r5, r6)
                android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
                android.graphics.PorterDuff$Mode r5 = com.google.android.material.internal.x.h(r5, r3)
                r4.setBackgroundTintMode(r5)
                int r5 = com.google.android.material.R$styleable.SnackbarLayout_actionTextColorAlpha
                float r5 = r1.getFloat(r5, r2)
                r4.f6836e = r5
                int r5 = com.google.android.material.R$styleable.SnackbarLayout_android_maxWidth
                int r5 = r1.getDimensionPixelSize(r5, r6)
                r4.f6837f = r5
                int r5 = com.google.android.material.R$styleable.SnackbarLayout_maxActionInlineWidth
                int r5 = r1.getDimensionPixelSize(r5, r6)
                r4.f6838n = r5
                r1.recycle()
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a r5 = f6831s
                r4.setOnTouchListener(r5)
                r5 = 1
                r4.setFocusable(r5)
                android.graphics.drawable.Drawable r5 = r4.getBackground()
                if (r5 != 0) goto L_0x00e2
                int r5 = com.google.android.material.R$attr.colorSurface
                int r6 = com.google.android.material.R$attr.colorOnSurface
                float r1 = r4.getBackgroundOverlayColorAlpha()
                int r5 = m9.b.A(r5, r4)
                int r6 = m9.b.A(r6, r4)
                int r5 = m9.b.K(r1, r5, r6)
                l8.m r6 = r4.f6833b
                if (r6 == 0) goto L_0x00bb
                q2.b r0 = com.google.android.material.snackbar.BaseTransientBottomBar.f6805u
                l8.h r0 = new l8.h
                r0.<init>((l8.m) r6)
                android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
                r0.n(r5)
                goto L_0x00d6
            L_0x00bb:
                android.content.res.Resources r6 = r4.getResources()
                q2.b r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f6805u
                int r1 = com.google.android.material.R$dimen.mtrl_snackbar_background_corner_radius
                float r6 = r6.getDimension(r1)
                android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
                r1.<init>()
                r1.setShape(r0)
                r1.setCornerRadius(r6)
                r1.setColor(r5)
                r0 = r1
            L_0x00d6:
                android.content.res.ColorStateList r5 = r4.f6839o
                if (r5 == 0) goto L_0x00dd
                o1.a.b.h(r0, r5)
            L_0x00dd:
                java.util.WeakHashMap<android.view.View, w1.q0> r5 = w1.d0.f16298a
                w1.d0.d.q(r4, r0)
            L_0x00e2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        /* access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f6832a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f6836e;
        }

        public int getAnimationMode() {
            return this.f6834c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f6835d;
        }

        public int getMaxInlineActionWidth() {
            return this.f6838n;
        }

        public int getMaxWidth() {
            return this.f6837f;
        }

        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f6832a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.c();
            }
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.h.c(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
            if (r1 == false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onDetachedFromWindow() {
            /*
                r7 = this;
                super.onDetachedFromWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r0 = r7.f6832a
                if (r0 == 0) goto L_0x0043
                com.google.android.material.snackbar.g r1 = com.google.android.material.snackbar.g.b()
                com.google.android.material.snackbar.BaseTransientBottomBar$c r2 = r0.f6829t
                java.lang.Object r3 = r1.f6858a
                monitor-enter(r3)
                boolean r4 = r1.c(r2)     // Catch:{ all -> 0x0028 }
                r5 = 0
                r6 = 1
                if (r4 != 0) goto L_0x0032
                com.google.android.material.snackbar.g$c r1 = r1.f6861d     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x002f
                if (r2 == 0) goto L_0x002a
                java.lang.ref.WeakReference<com.google.android.material.snackbar.g$b> r1 = r1.f6863a     // Catch:{ all -> 0x0028 }
                java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0028 }
                if (r1 != r2) goto L_0x002a
                r1 = r6
                goto L_0x002b
            L_0x0028:
                r0 = move-exception
                goto L_0x0041
            L_0x002a:
                r1 = r5
            L_0x002b:
                if (r1 == 0) goto L_0x002f
                r1 = r6
                goto L_0x0030
            L_0x002f:
                r1 = r5
            L_0x0030:
                if (r1 == 0) goto L_0x0033
            L_0x0032:
                r5 = r6
            L_0x0033:
                monitor-exit(r3)     // Catch:{ all -> 0x0028 }
                if (r5 == 0) goto L_0x0043
                android.os.Handler r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f6808x
                n8.f r2 = new n8.f
                r2.<init>(r0)
                r1.post(r2)
                goto L_0x0043
            L_0x0041:
                monitor-exit(r3)     // Catch:{ all -> 0x0028 }
                throw r0
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.onDetachedFromWindow():void");
        }

        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f6832a;
            if (baseTransientBottomBar != null && baseTransientBottomBar.f6827r) {
                baseTransientBottomBar.f();
                baseTransientBottomBar.f6827r = false;
            }
        }

        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (this.f6837f > 0 && getMeasuredWidth() > (i12 = this.f6837f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        public void setAnimationMode(int i10) {
            this.f6834c = i10;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f6839o == null)) {
                drawable = drawable.mutate();
                a.b.h(drawable, this.f6839o);
                a.b.i(drawable, this.f6840p);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f6839o = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.h(mutate, colorStateList);
                a.b.i(mutate, this.f6840p);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f6840p = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.i(mutate, mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f6842r && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f6841q = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f6832a;
                if (baseTransientBottomBar != null) {
                    q2.b bVar = BaseTransientBottomBar.f6805u;
                    baseTransientBottomBar.g();
                }
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            a aVar;
            if (onClickListener != null) {
                aVar = null;
            } else {
                aVar = f6831s;
            }
            setOnTouchListener(aVar);
            super.setOnClickListener(onClickListener);
        }
    }

    public class a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            boolean z10;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i10 = message.what;
            if (i10 == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                if (baseTransientBottomBar.f6818i.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f6818i.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.e) {
                        CoordinatorLayout.e eVar = (CoordinatorLayout.e) layoutParams;
                        Behavior behavior = new Behavior();
                        d dVar = behavior.f6830q;
                        dVar.getClass();
                        dVar.f6845a = baseTransientBottomBar.f6829t;
                        behavior.f5734b = new e(baseTransientBottomBar);
                        eVar.b(behavior);
                        eVar.f2073g = 80;
                    }
                    SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.f6818i;
                    ViewGroup viewGroup = baseTransientBottomBar.f6816g;
                    snackbarBaseLayout.f6842r = true;
                    viewGroup.addView(snackbarBaseLayout);
                    snackbarBaseLayout.f6842r = false;
                    baseTransientBottomBar.g();
                    baseTransientBottomBar.f6818i.setVisibility(4);
                }
                SnackbarBaseLayout snackbarBaseLayout2 = baseTransientBottomBar.f6818i;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (d0.g.c(snackbarBaseLayout2)) {
                    baseTransientBottomBar.f();
                } else {
                    baseTransientBottomBar.f6827r = true;
                }
                return true;
            } else if (i10 != 1) {
                return false;
            } else {
                BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
                int i11 = message.arg1;
                AccessibilityManager accessibilityManager = baseTransientBottomBar2.f6828s;
                if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10 || baseTransientBottomBar2.f6818i.getVisibility() != 0) {
                    baseTransientBottomBar2.d();
                } else if (baseTransientBottomBar2.f6818i.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    ofFloat.setInterpolator(baseTransientBottomBar2.f6813d);
                    ofFloat.addUpdateListener(new a(baseTransientBottomBar2));
                    ofFloat.setDuration((long) baseTransientBottomBar2.f6811b);
                    ofFloat.addListener(new n8.a(baseTransientBottomBar2, i11));
                    ofFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    int[] iArr = new int[2];
                    iArr[0] = 0;
                    int height = baseTransientBottomBar2.f6818i.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = baseTransientBottomBar2.f6818i.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    iArr[1] = height;
                    valueAnimator.setIntValues(iArr);
                    valueAnimator.setInterpolator(baseTransientBottomBar2.f6814e);
                    valueAnimator.setDuration((long) baseTransientBottomBar2.f6812c);
                    valueAnimator.addListener(new n8.c(baseTransientBottomBar2, i11));
                    valueAnimator.addUpdateListener(new d(baseTransientBottomBar2));
                    valueAnimator.start();
                }
                return true;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f6818i != null && (context = baseTransientBottomBar.f6817h) != null) {
                int height = z.a(context).height();
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                int[] iArr = new int[2];
                baseTransientBottomBar2.f6818i.getLocationInWindow(iArr);
                int height2 = (height - (baseTransientBottomBar2.f6818i.getHeight() + iArr[1])) + ((int) BaseTransientBottomBar.this.f6818i.getTranslationY());
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                int i10 = baseTransientBottomBar3.f6825p;
                if (height2 >= i10) {
                    baseTransientBottomBar3.f6826q = i10;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.f6818i.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    q2.b bVar = BaseTransientBottomBar.f6805u;
                    return;
                }
                BaseTransientBottomBar baseTransientBottomBar4 = BaseTransientBottomBar.this;
                int i11 = baseTransientBottomBar4.f6825p;
                baseTransientBottomBar4.f6826q = i11;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (i11 - height2) + marginLayoutParams.bottomMargin;
                baseTransientBottomBar4.f6818i.requestLayout();
            }
        }
    }

    public class c implements g.b {
        public c() {
        }

        public final void b() {
            Handler handler = BaseTransientBottomBar.f6808x;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public final void c(int i10) {
            Handler handler = BaseTransientBottomBar.f6808x;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public c f6845a;

        public d(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f5739n = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f5740o = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f5737e = 0;
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        boolean z10;
        int i10;
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (snackbarContentLayout2 != null) {
            this.f6816g = viewGroup;
            this.f6819j = snackbarContentLayout2;
            this.f6817h = context;
            u.c(context, u.f6503a, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f6809y);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = R$layout.mtrl_layout_snackbar;
            } else {
                i10 = R$layout.design_layout_snackbar;
            }
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) from.inflate(i10, viewGroup, false);
            this.f6818i = snackbarBaseLayout;
            snackbarBaseLayout.setBaseTransientBottomBar(this);
            float actionTextColorAlpha = snackbarBaseLayout.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f6848b.setTextColor(m9.b.K(actionTextColorAlpha, m9.b.A(R$attr.colorSurface, snackbarContentLayout), snackbarContentLayout.f6848b.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
            snackbarBaseLayout.addView(snackbarContentLayout);
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.g.f(snackbarBaseLayout, 1);
            d0.d.s(snackbarBaseLayout, 1);
            snackbarBaseLayout.setFitsSystemWindows(true);
            d0.i.u(snackbarBaseLayout, new n8.d(this));
            d0.o(snackbarBaseLayout, new e(this));
            this.f6828s = (AccessibilityManager) context.getSystemService("accessibility");
            int i11 = R$attr.motionDurationLong2;
            this.f6812c = j.c(context, i11, 250);
            this.f6810a = j.c(context, i11, 150);
            this.f6811b = j.c(context, R$attr.motionDurationMedium1, 75);
            int i12 = R$attr.motionEasingEmphasizedInterpolator;
            this.f6813d = j.d(context, i12, f6806v);
            this.f6815f = j.d(context, i12, f6807w);
            this.f6814e = j.d(context, i12, f6805u);
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public void a() {
        b(3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r7) {
        /*
            r6 = this;
            com.google.android.material.snackbar.g r0 = com.google.android.material.snackbar.g.b()
            com.google.android.material.snackbar.BaseTransientBottomBar$c r1 = r6.f6829t
            java.lang.Object r2 = r0.f6858a
            monitor-enter(r2)
            boolean r3 = r0.c(r1)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0015
            com.google.android.material.snackbar.g$c r1 = r0.f6860c     // Catch:{ all -> 0x0037 }
            r0.a(r1, r7)     // Catch:{ all -> 0x0037 }
            goto L_0x0033
        L_0x0015:
            com.google.android.material.snackbar.g$c r3 = r0.f6861d     // Catch:{ all -> 0x0037 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002b
            if (r1 == 0) goto L_0x0027
            java.lang.ref.WeakReference<com.google.android.material.snackbar.g$b> r3 = r3.f6863a     // Catch:{ all -> 0x0037 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0037 }
            if (r3 != r1) goto L_0x0027
            r1 = r4
            goto L_0x0028
        L_0x0027:
            r1 = r5
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r4 = r5
        L_0x002c:
            if (r4 == 0) goto L_0x0033
            com.google.android.material.snackbar.g$c r1 = r0.f6861d     // Catch:{ all -> 0x0037 }
            r0.a(r1, r7)     // Catch:{ all -> 0x0037 }
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            return
        L_0x0035:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r7
        L_0x0037:
            r7 = move-exception
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.b(int):void");
    }

    public final void c() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.f6818i.getRootWindowInsets()) != null) {
            this.f6825p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            g();
        }
    }

    public final void d() {
        g b10 = g.b();
        c cVar = this.f6829t;
        synchronized (b10.f6858a) {
            try {
                if (b10.c(cVar)) {
                    b10.f6860c = null;
                    g.c cVar2 = b10.f6861d;
                    if (!(cVar2 == null || cVar2 == null)) {
                        b10.f6860c = cVar2;
                        b10.f6861d = null;
                        g.b bVar = cVar2.f6863a.get();
                        if (bVar != null) {
                            bVar.b();
                        } else {
                            b10.f6860c = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        ViewParent parent = this.f6818i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f6818i);
        }
    }

    public final void e() {
        g b10 = g.b();
        c cVar = this.f6829t;
        synchronized (b10.f6858a) {
            if (b10.c(cVar)) {
                b10.d(b10.f6860c);
            }
        }
    }

    public final void f() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f6828s;
        boolean z10 = true;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z10 = false;
        }
        if (z10) {
            this.f6818i.post(new f(this));
            return;
        }
        if (this.f6818i.getParent() != null) {
            this.f6818i.setVisibility(0);
        }
        e();
    }

    public final void g() {
        boolean z10;
        boolean z11;
        ViewGroup.LayoutParams layoutParams = this.f6818i.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            SnackbarBaseLayout snackbarBaseLayout = this.f6818i;
            if (snackbarBaseLayout.f6841q != null && snackbarBaseLayout.getParent() != null) {
                int i10 = this.f6822m;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                SnackbarBaseLayout snackbarBaseLayout2 = this.f6818i;
                Rect rect = snackbarBaseLayout2.f6841q;
                int i11 = rect.bottom + i10;
                int i12 = rect.left + this.f6823n;
                int i13 = rect.right + this.f6824o;
                int i14 = rect.top;
                boolean z12 = false;
                if (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    marginLayoutParams.bottomMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    marginLayoutParams.topMargin = i14;
                    snackbarBaseLayout2.requestLayout();
                }
                if ((z10 || this.f6826q != this.f6825p) && Build.VERSION.SDK_INT >= 29) {
                    if (this.f6825p > 0) {
                        ViewGroup.LayoutParams layoutParams2 = this.f6818i.getLayoutParams();
                        if (!(layoutParams2 instanceof CoordinatorLayout.e) || !(((CoordinatorLayout.e) layoutParams2).f2067a instanceof SwipeDismissBehavior)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            z12 = true;
                        }
                    }
                    if (z12) {
                        this.f6818i.removeCallbacks(this.f6821l);
                        this.f6818i.post(this.f6821l);
                    }
                }
            }
        }
    }
}
