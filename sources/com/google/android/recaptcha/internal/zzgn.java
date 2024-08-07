package com.google.android.recaptcha.internal;

import android.content.Context;
import ek.e;
import fk.h;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzgn implements zzgm {
    private final Context zza;
    private final Map zzb = h.u0(new e(2, "activity"), new e(3, "phone"), new e(4, "input_method"), new e(5, "audio"));

    public zzgn(Context context) {
        this.zza = context;
    }

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzgl.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        Integer num = objArr[0];
        if (true != (num instanceof Integer)) {
            num = null;
        }
        Integer num2 = num;
        if (num2 != null) {
            Object obj = this.zzb.get(Integer.valueOf(num2.intValue()));
            if (obj != null) {
                return this.zza.getSystemService((String) obj);
            }
            throw new zzby(4, 4, (Throwable) null);
        }
        throw new zzby(4, 5, (Throwable) null);
    }
}
