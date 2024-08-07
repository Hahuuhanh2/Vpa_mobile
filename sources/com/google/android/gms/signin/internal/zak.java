package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import p3.l0;
import r7.h;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    public final int f5566a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectionResult f5567b;

    /* renamed from: c  reason: collision with root package name */
    public final zav f5568c;

    public zak(int i10, ConnectionResult connectionResult, zav zav) {
        this.f5566a = i10;
        this.f5567b = connectionResult;
        this.f5568c = zav;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5566a);
        l0.e1(parcel, 2, this.f5567b, i10);
        l0.e1(parcel, 3, this.f5568c, i10);
        l0.o1(n12, parcel);
    }
}
