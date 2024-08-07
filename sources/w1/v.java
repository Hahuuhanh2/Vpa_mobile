package w1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b0.a;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16354a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f16355b;

    public /* synthetic */ v(int i10, View view) {
        this.f16354a = i10;
        this.f16355b = view;
    }

    public final void run() {
        switch (this.f16354a) {
            case 0:
                View view = this.f16355b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 1:
                View view2 = this.f16355b;
                int i10 = BottomAppBar.C0;
                view2.requestLayout();
                return;
            default:
                View view3 = this.f16355b;
                view3.requestFocus();
                view3.post(new a(1, view3, false));
                return;
        }
    }
}
