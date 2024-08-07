package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzed extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzcs zzd;
    private final /* synthetic */ zzdf zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzed(zzdf zzdf, String str, zzcs zzcs) {
        super(zzdf);
        this.zzc = str;
        this.zzd = zzcs;
        this.zze = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zze.zzj;
        j.f(zza);
        zza.getMaxUserProperties(this.zzc, this.zzd);
    }

    public final void zzb() {
        this.zzd.zza((Bundle) null);
    }
}
