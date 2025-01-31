package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
final class zzz implements Runnable {
    public final /* synthetic */ zzw zza;
    public final /* synthetic */ Callable zzb;

    public zzz(zzw zzw, Callable callable) {
        this.zza = zzw;
        this.zzb = callable;
    }

    public final void run() {
        try {
            this.zza.zzb(this.zzb.call());
        } catch (Exception e10) {
            this.zza.zza(e10);
        } catch (Throwable th2) {
            this.zza.zza(new RuntimeException(th2));
        }
    }
}
