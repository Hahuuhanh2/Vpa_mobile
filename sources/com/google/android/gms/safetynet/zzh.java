package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o7.i;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    public final int f5557a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5558b;

    public zzh(int i10, boolean z10) {
        this.f5557a = i10;
        this.f5558b = z10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 2, this.f5557a);
        l0.X0(parcel, 3, this.f5558b);
        l0.o1(n12, parcel);
    }
}
