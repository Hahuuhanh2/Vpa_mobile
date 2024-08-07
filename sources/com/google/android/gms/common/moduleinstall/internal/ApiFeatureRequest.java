package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c7.d;
import c7.e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p3.l0;
import v6.b;
import y6.i;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    public final List f5451a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5452b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5453c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5454d;

    public ApiFeatureRequest(ArrayList arrayList, boolean z10, String str, String str2) {
        j.f(arrayList);
        this.f5451a = arrayList;
        this.f5452b = z10;
        this.f5453c = str;
        this.f5454d = str2;
    }

    public static ApiFeatureRequest P0(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(d.f4571a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((b) it.next()).d());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z10, (String) null, (String) null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.f5452b != apiFeatureRequest.f5452b || !i.a(this.f5451a, apiFeatureRequest.f5451a) || !i.a(this.f5453c, apiFeatureRequest.f5453c) || !i.a(this.f5454d, apiFeatureRequest.f5454d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5452b), this.f5451a, this.f5453c, this.f5454d});
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.j1(parcel, 1, this.f5451a);
        l0.X0(parcel, 2, this.f5452b);
        l0.f1(parcel, 3, this.f5453c);
        l0.f1(parcel, 4, this.f5454d);
        l0.o1(n12, parcel);
    }
}
