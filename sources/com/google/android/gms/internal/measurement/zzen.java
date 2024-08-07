package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import k7.b;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzen extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ zzdf zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzen(zzdf zzdf, String str, String str2, Object obj, boolean z10) {
        super(zzdf);
        this.zzc = str;
        this.zzd = str2;
        this.zze = obj;
        this.zzf = z10;
        this.zzg = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zzg.zzj;
        j.f(zza);
        zza.setUserProperty(this.zzc, this.zzd, new b(this.zze), this.zzf, this.zza);
    }
}
