package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.library.R$id;
import com.google.android.material.card.MaterialCardView;
import d2.e;
import d2.l;

/* compiled from: ItemRegulationBindingImpl */
public final class z6 extends y6 {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f21540x;

    /* renamed from: w  reason: collision with root package name */
    public long f21541w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21540x = sparseIntArray;
        sparseIntArray.put(2131362284, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z6(e eVar, View view) {
        super(eVar, view);
        Object[] o10 = l.o(eVar, view, 2, (l.d) null, f21540x);
        ImageView imageView = (ImageView) o10[1];
        ((MaterialCardView) o10[0]).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21541w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21541w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21541w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
