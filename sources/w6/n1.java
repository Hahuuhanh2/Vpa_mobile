package w6;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class n1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f16633a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f16634b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o1 f16635c;

    public n1(o1 o1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f16635c = o1Var;
        this.f16633a = lifecycleCallback;
        this.f16634b = str;
    }

    public final void run() {
        Bundle bundle;
        o1 o1Var = this.f16635c;
        if (o1Var.f16646f0 > 0) {
            LifecycleCallback lifecycleCallback = this.f16633a;
            Bundle bundle2 = o1Var.f16647g0;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.f16634b);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f16635c.f16646f0 >= 2) {
            this.f16633a.onStart();
        }
        if (this.f16635c.f16646f0 >= 3) {
            this.f16633a.onResume();
        }
        if (this.f16635c.f16646f0 >= 4) {
            this.f16633a.onStop();
        }
        if (this.f16635c.f16646f0 >= 5) {
            this.f16633a.onDestroy();
        }
    }
}
