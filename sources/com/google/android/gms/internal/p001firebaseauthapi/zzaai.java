package com.google.android.gms.internal.p001firebaseauthapi;

import ba.g;
import com.google.firebase.auth.EmailAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaai  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaai implements zzafe {
    public final /* synthetic */ EmailAuthCredential zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzadx zzc;
    public final /* synthetic */ zzabz zzd;

    public zzaai(zzabz zzabz, EmailAuthCredential emailAuthCredential, String str, zzadx zzadx) {
        this.zzd = zzabz;
        this.zza = emailAuthCredential;
        this.zzb = str;
        this.zzc = zzadx;
    }

    public final void zza(String str) {
        this.zzc.zzh(g.a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzQ(new zzage(this.zza, ((zzahb) obj).zze(), this.zzb), this.zzc);
    }
}
