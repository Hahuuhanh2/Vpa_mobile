package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaak  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaak implements zzafe {
    public final /* synthetic */ zzafd zza;
    public final /* synthetic */ zzadx zzb;
    public final /* synthetic */ zzahb zzc;
    public final /* synthetic */ zzahn zzd;
    public final /* synthetic */ zzabz zze;

    public zzaak(zzabz zzabz, zzafd zzafd, zzadx zzadx, zzahb zzahb, zzahn zzahn) {
        this.zze = zzabz;
        this.zza = zzafd;
        this.zzb = zzadx;
        this.zzc = zzahb;
        this.zzd = zzahn;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb2 = ((zzagr) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users");
        } else {
            zzabz.zzf(this.zze, this.zzb, this.zzc, (zzags) zzb2.get(0), this.zzd, this.zza);
        }
    }
}
