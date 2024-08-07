package com.google.firebase.auth;

import aa.q;
import android.os.Parcel;
import android.os.Parcelable;
import p3.l0;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    public final String f7508a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7509b;

    public TwitterAuthCredential(String str, String str2) {
        j.c(str);
        this.f7508a = str;
        j.c(str2);
        this.f7509b = str2;
    }

    public final String P0() {
        return "twitter.com";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7508a;
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, str);
        l0.f1(parcel, 2, this.f7509b);
        l0.o1(n12, parcel);
    }
}
