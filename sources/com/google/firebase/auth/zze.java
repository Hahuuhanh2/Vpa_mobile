package com.google.firebase.auth;

import aa.u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzac;
import com.google.android.gms.internal.p001firebaseauthapi.zzaic;
import p3.l0;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new u();

    /* renamed from: a  reason: collision with root package name */
    public final String f7558a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7559b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7560c;

    /* renamed from: d  reason: collision with root package name */
    public final zzaic f7561d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7562e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7563f;

    /* renamed from: n  reason: collision with root package name */
    public final String f7564n;

    public zze(String str, String str2, String str3, zzaic zzaic, String str4, String str5, String str6) {
        this.f7558a = zzac.zzc(str);
        this.f7559b = str2;
        this.f7560c = str3;
        this.f7561d = zzaic;
        this.f7562e = str4;
        this.f7563f = str5;
        this.f7564n = str6;
    }

    public static zze R0(zzaic zzaic) {
        if (zzaic != null) {
            return new zze((String) null, (String) null, (String) null, zzaic, (String) null, (String) null, (String) null);
        }
        throw new NullPointerException("Must specify a non-null webSignInCredential");
    }

    public final String P0() {
        return this.f7558a;
    }

    public final AuthCredential Q0() {
        return new zze(this.f7558a, this.f7559b, this.f7560c, this.f7561d, this.f7562e, this.f7563f, this.f7564n);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7558a;
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, str);
        l0.f1(parcel, 2, this.f7559b);
        l0.f1(parcel, 3, this.f7560c);
        l0.e1(parcel, 4, this.f7561d, i10);
        l0.f1(parcel, 5, this.f7562e);
        l0.f1(parcel, 6, this.f7563f);
        l0.f1(parcel, 7, this.f7564n);
        l0.o1(n12, parcel);
    }
}
