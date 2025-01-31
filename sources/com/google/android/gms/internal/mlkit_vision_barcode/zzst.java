package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzst implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 2:
                    str2 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 3:
                    str3 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 4:
                    str4 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 5:
                    str5 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 6:
                    str6 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 7:
                    str7 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 8:
                    str8 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 9:
                    str9 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 10:
                    str10 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 11:
                    str11 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 12:
                    str12 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 13:
                    str13 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 14:
                    str14 = SafeParcelReader.f(readInt, parcel2);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel2);
                    break;
            }
        }
        SafeParcelReader.k(t10, parcel2);
        return new zzse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzse[i10];
    }
}
