package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import k7.a;
import k7.b;
import p3.l0;
import u6.n;
import u6.t;
import y6.a1;
import y6.b1;
import y6.e0;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new t();

    /* renamed from: a  reason: collision with root package name */
    public final String f5518a;

    /* renamed from: b  reason: collision with root package name */
    public final n f5519b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5520c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5521d;

    public zzs(String str, IBinder iBinder, boolean z10, boolean z11) {
        e0 e0Var;
        byte[] bArr;
        this.f5518a = str;
        n nVar = null;
        if (iBinder != null) {
            try {
                int i10 = b1.f17546a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof e0) {
                    e0Var = (e0) queryLocalInterface;
                } else {
                    e0Var = new a1(iBinder);
                }
                a zzd = e0Var.zzd();
                if (zzd == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) b.o(zzd);
                }
                if (bArr != null) {
                    nVar = new n(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f5519b = nVar;
        this.f5520c = z10;
        this.f5521d = z11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f5518a;
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, str);
        n nVar = this.f5519b;
        if (nVar == null) {
            nVar = null;
        }
        l0.a1(parcel, 2, nVar);
        l0.X0(parcel, 3, this.f5520c);
        l0.X0(parcel, 4, this.f5521d);
        l0.o1(n12, parcel);
    }
}
