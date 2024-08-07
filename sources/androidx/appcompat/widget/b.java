package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: ActionBarBackgroundDrawable */
public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f1065a;

    public b(ActionBarContainer actionBarContainer) {
        this.f1065a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1065a;
        if (actionBarContainer.f710o) {
            Drawable drawable = actionBarContainer.f709n;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f707e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1065a;
        Drawable drawable3 = actionBarContainer2.f708f;
        if (drawable3 != null && actionBarContainer2.f711p) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1065a;
        if (!actionBarContainer.f710o) {
            Drawable drawable = actionBarContainer.f707e;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        } else if (actionBarContainer.f709n != null) {
            actionBarContainer.f707e.getOutline(outline);
        }
    }

    public final void setAlpha(int i10) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
