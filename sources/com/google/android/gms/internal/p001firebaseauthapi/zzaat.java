package com.google.android.gms.internal.p001firebaseauthapi;

import ba.g;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaat  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaat implements zzafe {
    public final /* synthetic */ zzadx zza;
    public final /* synthetic */ zzabz zzb;

    public zzaat(zzabz zzabz, zzadx zzadx) {
        this.zzb = zzabz;
        this.zza = zzadx;
    }

    public final void zza(String str) {
        this.zza.zzh(g.a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaik zzaik = (zzaik) obj;
        this.zzb.zzR(new zzahb(zzaik.zze(), zzaik.zzc(), Long.valueOf(zzaik.zzb()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzaik.zzg()), (zze) null, this.zza, this);
    }
}
