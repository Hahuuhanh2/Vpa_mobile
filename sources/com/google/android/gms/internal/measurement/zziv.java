package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zziv {
    private static final zziu<?> zza = new zziw();
    private static final zziu<?> zzb = zzc();

    public static zziu<?> zza() {
        zziu<?> zziu = zzb;
        if (zziu != null) {
            return zziu;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zziu<?> zzb() {
        return zza;
    }

    private static zziu<?> zzc() {
        try {
            return (zziu) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
