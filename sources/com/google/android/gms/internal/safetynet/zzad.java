package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import o7.c;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class zzad implements c {
    private Status zza;
    private boolean zzb;

    public zzad() {
    }

    public zzad(Status status, boolean z10) {
        this.zza = status;
        this.zzb = z10;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public final boolean isVerifyAppsEnabled() {
        Status status = this.zza;
        if (status == null || !status.P0()) {
            return false;
        }
        return this.zzb;
    }
}
