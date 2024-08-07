package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzdj extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzcs zze;
    private final /* synthetic */ zzdf zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdj(zzdf zzdf, String str, String str2, zzcs zzcs) {
        super(zzdf);
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzcs;
        this.zzf = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zzf.zzj;
        j.f(zza);
        zza.getConditionalUserProperties(this.zzc, this.zzd, this.zze);
    }

    public final void zzb() {
        this.zze.zza((Bundle) null);
    }
}
