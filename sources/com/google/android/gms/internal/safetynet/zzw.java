package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zzf;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
final class zzw extends zzd {
    public final /* synthetic */ zzx zza;

    public zzw(zzx zzx) {
        this.zza = zzx;
    }

    public final void zzh(Status status, zzf zzf) {
        this.zza.setResult(new zzab(status, zzf));
    }
}
