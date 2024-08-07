package com.google.android.gms.tasks;

import y6.j;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
final class zzk implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzl zzb;

    public zzk(zzl zzl, Task task) {
        this.zzb = zzl;
        this.zza = task;
    }

    public final void run() {
        synchronized (this.zzb.zzb) {
            zzl zzl = this.zzb;
            if (zzl.zzc != null) {
                OnFailureListener zza2 = zzl.zzc;
                Exception exception = this.zza.getException();
                j.f(exception);
                zza2.onFailure(exception);
            }
        }
    }
}
