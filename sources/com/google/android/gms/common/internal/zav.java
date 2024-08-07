package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import y6.a0;
import y6.i;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new a0();

    /* renamed from: a  reason: collision with root package name */
    public final int f5427a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f5428b;

    /* renamed from: c  reason: collision with root package name */
    public final ConnectionResult f5429c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5430d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5431e;

    public zav(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f5427a = i10;
        this.f5428b = iBinder;
        this.f5429c = connectionResult;
        this.f5430d = z10;
        this.f5431e = z11;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zav = (zav) obj;
        if (this.f5429c.equals(zav.f5429c)) {
            IBinder iBinder = this.f5428b;
            Object obj4 = null;
            if (iBinder == null) {
                obj2 = null;
            } else {
                int i10 = b.a.f5422a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof b) {
                    obj2 = (b) queryLocalInterface;
                } else {
                    obj2 = new c(iBinder);
                }
            }
            IBinder iBinder2 = zav.f5428b;
            if (iBinder2 != null) {
                int i11 = b.a.f5422a;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof b) {
                    obj3 = (b) queryLocalInterface2;
                } else {
                    obj3 = new c(iBinder2);
                }
                obj4 = obj3;
            }
            if (i.a(obj2, obj4)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5427a);
        l0.a1(parcel, 2, this.f5428b);
        l0.e1(parcel, 3, this.f5429c, i10);
        l0.X0(parcel, 4, this.f5430d);
        l0.X0(parcel, 5, this.f5431e);
        l0.o1(n12, parcel);
    }
}
