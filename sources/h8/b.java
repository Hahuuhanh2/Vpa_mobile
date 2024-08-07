package h8;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.u;
import i8.c;

/* compiled from: BaseProgressIndicatorSpec */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public int f10623a;

    /* renamed from: b  reason: collision with root package name */
    public int f10624b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f10625c = new int[0];

    /* renamed from: d  reason: collision with root package name */
    public int f10626d;

    /* renamed from: e  reason: collision with root package name */
    public int f10627e;

    /* renamed from: f  reason: collision with root package name */
    public int f10628f;

    public b(Context context, AttributeSet attributeSet, int i10, int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.mtrl_progress_track_thickness);
        TypedArray d10 = u.d(context, attributeSet, R$styleable.BaseProgressIndicator, i10, i11, new int[0]);
        this.f10623a = c.c(context, d10, R$styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f10624b = Math.min(c.c(context, d10, R$styleable.BaseProgressIndicator_trackCornerRadius, 0), this.f10623a / 2);
        this.f10627e = d10.getInt(R$styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f10628f = d10.getInt(R$styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        int i12 = R$styleable.BaseProgressIndicator_indicatorColor;
        if (!d10.hasValue(i12)) {
            this.f10625c = new int[]{m9.b.B(context, R$attr.colorPrimary, -1)};
        } else if (d10.peekValue(i12).type != 1) {
            this.f10625c = new int[]{d10.getColor(i12, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(d10.getResourceId(i12, -1));
            this.f10625c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        int i13 = R$styleable.BaseProgressIndicator_trackColor;
        if (d10.hasValue(i13)) {
            this.f10626d = d10.getColor(i13, -1);
        } else {
            this.f10626d = this.f10625c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f10 = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.f10626d = m9.b.m(this.f10626d, (int) (f10 * 255.0f));
        }
        d10.recycle();
    }

    public abstract void a();
}
