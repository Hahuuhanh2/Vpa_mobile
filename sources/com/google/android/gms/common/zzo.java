package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import k7.a;
import k7.b;
import p3.l0;
import u6.r;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new r();

    /* renamed from: a  reason: collision with root package name */
    public final String f5508a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5509b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5510c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f5511d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5512e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5513f;

    public zzo(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f5508a = str;
        this.f5509b = z10;
        this.f5510c = z11;
        this.f5511d = (Context) b.o(a.C0135a.m(iBinder));
        this.f5512e = z12;
        this.f5513f = z13;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f5508a;
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, str);
        l0.X0(parcel, 2, this.f5509b);
        l0.X0(parcel, 3, this.f5510c);
        l0.a1(parcel, 4, new b(this.f5511d));
        l0.X0(parcel, 5, this.f5512e);
        l0.X0(parcel, 6, this.f5513f);
        l0.o1(n12, parcel);
    }
}
