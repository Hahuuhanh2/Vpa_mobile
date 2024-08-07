package l8;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: ShapeableDelegateV33 */
public final class t extends r {

    /* compiled from: ShapeableDelegateV33 */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        public final void getOutline(View view, Outline outline) {
            if (!t.this.f12892e.isEmpty()) {
                outline.setPath(t.this.f12892e);
            }
        }
    }

    public t(View view) {
        d(view);
    }

    private void d(View view) {
        view.setOutlineProvider(new a());
    }

    public final void a(View view) {
        view.setClipToOutline(!this.f12888a);
        if (this.f12888a) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    public final boolean b() {
        return this.f12888a;
    }
}
