package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f5487a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5488b;

    /* renamed from: c  reason: collision with root package name */
    public final FastJsonResponse.Field f5489c;

    public zam(int i10, String str, FastJsonResponse.Field field) {
        this.f5487a = i10;
        this.f5488b = str;
        this.f5489c = field;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5487a);
        l0.f1(parcel, 2, this.f5488b);
        l0.e1(parcel, 3, this.f5489c, i10);
        l0.o1(n12, parcel);
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.f5487a = 1;
        this.f5488b = str;
        this.f5489c = field;
    }
}
