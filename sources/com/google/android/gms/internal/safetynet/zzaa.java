package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.zzd;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v6.e;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
final class zzaa implements e {
    private final Status zza;
    private final zzd zzb;

    public zzaa(Status status, zzd zzd) {
        this.zza = status;
        this.zzb = zzd;
    }

    public final List<HarmfulAppsData> getHarmfulAppsList() {
        zzd zzd = this.zzb;
        if (zzd == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(zzd.f5553b);
    }

    public final int getHoursSinceLastScanWithHarmfulApp() {
        zzd zzd = this.zzb;
        if (zzd == null) {
            return -1;
        }
        return zzd.f5554c;
    }

    public final long getLastScanTimeMs() {
        zzd zzd = this.zzb;
        if (zzd == null) {
            return 0;
        }
        return zzd.f5552a;
    }

    public final Status getStatus() {
        return this.zza;
    }
}
