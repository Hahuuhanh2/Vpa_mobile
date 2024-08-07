package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzx();
    public double zza;
    public double zzb;

    public zzk() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        double d10 = this.zza;
        parcel.writeInt(524290);
        parcel.writeDouble(d10);
        double d11 = this.zzb;
        parcel.writeInt(524291);
        parcel.writeDouble(d11);
        l0.o1(n12, parcel);
    }

    public zzk(double d10, double d11) {
        this.zza = d10;
        this.zzb = d11;
    }
}
