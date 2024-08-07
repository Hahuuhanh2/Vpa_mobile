package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.b;

/* compiled from: RecyclerView */
public final class s implements b.C0029b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3296a;

    public s(RecyclerView recyclerView) {
        this.f3296a = recyclerView;
    }

    public final int a() {
        return this.f3296a.getChildCount();
    }

    public final void b(int i10) {
        View childAt = this.f3296a.getChildAt(i10);
        if (childAt != null) {
            this.f3296a.r(childAt);
            childAt.clearAnimation();
        }
        this.f3296a.removeViewAt(i10);
    }
}
