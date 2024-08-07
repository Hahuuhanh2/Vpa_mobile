package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzej extends zzdf.zza {
    private final /* synthetic */ zzdf.zzb zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzej(zzdf zzdf, zzdf.zzb zzb) {
        super(zzdf);
        this.zzc = zzb;
        this.zzd = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zzd.zzj;
        j.f(zza);
        zza.registerOnMeasurementEventListener(this.zzc);
    }
}
