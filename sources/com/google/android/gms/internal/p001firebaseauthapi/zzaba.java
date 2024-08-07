package com.google.android.gms.internal.p001firebaseauthapi;

import ba.g;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaba  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaba implements zzafe {
    public final /* synthetic */ zzafe zza;
    public final /* synthetic */ zzahb zzb;
    public final /* synthetic */ zzabb zzc;

    public zzaba(zzabb zzabb, zzafe zzafe, zzahb zzahb) {
        this.zzc = zzabb;
        this.zza = zzafe;
        this.zzb = zzahb;
    }

    public final void zza(String str) {
        this.zzc.zzb.zzh(g.a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb2 = ((zzagr) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzahn zzahn = new zzahn();
        zzahn.zze(this.zzb.zze());
        zzahn.zzb(this.zzc.zza);
        zzabb zzabb = this.zzc;
        zzahb zzahb = this.zzb;
        zzafe zzafe = this.zza;
        zzabz.zzf(zzabb.zzc, zzabb.zzb, zzahb, (zzags) zzb2.get(0), zzahn, zzafe);
    }
}
