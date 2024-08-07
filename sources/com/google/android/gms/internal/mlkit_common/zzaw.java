package com.google.android.gms.internal.mlkit_common;

import android.support.v4.media.a;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class zzaw {
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
