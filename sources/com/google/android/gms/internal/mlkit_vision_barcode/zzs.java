package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzs implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        String str = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 3:
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 4:
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 5:
                    i13 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 6:
                    i14 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 7:
                    i15 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 8:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 9:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzf(i10, i11, i12, i13, i14, i15, z10, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzf[i10];
    }
}
