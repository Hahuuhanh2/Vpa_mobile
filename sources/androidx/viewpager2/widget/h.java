package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewPager2 */
public final class h implements RecyclerView.n {
    public final void a(View view) {
    }

    public final void b(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (layoutParams.width != -1 || layoutParams.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
