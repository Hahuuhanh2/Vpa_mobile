package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import k7.b;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzec extends zzdf.zza {
    private final /* synthetic */ int zzc = 5;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ Object zzf;
    private final /* synthetic */ Object zzg;
    private final /* synthetic */ zzdf zzh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzec(zzdf zzdf, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.zzd = str;
        this.zze = obj;
        this.zzf = null;
        this.zzg = null;
        this.zzh = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zzh.zzj;
        j.f(zza);
        zza.logHealthData(this.zzc, this.zzd, new b(this.zze), new b((Object) null), new b((Object) null));
    }
}
