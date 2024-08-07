package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.library.R$id;
import com.vpa.daugia.C0533R$id;
import d2.e;
import d2.l;
import hf.c;

/* compiled from: ItemActionHomeStep1BindingImpl */
public final class m4 extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f21218x;

    /* renamed from: w  reason: collision with root package name */
    public long f21219w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21218x = sparseIntArray;
        sparseIntArray.put(C0533R$id.btnList, 1);
        sparseIntArray.put(C0533R$id.btnCreate, 2);
        sparseIntArray.put(C0533R$id.ivLogo, 3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m4(e eVar, View view) {
        super(eVar, view);
        Object[] o10 = l.o(eVar, view, 4, (l.d) null, f21218x);
        RelativeLayout relativeLayout = (RelativeLayout) o10[2];
        RelativeLayout relativeLayout2 = (RelativeLayout) o10[1];
        ImageView imageView = (ImageView) o10[3];
        ((LinearLayout) o10[0]).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21219w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21219w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21219w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
