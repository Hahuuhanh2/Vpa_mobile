package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzmd implements zzlu {
    private final zzzo zza;
    private final zzzo zzb;

    private zzmd(byte[] bArr, byte[] bArr2) {
        this.zza = zzzo.zzb(bArr);
        this.zzb = zzzo.zzb(bArr2);
    }

    public static zzmd zzc(byte[] bArr, byte[] bArr2, int i10) {
        zzym.zzd(zzym.zzh(zzym.zzi(i10), 1, bArr2), zzym.zzg(i10, bArr));
        return new zzmd(bArr, bArr2);
    }

    public final zzzo zza() {
        return this.zza;
    }

    public final zzzo zzb() {
        return this.zzb;
    }
}