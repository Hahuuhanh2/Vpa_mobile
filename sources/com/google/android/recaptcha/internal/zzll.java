package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzll {
    private static final zzlk zza;
    private static final zzlk zzb = new zzlk();

    static {
        zzlk zzlk;
        try {
            zzlk = (zzlk) Class.forName("com.google.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlk = null;
        }
        zza = zzlk;
    }

    public static zzlk zza() {
        return zza;
    }

    public static zzlk zzb() {
        return zzb;
    }
}
