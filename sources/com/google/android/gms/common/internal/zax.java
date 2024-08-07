package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import y6.b0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new b0();

    /* renamed from: a  reason: collision with root package name */
    public final int f5432a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5433b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5434c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public final Scope[] f5435d;

    public zax(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f5432a = i10;
        this.f5433b = i11;
        this.f5434c = i12;
        this.f5435d = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5432a);
        l0.b1(parcel, 2, this.f5433b);
        l0.b1(parcel, 3, this.f5434c);
        l0.i1(parcel, 4, this.f5435d, i10);
        l0.o1(n12, parcel);
    }
}
