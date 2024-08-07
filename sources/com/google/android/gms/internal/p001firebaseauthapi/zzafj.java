package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzafj {
    public static zzaij zza(PhoneAuthCredential phoneAuthCredential) {
        if (!TextUtils.isEmpty(phoneAuthCredential.f7498e)) {
            return zzaij.zzc(phoneAuthCredential.f7496c, phoneAuthCredential.f7498e, phoneAuthCredential.f7497d);
        }
        return zzaij.zzb(phoneAuthCredential.f7494a, phoneAuthCredential.f7495b, phoneAuthCredential.f7497d);
    }
}
