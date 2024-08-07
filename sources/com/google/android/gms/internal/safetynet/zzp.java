package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zza;
import v6.e;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
final class zzp implements e {
    private final Status zza;
    private final zza zzb;

    public zzp(Status status, zza zza2) {
        this.zza = status;
        this.zzb = zza2;
    }

    public final String getJwsResult() {
        zza zza2 = this.zzb;
        if (zza2 == null) {
            return null;
        }
        return zza2.f5551a;
    }

    public final Status getStatus() {
        return this.zza;
    }
}
