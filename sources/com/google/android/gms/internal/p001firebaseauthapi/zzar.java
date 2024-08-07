package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzar  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzar {
    public static Object[] zza(Object[] objArr, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            if (objArr[i11] != null) {
                i11++;
            } else {
                throw new NullPointerException(a.m("at index ", i11));
            }
        }
        return objArr;
    }
}
