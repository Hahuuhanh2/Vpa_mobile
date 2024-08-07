package com.google.android.recaptcha.internal;

import android.content.Context;
import u6.b;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzbz {
    public static final /* synthetic */ int zza = 0;
    private static final b zzb = b.f15290b;

    public static final int zza(Context context) {
        int b10 = zzb.b(context);
        if (b10 == 1 || b10 == 3 || b10 == 9) {
            return 4;
        }
        return 3;
    }
}
