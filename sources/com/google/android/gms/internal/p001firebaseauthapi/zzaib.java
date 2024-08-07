package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaib  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaib implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int t10 = SafeParcelReader.t(parcel);
        while (parcel.dataPosition() < t10) {
            SafeParcelReader.s(parcel.readInt(), parcel);
        }
        SafeParcelReader.k(t10, parcel);
        return new zzaia();
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaia[i10];
    }
}
