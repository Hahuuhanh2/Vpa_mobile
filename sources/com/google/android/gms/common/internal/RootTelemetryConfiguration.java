package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import y6.i0;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new i0();

    /* renamed from: a  reason: collision with root package name */
    public final int f5414a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5415b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5416c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5417d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5418e;

    public RootTelemetryConfiguration(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f5414a = i10;
        this.f5415b = z10;
        this.f5416c = z11;
        this.f5417d = i11;
        this.f5418e = i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5414a);
        l0.X0(parcel, 2, this.f5415b);
        l0.X0(parcel, 3, this.f5416c);
        l0.b1(parcel, 4, this.f5417d);
        l0.b1(parcel, 5, this.f5418e);
        l0.o1(n12, parcel);
    }
}
