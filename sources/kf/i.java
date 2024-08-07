package kf;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import sk.j;

/* compiled from: SpacingItemDecoration.kt */
public final class i extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public final int f12561a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12562b;

    public i(int i10, int i11) {
        this.f12561a = i10;
        this.f12562b = i11;
    }

    public final void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.w wVar) {
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(wVar, "state");
        int M = RecyclerView.M(view);
        int i10 = this.f12561a;
        int i11 = M % i10;
        int i12 = this.f12562b;
        rect.left = i12 - ((i11 * i12) / i10);
        rect.right = ((i11 + 1) * i12) / i10;
        if (M < i10) {
            rect.top = i12;
        }
        rect.bottom = i12;
    }
}
