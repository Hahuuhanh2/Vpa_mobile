package com.google.android.gms.internal.p001firebaseauthapi;

import ba.g;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzabi implements zzafe {
    public final /* synthetic */ zzadx zza;
    public final /* synthetic */ zzabz zzb;

    public zzabi(zzabz zzabz, zzadx zzadx) {
        this.zzb = zzabz;
        this.zza = zzadx;
    }

    public final void zza(String str) {
        this.zza.zzh(g.a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzagj zzagj = (zzagj) obj;
        this.zzb.zzR(new zzahb(zzagj.zzc(), zzagj.zzb(), Long.valueOf(zzahd.zza(zzagj.zzb())), "Bearer"), (String) null, (String) null, Boolean.FALSE, (zze) null, this.zza, this);
    }
}
