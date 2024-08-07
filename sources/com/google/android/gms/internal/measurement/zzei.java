package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzei extends zzdf.zza {
    private final /* synthetic */ zzcs zzc;
    private final /* synthetic */ int zzd;
    private final /* synthetic */ zzdf zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzei(zzdf zzdf, zzcs zzcs, int i10) {
        super(zzdf);
        this.zzc = zzcs;
        this.zzd = i10;
        this.zze = zzdf;
    }

    public final void zza() {
        zzcu zza = this.zze.zzj;
        j.f(zza);
        zza.getTestFlag(this.zzc, this.zzd);
    }

    public final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
