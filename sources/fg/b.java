package fg;

import android.view.View;
import rk.l;

/* compiled from: PickerViewHolder.kt */
public final class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f20165a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f20166b;

    public b(int i10, l lVar) {
        this.f20165a = lVar;
        this.f20166b = i10;
    }

    public final void onClick(View view) {
        this.f20165a.invoke(Integer.valueOf(this.f20166b));
    }
}
