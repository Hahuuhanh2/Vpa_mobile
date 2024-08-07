package i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import o1.a;

/* compiled from: DrawableWrapperCompat */
public class c extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f10879a;

    public c(Drawable drawable) {
        Drawable drawable2 = this.f10879a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f10879a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f10879a.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.f10879a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f10879a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f10879a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f10879a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f10879a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f10879a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f10879a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f10879a.getPadding(rect);
    }

    public final int[] getState() {
        return this.f10879a.getState();
    }

    public final Region getTransparentRegion() {
        return this.f10879a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return a.C0166a.d(this.f10879a);
    }

    public final boolean isStateful() {
        return this.f10879a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f10879a.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f10879a.setBounds(rect);
    }

    public final boolean onLevelChange(int i10) {
        return this.f10879a.setLevel(i10);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public final void setAlpha(int i10) {
        this.f10879a.setAlpha(i10);
    }

    public final void setAutoMirrored(boolean z10) {
        a.C0166a.e(this.f10879a, z10);
    }

    public final void setChangingConfigurations(int i10) {
        this.f10879a.setChangingConfigurations(i10);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10879a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z10) {
        this.f10879a.setDither(z10);
    }

    public final void setFilterBitmap(boolean z10) {
        this.f10879a.setFilterBitmap(z10);
    }

    public void setHotspot(float f10, float f11) {
        a.b.e(this.f10879a, f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        a.b.f(this.f10879a, i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        return this.f10879a.setState(iArr);
    }

    public final void setTint(int i10) {
        a.b.g(this.f10879a, i10);
    }

    public final void setTintList(ColorStateList colorStateList) {
        a.b.h(this.f10879a, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        a.b.i(this.f10879a, mode);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        if (super.setVisible(z10, z11) || this.f10879a.setVisible(z10, z11)) {
            return true;
        }
        return false;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
