package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahc implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < t10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 3) {
                str2 = SafeParcelReader.f(readInt, parcel);
            } else if (c10 == 4) {
                l10 = SafeParcelReader.q(readInt, parcel);
            } else if (c10 == 5) {
                str3 = SafeParcelReader.f(readInt, parcel);
            } else if (c10 != 6) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                l11 = SafeParcelReader.q(readInt, parcel);
            }
        }
        SafeParcelReader.k(t10, parcel);
        return new zzahb(str, str2, l10, str3, l11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzahb[i10];
    }
}
