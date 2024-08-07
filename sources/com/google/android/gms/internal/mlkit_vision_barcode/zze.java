package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzd();
    public int zza;
    public String[] zzb;

    public zze() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 2, this.zza);
        l0.g1(parcel, 3, this.zzb);
        l0.o1(n12, parcel);
    }

    public zze(int i10, String[] strArr) {
        this.zza = i10;
        this.zzb = strArr;
    }
}
