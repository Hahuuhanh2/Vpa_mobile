package m8;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f13189a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13190b;

    public /* synthetic */ f(SideSheetBehavior sideSheetBehavior, int i10) {
        this.f13189a = sideSheetBehavior;
        this.f13190b = i10;
    }

    public final void run() {
        SideSheetBehavior sideSheetBehavior = this.f13189a;
        int i10 = this.f13190b;
        View view = (View) sideSheetBehavior.f6740w.get();
        if (view != null) {
            sideSheetBehavior.z(view, i10, false);
        }
    }
}
