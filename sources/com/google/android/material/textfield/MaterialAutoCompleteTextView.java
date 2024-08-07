package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.u;
import i8.c;
import java.util.Locale;
import java.util.WeakHashMap;
import l8.h;
import n1.d;
import o1.a;
import w1.d0;
import w1.q0;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: e  reason: collision with root package name */
    public final ListPopupWindow f6951e;

    /* renamed from: f  reason: collision with root package name */
    public final AccessibilityManager f6952f;

    /* renamed from: n  reason: collision with root package name */
    public final Rect f6953n;

    /* renamed from: o  reason: collision with root package name */
    public final int f6954o;

    /* renamed from: p  reason: collision with root package name */
    public final float f6955p;

    /* renamed from: q  reason: collision with root package name */
    public ColorStateList f6956q;

    /* renamed from: r  reason: collision with root package name */
    public int f6957r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f6958s;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            Object obj;
            int i11;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (i10 < 0) {
                ListPopupWindow listPopupWindow = materialAutoCompleteTextView.f6951e;
                if (!listPopupWindow.a()) {
                    obj = null;
                } else {
                    obj = listPopupWindow.f894c.getSelectedItem();
                }
            } else {
                obj = materialAutoCompleteTextView.getAdapter().getItem(i10);
            }
            MaterialAutoCompleteTextView.a(MaterialAutoCompleteTextView.this, obj);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    ListPopupWindow listPopupWindow2 = MaterialAutoCompleteTextView.this.f6951e;
                    if (!listPopupWindow2.a()) {
                        view = null;
                    } else {
                        view = listPopupWindow2.f894c.getSelectedView();
                    }
                    ListPopupWindow listPopupWindow3 = MaterialAutoCompleteTextView.this.f6951e;
                    if (!listPopupWindow3.a()) {
                        i11 = -1;
                    } else {
                        i11 = listPopupWindow3.f894c.getSelectedItemPosition();
                    }
                    i10 = i11;
                    ListPopupWindow listPopupWindow4 = MaterialAutoCompleteTextView.this.f6951e;
                    if (!listPopupWindow4.a()) {
                        j10 = Long.MIN_VALUE;
                    } else {
                        j10 = listPopupWindow4.f894c.getSelectedItemId();
                    }
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f6951e.f894c, view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.f6951e.dismiss();
        }
    }

    public class b<T> extends ArrayAdapter<String> {

        /* renamed from: a  reason: collision with root package name */
        public ColorStateList f6960a;

        /* renamed from: b  reason: collision with root package name */
        public ColorStateList f6961b;

        public b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            b();
        }

        public final void b() {
            boolean z10;
            ColorStateList colorStateList;
            boolean z11;
            boolean z12;
            ColorStateList colorStateList2 = MaterialAutoCompleteTextView.this.f6958s;
            if (colorStateList2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ColorStateList colorStateList3 = null;
            if (!z10) {
                colorStateList = null;
            } else {
                int[] iArr = {16842919};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            }
            this.f6961b = colorStateList;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (materialAutoCompleteTextView.f6957r != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                ColorStateList colorStateList4 = materialAutoCompleteTextView.f6958s;
                if (colorStateList4 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    int[] iArr2 = {16843623, -16842919};
                    int[] iArr3 = {16842913, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{d.c(colorStateList4.getColorForState(iArr3, 0), MaterialAutoCompleteTextView.this.f6957r), d.c(MaterialAutoCompleteTextView.this.f6958s.getColorForState(iArr2, 0), MaterialAutoCompleteTextView.this.f6957r), MaterialAutoCompleteTextView.this.f6957r});
                }
            }
            this.f6960a = colorStateList3;
        }

        public final View getView(int i10, View view, ViewGroup viewGroup) {
            boolean z10;
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                RippleDrawable rippleDrawable = null;
                if (MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText())) {
                    if (MaterialAutoCompleteTextView.this.f6957r != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f6957r);
                        if (this.f6961b != null) {
                            a.b.h(colorDrawable, this.f6960a);
                            rippleDrawable = new RippleDrawable(this.f6961b, colorDrawable, (Drawable) null);
                        } else {
                            rippleDrawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.d.q(textView, rippleDrawable);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static void a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void dismissDropDown() {
        boolean z10;
        AccessibilityManager accessibilityManager = this.f6952f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f6951e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f6956q;
    }

    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 == null || !b10.L) {
            return super.getHint();
        }
        return b10.getHint();
    }

    public float getPopupElevation() {
        return this.f6955p;
    }

    public int getSimpleItemSelectedColor() {
        return this.f6957r;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f6958s;
    }

    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.L && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ENGLISH);
            } else {
                str = "";
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6951e.dismiss();
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i13 = 0;
            if (!(adapter == null || b10 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.f6951e;
                if (!listPopupWindow.a()) {
                    i12 = -1;
                } else {
                    i12 = listPopupWindow.f894c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i12) + 15);
                View view = null;
                int i14 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i13) {
                        view = null;
                        i13 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i14 = Math.max(i14, view.getMeasuredWidth());
                }
                Drawable h10 = this.f6951e.h();
                if (h10 != null) {
                    h10.getPadding(this.f6953n);
                    Rect rect = this.f6953n;
                    i14 += rect.left + rect.right;
                }
                i13 = b10.getEndIconView().getMeasuredWidth() + i14;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i13), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z10) {
        boolean z11;
        AccessibilityManager accessibilityManager = this.f6952f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            super.onWindowFocusChanged(z10);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f6951e.p(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f6951e;
        if (listPopupWindow != null) {
            listPopupWindow.k(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f6956q = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof h) {
            ((h) dropDownBackground).n(this.f6956q);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f6951e.f908x = getOnItemSelectedListener();
    }

    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.s();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f6957r = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f6958s = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).b();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public final void showDropDown() {
        boolean z10;
        AccessibilityManager accessibilityManager = this.f6952f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f6951e.b();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f6954o, strArr));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(p8.a.a(context, attributeSet, i10, 0), attributeSet, i10);
        this.f6953n = new Rect();
        Context context2 = getContext();
        TypedArray d10 = u.d(context2, attributeSet, R$styleable.MaterialAutoCompleteTextView, i10, R$style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i11 = R$styleable.MaterialAutoCompleteTextView_android_inputType;
        if (d10.hasValue(i11) && d10.getInt(i11, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f6954o = d10.getResourceId(R$styleable.MaterialAutoCompleteTextView_simpleItemLayout, R$layout.mtrl_auto_complete_simple_item);
        this.f6955p = (float) d10.getDimensionPixelOffset(R$styleable.MaterialAutoCompleteTextView_android_popupElevation, R$dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int i12 = R$styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint;
        if (d10.hasValue(i12)) {
            this.f6956q = ColorStateList.valueOf(d10.getColor(i12, 0));
        }
        this.f6957r = d10.getColor(R$styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f6958s = c.a(context2, d10, R$styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f6952f = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f6951e = listPopupWindow;
        listPopupWindow.F = true;
        listPopupWindow.G.setFocusable(true);
        listPopupWindow.f906v = this;
        listPopupWindow.G.setInputMethodMode(2);
        listPopupWindow.p(getAdapter());
        listPopupWindow.f907w = new a();
        int i13 = R$styleable.MaterialAutoCompleteTextView_simpleItems;
        if (d10.hasValue(i13)) {
            setSimpleItems(d10.getResourceId(i13, 0));
        }
        d10.recycle();
    }
}
