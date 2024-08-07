package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import t6.d;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    public Messenger f5318a;

    public zzd(IBinder iBinder) {
        this.f5318a = new Messenger(iBinder);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f5318a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((zzd) obj).f5318a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f5318a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f5318a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
