package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p3.l0;
import r7.f;
import v6.e;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zag extends AbstractSafeParcelable implements e {
    public static final Parcelable.Creator<zag> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    public final List f5562a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5563b;

    public zag(String str, ArrayList arrayList) {
        this.f5562a = arrayList;
        this.f5563b = str;
    }

    public final Status getStatus() {
        if (this.f5563b != null) {
            return Status.f5340e;
        }
        return Status.f5344p;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.h1(parcel, 1, this.f5562a);
        l0.f1(parcel, 2, this.f5563b);
        l0.o1(n12, parcel);
    }
}
