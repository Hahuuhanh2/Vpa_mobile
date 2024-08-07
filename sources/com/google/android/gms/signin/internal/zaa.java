package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import r7.b;
import v6.e;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaa extends AbstractSafeParcelable implements e {
    public static final Parcelable.Creator<zaa> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f5559a;

    /* renamed from: b  reason: collision with root package name */
    public int f5560b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f5561c;

    public zaa() {
        this(2, 0, (Intent) null);
    }

    public final Status getStatus() {
        if (this.f5560b == 0) {
            return Status.f5340e;
        }
        return Status.f5344p;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5559a);
        l0.b1(parcel, 2, this.f5560b);
        l0.e1(parcel, 3, this.f5561c, i10);
        l0.o1(n12, parcel);
    }

    public zaa(int i10, int i11, Intent intent) {
        this.f5559a = i10;
        this.f5560b = i11;
        this.f5561c = intent;
    }
}
