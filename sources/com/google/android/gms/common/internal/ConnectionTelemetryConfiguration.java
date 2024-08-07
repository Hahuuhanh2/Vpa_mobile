package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import y6.s0;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new s0();

    /* renamed from: a  reason: collision with root package name */
    public final RootTelemetryConfiguration f5383a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5384b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5385c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f5386d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5387e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f5388f;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f5383a = rootTelemetryConfiguration;
        this.f5384b = z10;
        this.f5385c = z11;
        this.f5386d = iArr;
        this.f5387e = i10;
        this.f5388f = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.e1(parcel, 1, this.f5383a, i10);
        l0.X0(parcel, 2, this.f5384b);
        l0.X0(parcel, 3, this.f5385c);
        int[] iArr = this.f5386d;
        if (iArr != null) {
            int n13 = l0.n1(4, parcel);
            parcel.writeIntArray(iArr);
            l0.o1(n13, parcel);
        }
        l0.b1(parcel, 5, this.f5387e);
        int[] iArr2 = this.f5388f;
        if (iArr2 != null) {
            int n14 = l0.n1(6, parcel);
            parcel.writeIntArray(iArr2);
            l0.o1(n14, parcel);
        }
        l0.o1(n12, parcel);
    }
}
