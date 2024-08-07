package com.google.firebase.auth;

import aa.l;
import android.os.Parcel;
import android.os.Parcelable;
import p3.l0;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class GoogleAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    public final String f7492a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7493b;

    public GoogleAuthCredential(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        } else if (str2 == null || str2.length() != 0) {
            this.f7492a = str;
            this.f7493b = str2;
        } else {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
    }

    public final String P0() {
        return "google.com";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7492a;
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, str);
        l0.f1(parcel, 2, this.f7493b);
        l0.o1(n12, parcel);
    }
}
