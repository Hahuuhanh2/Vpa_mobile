package com.ots.core.utils.customview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

public class AspectRatioImageView extends AppCompatImageView {
    public AspectRatioImageView(Context context) {
        super(context);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public final void onMeasure(int i10, int i11) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicHeight() <= 0) {
            super.onMeasure(i10, i11);
            return;
        }
        int i12 = getLayoutParams().width;
        int i13 = getLayoutParams().height;
        if (i12 <= 0) {
            i12 = View.MeasureSpec.getSize(i10);
        }
        if (i13 <= 0) {
            i13 = View.MeasureSpec.getSize(i11);
        }
        if (i13 > getMaxHeight()) {
            i13 = getMaxHeight();
            i12 = (drawable.getIntrinsicWidth() * i13) / drawable.getIntrinsicHeight();
        }
        if (i12 > getMaxWidth()) {
            i12 = getMaxWidth();
            i13 = (drawable.getIntrinsicHeight() * i12) / drawable.getIntrinsicWidth();
        }
        if (i12 <= 0 || i13 <= 0) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(i12, i13);
        }
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }
}
