package fg;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.swnishan.materialdatetimepicker.R$layout;
import ek.i;
import java.util.List;
import rk.l;
import sk.j;

/* compiled from: PickerAdapter.kt */
public final class a extends RecyclerView.e<c> {

    /* renamed from: d  reason: collision with root package name */
    public List<? extends eg.a> f20161d;

    /* renamed from: e  reason: collision with root package name */
    public int f20162e;

    /* renamed from: f  reason: collision with root package name */
    public final int f20163f;

    /* renamed from: n  reason: collision with root package name */
    public final l<Integer, i> f20164n;

    /* JADX WARNING: type inference failed for: r4v0, types: [int, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.util.List<? extends eg.a> r2, int r3, java.lang.Object r4, rk.l<? super java.lang.Integer, ek.i> r5) {
        /*
            r1 = this;
            java.lang.String r0 = "items"
            sk.j.f(r2, r0)
            java.lang.String r0 = "scrollOption"
            n0.l.o(r4, r0)
            r1.<init>()
            r1.f20161d = r2
            r1.f20162e = r3
            r1.f20163f = r4
            r1.f20164n = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.a.<init>(java.util.List, int, int, rk.l):void");
    }

    public final int c() {
        if (this.f20163f == 1) {
            return 2000;
        }
        return this.f20161d.size();
    }

    public final void i(RecyclerView.a0 a0Var, int i10) {
        c cVar = (c) a0Var;
        List<? extends eg.a> list = this.f20161d;
        eg.a aVar = (eg.a) list.get(i10 % list.size());
        int i11 = this.f20162e;
        l<Integer, i> lVar = this.f20164n;
        j.f(aVar, "model");
        j.f(lVar, "onClickItem");
        View view = cVar.f20167u;
        if (view != null) {
            ((TextView) view).setText(aVar.a());
            ((TextView) cVar.f20167u).setTextAppearance(i11);
            cVar.f20167u.setOnClickListener(new b(i10, lVar));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
        j.f(recyclerView, "parent");
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(R$layout.item_picker, recyclerView, false);
        j.e(inflate, "LayoutInflater.from(pare…em_picker, parent, false)");
        return new c(inflate);
    }
}
