package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.R$styleable;
import k1.a;
import n1.d;

/* compiled from: ThemeUtils */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1133a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1134b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1135c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1136d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1137e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1138f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1139g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R$styleable.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList d10 = d(context, i10);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f1134b, d10.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f1133a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f10 = typedValue.getFloat();
        int c10 = c(context, i10);
        return d.d(c10, Math.round(((float) Color.alpha(c10)) * f10));
    }

    public static int c(Context context, int i10) {
        int[] iArr = f1139g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1139g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = a.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
