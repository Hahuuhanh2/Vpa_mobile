package com.google.android.gms.internal.common;

import android.support.v4.media.a;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class zzah {
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
