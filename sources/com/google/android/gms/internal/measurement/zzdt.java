package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzdt extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdt(zzdf zzdf, String str) {
        super(zzdf);
        this.zzc = str;
        this.zzd = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zzd.zzj;
        j.f(zza);
        zza.endAdUnitExposure(this.zzc, this.zzb);
    }
}
