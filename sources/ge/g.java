package ge;

import android.view.View;
import com.luck.picture.lib.entity.LocalMedia;
import ee.t;
import ge.b;
import ue.j;

/* compiled from: PreviewImageHolder */
public final class g extends b {

    /* compiled from: PreviewImageHolder */
    public class a implements j {
        public a() {
        }

        public final void a() {
            b.a aVar = g.this.A;
            if (aVar != null) {
                ((t.g) aVar).a();
            }
        }
    }

    /* compiled from: PreviewImageHolder */
    public class b implements View.OnLongClickListener {
        public b(LocalMedia localMedia) {
        }

        public final boolean onLongClick(View view) {
            b.a aVar = g.this.A;
            if (aVar == null) {
                return false;
            }
            ((t.g) aVar).b();
            return false;
        }
    }

    public g(View view) {
        super(view);
    }

    public final void s() {
    }

    public final void v(LocalMedia localMedia, int i10, int i11) {
        this.f10458y.getClass();
    }

    public final void w() {
        this.f10459z.setOnViewTapListener(new a());
    }

    public final void x(LocalMedia localMedia) {
        this.f10459z.setOnLongClickListener(new b(localMedia));
    }
}
