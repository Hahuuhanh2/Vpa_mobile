package com.google.android.gms.internal.mlkit_common;

import f0.b0;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzai {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException(b0.s("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
