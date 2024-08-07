package com.google.android.gms.internal.p001firebaseauthapi;

import aa.c;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaes  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaes implements zzaex {
    public final /* synthetic */ PhoneAuthCredential zza;

    public zzaes(zzaew zzaew, PhoneAuthCredential phoneAuthCredential) {
        this.zza = phoneAuthCredential;
    }

    public final void zza(c cVar, Object... objArr) {
        cVar.onVerificationCompleted(this.zza);
    }
}
