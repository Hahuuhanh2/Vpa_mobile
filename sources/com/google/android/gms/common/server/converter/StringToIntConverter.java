package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e7.b;
import java.util.ArrayList;
import java.util.HashMap;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class StringToIntConverter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f5458a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5459b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray f5460c;

    public StringToIntConverter() {
        this.f5458a = 1;
        this.f5459b = new HashMap();
        this.f5460c = new SparseArray();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5458a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f5459b.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f5459b.get(str)).intValue()));
        }
        l0.j1(parcel, 2, arrayList);
        l0.o1(n12, parcel);
    }

    public StringToIntConverter(int i10, ArrayList arrayList) {
        this.f5458a = i10;
        this.f5459b = new HashMap();
        this.f5460c = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zac zac = (zac) arrayList.get(i11);
            String str = zac.f5464b;
            int i12 = zac.f5465c;
            this.f5459b.put(str, Integer.valueOf(i12));
            this.f5460c.put(i12, str);
        }
    }
}
