package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import p3.l0;
import r7.g;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    public final int f5564a;

    /* renamed from: b  reason: collision with root package name */
    public final zat f5565b;

    public zai(int i10, zat zat) {
        this.f5564a = i10;
        this.f5565b = zat;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5564a);
        l0.e1(parcel, 2, this.f5565b, i10);
        l0.o1(n12, parcel);
    }
}
