package com.google.android.recaptcha.internal;

import fk.h;
import fk.r;
import java.lang.reflect.Method;
import java.util.List;
import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzeh extends zzee {
    private final zzeg zza;
    private final String zzb;

    public zzeh(zzeg zzeg, String str, Object obj) {
        super(obj);
        this.zza = zzeg;
        this.zzb = str;
    }

    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!j.a(method.getName(), this.zzb)) {
            return false;
        }
        zzeg zzeg = this.zza;
        if (objArr != null) {
            list = h.l0(objArr);
        } else {
            list = r.f20213a;
        }
        zzeg.zzb(list);
        return true;
    }
}
