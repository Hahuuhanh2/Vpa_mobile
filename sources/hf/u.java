package hf;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.library.R$id;
import d2.e;
import d2.l;

/* compiled from: PickerItemBindingImpl */
public final class u extends t {

    /* renamed from: x  reason: collision with root package name */
    public long f10814x = -1;

    public u(e eVar, View view) {
        super(eVar, view, (AppCompatTextView) l.o(eVar, view, 1, (l.d) null, (SparseIntArray) null)[0]);
        this.f10813w.setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f10814x = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f10814x != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f10814x = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
