package com.google.android.gms.internal.p001firebaseauthapi;

import aa.c;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaer  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaer implements zzaex {
    public final /* synthetic */ String zza;

    public zzaer(zzaew zzaew, String str) {
        this.zza = str;
    }

    public final void zza(c cVar, Object... objArr) {
        cVar.onCodeSent(this.zza, new PhoneAuthProvider$ForceResendingToken());
    }
}
