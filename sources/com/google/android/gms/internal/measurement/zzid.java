package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzid {
    private final zzio zza;
    private final byte[] zzb;

    private zzid(int i10) {
        byte[] bArr = new byte[i10];
        this.zzb = bArr;
        this.zza = zzio.zzb(bArr);
    }

    public final zzhu zza() {
        this.zza.zzb();
        return new zzie(this.zzb);
    }

    public final zzio zzb() {
        return this.zza;
    }
}
