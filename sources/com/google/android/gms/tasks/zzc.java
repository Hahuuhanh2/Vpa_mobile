package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
final class zzc implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzd zzb;

    public zzc(zzd zzd, Task task) {
        this.zzb = zzd;
        this.zza = task;
    }

    public final void run() {
        if (this.zza.isCanceled()) {
            this.zzb.zzc.zzc();
            return;
        }
        try {
            this.zzb.zzc.zzb(this.zzb.zzb.then(this.zza));
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.zzb.zzc.zza((Exception) e10.getCause());
            } else {
                this.zzb.zzc.zza(e10);
            }
        } catch (Exception e11) {
            this.zzb.zzc.zza(e11);
        }
    }
}
