package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.library.R$id;
import d2.e;
import d2.l;
import hf.c;

/* compiled from: ItemTitleUtilitiesBindingImpl */
public final class g7 extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f21088x;

    /* renamed from: w  reason: collision with root package name */
    public long f21089w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21088x = sparseIntArray;
        sparseIntArray.put(2131362800, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g7(e eVar, View view) {
        super(eVar, view);
        Object[] o10 = l.o(eVar, view, 2, (l.d) null, f21088x);
        TextView textView = (TextView) o10[1];
        ((LinearLayout) o10[0]).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21089w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21089w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21089w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
