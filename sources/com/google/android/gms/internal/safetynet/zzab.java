package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zzf;
import v6.e;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
final class zzab implements e {
    private final Status zza;
    private final zzf zzb;

    public zzab(Status status, zzf zzf) {
        this.zza = status;
        this.zzb = zzf;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public final String getTokenResult() {
        zzf zzf = this.zzb;
        if (zzf == null) {
            return null;
        }
        return zzf.f5556a;
    }
}
