package com.google.firebase.auth;

import aa.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class ActionCodeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new s();

    /* renamed from: a  reason: collision with root package name */
    public final String f7455a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7456b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7457c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7458d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7459e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7460f;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f7461n;

    /* renamed from: o  reason: collision with root package name */
    public String f7462o;

    /* renamed from: p  reason: collision with root package name */
    public int f7463p;

    /* renamed from: q  reason: collision with root package name */
    public String f7464q;

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7) {
        this.f7455a = str;
        this.f7456b = str2;
        this.f7457c = str3;
        this.f7458d = str4;
        this.f7459e = z10;
        this.f7460f = str5;
        this.f7461n = z11;
        this.f7462o = str6;
        this.f7463p = i10;
        this.f7464q = str7;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, this.f7455a);
        l0.f1(parcel, 2, this.f7456b);
        l0.f1(parcel, 3, this.f7457c);
        l0.f1(parcel, 4, this.f7458d);
        l0.X0(parcel, 5, this.f7459e);
        l0.f1(parcel, 6, this.f7460f);
        l0.X0(parcel, 7, this.f7461n);
        l0.f1(parcel, 8, this.f7462o);
        l0.b1(parcel, 9, this.f7463p);
        l0.f1(parcel, 10, this.f7464q);
        l0.o1(n12, parcel);
    }
}
