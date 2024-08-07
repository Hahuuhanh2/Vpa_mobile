package x2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x2.j;

/* compiled from: IMultiInstanceInvalidationCallback */
public interface e extends IInterface {

    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class a extends Binder implements e {

        /* renamed from: x2.e$a$a  reason: collision with other inner class name */
        /* compiled from: IMultiInstanceInvalidationCallback */
        public static class C0222a implements e {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f16900a;

            public C0222a(IBinder iBinder) {
                this.f16900a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f16900a;
            }

            public final void e(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f16900a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                ((j.b) this).e(parcel.createStringArray());
                return true;
            }
        }
    }

    void e(String[] strArr);
}
