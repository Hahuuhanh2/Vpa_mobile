package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import p3.l0;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zze extends zzs {
    public final int zza(Context context, zzr zzr, boolean z10) {
        if (zzr.zza.getAuthority().lastIndexOf(64) < 0 || l0.o(context, "android.permission.INTERACT_ACROSS_USERS") != 0) {
            return 3;
        }
        return 2;
    }
}
