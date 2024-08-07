package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzdk extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Bundle zze;
    private final /* synthetic */ zzdf zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdk(zzdf zzdf, String str, String str2, Bundle bundle) {
        super(zzdf);
        this.zzc = str;
        this.zzd = str2;
        this.zze = bundle;
        this.zzf = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zzf.zzj;
        j.f(zza);
        zza.clearConditionalUserProperty(this.zzc, this.zzd, this.zze);
    }
}
