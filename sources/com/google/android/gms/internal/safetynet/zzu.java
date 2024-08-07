package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zzd;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
final class zzu extends zzd {
    public final /* synthetic */ zzv zza;

    public zzu(zzv zzv) {
        this.zza = zzv;
    }

    public final void zzg(Status status, zzd zzd) {
        this.zza.setResult(new zzaa(status, zzd));
    }
}
