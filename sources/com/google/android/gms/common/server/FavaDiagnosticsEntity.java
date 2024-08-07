package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d7.a;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f5455a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5456b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5457c;

    public FavaDiagnosticsEntity(int i10, int i11, String str) {
        this.f5455a = i10;
        this.f5456b = str;
        this.f5457c = i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5455a);
        l0.f1(parcel, 2, this.f5456b);
        l0.b1(parcel, 3, this.f5457c);
        l0.o1(n12, parcel);
    }
}
