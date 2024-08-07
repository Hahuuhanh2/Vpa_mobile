package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f442a;

    public /* synthetic */ k(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f442a = appCompatDelegateImpl;
    }

    public final void onBackInvoked() {
        this.f442a.Q();
    }
}
