package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class ActionBarContextView extends a {
    public int A;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f713p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f714q;

    /* renamed from: r  reason: collision with root package name */
    public View f715r;

    /* renamed from: s  reason: collision with root package name */
    public View f716s;

    /* renamed from: t  reason: collision with root package name */
    public View f717t;

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f718u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f719v;

    /* renamed from: w  reason: collision with root package name */
    public TextView f720w;

    /* renamed from: x  reason: collision with root package name */
    public int f721x;

    /* renamed from: y  reason: collision with root package name */
    public int f722y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f723z;

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l.a f724a;

        public a(l.a aVar) {
            this.f724a = aVar;
        }

        public final void onClick(View view) {
            this.f724a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void f(l.a aVar) {
        View view = this.f715r;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.A, this, false);
            this.f715r = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f715r);
        }
        View findViewById = this.f715r.findViewById(R$id.action_mode_close_button);
        this.f716s = findViewById;
        findViewById.setOnClickListener(new a(aVar));
        f e10 = aVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f1046d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar2 = actionMenuPresenter.B;
            if (aVar2 != null && aVar2.b()) {
                aVar2.f678j.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1046d = actionMenuPresenter2;
        actionMenuPresenter2.f750t = true;
        actionMenuPresenter2.f751u = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e10.b(this.f1046d, this.f1044b);
        ActionMenuPresenter actionMenuPresenter3 = this.f1046d;
        k kVar = actionMenuPresenter3.f569o;
        if (kVar == null) {
            k kVar2 = (k) actionMenuPresenter3.f565d.inflate(actionMenuPresenter3.f567f, this, false);
            actionMenuPresenter3.f569o = kVar2;
            kVar2.b(actionMenuPresenter3.f564c);
            actionMenuPresenter3.d(true);
        }
        k kVar3 = actionMenuPresenter3.f569o;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.f1045c = actionMenuView;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.q(actionMenuView, (Drawable) null);
        addView(this.f1045c, layoutParams);
    }

    public final void g() {
        int i10;
        if (this.f718u == null) {
            LayoutInflater.from(getContext()).inflate(R$layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f718u = linearLayout;
            this.f719v = (TextView) linearLayout.findViewById(R$id.action_bar_title);
            this.f720w = (TextView) this.f718u.findViewById(R$id.action_bar_subtitle);
            if (this.f721x != 0) {
                this.f719v.setTextAppearance(getContext(), this.f721x);
            }
            if (this.f722y != 0) {
                this.f720w.setTextAppearance(getContext(), this.f722y);
            }
        }
        this.f719v.setText(this.f713p);
        this.f720w.setText(this.f714q);
        boolean z10 = !TextUtils.isEmpty(this.f713p);
        boolean z11 = !TextUtils.isEmpty(this.f714q);
        TextView textView = this.f720w;
        int i11 = 0;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        LinearLayout linearLayout2 = this.f718u;
        if (!z10 && !z11) {
            i11 = 8;
        }
        linearLayout2.setVisibility(i11);
        if (this.f718u.getParent() == null) {
            addView(this.f718u);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f714q;
    }

    public CharSequence getTitle() {
        return this.f713p;
    }

    public final void h() {
        removeAllViews();
        this.f717t = null;
        this.f1045c = null;
        this.f1046d = null;
        View view = this.f716s;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1046d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar = this.f1046d.B;
            if (aVar != null && aVar.b()) {
                aVar.f678j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean a10 = u0.a(this);
        if (a10) {
            i14 = (i12 - i10) - getPaddingRight();
        } else {
            i14 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f715r;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f715r.getLayoutParams();
            if (a10) {
                i16 = marginLayoutParams.rightMargin;
            } else {
                i16 = marginLayoutParams.leftMargin;
            }
            if (a10) {
                i17 = marginLayoutParams.leftMargin;
            } else {
                i17 = marginLayoutParams.rightMargin;
            }
            if (a10) {
                i18 = i14 - i16;
            } else {
                i18 = i14 + i16;
            }
            int d10 = a.d(i18, paddingTop, paddingTop2, this.f715r, a10) + i18;
            if (a10) {
                i19 = d10 - i17;
            } else {
                i19 = d10 + i17;
            }
            i14 = i19;
        }
        LinearLayout linearLayout = this.f718u;
        if (!(linearLayout == null || this.f717t != null || linearLayout.getVisibility() == 8)) {
            i14 += a.d(i14, paddingTop, paddingTop2, this.f718u, a10);
        }
        View view2 = this.f717t;
        if (view2 != null) {
            a.d(i14, paddingTop, paddingTop2, view2, a10);
        }
        if (a10) {
            i15 = getPaddingLeft();
        } else {
            i15 = (i12 - i10) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f1045c;
        if (actionMenuView != null) {
            a.d(i15, paddingTop, paddingTop2, actionMenuView, !a10);
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i15 = this.f1047e;
            if (i15 <= 0) {
                i15 = View.MeasureSpec.getSize(i11);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i16 = i15 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
            View view = this.f715r;
            if (view != null) {
                int c10 = a.c(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f715r.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1045c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = a.c(this.f1045c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f718u;
            if (linearLayout != null && this.f717t == null) {
                if (this.f723z) {
                    this.f718u.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f718u.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f718u;
                    if (z10) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    linearLayout2.setVisibility(i13);
                } else {
                    paddingLeft = a.c(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f717t;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i17 = layoutParams.width;
                if (i17 != -2) {
                    i12 = 1073741824;
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    paddingLeft = Math.min(i17, paddingLeft);
                }
                int i18 = layoutParams.height;
                if (i18 == -2) {
                    i14 = Integer.MIN_VALUE;
                }
                if (i18 >= 0) {
                    i16 = Math.min(i18, i16);
                }
                this.f717t.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i16, i14));
            }
            if (this.f1047e <= 0) {
                int childCount = getChildCount();
                int i19 = 0;
                for (int i20 = 0; i20 < childCount; i20++) {
                    int measuredHeight = getChildAt(i20).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i19) {
                        i19 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i19);
                return;
            }
            setMeasuredDimension(size, i15);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i10) {
        this.f1047e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f717t;
        if (view2 != null) {
            removeView(view2);
        }
        this.f717t = view;
        if (!(view == null || (linearLayout = this.f718u) == null)) {
            removeView(linearLayout);
            this.f718u = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f714q = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f713p = charSequence;
        g();
        d0.p(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f723z) {
            requestLayout();
        }
        this.f723z = z10;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionMode, i10, 0);
        int i11 = R$styleable.ActionMode_background;
        if (!obtainStyledAttributes.hasValue(i11) || (resourceId = obtainStyledAttributes.getResourceId(i11, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i11);
        } else {
            drawable = h.a.a(context, resourceId);
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.q(this, drawable);
        this.f721x = obtainStyledAttributes.getResourceId(R$styleable.ActionMode_titleTextStyle, 0);
        this.f722y = obtainStyledAttributes.getResourceId(R$styleable.ActionMode_subtitleTextStyle, 0);
        this.f1047e = obtainStyledAttributes.getLayoutDimension(R$styleable.ActionMode_height, 0);
        this.A = obtainStyledAttributes.getResourceId(R$styleable.ActionMode_closeItemLayout, R$layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }
}
