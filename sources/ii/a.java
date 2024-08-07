package ii;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import sk.j;

/* compiled from: GridSpacingItemDecoration.kt */
public final class a extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public final int f20574a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final int f20575b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20576c;

    public a(int i10) {
        this.f20575b = i10;
        this.f20576c = false;
    }

    public final void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.w wVar) {
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(wVar, "state");
        int M = RecyclerView.M(view);
        int i10 = this.f20574a;
        int i11 = M % i10;
        if (this.f20576c) {
            int i12 = this.f20575b;
            rect.left = i12 - ((i11 * i12) / i10);
            rect.right = ((i11 + 1) * i12) / i10;
            if (M < i10) {
                rect.top = i12;
            }
            rect.bottom = i12;
            return;
        }
        int i13 = this.f20575b;
        rect.left = (i11 * i13) / i10;
        rect.right = i13 - (((i11 + 1) * i13) / i10);
        if (M >= i10) {
            rect.top = i13;
        }
    }
}
