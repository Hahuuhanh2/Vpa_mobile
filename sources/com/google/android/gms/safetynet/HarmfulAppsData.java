package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o7.f;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HarmfulAppsData> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    public final String f5543a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5544b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5545c;

    public HarmfulAppsData(String str, byte[] bArr, int i10) {
        this.f5543a = str;
        this.f5544b = bArr;
        this.f5545c = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 2, this.f5543a);
        l0.Z0(parcel, 3, this.f5544b);
        l0.b1(parcel, 4, this.f5545c);
        l0.o1(n12, parcel);
    }
}
