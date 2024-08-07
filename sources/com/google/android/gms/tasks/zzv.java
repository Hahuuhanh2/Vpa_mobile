package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import w6.g;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
final class zzv extends LifecycleCallback {
    private final List zza = new ArrayList();

    private zzv(g gVar) {
        super(gVar);
        this.mLifecycleFragment.c("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzv;
        g fragment = LifecycleCallback.getFragment(activity);
        synchronized (fragment) {
            zzv = (zzv) fragment.e(zzv.class, "TaskOnStopCallback");
            if (zzv == null) {
                zzv = new zzv(fragment);
            }
        }
        return zzv;
    }

    public final void onStop() {
        synchronized (this.zza) {
            for (WeakReference weakReference : this.zza) {
                zzq zzq = (zzq) weakReference.get();
                if (zzq != null) {
                    zzq.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final void zzb(zzq zzq) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzq));
        }
    }
}
