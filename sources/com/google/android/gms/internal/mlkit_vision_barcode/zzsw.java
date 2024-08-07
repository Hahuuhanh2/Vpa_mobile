package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import k7.a;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzsw extends zza {
    public zzsw(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final List zzd(a aVar, zztf zztf) {
        Parcel zza = zza();
        zzc.zzb(zza, aVar);
        zzc.zza(zza, zztf);
        Parcel zzb = zzb(3, zza);
        ArrayList<zzsm> createTypedArrayList = zzb.createTypedArrayList(zzsm.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void zze() {
        zzc(1, zza());
    }

    public final void zzf() {
        zzc(2, zza());
    }
}
