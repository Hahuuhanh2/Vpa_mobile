package d;

import android.window.OnBackInvokedCallback;
import f8.b;
import rk.a;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8458a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8459b;

    public /* synthetic */ x(Object obj, int i10) {
        this.f8458a = i10;
        this.f8459b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f8458a) {
            case 0:
                a aVar = (a) this.f8459b;
                j.f(aVar, "$onBackInvoked");
                aVar.invoke();
                return;
            case 1:
                ((Runnable) this.f8459b).run();
                return;
            default:
                ((b) this.f8459b).b();
                return;
        }
    }
}
