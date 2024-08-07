package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzkl implements zzlv {
    private static final zzkl zza = new zzkl();

    private zzkl() {
    }

    public static zzkl zza() {
        return zza;
    }

    public final zzlu zzb(Class cls) {
        Class<zzks> cls2 = zzks.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzlu) zzks.zzs(cls.asSubclass(cls2)).zzh(3, (Object) null, (Object) null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return zzks.class.isAssignableFrom(cls);
    }
}
