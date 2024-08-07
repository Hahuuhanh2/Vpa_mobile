package ce;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.e;
import com.kizitonwose.calendar.view.internal.g;
import java.util.List;
import m9.b;
import sk.j;
import zd.a;

/* compiled from: MonthViewHolder.kt */
public final class c extends RecyclerView.a0 {

    /* renamed from: u  reason: collision with root package name */
    public final View f4732u;

    /* renamed from: v  reason: collision with root package name */
    public final View f4733v;

    /* renamed from: w  reason: collision with root package name */
    public final List<g<a>> f4734w;

    /* renamed from: x  reason: collision with root package name */
    public b f4735x;

    /* renamed from: y  reason: collision with root package name */
    public b f4736y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup, View view, View view2, List<g<a>> list, e<b> eVar, e<b> eVar2) {
        super(viewGroup);
        j.f(viewGroup, "rootLayout");
        j.f(list, "weekHolders");
        this.f4732u = view;
        this.f4733v = view2;
        this.f4734w = list;
    }
}
