package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class zzh extends zza {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    public final void zzc(zzg zzg, byte[] bArr, String str) {
        Parcel zza = zza();
        zzc.zzb(zza, zzg);
        zza.writeByteArray(bArr);
        zza.writeString(str);
        zzb(7, zza);
    }

    public final void zzd(zzg zzg) {
        Parcel zza = zza();
        zzc.zzb(zza, zzg);
        zzb(4, zza);
    }

    public final void zze(zzg zzg) {
        Parcel zza = zza();
        zzc.zzb(zza, zzg);
        zzb(12, zza);
    }

    public final void zzf(zzg zzg) {
        Parcel zza = zza();
        zzc.zzb(zza, zzg);
        zzb(14, zza);
    }

    public final void zzg(zzg zzg) {
        Parcel zza = zza();
        zzc.zzb(zza, zzg);
        zzb(5, zza);
    }

    public final void zzh(zzg zzg, String str, int[] iArr, int i10, String str2) {
        Parcel zza = zza();
        zzc.zzb(zza, zzg);
        zza.writeString(str);
        zza.writeIntArray(iArr);
        zza.writeInt(i10);
        zza.writeString(str2);
        zzb(3, zza);
    }

    public final void zzi() {
        zzb(13, zza());
    }

    public final void zzj(zzg zzg, String str) {
        Parcel zza = zza();
        zzc.zzb(zza, zzg);
        zza.writeString(str);
        zzb(6, zza);
    }
}
