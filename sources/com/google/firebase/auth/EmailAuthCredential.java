package com.google.firebase.auth;

import aa.v;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p3.l0;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new v();

    /* renamed from: a  reason: collision with root package name */
    public final String f7465a;

    /* renamed from: b  reason: collision with root package name */
    public String f7466b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7467c;

    /* renamed from: d  reason: collision with root package name */
    public String f7468d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7469e;

    public EmailAuthCredential(String str, String str2, String str3, String str4, boolean z10) {
        j.c(str);
        this.f7465a = str;
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f7466b = str2;
            this.f7467c = str3;
            this.f7468d = str4;
            this.f7469e = z10;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    public final String P0() {
        return "password";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7465a;
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, str);
        l0.f1(parcel, 2, this.f7466b);
        l0.f1(parcel, 3, this.f7467c);
        l0.f1(parcel, 4, this.f7468d);
        l0.X0(parcel, 5, this.f7469e);
        l0.o1(n12, parcel);
    }
}
