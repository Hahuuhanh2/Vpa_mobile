package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R$attr;

public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    public final m f832a;

    public AppCompatSeekBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f832a;
        Drawable drawable = mVar.f1149e;
        if (drawable != null && drawable.isStateful() && drawable.setState(mVar.f1148d.getDrawableState())) {
            mVar.f1148d.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f832a.f1149e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f832a.d(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i0.a(getContext(), this);
        m mVar = new m(this);
        this.f832a = mVar;
        mVar.a(attributeSet, i10);
    }
}
