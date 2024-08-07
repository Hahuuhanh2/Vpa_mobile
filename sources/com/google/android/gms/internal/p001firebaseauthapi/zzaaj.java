package com.google.android.gms.internal.p001firebaseauthapi;

import ba.g;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaaj implements zzafe {
    public final /* synthetic */ zzadx zza;
    public final /* synthetic */ zzabz zzb;

    public zzaaj(zzabz zzabz, zzadx zzadx) {
        this.zzb = zzabz;
        this.zza = zzadx;
    }

    public final void zza(String str) {
        this.zza.zzh(g.a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzagf zzagf = (zzagf) obj;
        if (zzagf.zzg()) {
            this.zza.zzf(new zzaaf(zzagf.zzd(), zzagf.zzf(), (zze) null));
            return;
        }
        this.zzb.zzR(new zzahb(zzagf.zze(), zzagf.zzc(), Long.valueOf(zzagf.zzb()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzagf.zzh()), (zze) null, this.zza, this);
    }
}
