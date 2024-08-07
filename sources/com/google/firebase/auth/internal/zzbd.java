package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ba.o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p3.l0;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    public final List f7528a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7529b;

    public zzbd(ArrayList arrayList, ArrayList arrayList2) {
        this.f7528a = arrayList == null ? new ArrayList() : arrayList;
        this.f7529b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f7528a;
        int n12 = l0.n1(20293, parcel);
        l0.j1(parcel, 1, list);
        l0.j1(parcel, 2, this.f7529b);
        l0.o1(n12, parcel);
    }
}
