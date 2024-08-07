package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzak implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 3) {
                i11 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 4) {
                i12 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 5) {
                j10 = SafeParcelReader.p(readInt, parcel);
            } else if (c10 != 6) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                i13 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzaj(i10, i11, i12, j10, i13);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaj[i10];
    }
}
