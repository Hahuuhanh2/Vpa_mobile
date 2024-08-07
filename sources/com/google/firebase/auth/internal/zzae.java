package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ba.e;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;
import p3.l0;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzae extends MultiFactorResolver {
    public static final Parcelable.Creator<zzae> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    public final List f7517a;

    /* renamed from: b  reason: collision with root package name */
    public final zzag f7518b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7519c;

    /* renamed from: d  reason: collision with root package name */
    public final zze f7520d;

    /* renamed from: e  reason: collision with root package name */
    public final zzx f7521e;

    /* renamed from: f  reason: collision with root package name */
    public final List f7522f;

    public zzae(ArrayList arrayList, zzag zzag, String str, zze zze, zzx zzx, ArrayList arrayList2) {
        j.f(arrayList);
        this.f7517a = arrayList;
        j.f(zzag);
        this.f7518b = zzag;
        j.c(str);
        this.f7519c = str;
        this.f7520d = zze;
        this.f7521e = zzx;
        j.f(arrayList2);
        this.f7522f = arrayList2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f7517a;
        int n12 = l0.n1(20293, parcel);
        l0.j1(parcel, 1, list);
        l0.e1(parcel, 2, this.f7518b, i10);
        l0.f1(parcel, 3, this.f7519c);
        l0.e1(parcel, 4, this.f7520d, i10);
        l0.e1(parcel, 5, this.f7521e, i10);
        l0.j1(parcel, 6, this.f7522f);
        l0.o1(n12, parcel);
    }
}
