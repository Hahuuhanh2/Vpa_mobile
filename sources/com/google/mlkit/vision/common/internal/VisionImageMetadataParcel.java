package com.google.mlkit.vision.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import sc.i;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public class VisionImageMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    public final int f7857a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7858b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7859c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7860d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7861e;

    public VisionImageMetadataParcel(int i10, int i11, int i12, long j10, int i13) {
        this.f7857a = i10;
        this.f7858b = i11;
        this.f7861e = i12;
        this.f7859c = j10;
        this.f7860d = i13;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f7857a);
        l0.b1(parcel, 2, this.f7858b);
        l0.b1(parcel, 3, this.f7861e);
        l0.c1(parcel, 4, this.f7859c);
        l0.b1(parcel, 5, this.f7860d);
        l0.o1(n12, parcel);
    }
}
