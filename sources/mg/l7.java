package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.library.R$id;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import d2.e;
import d2.l;
import hf.c;

/* compiled from: PopupLayoutBindingImpl */
public final class l7 extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f21177x;

    /* renamed from: w  reason: collision with root package name */
    public long f21178w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21177x = sparseIntArray;
        sparseIntArray.put(C0533R$id.tvAll, 1);
        sparseIntArray.put(C0533R$id.tvSeen, 2);
        sparseIntArray.put(C0533R$id.tvUnseen, 3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l7(e eVar, View view) {
        super(eVar, view);
        Object[] o10 = l.o(eVar, view, 4, (l.d) null, f21177x);
        AppTextView appTextView = (AppTextView) o10[1];
        AppTextView appTextView2 = (AppTextView) o10[2];
        AppTextView appTextView3 = (AppTextView) o10[3];
        ((LinearLayout) o10[0]).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21178w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21178w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21178w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
