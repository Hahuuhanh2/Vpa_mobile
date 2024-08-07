package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import y6.j0;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new j0();

    /* renamed from: a  reason: collision with root package name */
    public final int f5436a;

    public zzak(int i10) {
        this.f5436a = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f5436a;
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, i11);
        l0.o1(n12, parcel);
    }
}
