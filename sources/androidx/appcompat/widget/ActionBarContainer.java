package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f703a;

    /* renamed from: b  reason: collision with root package name */
    public ScrollingTabContainerView f704b;

    /* renamed from: c  reason: collision with root package name */
    public View f705c;

    /* renamed from: d  reason: collision with root package name */
    public View f706d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f707e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f708f;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f709n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f710o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f711p;

    /* renamed from: q  reason: collision with root package name */
    public int f712q;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f707e;
        if (drawable != null && drawable.isStateful()) {
            this.f707e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f708f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f708f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f709n;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f709n.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f704b;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f707e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f708f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f709n;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f705c = findViewById(R$id.action_bar);
        this.f706d = findViewById(R$id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f703a || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            androidx.appcompat.widget.ScrollingTabContainerView r5 = r4.f704b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f710o
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.f709n
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.f707e
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.f705c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.f707e
            android.view.View r7 = r4.f705c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f705c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f705c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f705c
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.f706d
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.f707e
            android.view.View r7 = r4.f706d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f706d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f706d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f706d
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.f707e
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.f711p = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f708f
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        if (this.f705c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i13 = this.f712q) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f705c != null) {
            int mode = View.MeasureSpec.getMode(i11);
            ScrollingTabContainerView scrollingTabContainerView = this.f704b;
            if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8 && mode != 1073741824) {
                View view = this.f705c;
                boolean z11 = true;
                int i14 = 0;
                if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i14 = a(this.f705c);
                } else {
                    View view2 = this.f706d;
                    if (!(view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0)) {
                        z11 = false;
                    }
                    if (!z11) {
                        i14 = a(this.f706d);
                    }
                }
                if (mode == Integer.MIN_VALUE) {
                    i12 = View.MeasureSpec.getSize(i11);
                } else {
                    i12 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f704b) + i14, i12));
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f707e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f707e);
        }
        this.f707e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f705c;
            if (view != null) {
                this.f707e.setBounds(view.getLeft(), this.f705c.getTop(), this.f705c.getRight(), this.f705c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f710o ? !(this.f707e == null && this.f708f == null) : this.f709n != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f709n;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f709n);
        }
        this.f709n = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f710o && (drawable2 = this.f709n) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f710o ? this.f707e == null && this.f708f == null : this.f709n == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f708f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f708f);
        }
        this.f708f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f711p && (drawable2 = this.f708f) != null) {
                drawable2.setBounds(this.f704b.getLeft(), this.f704b.getTop(), this.f704b.getRight(), this.f704b.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f710o ? !(this.f707e == null && this.f708f == null) : this.f709n != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f704b;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f704b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        int i10;
        this.f703a = z10;
        if (z10) {
            i10 = 393216;
        } else {
            i10 = 262144;
        }
        setDescendantFocusability(i10);
    }

    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f707e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f708f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f709n;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.f707e || this.f710o) && ((drawable != this.f708f || !this.f711p) && ((drawable != this.f709n || !this.f710o) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBar);
        this.f707e = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_background);
        this.f708f = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundStacked);
        this.f712q = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_height, -1);
        boolean z10 = true;
        if (getId() == R$id.split_action_bar) {
            this.f710o = true;
            this.f709n = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f710o ? !(this.f707e == null && this.f708f == null) : this.f709n != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }
}
