package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzeg extends zzdf.zza {
    private final /* synthetic */ zzcs zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzeg(zzdf zzdf, zzcs zzcs) {
        super(zzdf);
        this.zzc = zzcs;
        this.zzd = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zzd.zzj;
        j.f(zza);
        zza.getAppInstanceId(this.zzc);
    }

    public final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
