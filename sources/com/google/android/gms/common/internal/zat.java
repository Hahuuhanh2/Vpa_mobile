package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import y6.z;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new z();

    /* renamed from: a  reason: collision with root package name */
    public final int f5423a;

    /* renamed from: b  reason: collision with root package name */
    public final Account f5424b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5425c;

    /* renamed from: d  reason: collision with root package name */
    public final GoogleSignInAccount f5426d;

    public zat(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f5423a = i10;
        this.f5424b = account;
        this.f5425c = i11;
        this.f5426d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5423a);
        l0.e1(parcel, 2, this.f5424b, i10);
        l0.b1(parcel, 3, this.f5425c);
        l0.e1(parcel, 4, this.f5426d, i10);
        l0.o1(n12, parcel);
    }
}
