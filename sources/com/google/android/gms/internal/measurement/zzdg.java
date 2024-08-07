package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public final class zzdg implements Parcelable.Creator<zzdd> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int t10 = SafeParcelReader.t(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = SafeParcelReader.p(readInt, parcel2);
                    break;
                case 2:
                    j11 = SafeParcelReader.p(readInt, parcel2);
                    break;
                case 3:
                    z10 = SafeParcelReader.l(readInt, parcel2);
                    break;
                case 4:
                    str = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 5:
                    str2 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 6:
                    str3 = SafeParcelReader.f(readInt, parcel2);
                    break;
                case 7:
                    bundle = SafeParcelReader.b(readInt, parcel2);
                    break;
                case 8:
                    str4 = SafeParcelReader.f(readInt, parcel2);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel2);
                    break;
            }
        }
        SafeParcelReader.k(t10, parcel2);
        return new zzdd(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdd[i10];
    }
}
