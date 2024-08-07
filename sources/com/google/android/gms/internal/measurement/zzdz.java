package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzdz extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzcs zzf;
    private final /* synthetic */ zzdf zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdz(zzdf zzdf, String str, String str2, boolean z10, zzcs zzcs) {
        super(zzdf);
        this.zzc = str;
        this.zzd = str2;
        this.zze = z10;
        this.zzf = zzcs;
        this.zzg = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zzg.zzj;
        j.f(zza);
        zza.getUserProperties(this.zzc, this.zzd, this.zze, this.zzf);
    }

    public final void zzb() {
        this.zzf.zza((Bundle) null);
    }
}
