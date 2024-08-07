package com.google.android.gms.internal.p001firebaseauthapi;

import ba.g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzabw implements zzafe {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzadx zzb;
    public final /* synthetic */ zzabz zzc;

    public zzabw(zzabz zzabz, String str, zzadx zzadx) {
        this.zzc = zzabz;
        this.zza = str;
        this.zzb = zzadx;
    }

    public final void zza(String str) {
        this.zzb.zzh(g.a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzahb zzahb = (zzahb) obj;
        String zze = zzahb.zze();
        zzahn zzahn = new zzahn();
        zzahn.zze(zze);
        zzahn.zzg(this.zza);
        zzabz.zze(this.zzc, this.zzb, zzahb, zzahn, this);
    }
}
