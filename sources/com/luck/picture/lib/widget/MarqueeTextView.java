package com.luck.picture.lib.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

public class MarqueeTextView extends MediumBoldTextView {
    public MarqueeTextView(Context context) {
        super(context);
    }

    public final boolean isFocused() {
        return true;
    }

    public final boolean isSelected() {
        return true;
    }

    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            super.onFocusChanged(true, i10, rect);
        }
    }

    public final void onWindowFocusChanged(boolean z10) {
        if (z10) {
            super.onWindowFocusChanged(true);
        }
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
