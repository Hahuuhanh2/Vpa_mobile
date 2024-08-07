package com.google.android.recaptcha.internal;

import fk.p;
import java.util.Set;
import sk.j;
import yk.l;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzeb {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        String str2 = "";
        for (String valueOf : l.e1(str, new char[]{'.'})) {
            String concat = str2.concat(String.valueOf(valueOf));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }

    public final void zza(zzpj zzpj) {
        this.zza = p.d1(zzpj.zzf().zzi());
        this.zzb = p.d1(zzpj.zzg().zzi());
    }

    public final boolean zzb(String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        } else if (set.isEmpty()) {
            return true;
        } else {
            Set set2 = this.zzb;
            j.d(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            if (zzc(str, set2)) {
                return false;
            }
            return zzc(str, set);
        }
    }
}
