package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzta implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 2:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 3:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 4:
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    str5 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 6:
                    str6 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 7:
                    str7 = SafeParcelReader.f(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzsh(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzsh[i10];
    }
}
