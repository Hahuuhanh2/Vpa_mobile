package androidx.fragment.app;

import a3.c;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.v;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2661a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2662b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f2661a = i10;
        this.f2662b = obj;
    }

    public final Bundle a() {
        switch (this.f2661a) {
            case 0:
                FragmentActivity fragmentActivity = (FragmentActivity) this.f2662b;
                int i10 = FragmentActivity.G;
                do {
                } while (FragmentActivity.H(fragmentActivity.G()));
                fragmentActivity.C.f(i.a.ON_STOP);
                return new Bundle();
            default:
                return v.a((v) this.f2662b);
        }
    }
}
