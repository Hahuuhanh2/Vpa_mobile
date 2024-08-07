package le;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GridSpacingItemDecoration */
public final class a extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public final int f12975a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12976b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12977c = false;

    public a(int i10, int i11) {
        this.f12975a = i10;
        this.f12976b = i11;
    }

    public final void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.w wVar) {
        recyclerView.getClass();
        int M = RecyclerView.M(view);
        int i10 = this.f12975a;
        int i11 = M % i10;
        if (this.f12977c) {
            int i12 = this.f12976b;
            rect.left = i12 - ((i11 * i12) / i10);
            rect.right = ((i11 + 1) * i12) / i10;
        } else {
            int i13 = this.f12976b;
            rect.left = (i11 * i13) / i10;
            rect.right = i13 - (((i11 + 1) * i13) / i10);
        }
        if (M < i10) {
            rect.top = this.f12976b;
        }
        rect.bottom = this.f12976b;
    }
}
