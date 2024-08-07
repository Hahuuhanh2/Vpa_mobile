package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import d.h;
import d.i;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f2130c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final h f2131a;

    /* renamed from: b  reason: collision with root package name */
    public final i f2132b;

    public ContentLoadingProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f2131a);
        removeCallbacks(this.f2132b);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2131a);
        removeCallbacks(this.f2132b);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2131a = new h(this, 12);
        this.f2132b = new i(this, 7);
    }
}
