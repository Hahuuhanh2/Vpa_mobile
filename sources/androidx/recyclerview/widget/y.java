package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper */
public final class y extends l {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ x f3308p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(x xVar, Context context) {
        super(context);
        this.f3308p = xVar;
    }

    public final void f(View view, RecyclerView.v.a aVar) {
        x xVar = this.f3308p;
        RecyclerView recyclerView = xVar.f3303a;
        if (recyclerView != null) {
            int[] b10 = xVar.b(recyclerView.getLayoutManager(), view);
            int i10 = b10[0];
            int i11 = b10[1];
            int l10 = l(Math.max(Math.abs(i10), Math.abs(i11)));
            if (l10 > 0) {
                DecelerateInterpolator decelerateInterpolator = this.f3280i;
                aVar.f3091a = i10;
                aVar.f3092b = i11;
                aVar.f3093c = l10;
                aVar.f3095e = decelerateInterpolator;
                aVar.f3096f = true;
            }
        }
    }

    public final float k(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }
}
