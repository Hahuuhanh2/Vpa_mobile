package com.google.android.gms.internal.p001firebaseauthapi;

import ba.g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzabs implements zzafe {
    public final /* synthetic */ zzadx zza;
    public final /* synthetic */ zzabz zzb;

    public zzabs(zzabz zzabz, zzadx zzadx) {
        this.zzb = zzabz;
        this.zza = zzadx;
    }

    public final void zza(String str) {
        this.zza.zzh(g.a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaie zzaie = (zzaie) obj;
        if (!zzaie.zzm()) {
            zzabz.zzd(this.zzb, zzaie, this.zza, this);
        } else {
            this.zza.zzf(new zzaaf(zzaie.zzg(), zzaie.zzl(), zzaie.zzc()));
        }
    }
}
