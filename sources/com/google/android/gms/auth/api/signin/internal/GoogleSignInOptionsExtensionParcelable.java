package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import s6.b;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f5313a;

    /* renamed from: b  reason: collision with root package name */
    public int f5314b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f5315c;

    public GoogleSignInOptionsExtensionParcelable(int i10, int i11, Bundle bundle) {
        this.f5313a = i10;
        this.f5314b = i11;
        this.f5315c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5313a);
        l0.b1(parcel, 2, this.f5314b);
        l0.Y0(parcel, 3, this.f5315c);
        l0.o1(n12, parcel);
    }
}
