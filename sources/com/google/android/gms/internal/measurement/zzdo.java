package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzdo extends zzdf.zza {
    private final /* synthetic */ Boolean zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdo(zzdf zzdf, Boolean bool) {
        super(zzdf);
        this.zzc = bool;
        this.zzd = zzdf;
    }

    public final void zza() {
        if (this.zzc != null) {
            zzcu zza = this.zzd.zzj;
            j.f(zza);
            zza.setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
            return;
        }
        zzcu zza2 = this.zzd.zzj;
        j.f(zza2);
        zza2.clearMeasurementEnabled(this.zza);
    }
}
