package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzdf;
import k7.b;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzdl extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzdf zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdl(zzdf zzdf, Activity activity, String str, String str2) {
        super(zzdf);
        this.zzc = activity;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zzf.zzj;
        j.f(zza);
        zza.setCurrentScreen(new b(this.zzc), this.zzd, this.zze, this.zza);
    }
}
