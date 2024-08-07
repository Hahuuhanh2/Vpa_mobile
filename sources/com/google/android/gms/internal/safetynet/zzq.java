package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zza;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
final class zzq extends zzd {
    public final /* synthetic */ zzr zza;

    public zzq(zzr zzr) {
        this.zza = zzr;
    }

    public final void zzd(Status status, zza zza2) {
        this.zza.setResult(new zzp(status, zza2));
    }
}
