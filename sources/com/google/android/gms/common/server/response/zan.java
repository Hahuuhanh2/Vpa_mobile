package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import f7.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p3.l0;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f5490a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5491b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5492c;

    public zan(int i10, String str, ArrayList arrayList) {
        this.f5490a = i10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zal zal = (zal) arrayList.get(i11);
            String str2 = zal.f5485b;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = zal.f5486c;
            j.f(arrayList2);
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                zam zam = (zam) zal.f5486c.get(i12);
                hashMap2.put(zam.f5488b, zam.f5489c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f5491b = hashMap;
        j.f(str);
        this.f5492c = str;
        for (String str3 : hashMap.keySet()) {
            Map map = (Map) this.f5491b.get(str3);
            for (String str4 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str4)).f5475q = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f5491b.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.f5491b.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5490a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f5491b.keySet()) {
            arrayList.add(new zal(str, (Map) this.f5491b.get(str)));
        }
        l0.j1(parcel, 2, arrayList);
        l0.f1(parcel, 3, this.f5492c);
        l0.o1(n12, parcel);
    }
}
