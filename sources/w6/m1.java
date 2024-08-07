package w6;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class m1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f16629a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f16630b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ zzb f16631c;

    public m1(zzb zzb, LifecycleCallback lifecycleCallback, String str) {
        this.f16631c = zzb;
        this.f16629a = lifecycleCallback;
        this.f16630b = str;
    }

    public final void run() {
        Bundle bundle;
        zzb zzb = this.f16631c;
        if (zzb.f5361b > 0) {
            LifecycleCallback lifecycleCallback = this.f16629a;
            Bundle bundle2 = zzb.f5362c;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.f16630b);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f16631c.f5361b >= 2) {
            this.f16629a.onStart();
        }
        if (this.f16631c.f5361b >= 3) {
            this.f16629a.onResume();
        }
        if (this.f16631c.f5361b >= 4) {
            this.f16629a.onStop();
        }
        if (this.f16631c.f5361b >= 5) {
            this.f16629a.onDestroy();
        }
    }
}
