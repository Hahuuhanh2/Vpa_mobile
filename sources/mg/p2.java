package mg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.library.R$id;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import d2.e;
import d2.l;
import hf.c;

/* compiled from: DialogDebugBindingImpl */
public final class p2 extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f21285x;

    /* renamed from: w  reason: collision with root package name */
    public long f21286w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21285x = sparseIntArray;
        sparseIntArray.put(2131362806, 1);
        sparseIntArray.put(2131362747, 2);
        sparseIntArray.put(2131361931, 3);
        sparseIntArray.put(2131361937, 4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p2(e eVar, View view) {
        super(eVar, view);
        Object[] o10 = l.o(eVar, view, 5, (l.d) null, f21285x);
        MaterialButton materialButton = (MaterialButton) o10[3];
        MaterialButton materialButton2 = (MaterialButton) o10[4];
        TextView textView = (TextView) o10[2];
        TextView textView2 = (TextView) o10[1];
        ((MaterialCardView) o10[0]).setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f21286w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21286w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21286w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
