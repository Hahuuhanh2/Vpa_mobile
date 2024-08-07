package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ba.f;
import com.google.firebase.auth.MultiFactorSession;
import java.util.ArrayList;
import java.util.List;
import p3.l0;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzag extends MultiFactorSession {
    public static final Parcelable.Creator<zzag> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    public String f7523a;

    /* renamed from: b  reason: collision with root package name */
    public String f7524b;

    /* renamed from: c  reason: collision with root package name */
    public List f7525c;

    /* renamed from: d  reason: collision with root package name */
    public List f7526d;

    /* renamed from: e  reason: collision with root package name */
    public zzx f7527e;

    public zzag() {
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, this.f7523a);
        l0.f1(parcel, 2, this.f7524b);
        l0.j1(parcel, 3, this.f7525c);
        l0.j1(parcel, 4, this.f7526d);
        l0.e1(parcel, 5, this.f7527e, i10);
        l0.o1(n12, parcel);
    }

    public zzag(String str, String str2, ArrayList arrayList, ArrayList arrayList2, zzx zzx) {
        this.f7523a = str;
        this.f7524b = str2;
        this.f7525c = arrayList;
        this.f7526d = arrayList2;
        this.f7527e = zzx;
    }
}
