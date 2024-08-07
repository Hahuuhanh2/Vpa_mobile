package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzls {
    public static final boolean zza(Object obj) {
        if (!((zzlr) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzlr zzlr = (zzlr) obj;
        zzlr zzlr2 = (zzlr) obj2;
        if (!zzlr2.isEmpty()) {
            if (!zzlr.zze()) {
                zzlr = zzlr.zzb();
            }
            zzlr.zzd(zzlr2);
        }
        return zzlr;
    }
}
