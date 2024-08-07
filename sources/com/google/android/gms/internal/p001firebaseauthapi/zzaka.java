package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaka  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaka {
    private static final zzajy zza = new zzajz();
    private static final zzajy zzb;

    static {
        zzajy zzajy;
        try {
            zzajy = (zzajy) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzajy = null;
        }
        zzb = zzajy;
    }

    public static zzajy zza() {
        zzajy zzajy = zzb;
        if (zzajy != null) {
            return zzajy;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzajy zzb() {
        return zza;
    }
}
