package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzae  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzae {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException(b0.s("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
