package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import f7.b;
import java.util.ArrayList;
import java.util.Map;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f5484a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5485b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f5486c;

    public zal(int i10, String str, ArrayList arrayList) {
        this.f5484a = i10;
        this.f5485b = str;
        this.f5486c = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5484a);
        l0.f1(parcel, 2, this.f5485b);
        l0.j1(parcel, 3, this.f5486c);
        l0.o1(n12, parcel);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f5484a = 1;
        this.f5485b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f5486c = arrayList;
    }
}
