package kf;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import java.util.Objects;

/* compiled from: CenterSmoothScroller.kt */
public final class f extends l {
    public f(Context context) {
        super(context);
    }

    public final int h(int i10, int i11, int i12, int i13, int i14) {
        RecyclerView.m mVar = this.f3086c;
        Objects.requireNonNull(mVar);
        return (mVar.f3061w / 7) + ((((i13 - i12) / 2) + i12) - (((i11 - i10) / 2) + i10));
    }
}
