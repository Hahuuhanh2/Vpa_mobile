package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzlt {
    private static final zzls zza;
    private static final zzls zzb = new zzls();

    static {
        zzls zzls;
        try {
            zzls = (zzls) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzls = null;
        }
        zza = zzls;
    }

    public static zzls zza() {
        return zza;
    }

    public static zzls zzb() {
        return zzb;
    }
}
