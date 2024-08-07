package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R$styleable;
import androidx.core.widget.j;
import h.a;

class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet, i10, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PopupWindow, i10, i11);
        int i12 = R$styleable.PopupWindow_overlapAnchor;
        if (obtainStyledAttributes.hasValue(i12)) {
            j.c(this, obtainStyledAttributes.getBoolean(i12, false));
        }
        int i13 = R$styleable.PopupWindow_android_popupBackground;
        if (!obtainStyledAttributes.hasValue(i13) || (resourceId = obtainStyledAttributes.getResourceId(i13, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i13);
        } else {
            drawable = a.a(context, resourceId);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    public final void showAsDropDown(View view, int i10, int i11) {
        super.showAsDropDown(view, i10, i11);
    }

    public final void update(View view, int i10, int i11, int i12, int i13) {
        super.update(view, i10, i11, i12, i13);
    }

    public final void showAsDropDown(View view, int i10, int i11, int i12) {
        super.showAsDropDown(view, i10, i11, i12);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }
}
