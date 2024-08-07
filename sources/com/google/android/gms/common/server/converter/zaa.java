package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e7.a;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f5461a;

    /* renamed from: b  reason: collision with root package name */
    public final StringToIntConverter f5462b;

    public zaa(int i10, StringToIntConverter stringToIntConverter) {
        this.f5461a = i10;
        this.f5462b = stringToIntConverter;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5461a);
        l0.e1(parcel, 2, this.f5462b, i10);
        l0.o1(n12, parcel);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f5461a = 1;
        this.f5462b = stringToIntConverter;
    }
}
