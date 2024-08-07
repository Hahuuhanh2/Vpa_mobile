package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzel extends zzdf.zza {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzdf zzi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzel(zzdf zzdf, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(zzdf);
        this.zzc = l10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = zzdf;
    }

    public final void zza() {
        long j10;
        Long l10 = this.zzc;
        if (l10 == null) {
            j10 = this.zza;
        } else {
            j10 = l10.longValue();
        }
        zzcu zza = this.zzi.zzj;
        j.f(zza);
        zza.logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, j10);
    }
}
