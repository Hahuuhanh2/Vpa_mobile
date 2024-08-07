package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import y6.y;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    public final int f5405a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5406b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5407c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5408d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5409e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5410f;

    /* renamed from: n  reason: collision with root package name */
    public final String f5411n;

    /* renamed from: o  reason: collision with root package name */
    public final int f5412o;

    /* renamed from: p  reason: collision with root package name */
    public final int f5413p;

    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f5405a = i10;
        this.f5406b = i11;
        this.f5407c = i12;
        this.f5408d = j10;
        this.f5409e = j11;
        this.f5410f = str;
        this.f5411n = str2;
        this.f5412o = i13;
        this.f5413p = i14;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5405a);
        l0.b1(parcel, 2, this.f5406b);
        l0.b1(parcel, 3, this.f5407c);
        l0.c1(parcel, 4, this.f5408d);
        l0.c1(parcel, 5, this.f5409e);
        l0.f1(parcel, 6, this.f5410f);
        l0.f1(parcel, 7, this.f5411n);
        l0.b1(parcel, 8, this.f5412o);
        l0.b1(parcel, 9, this.f5413p);
        l0.o1(n12, parcel);
    }
}
