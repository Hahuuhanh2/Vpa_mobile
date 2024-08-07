package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class b implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        int i10 = 0;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.o(readInt, parcel);
            } else if (c10 == 2) {
                str = SafeParcelReader.f(readInt, parcel);
            } else if (c10 != 3) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                field = (FastJsonResponse.Field) SafeParcelReader.e(parcel, readInt, FastJsonResponse.Field.CREATOR);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zam(i10, str, field);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zam[i10];
    }
}
