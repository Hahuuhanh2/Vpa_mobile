package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o7.g;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    public final long f5552a;

    /* renamed from: b  reason: collision with root package name */
    public final HarmfulAppsData[] f5553b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5554c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5555d;

    public zzd(long j10, HarmfulAppsData[] harmfulAppsDataArr, int i10, boolean z10) {
        this.f5552a = j10;
        this.f5553b = harmfulAppsDataArr;
        this.f5555d = z10;
        if (z10) {
            this.f5554c = i10;
        } else {
            this.f5554c = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.c1(parcel, 2, this.f5552a);
        l0.i1(parcel, 3, this.f5553b, i10);
        l0.b1(parcel, 4, this.f5554c);
        l0.X0(parcel, 5, this.f5555d);
        l0.o1(n12, parcel);
    }
}
