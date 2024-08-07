package y6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class g0 implements g {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f17556a;

    public g0(IBinder iBinder) {
        this.f17556a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f17556a;
    }

    public final void n(m0 m0Var, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(m0Var.asBinder());
            obtain.writeInt(1);
            t0.a(getServiceRequest, obtain, 0);
            this.f17556a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
