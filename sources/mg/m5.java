package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.library.R$id;
import d2.e;
import d2.l;

/* compiled from: ItemDocumentAuctionBindingImpl */
public final class m5 extends n3 {

    /* renamed from: w  reason: collision with root package name */
    public long f21220w = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m5(e eVar, View view) {
        super(view, eVar);
        Object[] o10 = l.o(eVar, view, 1, (l.d) null, (SparseIntArray) null);
        ((LinearLayout) o10[0]).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21220w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21220w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21220w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
