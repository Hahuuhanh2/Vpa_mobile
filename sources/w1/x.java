package w1;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f16422a;

    public /* synthetic */ x(AtomicBoolean atomicBoolean) {
        this.f16422a = atomicBoolean;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i10) {
        boolean z10;
        AtomicBoolean atomicBoolean = this.f16422a;
        if ((i10 & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        atomicBoolean.set(z10);
    }
}
