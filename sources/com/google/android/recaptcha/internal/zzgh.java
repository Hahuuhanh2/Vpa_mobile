package com.google.android.recaptcha.internal;

import android.content.Context;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzgh implements zzgm {
    private final Context zza;

    public zzgh(Context context) {
        this.zza = context;
    }

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzgl.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        return zzau.zza(this.zza.getContentResolver());
    }
}
