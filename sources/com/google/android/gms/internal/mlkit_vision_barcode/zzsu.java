package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzsu implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        int i10 = 0;
        String str3 = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 2) {
                str = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 3) {
                str3 = SafeParcelReader.f(readInt, parcel);
            } else if (c10 != 4) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                str2 = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzsf(i10, str, str3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzsf[i10];
    }
}
