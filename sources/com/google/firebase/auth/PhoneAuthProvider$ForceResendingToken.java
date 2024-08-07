package com.google.firebase.auth;

import aa.t;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class PhoneAuthProvider$ForceResendingToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhoneAuthProvider$ForceResendingToken> CREATOR = new t();

    public final void writeToParcel(Parcel parcel, int i10) {
        l0.o1(l0.n1(20293, parcel), parcel);
    }
}
