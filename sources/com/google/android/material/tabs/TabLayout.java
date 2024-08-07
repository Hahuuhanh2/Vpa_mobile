package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.k;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R$attr;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o1.a;
import w1.d0;
import w1.q0;
import w1.u;
import x1.f;

@ViewPager.e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: g0  reason: collision with root package name */
    public static final int f6876g0 = R$style.Widget_Design_TabLayout;

    /* renamed from: h0  reason: collision with root package name */
    public static final v1.e f6877h0 = new v1.e(16);
    public final int A;
    public int B;
    public final int C;
    public final int D;
    public final int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public a P;
    public final TimeInterpolator Q;
    public c R;
    public final ArrayList<c> S;
    public i T;
    public ValueAnimator U;
    public ViewPager V;
    public l3.a W;

    /* renamed from: a  reason: collision with root package name */
    public int f6878a;

    /* renamed from: a0  reason: collision with root package name */
    public e f6879a0;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<g> f6880b;

    /* renamed from: b0  reason: collision with root package name */
    public h f6881b0;

    /* renamed from: c  reason: collision with root package name */
    public g f6882c;

    /* renamed from: c0  reason: collision with root package name */
    public b f6883c0;

    /* renamed from: d  reason: collision with root package name */
    public final f f6884d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f6885d0;

    /* renamed from: e  reason: collision with root package name */
    public int f6886e;

    /* renamed from: e0  reason: collision with root package name */
    public int f6887e0;

    /* renamed from: f  reason: collision with root package name */
    public int f6888f;

    /* renamed from: f0  reason: collision with root package name */
    public final a1.e f6889f0;

    /* renamed from: n  reason: collision with root package name */
    public int f6890n;

    /* renamed from: o  reason: collision with root package name */
    public int f6891o;

    /* renamed from: p  reason: collision with root package name */
    public final int f6892p;

    /* renamed from: q  reason: collision with root package name */
    public final int f6893q;

    /* renamed from: r  reason: collision with root package name */
    public int f6894r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f6895s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f6896t;

    /* renamed from: u  reason: collision with root package name */
    public ColorStateList f6897u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f6898v;

    /* renamed from: w  reason: collision with root package name */
    public int f6899w;

    /* renamed from: x  reason: collision with root package name */
    public PorterDuff.Mode f6900x;

    /* renamed from: y  reason: collision with root package name */
    public float f6901y;

    /* renamed from: z  reason: collision with root package name */
    public float f6902z;

    public final class TabView extends LinearLayout {

        /* renamed from: s  reason: collision with root package name */
        public static final /* synthetic */ int f6903s = 0;

        /* renamed from: a  reason: collision with root package name */
        public g f6904a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f6905b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f6906c;

        /* renamed from: d  reason: collision with root package name */
        public View f6907d;

        /* renamed from: e  reason: collision with root package name */
        public com.google.android.material.badge.a f6908e;

        /* renamed from: f  reason: collision with root package name */
        public View f6909f;

        /* renamed from: n  reason: collision with root package name */
        public TextView f6910n;

        /* renamed from: o  reason: collision with root package name */
        public ImageView f6911o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f6912p;

        /* renamed from: q  reason: collision with root package name */
        public int f6913q = 2;

        public TabView(Context context) {
            super(context);
            u uVar;
            e(context);
            int i10 = TabLayout.this.f6886e;
            int i11 = TabLayout.this.f6888f;
            int i12 = TabLayout.this.f6890n;
            int i13 = TabLayout.this.f6891o;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.e.k(this, i10, i11, i12, i13);
            setGravity(17);
            setOrientation(TabLayout.this.K ^ true ? 1 : 0);
            setClickable(true);
            Context context2 = getContext();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                uVar = new u(u.a.b(context2, 1002));
            } else {
                uVar = new u((PointerIcon) null);
            }
            if (i14 >= 24) {
                d0.k.d(this, uVar.f16353a);
            }
        }

        private com.google.android.material.badge.a getBadge() {
            return this.f6908e;
        }

        private com.google.android.material.badge.a getOrCreateBadge() {
            if (this.f6908e == null) {
                this.f6908e = new com.google.android.material.badge.a(getContext(), (BadgeState.State) null);
            }
            b();
            com.google.android.material.badge.a aVar = this.f6908e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            boolean z10;
            if (this.f6908e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f6907d;
                if (view != null) {
                    com.google.android.material.badge.a aVar = this.f6908e;
                    if (aVar != null) {
                        if (aVar.d() != null) {
                            aVar.d().setForeground((Drawable) null);
                        } else {
                            view.getOverlay().remove(aVar);
                        }
                    }
                    this.f6907d = null;
                }
            }
        }

        public final void b() {
            boolean z10;
            g gVar;
            g gVar2;
            boolean z11 = true;
            if (this.f6908e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f6909f != null) {
                    a();
                    return;
                }
                ImageView imageView = this.f6906c;
                if (imageView == null || (gVar2 = this.f6904a) == null || gVar2.f6925a == null) {
                    TextView textView = this.f6905b;
                    if (textView == null || (gVar = this.f6904a) == null || gVar.f6930f != 1) {
                        a();
                    } else if (this.f6907d != textView) {
                        a();
                        TextView textView2 = this.f6905b;
                        if (this.f6908e == null) {
                            z11 = false;
                        }
                        if (z11 && textView2 != null) {
                            setClipChildren(false);
                            setClipToPadding(false);
                            ViewGroup viewGroup = (ViewGroup) getParent();
                            if (viewGroup != null) {
                                viewGroup.setClipChildren(false);
                                viewGroup.setClipToPadding(false);
                            }
                            com.google.android.material.badge.a aVar = this.f6908e;
                            Rect rect = new Rect();
                            textView2.getDrawingRect(rect);
                            aVar.setBounds(rect);
                            aVar.i(textView2, (FrameLayout) null);
                            if (aVar.d() != null) {
                                aVar.d().setForeground(aVar);
                            } else {
                                textView2.getOverlay().add(aVar);
                            }
                            this.f6907d = textView2;
                        }
                    } else {
                        c(textView);
                    }
                } else if (this.f6907d != imageView) {
                    a();
                    ImageView imageView2 = this.f6906c;
                    if (this.f6908e == null) {
                        z11 = false;
                    }
                    if (z11 && imageView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.setClipChildren(false);
                            viewGroup2.setClipToPadding(false);
                        }
                        com.google.android.material.badge.a aVar2 = this.f6908e;
                        Rect rect2 = new Rect();
                        imageView2.getDrawingRect(rect2);
                        aVar2.setBounds(rect2);
                        aVar2.i(imageView2, (FrameLayout) null);
                        if (aVar2.d() != null) {
                            aVar2.d().setForeground(aVar2);
                        } else {
                            imageView2.getOverlay().add(aVar2);
                        }
                        this.f6907d = imageView2;
                    }
                } else {
                    c(imageView);
                }
            }
        }

        public final void c(View view) {
            boolean z10;
            com.google.android.material.badge.a aVar = this.f6908e;
            if (aVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && view == this.f6907d) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.i(view, (FrameLayout) null);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            if (r0 != false) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d() {
            /*
                r5 = this;
                r5.f()
                com.google.android.material.tabs.TabLayout$g r0 = r5.f6904a
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0026
                com.google.android.material.tabs.TabLayout r3 = r0.f6931g
                if (r3 == 0) goto L_0x001e
                int r3 = r3.getSelectedTabPosition()
                r4 = -1
                if (r3 == r4) goto L_0x001a
                int r0 = r0.f6928d
                if (r3 != r0) goto L_0x001a
                r0 = r1
                goto L_0x001b
            L_0x001a:
                r0 = r2
            L_0x001b:
                if (r0 == 0) goto L_0x0026
                goto L_0x0027
            L_0x001e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
            L_0x0026:
                r1 = r2
            L_0x0027:
                r5.setSelected(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.d():void");
        }

        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f6912p;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.f6912p.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.A
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = h.a.a(r6, r0)
                r5.f6912p = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.f6912p
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.f6912p = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.f6897u
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f6897u
                android.content.res.ColorStateList r2 = j8.a.a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.O
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                java.util.WeakHashMap<android.view.View, w1.q0> r0 = w1.d0.f16298a
                w1.d0.d.q(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.e(android.content.Context):void");
        }

        public final void f() {
            View view;
            int i10;
            ViewParent parent;
            g gVar = this.f6904a;
            if (gVar != null) {
                view = gVar.f6929e;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f6909f;
                    if (!(view2 == null || (parent = view2.getParent()) == null)) {
                        ((ViewGroup) parent).removeView(this.f6909f);
                    }
                    addView(view);
                }
                this.f6909f = view;
                TextView textView = this.f6905b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f6906c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f6906c.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f6910n = textView2;
                if (textView2 != null) {
                    this.f6913q = k.a.b(textView2);
                }
                this.f6911o = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.f6909f;
                if (view3 != null) {
                    removeView(view3);
                    this.f6909f = null;
                }
                this.f6910n = null;
                this.f6911o = null;
            }
            if (this.f6909f == null) {
                if (this.f6906c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R$layout.design_layout_tab_icon, this, false);
                    this.f6906c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f6905b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R$layout.design_layout_tab_text, this, false);
                    this.f6905b = textView3;
                    addView(textView3);
                    this.f6913q = k.a.b(this.f6905b);
                }
                this.f6905b.setTextAppearance(TabLayout.this.f6892p);
                if (!isSelected() || (i10 = TabLayout.this.f6894r) == -1) {
                    this.f6905b.setTextAppearance(TabLayout.this.f6893q);
                } else {
                    this.f6905b.setTextAppearance(i10);
                }
                ColorStateList colorStateList = TabLayout.this.f6895s;
                if (colorStateList != null) {
                    this.f6905b.setTextColor(colorStateList);
                }
                g(this.f6905b, this.f6906c, true);
                b();
                ImageView imageView3 = this.f6906c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new b(this, imageView3));
                }
                TextView textView4 = this.f6905b;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new b(this, textView4));
                }
            } else {
                TextView textView5 = this.f6910n;
                if (!(textView5 == null && this.f6911o == null)) {
                    g(textView5, this.f6911o, false);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f6927c)) {
                setContentDescription(gVar.f6927c);
            }
        }

        public final void g(TextView textView, ImageView imageView, boolean z10) {
            Drawable drawable;
            CharSequence charSequence;
            int i10;
            CharSequence charSequence2;
            int i11;
            Drawable drawable2;
            g gVar = this.f6904a;
            CharSequence charSequence3 = null;
            if (gVar == null || (drawable2 = gVar.f6925a) == null) {
                drawable = null;
            } else {
                drawable = drawable2.mutate();
            }
            if (drawable != null) {
                a.b.h(drawable, TabLayout.this.f6896t);
                PorterDuff.Mode mode = TabLayout.this.f6900x;
                if (mode != null) {
                    a.b.i(drawable, mode);
                }
            }
            g gVar2 = this.f6904a;
            if (gVar2 != null) {
                charSequence = gVar2.f6926b;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z11 = true;
            boolean z12 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!z12 || this.f6904a.f6930f != 1) {
                    z11 = false;
                }
                if (z12) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                if (z12) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (!z11 || imageView.getVisibility() != 0) {
                    i10 = 0;
                } else {
                    i10 = (int) x.c(getContext(), 8);
                }
                if (TabLayout.this.K) {
                    if (i10 != w1.g.b(marginLayoutParams)) {
                        w1.g.g(marginLayoutParams, i10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i10;
                    w1.g.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f6904a;
            if (gVar3 != null) {
                charSequence3 = gVar3.f6927c;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z12) {
                    charSequence = charSequence3;
                }
                androidx.appcompat.widget.q0.a(this, charSequence);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f6905b, this.f6906c, this.f6909f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    if (z10) {
                        i11 = Math.min(i11, view.getTop());
                    } else {
                        i11 = view.getTop();
                    }
                    if (z10) {
                        i10 = Math.max(i10, view.getBottom());
                    } else {
                        i10 = view.getBottom();
                    }
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f6905b, this.f6906c, this.f6909f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    if (z10) {
                        i11 = Math.min(i11, view.getLeft());
                    } else {
                        i11 = view.getLeft();
                    }
                    if (z10) {
                        i10 = Math.max(i10, view.getRight());
                    } else {
                        i10 = view.getRight();
                    }
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public g getTab() {
            return this.f6904a;
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.f6908e;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f6908e.c());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.g.a(0, 1, this.f6904a.f6928d, 1, false, isSelected()).f16881a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f16867g.f16876a);
            }
            f.b.c(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R$string.item_view_role_description));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) goto L_0x0095;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L_0x001e
                if (r1 == 0) goto L_0x0014
                if (r0 <= r2) goto L_0x001e
            L_0x0014:
                com.google.android.material.tabs.TabLayout r8 = com.google.android.material.tabs.TabLayout.this
                int r8 = r8.B
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L_0x001e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f6905b
                if (r0 == 0) goto L_0x00a5
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f6901y
                int r1 = r7.f6913q
                android.widget.ImageView r2 = r7.f6906c
                r3 = 1
                if (r2 == 0) goto L_0x0038
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L_0x0038
                r1 = r3
                goto L_0x0046
            L_0x0038:
                android.widget.TextView r2 = r7.f6905b
                if (r2 == 0) goto L_0x0046
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L_0x0046
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f6902z
            L_0x0046:
                android.widget.TextView r2 = r7.f6905b
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.f6905b
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.f6905b
                int r5 = androidx.core.widget.k.a.b(r5)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L_0x0060
                if (r5 < 0) goto L_0x00a5
                if (r1 == r5) goto L_0x00a5
            L_0x0060:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                int r5 = r5.J
                r6 = 0
                if (r5 != r3) goto L_0x0096
                if (r2 <= 0) goto L_0x0096
                if (r4 != r3) goto L_0x0096
                android.widget.TextView r2 = r7.f6905b
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L_0x0095
                float r4 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r4
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x0096
            L_0x0095:
                r3 = r6
            L_0x0096:
                if (r3 == 0) goto L_0x00a5
                android.widget.TextView r2 = r7.f6905b
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f6905b
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L_0x00a5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.onMeasure(int, int):void");
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f6904a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            g gVar = this.f6904a;
            TabLayout tabLayout = gVar.f6931g;
            if (tabLayout != null) {
                tabLayout.l(gVar, true);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f6905b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f6906c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f6909f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f6904a) {
                this.f6904a = gVar;
                d();
            }
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6916a;

        public b() {
        }

        public final void d(ViewPager viewPager, l3.a aVar, l3.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.V == viewPager) {
                tabLayout.m(aVar2, this.f6916a);
            }
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void a();

        void b(T t10);

        void c();
    }

    public interface d extends c<g> {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        public final void onChanged() {
            TabLayout.this.j();
        }

        public final void onInvalidated() {
            TabLayout.this.j();
        }
    }

    public class f extends LinearLayout {

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int f6919c = 0;

        /* renamed from: a  reason: collision with root package name */
        public ValueAnimator f6920a;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f6922a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f6923b;

            public a(View view, View view2) {
                this.f6922a = view;
                this.f6923b = view2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.c(this.f6922a, this.f6923b, valueAnimator.getAnimatedFraction());
            }
        }

        public f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f6887e0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                TabLayout tabLayout2 = TabLayout.this;
                a aVar = tabLayout2.P;
                Drawable drawable = tabLayout2.f6898v;
                aVar.getClass();
                RectF a10 = a.a(tabLayout2, childAt);
                drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
                TabLayout.this.f6878a = i10;
            }
        }

        public final void b(int i10) {
            Rect bounds = TabLayout.this.f6898v.getBounds();
            TabLayout.this.f6898v.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void c(View view, View view2, float f10) {
            boolean z10;
            if (view == null || view.getWidth() <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.P.b(tabLayout, view, view2, f10, tabLayout.f6898v);
            } else {
                Drawable drawable = TabLayout.this.f6898v;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f6898v.getBounds().bottom);
            }
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(this);
        }

        public final void d(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f6878a != i10) {
                View childAt = getChildAt(tabLayout.getSelectedTabPosition());
                View childAt2 = getChildAt(i10);
                if (childAt2 == null) {
                    a(TabLayout.this.getSelectedTabPosition());
                    return;
                }
                TabLayout.this.f6878a = i10;
                a aVar = new a(childAt, childAt2);
                if (z10) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.f6920a = valueAnimator;
                    valueAnimator.setInterpolator(TabLayout.this.Q);
                    valueAnimator.setDuration((long) i11);
                    valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                    valueAnimator.addUpdateListener(aVar);
                    valueAnimator.start();
                    return;
                }
                this.f6920a.removeAllUpdateListeners();
                this.f6920a.addUpdateListener(aVar);
            }
        }

        public final void draw(Canvas canvas) {
            int height = TabLayout.this.f6898v.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f6898v.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.I;
            int i11 = 0;
            if (i10 == 0) {
                i11 = getHeight() - height;
                height = getHeight();
            } else if (i10 == 1) {
                i11 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    height = 0;
                } else {
                    height = getHeight();
                }
            }
            if (TabLayout.this.f6898v.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f6898v.getBounds();
                TabLayout.this.f6898v.setBounds(bounds.left, i11, bounds.right, height);
                TabLayout.this.f6898v.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f6920a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                TabLayout tabLayout = TabLayout.this;
                if (tabLayout.f6878a == -1) {
                    tabLayout.f6878a = tabLayout.getSelectedTabPosition();
                }
                a(TabLayout.this.f6878a);
                return;
            }
            d(false, TabLayout.this.getSelectedTabPosition(), -1);
        }

        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z10 = true;
                if (tabLayout.G == 1 || tabLayout.J == 2) {
                    int childCount = getChildCount();
                    int i12 = 0;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = getChildAt(i13);
                        if (childAt.getVisibility() == 0) {
                            i12 = Math.max(i12, childAt.getMeasuredWidth());
                        }
                    }
                    if (i12 > 0) {
                        if (i12 * childCount <= getMeasuredWidth() - (((int) x.c(getContext(), 16)) * 2)) {
                            boolean z11 = false;
                            for (int i14 = 0; i14 < childCount; i14++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                                if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i12;
                                    layoutParams.weight = 0.0f;
                                    z11 = true;
                                }
                            }
                            z10 = z11;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.G = 0;
                            tabLayout2.p(false);
                        }
                        if (z10) {
                            super.onMeasure(i10, i11);
                        }
                    }
                }
            }
        }

        public final void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f6925a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f6926b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f6927c;

        /* renamed from: d  reason: collision with root package name */
        public int f6928d = -1;

        /* renamed from: e  reason: collision with root package name */
        public View f6929e;

        /* renamed from: f  reason: collision with root package name */
        public int f6930f = 1;

        /* renamed from: g  reason: collision with root package name */
        public TabLayout f6931g;

        /* renamed from: h  reason: collision with root package name */
        public TabView f6932h;

        /* renamed from: i  reason: collision with root package name */
        public int f6933i = -1;

        public final void a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f6927c) && !TextUtils.isEmpty(charSequence)) {
                this.f6932h.setContentDescription(charSequence);
            }
            this.f6926b = charSequence;
            TabView tabView = this.f6932h;
            if (tabView != null) {
                tabView.d();
            }
        }
    }

    public static class h implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f6934a;

        /* renamed from: b  reason: collision with root package name */
        public int f6935b;

        /* renamed from: c  reason: collision with root package name */
        public int f6936c;

        public h(TabLayout tabLayout) {
            this.f6934a = new WeakReference<>(tabLayout);
        }

        public final void a(float f10, int i10) {
            boolean z10;
            boolean z11;
            TabLayout tabLayout = this.f6934a.get();
            if (tabLayout != null) {
                int i11 = this.f6936c;
                if (i11 != 2 || this.f6935b == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i11 == 2 && this.f6935b == 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                tabLayout.n(i10, f10, z10, z11, false);
            }
        }

        public final void b(int i10) {
            this.f6935b = this.f6936c;
            this.f6936c = i10;
            TabLayout tabLayout = this.f6934a.get();
            if (tabLayout != null) {
                tabLayout.f6887e0 = this.f6936c;
            }
        }

        public final void c(int i10) {
            boolean z10;
            TabLayout tabLayout = this.f6934a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f6936c;
                if (i11 == 0 || (i11 == 2 && this.f6935b == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tabLayout.l(tabLayout.h(i10), z10);
            }
        }
    }

    public static class i implements d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f6937a;

        public i(ViewPager viewPager) {
            this.f6937a = viewPager;
        }

        public final void a() {
        }

        public final void b(g gVar) {
            this.f6937a.setCurrentItem(gVar.f6928d);
        }

        public final void c() {
        }
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public static ColorStateList f(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private int getDefaultHeight() {
        int size = this.f6880b.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                g gVar = this.f6880b.get(i10);
                if (gVar != null && gVar.f6925a != null && !TextUtils.isEmpty(gVar.f6926b)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        if (!z10 || this.K) {
            return 48;
        }
        return 72;
    }

    private int getTabMinWidth() {
        int i10 = this.C;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.J;
        if (i11 == 0 || i11 == 2) {
            return this.E;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f6884d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        boolean z10;
        boolean z11;
        int childCount = this.f6884d.getChildCount();
        if (i10 < childCount) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f6884d.getChildAt(i11);
                boolean z12 = true;
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    if (i11 == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    childAt.setSelected(z11);
                    if (i11 != i10) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                } else {
                    if (i11 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i11 != i10) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).f();
                    }
                }
            }
        }
    }

    public final void a(g gVar, boolean z10) {
        int size = this.f6880b.size();
        if (gVar.f6931g == this) {
            gVar.f6928d = size;
            this.f6880b.add(size, gVar);
            int size2 = this.f6880b.size();
            int i10 = -1;
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                if (this.f6880b.get(size).f6928d == this.f6878a) {
                    i10 = size;
                }
                this.f6880b.get(size).f6928d = size;
            }
            this.f6878a = i10;
            TabView tabView = gVar.f6932h;
            tabView.setSelected(false);
            tabView.setActivated(false);
            f fVar = this.f6884d;
            int i11 = gVar.f6928d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.J == 1 && this.G == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            fVar.addView(tabView, i11, layoutParams);
            if (z10) {
                TabLayout tabLayout = gVar.f6931g;
                if (tabLayout != null) {
                    tabLayout.l(gVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void addView(View view) {
        b(view);
    }

    public final void b(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            g i10 = i();
            CharSequence charSequence = tabItem.f6873a;
            if (charSequence != null) {
                i10.a(charSequence);
            }
            Drawable drawable = tabItem.f6874b;
            if (drawable != null) {
                i10.f6925a = drawable;
                TabLayout tabLayout = i10.f6931g;
                if (tabLayout.G == 1 || tabLayout.J == 2) {
                    tabLayout.p(true);
                }
                TabView tabView = i10.f6932h;
                if (tabView != null) {
                    tabView.d();
                }
            }
            int i11 = tabItem.f6875c;
            if (i11 != 0) {
                i10.f6929e = LayoutInflater.from(i10.f6932h.getContext()).inflate(i11, i10.f6932h, false);
                TabView tabView2 = i10.f6932h;
                if (tabView2 != null) {
                    tabView2.d();
                }
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                i10.f6927c = tabItem.getContentDescription();
                TabView tabView3 = i10.f6932h;
                if (tabView3 != null) {
                    tabView3.d();
                }
            }
            a(i10, this.f6880b.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void c(int i10) {
        boolean z10;
        if (i10 != -1) {
            if (getWindowToken() != null) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (d0.g.c(this)) {
                    f fVar = this.f6884d;
                    int childCount = fVar.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            z10 = false;
                            break;
                        } else if (fVar.getChildAt(i11).getWidth() <= 0) {
                            z10 = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (!z10) {
                        int scrollX = getScrollX();
                        int e10 = e(i10, 0.0f);
                        if (scrollX != e10) {
                            g();
                            this.U.setIntValues(new int[]{scrollX, e10});
                            this.U.start();
                        }
                        f fVar2 = this.f6884d;
                        int i12 = this.H;
                        ValueAnimator valueAnimator = fVar2.f6920a;
                        if (!(valueAnimator == null || !valueAnimator.isRunning() || TabLayout.this.f6878a == i10)) {
                            fVar2.f6920a.cancel();
                        }
                        fVar2.d(true, i10, i12);
                        return;
                    }
                }
            }
            setScrollPosition(i10, 0.0f, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 != 2) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r5 = this;
            int r0 = r5.J
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = r2
            goto L_0x0014
        L_0x000b:
            int r0 = r5.F
            int r3 = r5.f6886e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            com.google.android.material.tabs.TabLayout$f r3 = r5.f6884d
            java.util.WeakHashMap<android.view.View, w1.q0> r4 = w1.d0.f16298a
            w1.d0.e.k(r3, r0, r2, r2, r2)
            int r0 = r5.J
            r2 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r2) goto L_0x0025
            if (r0 == r1) goto L_0x0025
            goto L_0x0042
        L_0x0025:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f6884d
            r0.setGravity(r2)
            goto L_0x0042
        L_0x002b:
            int r0 = r5.G
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0034
            if (r0 == r1) goto L_0x003a
            goto L_0x0042
        L_0x0034:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f6884d
            r0.setGravity(r2)
            goto L_0x0042
        L_0x003a:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f6884d
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L_0x0042:
            r5.p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(int i10, float f10) {
        View childAt;
        View view;
        int i11 = this.J;
        int i12 = 0;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f6884d.getChildAt(i10)) == null) {
            return 0;
        }
        int i13 = i10 + 1;
        if (i13 < this.f6884d.getChildCount()) {
            view = this.f6884d.getChildAt(i13);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i12 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i14 = (int) (((float) (width + i12)) * 0.5f * f10);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.d(this) == 0) {
            return left + i14;
        }
        return left - i14;
    }

    public final void g() {
        if (this.U == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.U = valueAnimator;
            valueAnimator.setInterpolator(this.Q);
            this.U.setDuration((long) this.H);
            this.U.addUpdateListener(new a());
        }
    }

    public int getSelectedTabPosition() {
        g gVar = this.f6882c;
        if (gVar != null) {
            return gVar.f6928d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f6880b.size();
    }

    public int getTabGravity() {
        return this.G;
    }

    public ColorStateList getTabIconTint() {
        return this.f6896t;
    }

    public int getTabIndicatorAnimationMode() {
        return this.N;
    }

    public int getTabIndicatorGravity() {
        return this.I;
    }

    public int getTabMaxWidth() {
        return this.B;
    }

    public int getTabMode() {
        return this.J;
    }

    public ColorStateList getTabRippleColor() {
        return this.f6897u;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f6898v;
    }

    public ColorStateList getTabTextColors() {
        return this.f6895s;
    }

    public final g h(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f6880b.get(i10);
    }

    public final g i() {
        TabView tabView;
        g gVar = (g) f6877h0.b();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.f6931g = this;
        a1.e eVar = this.f6889f0;
        if (eVar != null) {
            tabView = (TabView) eVar.b();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(gVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f6927c)) {
            tabView.setContentDescription(gVar.f6926b);
        } else {
            tabView.setContentDescription(gVar.f6927c);
        }
        gVar.f6932h = tabView;
        int i10 = gVar.f6933i;
        if (i10 != -1) {
            tabView.setId(i10);
        }
        return gVar;
    }

    public final void j() {
        k();
        l3.a aVar = this.W;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void k() {
        for (int childCount = this.f6884d.getChildCount() - 1; childCount >= 0; childCount--) {
            TabView tabView = (TabView) this.f6884d.getChildAt(childCount);
            this.f6884d.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab((g) null);
                tabView.setSelected(false);
                this.f6889f0.a(tabView);
            }
            requestLayout();
        }
        Iterator<g> it = this.f6880b.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f6931g = null;
            next.f6932h = null;
            next.f6925a = null;
            next.f6933i = -1;
            next.f6926b = null;
            next.f6927c = null;
            next.f6928d = -1;
            next.f6929e = null;
            f6877h0.a(next);
        }
        this.f6882c = null;
    }

    public final void l(g gVar, boolean z10) {
        int i10;
        g gVar2 = this.f6882c;
        if (gVar2 != gVar) {
            if (gVar != null) {
                i10 = gVar.f6928d;
            } else {
                i10 = -1;
            }
            if (z10) {
                if ((gVar2 == null || gVar2.f6928d == -1) && i10 != -1) {
                    setScrollPosition(i10, 0.0f, true);
                } else {
                    c(i10);
                }
                if (i10 != -1) {
                    setSelectedTabView(i10);
                }
            }
            this.f6882c = gVar;
            if (!(gVar2 == null || gVar2.f6931g == null)) {
                for (int size = this.S.size() - 1; size >= 0; size--) {
                    this.S.get(size).c();
                }
            }
            if (gVar != null) {
                for (int size2 = this.S.size() - 1; size2 >= 0; size2--) {
                    this.S.get(size2).b(gVar);
                }
            }
        } else if (gVar2 != null) {
            for (int size3 = this.S.size() - 1; size3 >= 0; size3--) {
                this.S.get(size3).a();
            }
            c(gVar.f6928d);
        }
    }

    public final void m(l3.a aVar, boolean z10) {
        e eVar;
        l3.a aVar2 = this.W;
        if (!(aVar2 == null || (eVar = this.f6879a0) == null)) {
            aVar2.o(eVar);
        }
        this.W = aVar;
        if (z10 && aVar != null) {
            if (this.f6879a0 == null) {
                this.f6879a0 = new e();
            }
            aVar.i(this.f6879a0);
        }
        j();
    }

    public final void n(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f11 = ((float) i10) + f10;
        int round = Math.round(f11);
        if (round >= 0 && round < this.f6884d.getChildCount()) {
            if (z11) {
                f fVar = this.f6884d;
                TabLayout.this.f6878a = Math.round(f11);
                ValueAnimator valueAnimator = fVar.f6920a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.f6920a.cancel();
                }
                fVar.c(fVar.getChildAt(i10), fVar.getChildAt(i10 + 1), f10);
            }
            ValueAnimator valueAnimator2 = this.U;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.U.cancel();
            }
            int e10 = e(i10, f10);
            int scrollX = getScrollX();
            if ((i10 >= getSelectedTabPosition() || e10 < scrollX) && ((i10 <= getSelectedTabPosition() || e10 > scrollX) && i10 != getSelectedTabPosition())) {
                z13 = false;
            } else {
                z13 = true;
            }
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.e.d(this) == 1) {
                if ((i10 >= getSelectedTabPosition() || e10 > scrollX) && ((i10 <= getSelectedTabPosition() || e10 < scrollX) && i10 != getSelectedTabPosition())) {
                    z13 = false;
                } else {
                    z13 = true;
                }
            }
            if (z13 || this.f6887e0 == 1 || z12) {
                if (i10 < 0) {
                    e10 = 0;
                }
                scrollTo(e10, 0);
            }
            if (z10) {
                setSelectedTabView(round);
            }
        }
    }

    public final void o(ViewPager viewPager, boolean z10, boolean z11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.V;
        if (viewPager2 != null) {
            h hVar = this.f6881b0;
            if (!(hVar == null || (arrayList2 = viewPager2.T) == null)) {
                arrayList2.remove(hVar);
            }
            b bVar = this.f6883c0;
            if (!(bVar == null || (arrayList = this.V.W) == null)) {
                arrayList.remove(bVar);
            }
        }
        i iVar = this.T;
        if (iVar != null) {
            this.S.remove(iVar);
            this.T = null;
        }
        if (viewPager != null) {
            this.V = viewPager;
            if (this.f6881b0 == null) {
                this.f6881b0 = new h(this);
            }
            h hVar2 = this.f6881b0;
            hVar2.f6936c = 0;
            hVar2.f6935b = 0;
            if (viewPager.T == null) {
                viewPager.T = new ArrayList();
            }
            viewPager.T.add(hVar2);
            i iVar2 = new i(viewPager);
            this.T = iVar2;
            if (!this.S.contains(iVar2)) {
                this.S.add(iVar2);
            }
            l3.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m(adapter, z10);
            }
            if (this.f6883c0 == null) {
                this.f6883c0 = new b();
            }
            b bVar2 = this.f6883c0;
            bVar2.f6916a = z10;
            if (viewPager.W == null) {
                viewPager.W = new ArrayList();
            }
            viewPager.W.add(bVar2);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.V = null;
            m((l3.a) null, false);
        }
        this.f6885d0 = z11;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9.b.W(this);
        if (this.V == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                o((ViewPager) parent, true, true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6885d0) {
            setupWithViewPager((ViewPager) null);
            this.f6885d0 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = (com.google.android.material.tabs.TabLayout.TabView) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            com.google.android.material.tabs.TabLayout$f r1 = r7.f6884d
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0034
            com.google.android.material.tabs.TabLayout$f r1 = r7.f6884d
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r2 == 0) goto L_0x0031
            com.google.android.material.tabs.TabLayout$TabView r1 = (com.google.android.material.tabs.TabLayout.TabView) r1
            android.graphics.drawable.Drawable r2 = r1.f6912p
            if (r2 == 0) goto L_0x0031
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.f6912p
            r1.draw(r8)
        L_0x0031:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0034:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.C0220f.a(1, getTabCount(), 1).f16880a);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (getTabMode() == 0 || getTabMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.x.c(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.D
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.x.c(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.B = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.J
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = r5
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getActionMasked() == 8) {
            if (getTabMode() == 0 || getTabMode() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10) {
        for (int i10 = 0; i10 < this.f6884d.getChildCount(); i10++) {
            View childAt = this.f6884d.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.J == 1 && this.G == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        m9.b.U(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            for (int i10 = 0; i10 < this.f6884d.getChildCount(); i10++) {
                View childAt = this.f6884d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    TabView tabView = (TabView) childAt;
                    tabView.setOrientation(TabLayout.this.K ^ true ? 1 : 0);
                    TextView textView = tabView.f6910n;
                    if (textView == null && tabView.f6911o == null) {
                        tabView.g(tabView.f6905b, tabView.f6906c, true);
                    } else {
                        tabView.g(textView, tabView.f6911o, false);
                    }
                }
            }
            d();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.U.addListener(animatorListener);
    }

    public void setScrollPosition(int i10, float f10, boolean z10) {
        setScrollPosition(i10, f10, z10, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.f6898v = mutate;
        int i10 = this.f6899w;
        if (i10 != 0) {
            a.b.g(mutate, i10);
        } else {
            a.b.h(mutate, (ColorStateList) null);
        }
        int i11 = this.M;
        if (i11 == -1) {
            i11 = this.f6898v.getIntrinsicHeight();
        }
        this.f6884d.b(i11);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        boolean z10;
        this.f6899w = i10;
        Drawable drawable = this.f6898v;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a.b.g(drawable, i10);
        } else {
            a.b.h(drawable, (ColorStateList) null);
        }
        p(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.I != i10) {
            this.I = i10;
            f fVar = this.f6884d;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(fVar);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.M = i10;
        this.f6884d.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.G != i10) {
            this.G = i10;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f6896t != colorStateList) {
            this.f6896t = colorStateList;
            int size = this.f6880b.size();
            for (int i10 = 0; i10 < size; i10++) {
                TabView tabView = this.f6880b.get(i10).f6932h;
                if (tabView != null) {
                    tabView.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(k1.a.getColorStateList(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.N = i10;
        if (i10 == 0) {
            this.P = new a();
        } else if (i10 == 1) {
            this.P = new o8.a();
        } else if (i10 == 2) {
            this.P = new o8.b();
        } else {
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.L = z10;
        f fVar = this.f6884d;
        int i10 = f.f6919c;
        fVar.a(TabLayout.this.getSelectedTabPosition());
        f fVar2 = this.f6884d;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.k(fVar2);
    }

    public void setTabMode(int i10) {
        if (i10 != this.J) {
            this.J = i10;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f6897u != colorStateList) {
            this.f6897u = colorStateList;
            for (int i10 = 0; i10 < this.f6884d.getChildCount(); i10++) {
                View childAt = this.f6884d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    Context context = getContext();
                    int i11 = TabView.f6903s;
                    ((TabView) childAt).e(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(k1.a.getColorStateList(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f6895s != colorStateList) {
            this.f6895s = colorStateList;
            int size = this.f6880b.size();
            for (int i10 = 0; i10 < size; i10++) {
                TabView tabView = this.f6880b.get(i10).f6932h;
                if (tabView != null) {
                    tabView.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(l3.a aVar) {
        m(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            for (int i10 = 0; i10 < this.f6884d.getChildCount(); i10++) {
                View childAt = this.f6884d.getChildAt(i10);
                if (childAt instanceof TabView) {
                    Context context = getContext();
                    int i11 = TabView.f6903s;
                    ((TabView) childAt).e(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.tabStyle);
    }

    public final void addView(View view, int i10) {
        b(view);
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.R;
        if (cVar2 != null) {
            this.S.remove(cVar2);
        }
        this.R = cVar;
        if (cVar != null && !this.S.contains(cVar)) {
            this.S.add(cVar);
        }
    }

    public void setScrollPosition(int i10, float f10, boolean z10, boolean z11) {
        n(i10, f10, z10, z11, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z10) {
        o(viewPager, z10, false);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r4 = f6876g0
            android.content.Context r12 = p8.a.a(r12, r13, r14, r4)
            r11.<init>(r12, r13, r14)
            r12 = -1
            r11.f6878a = r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f6880b = r0
            r11.f6894r = r12
            r6 = 0
            r11.f6899w = r6
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.B = r0
            r11.M = r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.S = r0
            a1.e r0 = new a1.e
            r1 = 12
            r7 = 1
            r0.<init>(r1, r7)
            r11.f6889f0 = r0
            android.content.Context r8 = r11.getContext()
            r11.setHorizontalScrollBarEnabled(r6)
            com.google.android.material.tabs.TabLayout$f r9 = new com.google.android.material.tabs.TabLayout$f
            r9.<init>(r8)
            r11.f6884d = r9
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r12)
            super.addView(r9, r6, r0)
            int[] r2 = com.google.android.material.R$styleable.TabLayout
            int[] r5 = new int[r7]
            int r10 = com.google.android.material.R$styleable.TabLayout_tabTextAppearance
            r5[r6] = r10
            r0 = r8
            r1 = r13
            r3 = r14
            android.content.res.TypedArray r13 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.content.res.ColorStateList r14 = b8.b.d(r14)
            if (r14 == 0) goto L_0x0077
            l8.h r0 = new l8.h
            r0.<init>()
            r0.n(r14)
            r0.k(r8)
            java.util.WeakHashMap<android.view.View, w1.q0> r14 = w1.d0.f16298a
            float r14 = w1.d0.i.i(r11)
            r0.m(r14)
            w1.d0.d.q(r11, r0)
        L_0x0077:
            int r14 = com.google.android.material.R$styleable.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r14 = i8.c.d(r8, r13, r14)
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r14)
            int r14 = com.google.android.material.R$styleable.TabLayout_tabIndicatorColor
            int r14 = r13.getColor(r14, r6)
            r11.setSelectedTabIndicatorColor(r14)
            int r14 = com.google.android.material.R$styleable.TabLayout_tabIndicatorHeight
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r9.b(r14)
            int r14 = com.google.android.material.R$styleable.TabLayout_tabIndicatorGravity
            int r14 = r13.getInt(r14, r6)
            r11.setSelectedTabIndicatorGravity(r14)
            int r14 = com.google.android.material.R$styleable.TabLayout_tabIndicatorAnimationMode
            int r14 = r13.getInt(r14, r6)
            r11.setTabIndicatorAnimationMode(r14)
            int r14 = com.google.android.material.R$styleable.TabLayout_tabIndicatorFullWidth
            boolean r14 = r13.getBoolean(r14, r7)
            r11.setTabIndicatorFullWidth(r14)
            int r14 = com.google.android.material.R$styleable.TabLayout_tabPadding
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r11.f6891o = r14
            r11.f6890n = r14
            r11.f6888f = r14
            r11.f6886e = r14
            int r0 = com.google.android.material.R$styleable.TabLayout_tabPaddingStart
            int r14 = r13.getDimensionPixelSize(r0, r14)
            r11.f6886e = r14
            int r14 = com.google.android.material.R$styleable.TabLayout_tabPaddingTop
            int r0 = r11.f6888f
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f6888f = r14
            int r14 = com.google.android.material.R$styleable.TabLayout_tabPaddingEnd
            int r0 = r11.f6890n
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f6890n = r14
            int r14 = com.google.android.material.R$styleable.TabLayout_tabPaddingBottom
            int r0 = r11.f6891o
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f6891o = r14
            int r14 = com.google.android.material.R$attr.isMaterial3Theme
            boolean r14 = i8.b.b(r8, r14, r6)
            if (r14 == 0) goto L_0x00ee
            int r14 = com.google.android.material.R$attr.textAppearanceTitleSmall
            r11.f6892p = r14
            goto L_0x00f2
        L_0x00ee:
            int r14 = com.google.android.material.R$attr.textAppearanceButton
            r11.f6892p = r14
        L_0x00f2:
            int r14 = com.google.android.material.R$style.TextAppearance_Design_Tab
            int r14 = r13.getResourceId(r10, r14)
            r11.f6893q = r14
            int[] r0 = androidx.appcompat.R$styleable.TextAppearance
            android.content.res.TypedArray r1 = r8.obtainStyledAttributes(r14, r0)
            int r2 = androidx.appcompat.R$styleable.TextAppearance_android_textSize     // Catch:{ all -> 0x020d }
            int r3 = r1.getDimensionPixelSize(r2, r6)     // Catch:{ all -> 0x020d }
            float r3 = (float) r3     // Catch:{ all -> 0x020d }
            r11.f6901y = r3     // Catch:{ all -> 0x020d }
            int r3 = androidx.appcompat.R$styleable.TextAppearance_android_textColor     // Catch:{ all -> 0x020d }
            android.content.res.ColorStateList r4 = i8.c.a(r8, r1, r3)     // Catch:{ all -> 0x020d }
            r11.f6895s = r4     // Catch:{ all -> 0x020d }
            r1.recycle()
            int r1 = com.google.android.material.R$styleable.TabLayout_tabSelectedTextAppearance
            boolean r4 = r13.hasValue(r1)
            if (r4 == 0) goto L_0x0122
            int r14 = r13.getResourceId(r1, r14)
            r11.f6894r = r14
        L_0x0122:
            int r14 = r11.f6894r
            if (r14 == r12) goto L_0x015a
            android.content.res.TypedArray r14 = r8.obtainStyledAttributes(r14, r0)
            float r0 = r11.f6901y     // Catch:{ all -> 0x0155 }
            int r0 = (int) r0     // Catch:{ all -> 0x0155 }
            r14.getDimensionPixelSize(r2, r0)     // Catch:{ all -> 0x0155 }
            android.content.res.ColorStateList r0 = i8.c.a(r8, r14, r3)     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x0151
            android.content.res.ColorStateList r1 = r11.f6895s     // Catch:{ all -> 0x0155 }
            int r1 = r1.getDefaultColor()     // Catch:{ all -> 0x0155 }
            int[] r2 = new int[r7]     // Catch:{ all -> 0x0155 }
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            r2[r6] = r3     // Catch:{ all -> 0x0155 }
            int r3 = r0.getDefaultColor()     // Catch:{ all -> 0x0155 }
            int r0 = r0.getColorForState(r2, r3)     // Catch:{ all -> 0x0155 }
            android.content.res.ColorStateList r0 = f(r1, r0)     // Catch:{ all -> 0x0155 }
            r11.f6895s = r0     // Catch:{ all -> 0x0155 }
        L_0x0151:
            r14.recycle()
            goto L_0x015a
        L_0x0155:
            r12 = move-exception
            r14.recycle()
            throw r12
        L_0x015a:
            int r14 = com.google.android.material.R$styleable.TabLayout_tabTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x0168
            android.content.res.ColorStateList r14 = i8.c.a(r8, r13, r14)
            r11.f6895s = r14
        L_0x0168:
            int r14 = com.google.android.material.R$styleable.TabLayout_tabSelectedTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x0180
            int r14 = r13.getColor(r14, r6)
            android.content.res.ColorStateList r0 = r11.f6895s
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r14 = f(r0, r14)
            r11.f6895s = r14
        L_0x0180:
            int r14 = com.google.android.material.R$styleable.TabLayout_tabIconTint
            android.content.res.ColorStateList r14 = i8.c.a(r8, r13, r14)
            r11.f6896t = r14
            int r14 = com.google.android.material.R$styleable.TabLayout_tabIconTintMode
            int r14 = r13.getInt(r14, r12)
            r0 = 0
            android.graphics.PorterDuff$Mode r14 = com.google.android.material.internal.x.h(r14, r0)
            r11.f6900x = r14
            int r14 = com.google.android.material.R$styleable.TabLayout_tabRippleColor
            android.content.res.ColorStateList r14 = i8.c.a(r8, r13, r14)
            r11.f6897u = r14
            int r14 = com.google.android.material.R$styleable.TabLayout_tabIndicatorAnimationDuration
            r0 = 300(0x12c, float:4.2E-43)
            int r14 = r13.getInt(r14, r0)
            r11.H = r14
            int r14 = com.google.android.material.R$attr.motionEasingEmphasizedInterpolator
            q2.b r0 = t7.b.f14886b
            android.animation.TimeInterpolator r14 = f8.j.d(r8, r14, r0)
            r11.Q = r14
            int r14 = com.google.android.material.R$styleable.TabLayout_tabMinWidth
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.C = r14
            int r14 = com.google.android.material.R$styleable.TabLayout_tabMaxWidth
            int r12 = r13.getDimensionPixelSize(r14, r12)
            r11.D = r12
            int r12 = com.google.android.material.R$styleable.TabLayout_tabBackground
            int r12 = r13.getResourceId(r12, r6)
            r11.A = r12
            int r12 = com.google.android.material.R$styleable.TabLayout_tabContentStart
            int r12 = r13.getDimensionPixelSize(r12, r6)
            r11.F = r12
            int r12 = com.google.android.material.R$styleable.TabLayout_tabMode
            int r12 = r13.getInt(r12, r7)
            r11.J = r12
            int r12 = com.google.android.material.R$styleable.TabLayout_tabGravity
            int r12 = r13.getInt(r12, r6)
            r11.G = r12
            int r12 = com.google.android.material.R$styleable.TabLayout_tabInlineLabel
            boolean r12 = r13.getBoolean(r12, r6)
            r11.K = r12
            int r12 = com.google.android.material.R$styleable.TabLayout_tabUnboundedRipple
            boolean r12 = r13.getBoolean(r12, r6)
            r11.O = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = com.google.android.material.R$dimen.design_tab_text_size_2line
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.f6902z = r13
            int r13 = com.google.android.material.R$dimen.design_tab_scrollable_min_width
            int r12 = r12.getDimensionPixelSize(r13)
            r11.E = r12
            r11.d()
            return
        L_0x020d:
            r12 = move-exception
            r1.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public void setTabTextColors(int i10, int i11) {
        setTabTextColors(f(i10, i11));
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(h.a.a(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
