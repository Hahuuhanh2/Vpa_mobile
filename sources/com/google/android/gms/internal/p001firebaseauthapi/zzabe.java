package com.google.android.gms.internal.p001firebaseauthapi;

import ba.g;
import f0.b0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzabe implements zzafe {
    public final /* synthetic */ zzahr zza;
    public final /* synthetic */ zzadx zzb;

    public zzabe(zzabz zzabz, zzahr zzahr, zzadx zzadx) {
        this.zza = zzahr;
        this.zzb = zzadx;
    }

    public final void zza(String str) {
        this.zzb.zzh(g.a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzahr zzahr = this.zza;
        zzahs zzahs = (zzahs) obj;
        if (zzahr instanceof zzahv) {
            this.zzb.zzb(zzahs.zzc());
        } else if (zzahr instanceof zzahx) {
            this.zzb.zzp(zzahs);
        } else {
            throw new IllegalArgumentException(b0.s("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was ", zzahr.getClass().getName(), "."));
        }
    }
}
