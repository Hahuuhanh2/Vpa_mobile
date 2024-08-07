package com.google.firebase.auth;

import aa.k;
import android.os.Parcel;
import android.os.Parcelable;
import p3.l0;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class GithubAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    public final String f7491a;

    public GithubAuthCredential(String str) {
        j.c(str);
        this.f7491a = str;
    }

    public final String P0() {
        return "github.com";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7491a;
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, str);
        l0.o1(n12, parcel);
    }
}
