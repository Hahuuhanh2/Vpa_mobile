package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.library.R$id;
import com.vpa.daugia.C0533R$id;
import d2.e;
import d2.l;
import hf.c;

/* compiled from: ActivityTermsOfUseBindingImpl */
public final class x1 extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f21448x;

    /* renamed from: w  reason: collision with root package name */
    public long f21449w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21448x = sparseIntArray;
        sparseIntArray.put(2131361926, 1);
        sparseIntArray.put(C0533R$id.tvClose, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x1(e eVar, View view) {
        super(eVar, view);
        Object[] o10 = l.o(eVar, view, 3, (l.d) null, f21448x);
        ImageButton imageButton = (ImageButton) o10[1];
        TextView textView = (TextView) o10[2];
        ((RelativeLayout) o10[0]).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21449w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21449w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21449w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
