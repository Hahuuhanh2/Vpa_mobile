package com.google.android.gms.internal.p001firebaseauthapi;

import aa.c;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzafl extends c {
    public final /* synthetic */ c zza;
    public final /* synthetic */ String zzb;

    public zzafl(c cVar, String str) {
        this.zza = cVar;
        this.zzb = str;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzafn.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    public final void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
        this.zza.onCodeSent(str, phoneAuthProvider$ForceResendingToken);
    }

    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        zzafn.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(phoneAuthCredential);
    }

    public final void onVerificationFailed(FirebaseException firebaseException) {
        zzafn.zza.remove(this.zzb);
        this.zza.onVerificationFailed(firebaseException);
    }
}
