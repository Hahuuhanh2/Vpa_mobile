package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
final class zzy extends zzd {
    public final /* synthetic */ zzz zza;

    public zzy(zzz zzz) {
        this.zza = zzz;
    }

    public final void zzj(Status status, SafeBrowsingData safeBrowsingData) {
        this.zza.setResult(new zzac(status, safeBrowsingData));
    }
}
