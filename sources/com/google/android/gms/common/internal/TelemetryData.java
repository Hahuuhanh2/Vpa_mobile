package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p3.l0;
import y6.o;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    public final int f5419a;

    /* renamed from: b  reason: collision with root package name */
    public List f5420b;

    public TelemetryData(int i10, List list) {
        this.f5419a = i10;
        this.f5420b = list;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5419a);
        l0.j1(parcel, 2, this.f5420b);
        l0.o1(n12, parcel);
    }
}
