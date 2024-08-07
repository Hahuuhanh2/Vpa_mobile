package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzabm implements zzafe {
    public final /* synthetic */ zzafe zza;
    public final /* synthetic */ zzahb zzb;
    public final /* synthetic */ zzabn zzc;

    public zzabm(zzabn zzabn, zzafe zzafe, zzahb zzahb) {
        this.zzc = zzabn;
        this.zza = zzafe;
        this.zzb = zzahb;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb2 = ((zzagr) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users");
            return;
        }
        this.zzc.zza.zzk(this.zzb, (zzags) zzb2.get(0));
    }
}
