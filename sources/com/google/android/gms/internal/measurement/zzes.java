package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzdf;
import k7.b;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzes extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdf.zzd zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzes(zzdf.zzd zzd2, Activity activity) {
        super(zzdf.this);
        this.zzc = activity;
        this.zzd = zzd2;
    }

    public final void zza() {
        zzcu zza = zzdf.this.zzj;
        j.f(zza);
        zza.onActivityPaused(new b(this.zzc), this.zzb);
    }
}
