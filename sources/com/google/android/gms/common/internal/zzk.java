package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import y6.r0;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new r0();

    /* renamed from: a  reason: collision with root package name */
    public Bundle f5437a;

    /* renamed from: b  reason: collision with root package name */
    public Feature[] f5438b;

    /* renamed from: c  reason: collision with root package name */
    public int f5439c;

    /* renamed from: d  reason: collision with root package name */
    public ConnectionTelemetryConfiguration f5440d;

    public zzk() {
    }

    public zzk(Bundle bundle, Feature[] featureArr, int i10, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f5437a = bundle;
        this.f5438b = featureArr;
        this.f5439c = i10;
        this.f5440d = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.Y0(parcel, 1, this.f5437a);
        l0.i1(parcel, 2, this.f5438b, i10);
        l0.b1(parcel, 3, this.f5439c);
        l0.e1(parcel, 4, this.f5440d, i10);
        l0.o1(n12, parcel);
    }
}
