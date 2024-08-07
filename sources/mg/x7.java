package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.library.R$id;
import com.vpa.daugia.C0533R$id;
import d2.e;
import d2.l;
import hf.c;

/* compiled from: WidgetProgressDialogBindingImpl */
public final class x7 extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f21457x;

    /* renamed from: w  reason: collision with root package name */
    public long f21458w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21457x = sparseIntArray;
        sparseIntArray.put(C0533R$id.tv_wait_message, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x7(e eVar, View view) {
        super(eVar, view);
        Object[] o10 = l.o(eVar, view, 2, (l.d) null, f21457x);
        TextView textView = (TextView) o10[1];
        ((CardView) o10[0]).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21458w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21458w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21458w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
