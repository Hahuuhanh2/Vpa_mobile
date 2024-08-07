package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.library.R$id;
import d2.e;
import d2.l;
import hf.i;

/* compiled from: ActivityAuthBindingImpl */
public final class o extends i {

    /* renamed from: x  reason: collision with root package name */
    public long f21261x = -1;

    public o(e eVar, View view) {
        super(eVar, view, (FrameLayout) l.o(eVar, view, 1, (l.d) null, (SparseIntArray) null)[0]);
        ((FrameLayout) this.f10793w).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21261x = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21261x != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21261x = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
