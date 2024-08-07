package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.p;
import k1.a;
import m1.e;

/* compiled from: TintTypedArray */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1156a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f1157b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1158c;

    public n0(Context context, TypedArray typedArray) {
        this.f1156a = context;
        this.f1157b = typedArray;
    }

    public static n0 m(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new n0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public final boolean a(int i10, boolean z10) {
        return this.f1157b.getBoolean(i10, z10);
    }

    public final ColorStateList b(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        if (!this.f1157b.hasValue(i10) || (resourceId = this.f1157b.getResourceId(i10, 0)) == 0 || (colorStateList = a.getColorStateList(this.f1156a, resourceId)) == null) {
            return this.f1157b.getColorStateList(i10);
        }
        return colorStateList;
    }

    public final int c(int i10, int i11) {
        return this.f1157b.getDimensionPixelOffset(i10, i11);
    }

    public final int d(int i10, int i11) {
        return this.f1157b.getDimensionPixelSize(i10, i11);
    }

    public final Drawable e(int i10) {
        int resourceId;
        if (!this.f1157b.hasValue(i10) || (resourceId = this.f1157b.getResourceId(i10, 0)) == 0) {
            return this.f1157b.getDrawable(i10);
        }
        return h.a.a(this.f1156a, resourceId);
    }

    public final Drawable f(int i10) {
        int resourceId;
        Drawable g2;
        if (!this.f1157b.hasValue(i10) || (resourceId = this.f1157b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        g a10 = g.a();
        Context context = this.f1156a;
        synchronized (a10) {
            g2 = a10.f1105a.g(context, resourceId, true);
        }
        return g2;
    }

    public final Typeface g(int i10, int i11, p.a aVar) {
        int resourceId = this.f1157b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1158c == null) {
            this.f1158c = new TypedValue();
        }
        Context context = this.f1156a;
        TypedValue typedValue = this.f1158c;
        ThreadLocal<TypedValue> threadLocal = e.f13062a;
        if (context.isRestricted()) {
            return null;
        }
        return e.b(context, resourceId, typedValue, i11, aVar, true, false);
    }

    public final int h(int i10, int i11) {
        return this.f1157b.getInt(i10, i11);
    }

    public final int i(int i10, int i11) {
        return this.f1157b.getResourceId(i10, i11);
    }

    public final String j(int i10) {
        return this.f1157b.getString(i10);
    }

    public final CharSequence k(int i10) {
        return this.f1157b.getText(i10);
    }

    public final boolean l(int i10) {
        return this.f1157b.hasValue(i10);
    }

    public final void n() {
        this.f1157b.recycle();
    }
}
