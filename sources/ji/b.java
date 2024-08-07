package ji;

import android.view.View;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements View.OnScrollChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f20782a;

    public /* synthetic */ b(c cVar) {
        this.f20782a = cVar;
    }

    public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
        c cVar = this.f20782a;
        j.f(cVar, "this$0");
        if (!view.canScrollVertically(1)) {
            cVar.f20783i.f21400y.setChecked(true);
        }
    }
}
