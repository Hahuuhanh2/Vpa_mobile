package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.luck.picture.lib.R$styleable;

public class RoundCornerRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Path f8145a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8146b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8147c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8148d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f8149e;

    public RoundCornerRelativeLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f8145a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f8145a.reset();
        RectF rectF = this.f8149e;
        rectF.right = (float) i10;
        rectF.bottom = (float) i11;
        boolean z10 = this.f8147c;
        if (z10 || this.f8148d) {
            if (z10) {
                float f10 = this.f8146b;
                this.f8145a.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10}, Path.Direction.CW);
            }
            if (this.f8148d) {
                float f11 = this.f8146b;
                this.f8145a.addRoundRect(this.f8149e, new float[]{f11, f11, f11, f11, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                return;
            }
            return;
        }
        Path path = this.f8145a;
        float f12 = this.f8146b;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8149e = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.PictureRoundCornerRelativeLayout, i10, 0);
        this.f8146b = obtainStyledAttributes.getDimension(R$styleable.PictureRoundCornerRelativeLayout_psCorners, 0.0f);
        this.f8147c = obtainStyledAttributes.getBoolean(R$styleable.PictureRoundCornerRelativeLayout_psTopNormal, false);
        this.f8148d = obtainStyledAttributes.getBoolean(R$styleable.PictureRoundCornerRelativeLayout_psBottomNormal, false);
        obtainStyledAttributes.recycle();
        this.f8145a = new Path();
    }
}
