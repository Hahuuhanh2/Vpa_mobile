package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;

/* compiled from: IResultReceiver */
public interface a extends IInterface {

    /* renamed from: g  reason: collision with root package name */
    public static final String f265g = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: android.support.v4.os.a$a  reason: collision with other inner class name */
    /* compiled from: IResultReceiver */
    public static abstract class C0008a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f266a = 0;

        /* renamed from: android.support.v4.os.a$a$a  reason: collision with other inner class name */
        /* compiled from: IResultReceiver */
        public static class C0009a implements a {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f267a;

            public C0009a(IBinder iBinder) {
                this.f267a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f267a;
            }

            public final void w(int i10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f265g);
                    obtain.writeInt(i10);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f267a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0008a() {
            attachInterface(this, a.f265g);
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Object obj;
            String str = a.f265g;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                ((ResultReceiver.b) this).w(readInt, (Bundle) obj);
                return true;
            }
        }
    }

    void w(int i10, Bundle bundle);
}
