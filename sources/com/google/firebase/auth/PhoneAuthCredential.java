package com.google.firebase.auth;

import aa.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p3.l0;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    public final String f7494a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7495b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7496c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7497d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7498e;

    public PhoneAuthCredential(String str, String str2, String str3, String str4, boolean z10) {
        boolean z11;
        if ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) {
            z11 = false;
        } else {
            z11 = true;
        }
        j.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", z11);
        this.f7494a = str;
        this.f7495b = str2;
        this.f7496c = str3;
        this.f7497d = z10;
        this.f7498e = str4;
    }

    public final String P0() {
        return "phone";
    }

    public final Object clone() {
        return new PhoneAuthCredential(this.f7494a, this.f7495b, this.f7496c, this.f7498e, this.f7497d);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7494a;
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, str);
        l0.f1(parcel, 2, this.f7495b);
        l0.f1(parcel, 4, this.f7496c);
        l0.X0(parcel, 5, this.f7497d);
        l0.f1(parcel, 6, this.f7498e);
        l0.o1(n12, parcel);
    }
}
