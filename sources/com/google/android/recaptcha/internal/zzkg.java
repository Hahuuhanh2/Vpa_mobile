package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzkg {
    private static final zzke zza = new zzkf();
    private static final zzke zzb;

    static {
        zzke zzke;
        try {
            zzke = (zzke) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzke = null;
        }
        zzb = zzke;
    }

    public static zzke zza() {
        zzke zzke = zzb;
        if (zzke != null) {
            return zzke;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzke zzb() {
        return zza;
    }
}
