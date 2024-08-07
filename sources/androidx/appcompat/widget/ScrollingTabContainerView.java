package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$bool;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public g0 f920a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayoutCompat f921b;

    /* renamed from: c  reason: collision with root package name */
    public AppCompatSpinner f922c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f923d;

    /* renamed from: e  reason: collision with root package name */
    public int f924e;

    /* renamed from: f  reason: collision with root package name */
    public int f925f;

    /* renamed from: n  reason: collision with root package name */
    public int f926n;

    /* renamed from: o  reason: collision with root package name */
    public int f927o;

    public class a extends BaseAdapter {
        public a() {
        }

        public final int getCount() {
            return ScrollingTabContainerView.this.f921b.getChildCount();
        }

        public final Object getItem(int i10) {
            return ((b) ScrollingTabContainerView.this.f921b.getChildAt(i10)).f929a;
        }

        public final long getItemId(int i10) {
            return (long) i10;
        }

        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                scrollingTabContainerView.getClass();
                b bVar = new b(scrollingTabContainerView.getContext(), (ActionBar.b) getItem(i10));
                bVar.setBackgroundDrawable((Drawable) null);
                bVar.setLayoutParams(new AbsListView.LayoutParams(-1, scrollingTabContainerView.f926n));
                return bVar;
            }
            b bVar2 = (b) view;
            bVar2.f929a = (ActionBar.b) getItem(i10);
            bVar2.a();
            return view;
        }
    }

    public class b extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public ActionBar.b f929a;

        /* renamed from: b  reason: collision with root package name */
        public AppCompatTextView f930b;

        /* renamed from: c  reason: collision with root package name */
        public AppCompatImageView f931c;

        /* renamed from: d  reason: collision with root package name */
        public View f932d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(android.content.Context r6, androidx.appcompat.app.ActionBar.b r7) {
            /*
                r4 = this;
                androidx.appcompat.widget.ScrollingTabContainerView.this = r5
                int r5 = androidx.appcompat.R$attr.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 0
                r3 = 16842964(0x10100d4, float:2.3694152E-38)
                r1[r2] = r3
                r4.f929a = r7
                android.content.res.TypedArray r5 = r6.obtainStyledAttributes(r0, r1, r5, r2)
                boolean r7 = r5.hasValue(r2)
                if (r7 == 0) goto L_0x0035
                boolean r7 = r5.hasValue(r2)
                if (r7 == 0) goto L_0x002e
                int r7 = r5.getResourceId(r2, r2)
                if (r7 == 0) goto L_0x002e
                android.graphics.drawable.Drawable r6 = h.a.a(r6, r7)
                goto L_0x0032
            L_0x002e:
                android.graphics.drawable.Drawable r6 = r5.getDrawable(r2)
            L_0x0032:
                r4.setBackgroundDrawable(r6)
            L_0x0035:
                r5.recycle()
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
                r4.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ScrollingTabContainerView.b.<init>(androidx.appcompat.widget.ScrollingTabContainerView, android.content.Context, androidx.appcompat.app.ActionBar$b):void");
        }

        public final void a() {
            ActionBar.b bVar = this.f929a;
            View b10 = bVar.b();
            CharSequence charSequence = null;
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f932d = b10;
                AppCompatTextView appCompatTextView = this.f930b;
                if (appCompatTextView != null) {
                    appCompatTextView.setVisibility(8);
                }
                AppCompatImageView appCompatImageView = this.f931c;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                    this.f931c.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f932d;
            if (view != null) {
                removeView(view);
                this.f932d = null;
            }
            Drawable c10 = bVar.c();
            CharSequence d10 = bVar.d();
            if (c10 != null) {
                if (this.f931c == null) {
                    AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView2.setLayoutParams(layoutParams);
                    addView(appCompatImageView2, 0);
                    this.f931c = appCompatImageView2;
                }
                this.f931c.setImageDrawable(c10);
                this.f931c.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView3 = this.f931c;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(8);
                    this.f931c.setImageDrawable((Drawable) null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(d10);
            if (z10) {
                if (this.f930b == null) {
                    AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), (AttributeSet) null, R$attr.actionBarTabTextStyle);
                    appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView2.setLayoutParams(layoutParams2);
                    addView(appCompatTextView2);
                    this.f930b = appCompatTextView2;
                }
                this.f930b.setText(d10);
                this.f930b.setVisibility(0);
            } else {
                AppCompatTextView appCompatTextView3 = this.f930b;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setVisibility(8);
                    this.f930b.setText((CharSequence) null);
                }
            }
            AppCompatImageView appCompatImageView4 = this.f931c;
            if (appCompatImageView4 != null) {
                appCompatImageView4.setContentDescription(bVar.a());
            }
            if (!z10) {
                charSequence = bVar.a();
            }
            q0.a(this, charSequence);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (ScrollingTabContainerView.this.f924e > 0 && getMeasuredWidth() > (i12 = ScrollingTabContainerView.this.f924e)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        public final void setSelected(boolean z10) {
            boolean z11;
            if (isSelected() != z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f934a = false;

        public c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f934a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f934a) {
                ScrollingTabContainerView.this.getClass();
                ScrollingTabContainerView.this.setVisibility(0);
            }
        }

        public final void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f934a = false;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        new c();
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0);
        layoutDimension = !context.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs) ? Math.min(layoutDimension, context.getResources().getDimensionPixelSize(R$dimen.abc_action_bar_stacked_max_height)) : layoutDimension;
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f925f = context.getResources().getDimensionPixelSize(R$dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), (AttributeSet) null, R$attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        this.f921b = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void a() {
        boolean z10;
        AppCompatSpinner appCompatSpinner = this.f922c;
        if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            removeView(this.f922c);
            addView(this.f921b, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f922c.getSelectedItemPosition());
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g0 g0Var = this.f920a;
        if (g0Var != null) {
            post(g0Var);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R$dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f925f = context.getResources().getDimensionPixelSize(R$dimen.abc_action_bar_stacked_tab_max_width);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g0 g0Var = this.f920a;
        if (g0Var != null) {
            removeCallbacks(g0Var);
        }
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((b) view).f929a.e();
    }

    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z12 = false;
        if (mode == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        setFillViewport(z10);
        int childCount = this.f921b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f924e = -1;
        } else {
            if (childCount > 2) {
                this.f924e = (int) (((float) View.MeasureSpec.getSize(i10)) * 0.4f);
            } else {
                this.f924e = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f924e = Math.min(this.f924e, this.f925f);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f926n, 1073741824);
        if (z10 || !this.f923d) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            this.f921b.measure(0, makeMeasureSpec);
            if (this.f921b.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                AppCompatSpinner appCompatSpinner = this.f922c;
                if (appCompatSpinner != null && appCompatSpinner.getParent() == this) {
                    z12 = true;
                }
                if (!z12) {
                    if (this.f922c == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), (AttributeSet) null, R$attr.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.f922c = appCompatSpinner2;
                    }
                    removeView(this.f921b);
                    addView(this.f922c, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f922c.getAdapter() == null) {
                        this.f922c.setAdapter((SpinnerAdapter) new a());
                    }
                    g0 g0Var = this.f920a;
                    if (g0Var != null) {
                        removeCallbacks(g0Var);
                        this.f920a = null;
                    }
                    this.f922c.setSelection(this.f927o);
                }
            } else {
                a();
            }
        } else {
            a();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z10 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f927o);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f923d = z10;
    }

    public void setContentHeight(int i10) {
        this.f926n = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        boolean z10;
        this.f927o = i10;
        int childCount = this.f921b.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.f921b.getChildAt(i11);
            if (i11 == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            childAt.setSelected(z10);
            if (z10) {
                View childAt2 = this.f921b.getChildAt(i10);
                g0 g0Var = this.f920a;
                if (g0Var != null) {
                    removeCallbacks(g0Var);
                }
                g0 g0Var2 = new g0(this, childAt2);
                this.f920a = g0Var2;
                post(g0Var2);
            }
        }
        AppCompatSpinner appCompatSpinner = this.f922c;
        if (appCompatSpinner != null && i10 >= 0) {
            appCompatSpinner.setSelection(i10);
        }
    }
}
