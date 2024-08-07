package com.google.android.gms.internal.p001firebaseauthapi;

import ba.g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaau  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaau implements zzafe {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzadx zzc;
    public final /* synthetic */ zzabz zzd;

    public zzaau(zzabz zzabz, String str, String str2, zzadx zzadx) {
        this.zzd = zzabz;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzadx;
    }

    public final void zza(String str) {
        this.zzc.zzh(g.a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzahb zzahb = (zzahb) obj;
        zzahn zzahn = new zzahn();
        zzahn.zze(zzahb.zze());
        zzahn.zzd(this.zza);
        zzahn.zzg(this.zzb);
        zzabz.zze(this.zzd, this.zzc, zzahb, zzahn, this);
    }
}
