package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import x6.a;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f5363a;

    /* renamed from: b  reason: collision with root package name */
    public ParcelFileDescriptor f5364b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5365c;

    public BitmapTeleporter(int i10, ParcelFileDescriptor parcelFileDescriptor, int i11) {
        this.f5363a = i10;
        this.f5364b = parcelFileDescriptor;
        this.f5365c = i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        if (this.f5364b != null) {
            int n12 = l0.n1(20293, parcel);
            l0.b1(parcel, 1, this.f5363a);
            l0.e1(parcel, 2, this.f5364b, i10 | 1);
            l0.b1(parcel, 3, this.f5365c);
            l0.o1(n12, parcel);
            this.f5364b = null;
            return;
        }
        j.f((Object) null);
        throw null;
    }
}
