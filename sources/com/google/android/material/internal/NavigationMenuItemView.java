package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.k;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import java.util.WeakHashMap;
import m1.e;
import o1.a;
import w1.d0;
import w1.q0;
import x1.f;

public class NavigationMenuItemView extends ForegroundLinearLayout implements k.a {
    public static final int[] N = {16842912};
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final CheckedTextView G;
    public FrameLayout H;
    public h I;
    public ColorStateList J;
    public boolean K;
    public Drawable L;
    public final a M;

    public class a extends w1.a {
        public a() {
        }

        public final void d(View view, f fVar) {
            this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            fVar.f16862a.setCheckable(NavigationMenuItemView.this.E);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.H == null) {
                this.H = (FrameLayout) ((ViewStub) findViewById(R$id.design_menu_item_action_area_stub)).inflate();
            }
            this.H.removeAllViews();
            this.H.addView(view);
        }
    }

    public final void c(h hVar) {
        int i10;
        StateListDrawable stateListDrawable;
        this.I = hVar;
        int i11 = hVar.f642a;
        if (i11 > 0) {
            setId(i11);
        }
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        boolean z10 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R$attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(N, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.q(this, stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f646e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f658q);
        androidx.appcompat.widget.q0.a(this, hVar.f659r);
        h hVar2 = this.I;
        if (!(hVar2.f646e == null && hVar2.getIcon() == null && this.I.getActionView() != null)) {
            z10 = false;
        }
        if (z10) {
            this.G.setVisibility(8);
            FrameLayout frameLayout = this.H;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.H.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.G.setVisibility(0);
        FrameLayout frameLayout2 = this.H;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.H.setLayoutParams(layoutParams2);
        }
    }

    public h getItemData() {
        return this.I;
    }

    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        h hVar = this.I;
        if (hVar != null && hVar.isCheckable() && this.I.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, N);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.E != z10) {
            this.E = z10;
            this.M.h(this.G, 2048);
        }
    }

    public void setChecked(boolean z10) {
        int i10;
        refreshDrawableState();
        this.G.setChecked(z10);
        CheckedTextView checkedTextView = this.G;
        Typeface typeface = checkedTextView.getTypeface();
        if (!z10 || !this.F) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        checkedTextView.setTypeface(typeface, i10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.K) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.b.h(drawable, this.J);
            }
            int i10 = this.C;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.D) {
            if (this.L == null) {
                Resources resources = getResources();
                int i11 = R$drawable.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = e.f13062a;
                Drawable a10 = e.a.a(resources, i11, theme);
                this.L = a10;
                if (a10 != null) {
                    int i12 = this.C;
                    a10.setBounds(0, 0, i12, i12);
                }
            }
            drawable = this.L;
        }
        k.b.e(this.G, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i10) {
        this.G.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.C = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.J = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = z10;
        h hVar = this.I;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.G.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.D = z10;
    }

    public void setShortcut(boolean z10, char c10) {
    }

    public void setTextAppearance(int i10) {
        this.G.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.G.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.G.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.F = true;
        a aVar = new a();
        this.M = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R$dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R$id.design_menu_item_text);
        this.G = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        d0.o(checkedTextView, aVar);
    }
}
