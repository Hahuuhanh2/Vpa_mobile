package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzee extends zzdf.zza {
    private final /* synthetic */ zzdf.zzc zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzee(zzdf zzdf, zzdf.zzc zzc2) {
        super(zzdf);
        this.zzc = zzc2;
        this.zzd = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zzd.zzj;
        j.f(zza);
        zza.setEventInterceptor(this.zzc);
    }
}
