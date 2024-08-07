package com.google.android.gms.internal.mlkit_common;

import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class zzbd {
    public static int zza(Set set) {
        int i10;
        int i11 = 0;
        for (Object next : set) {
            if (next != null) {
                i10 = next.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }
}