package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaid  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaid implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int t10 = SafeParcelReader.t(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
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
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 4:
                    str3 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 6:
                    str5 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 7:
                    str6 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 8:
                    str7 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 9:
                    str8 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 10:
                    z10 = SafeParcelReader.l(readInt, parcel2);
                    break;
                case 11:
                    z11 = SafeParcelReader.l(readInt, parcel2);
                    break;
                case 12:
                    str9 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 13:
                    str10 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 14:
                    str11 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 15:
                    str12 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 16:
                    z12 = SafeParcelReader.l(readInt, parcel2);
                    break;
                case 17:
                    str13 = SafeParcelReader.f(readInt, parcel2);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel2);
                    break;
            }
        }
        SafeParcelReader.k(t10, parcel2);
        return new zzaic(str, str2, str3, str4, str5, str6, str7, str8, z10, z11, str9, str10, str11, str12, z12, str13);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaic[i10];
    }
}
