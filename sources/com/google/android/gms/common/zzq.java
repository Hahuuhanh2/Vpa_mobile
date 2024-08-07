package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import u6.s;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new s();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5514a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5515b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5516c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5517d;

    public zzq(int i10, int i11, String str, boolean z10) {
        int i12;
        int i13;
        this.f5514a = z10;
        this.f5515b = str;
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i12 = 1;
            if (i15 >= 6) {
                i13 = 1;
                break;
            }
            i13 = iArr[i15];
            int i16 = i13 - 1;
            if (i13 == 0) {
                throw null;
            } else if (i16 == i10) {
                break;
            } else {
                i15++;
            }
        }
        this.f5516c = i13 - 1;
        int[] iArr2 = {1, 2, 3};
        while (true) {
            if (i14 >= 3) {
                break;
            }
            int i17 = iArr2[i14];
            int i18 = i17 - 1;
            if (i17 == 0) {
                throw null;
            } else if (i18 == i11) {
                i12 = i17;
                break;
            } else {
                i14++;
            }
        }
        this.f5517d = i12 - 1;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.X0(parcel, 1, this.f5514a);
        l0.f1(parcel, 2, this.f5515b);
        l0.b1(parcel, 3, this.f5516c);
        l0.b1(parcel, 4, this.f5517d);
        l0.o1(n12, parcel);
    }
}
