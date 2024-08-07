package hf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.R$id;
import d2.e;
import d2.l;

/* compiled from: DateDialogBindingImpl */
public final class d extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f10779x;

    /* renamed from: w  reason: collision with root package name */
    public long f10780w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10779x = sparseIntArray;
        sparseIntArray.put(R$id.yearView, 1);
        sparseIntArray.put(R$id.monthView, 2);
        sparseIntArray.put(R$id.dayView, 3);
        sparseIntArray.put(R$id.hoursView, 4);
        sparseIntArray.put(R$id.minusView, 5);
        sparseIntArray.put(R$id.llConfirm, 6);
        sparseIntArray.put(R$id.tvCancel, 7);
        sparseIntArray.put(R$id.v_ui_line, 8);
        sparseIntArray.put(R$id.tvConfirm, 9);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar, View view) {
        super(eVar, view);
        Object[] o10 = l.o(eVar, view, 10, (l.d) null, f10779x);
        RecyclerView recyclerView = (RecyclerView) o10[3];
        RecyclerView recyclerView2 = (RecyclerView) o10[4];
        LinearLayout linearLayout = (LinearLayout) o10[6];
        RecyclerView recyclerView3 = (RecyclerView) o10[5];
        RecyclerView recyclerView4 = (RecyclerView) o10[2];
        TextView textView = (TextView) o10[7];
        TextView textView2 = (TextView) o10[9];
        View view2 = (View) o10[8];
        RecyclerView recyclerView5 = (RecyclerView) o10[1];
        ((MaterialCardView) o10[0]).setTag((Object) null);
        view.setTag(androidx.databinding.library.R$id.dataBinding, this);
        m();
    }

    public final void h() {
        synchronized (this) {
            this.f10780w = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f10780w != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f10780w = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
