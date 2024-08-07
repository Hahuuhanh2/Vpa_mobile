package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import y6.t0;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new t0();

    /* renamed from: v  reason: collision with root package name */
    public static final Scope[] f5389v = new Scope[0];

    /* renamed from: w  reason: collision with root package name */
    public static final Feature[] f5390w = new Feature[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f5391a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5392b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5393c;

    /* renamed from: d  reason: collision with root package name */
    public String f5394d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f5395e;

    /* renamed from: f  reason: collision with root package name */
    public Scope[] f5396f;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f5397n;

    /* renamed from: o  reason: collision with root package name */
    public Account f5398o;

    /* renamed from: p  reason: collision with root package name */
    public Feature[] f5399p;

    /* renamed from: q  reason: collision with root package name */
    public Feature[] f5400q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f5401r;

    /* renamed from: s  reason: collision with root package name */
    public final int f5402s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5403t;

    /* renamed from: u  reason: collision with root package name */
    public final String f5404u;

    public GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z10, int i13, boolean z11, String str2) {
        b bVar;
        scopeArr = scopeArr == null ? f5389v : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f5390w : featureArr;
        featureArr2 = featureArr2 == null ? f5390w : featureArr2;
        this.f5391a = i10;
        this.f5392b = i11;
        this.f5393c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f5394d = "com.google.android.gms";
        } else {
            this.f5394d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = b.a.f5422a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof b) {
                    bVar = (b) queryLocalInterface;
                } else {
                    bVar = new c(iBinder);
                }
                int i15 = a.f5421b;
                if (bVar != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = bVar.zzb();
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th2;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f5398o = account2;
        } else {
            this.f5395e = iBinder;
            this.f5398o = account;
        }
        this.f5396f = scopeArr;
        this.f5397n = bundle;
        this.f5399p = featureArr;
        this.f5400q = featureArr2;
        this.f5401r = z10;
        this.f5402s = i13;
        this.f5403t = z11;
        this.f5404u = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        t0.a(this, parcel, i10);
    }
}
