package ef;

import androidx.recyclerview.widget.RecyclerView;
import com.ots.core.base.BaseRecyclerView;
import sk.j;

/* compiled from: BaseRecyclerView.kt */
public final class i extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseRecyclerView f9463a;

    public i(BaseRecyclerView baseRecyclerView) {
        this.f9463a = baseRecyclerView;
    }

    public final void a(int i10, RecyclerView recyclerView) {
        int i11;
        j.f(recyclerView, "recyclerView");
        if (!recyclerView.canScrollVertically(1) && i10 == 0) {
            RecyclerView.e adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i11 = adapter.c();
            } else {
                i11 = 0;
            }
            if (!this.f9463a.getOnLoadMore() && i11 >= 10) {
                this.f9463a.setOnLoadMore(true);
                this.f9463a.getOnLoadMoreAction().invoke();
            }
        }
    }
}
