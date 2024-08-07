package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzdp extends zzdf.zza {
    private final /* synthetic */ zzdf zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdp(zzdf zzdf) {
        super(zzdf);
        this.zzc = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zzc.zzj;
        j.f(zza);
        zza.resetAnalyticsData(this.zza);
    }
}
