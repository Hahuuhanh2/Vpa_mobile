package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import b7.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5441a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5442b;

    public ModuleAvailabilityResponse(int i10, boolean z10) {
        this.f5441a = z10;
        this.f5442b = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.X0(parcel, 1, this.f5441a);
        l0.b1(parcel, 2, this.f5442b);
        l0.o1(n12, parcel);
    }
}
