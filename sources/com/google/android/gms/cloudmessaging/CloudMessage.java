package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import t6.b;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public Intent f5316a;

    public CloudMessage(Intent intent) {
        this.f5316a = intent;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.e1(parcel, 1, this.f5316a, i10);
        l0.o1(n12, parcel);
    }
}
