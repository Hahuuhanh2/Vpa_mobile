package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e7.c;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final int f5463a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5464b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5465c;

    public zac(int i10, int i11, String str) {
        this.f5463a = i10;
        this.f5464b = str;
        this.f5465c = i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5463a);
        l0.f1(parcel, 2, this.f5464b);
        l0.b1(parcel, 3, this.f5465c);
        l0.o1(n12, parcel);
    }

    public zac(String str, int i10) {
        this.f5463a = 1;
        this.f5464b = str;
        this.f5465c = i10;
    }
}
