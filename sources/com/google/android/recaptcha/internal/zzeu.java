package com.google.android.recaptcha.internal;

import fk.h;
import fk.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzeu implements zzfe {
    public static final zzeu zza = new zzeu();

    private zzeu() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(j.H0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzrr) it.next()).zzP()));
        }
        if (!arrayList.contains(Boolean.FALSE)) {
            return true;
        }
        return false;
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        if (zzb(h.z0(zzrrArr))) {
            for (zzrr zzi : zzrrArr) {
                zzek.zzc().zzb(zzi.zzi());
            }
            return;
        }
        throw new zzby(4, 5, (Throwable) null);
    }
}
