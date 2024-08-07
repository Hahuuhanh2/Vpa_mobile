package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import b7.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    public final int f5444a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5445b;

    public ModuleInstallResponse(int i10, boolean z10) {
        this.f5444a = i10;
        this.f5445b = z10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5444a);
        l0.X0(parcel, 2, this.f5445b);
        l0.o1(n12, parcel);
    }
}
