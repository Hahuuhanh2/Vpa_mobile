package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b7.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f5443a;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f5443a = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.e1(parcel, 1, this.f5443a, i10);
        l0.o1(n12, parcel);
    }
}
