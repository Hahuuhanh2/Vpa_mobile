package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ba.g0;
import ba.n;
import com.google.firebase.auth.AdditionalUserInfo;
import p3.l0;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzp implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzp> CREATOR = new g0();

    /* renamed from: a  reason: collision with root package name */
    public final String f7530a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7531b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7532c;

    public zzp(String str, String str2, boolean z10) {
        j.c(str);
        j.c(str2);
        this.f7530a = str;
        this.f7531b = str2;
        n.c(str2);
        this.f7532c = z10;
    }

    public zzp(boolean z10) {
        this.f7532c = z10;
        this.f7531b = null;
        this.f7530a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7530a;
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, str);
        l0.f1(parcel, 2, this.f7531b);
        l0.X0(parcel, 3, this.f7532c);
        l0.o1(n12, parcel);
    }
}
