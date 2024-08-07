package com.google.android.gms.internal.mlkit_vision_common;

import android.support.v4.media.a;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public final class zzt {
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
