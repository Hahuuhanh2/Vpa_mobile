package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import b7.e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    public final int f5446a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5447b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f5448c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f5449d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5450e;

    public ModuleInstallStatusUpdate(int i10, int i11, Long l10, Long l11, int i12) {
        this.f5446a = i10;
        this.f5447b = i11;
        this.f5448c = l10;
        this.f5449d = l11;
        this.f5450e = i12;
        if (l10 != null && l11 != null && l11.longValue() != 0) {
            l10.longValue();
            if (l11.longValue() == 0) {
                throw new IllegalArgumentException("Given Long is zero");
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5446a);
        l0.b1(parcel, 2, this.f5447b);
        l0.d1(parcel, 3, this.f5448c);
        l0.d1(parcel, 4, this.f5449d);
        l0.b1(parcel, 5, this.f5450e);
        l0.o1(n12, parcel);
    }
}
