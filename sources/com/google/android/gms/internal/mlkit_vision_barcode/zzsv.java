package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzsv implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                d10 = SafeParcelReader.m(readInt, parcel);
            } else if (c10 != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                d11 = SafeParcelReader.m(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzsg(d10, d11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzsg[i10];
    }
}
