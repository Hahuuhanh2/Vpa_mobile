package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
final class zzs extends zzd {
    public final /* synthetic */ zzt zza;

    public zzs(zzt zzt) {
        this.zza = zzt;
    }

    public final void zzb(Status status, boolean z10) {
        this.zza.setResult(new zzad(status, z10));
    }
}
