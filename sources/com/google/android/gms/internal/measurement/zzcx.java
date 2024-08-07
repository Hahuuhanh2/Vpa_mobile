package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public final class zzcx extends zzbu implements zzcv {
    public zzcx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void zza(Bundle bundle) {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        zzb(1, a_);
    }
}
