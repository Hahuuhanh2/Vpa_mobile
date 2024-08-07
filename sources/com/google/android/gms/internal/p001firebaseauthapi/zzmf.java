package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzmf implements zzlu {
    private final zzzo zza;
    private final zzzo zzb;

    private zzmf(byte[] bArr, byte[] bArr2) {
        this.zza = zzzo.zzb(bArr);
        this.zzb = zzzo.zzb(bArr2);
    }

    public static zzmf zzc(byte[] bArr) {
        return new zzmf(bArr, zzzm.zzb(bArr));
    }

    public final zzzo zza() {
        return this.zza;
    }

    public final zzzo zzb() {
        return this.zzb;
    }
}
