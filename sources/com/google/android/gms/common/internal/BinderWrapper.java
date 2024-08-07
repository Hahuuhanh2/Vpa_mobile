package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import y6.q0;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new q0();

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f5380a;

    public /* synthetic */ BinderWrapper(Parcel parcel) {
        this.f5380a = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStrongBinder(this.f5380a);
    }
}
