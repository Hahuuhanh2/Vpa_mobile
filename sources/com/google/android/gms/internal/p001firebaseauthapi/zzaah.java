package com.google.android.gms.internal.p001firebaseauthapi;

import ba.g;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaah  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaah implements zzafe {
    public final /* synthetic */ zzadx zza;
    public final /* synthetic */ zzabz zzb;

    public zzaah(zzabz zzabz, zzadx zzadx) {
        this.zzb = zzabz;
        this.zza = zzadx;
    }

    public final void zza(String str) {
        this.zza.zzh(g.a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaii zzaii = (zzaii) obj;
        if (zzaii.zzg()) {
            this.zza.zzf(new zzaaf(zzaii.zzd(), zzaii.zzf(), (zze) null));
            return;
        }
        zzahb zzahb = new zzahb(zzaii.zze(), zzaii.zzc(), Long.valueOf(zzaii.zzb()), "Bearer");
        this.zzb.zzR(zzahb, (String) null, (String) null, Boolean.FALSE, (zze) null, this.zza, this);
    }
}
