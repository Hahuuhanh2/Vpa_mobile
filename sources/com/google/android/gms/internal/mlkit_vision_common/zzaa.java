package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Set;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public final class zzaa {
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