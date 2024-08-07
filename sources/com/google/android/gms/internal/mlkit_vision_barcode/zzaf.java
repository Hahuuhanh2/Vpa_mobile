package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.Parcel;
import k7.a;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzaf extends zza {
    public zzaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void zzd() {
        zzc(3, zza());
    }

    public final zzq[] zze(a aVar, zzaj zzaj) {
        Parcel zza = zza();
        zzc.zzb(zza, aVar);
        zzc.zza(zza, zzaj);
        Parcel zzb = zzb(1, zza);
        zzq[] zzqArr = (zzq[]) zzb.createTypedArray(zzq.CREATOR);
        zzb.recycle();
        return zzqArr;
    }

    public final zzq[] zzf(a aVar, zzaj zzaj) {
        Parcel zza = zza();
        zzc.zzb(zza, aVar);
        zzc.zza(zza, zzaj);
        Parcel zzb = zzb(2, zza);
        zzq[] zzqArr = (zzq[]) zzb.createTypedArray(zzq.CREATOR);
        zzb.recycle();
        return zzqArr;
    }
}
