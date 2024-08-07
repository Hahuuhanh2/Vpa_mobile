package x2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService;
import sk.j;
import x2.e;

/* compiled from: IMultiInstanceInvalidationService */
public interface f extends IInterface {

    /* compiled from: IMultiInstanceInvalidationService */
    public static abstract class a extends Binder implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f16901a = 0;

        /* renamed from: x2.f$a$a  reason: collision with other inner class name */
        /* compiled from: IMultiInstanceInvalidationService */
        public static class C0223a implements f {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f16902a;

            public C0223a(IBinder iBinder) {
                this.f16902a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f16902a;
            }

            public final int k(e eVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(eVar);
                    obtain.writeString(str);
                    this.f16902a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void t(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f16902a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i10 != 1598968902) {
                e eVar = null;
                if (i10 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof e)) {
                            eVar = new e.a.C0222a(readStrongBinder);
                        } else {
                            eVar = (e) queryLocalInterface;
                        }
                    }
                    int k10 = ((MultiInstanceInvalidationService.a) this).k(eVar, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(k10);
                } else if (i10 == 2) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof e)) {
                            eVar = new e.a.C0222a(readStrongBinder2);
                        } else {
                            eVar = (e) queryLocalInterface2;
                        }
                    }
                    int readInt = parcel.readInt();
                    j.f(eVar, "callback");
                    MultiInstanceInvalidationService multiInstanceInvalidationService = ((MultiInstanceInvalidationService.a) this).f3320b;
                    synchronized (multiInstanceInvalidationService.f3318c) {
                        multiInstanceInvalidationService.f3318c.unregister(eVar);
                        String str = (String) multiInstanceInvalidationService.f3317b.remove(Integer.valueOf(readInt));
                    }
                    parcel2.writeNoException();
                } else if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    ((MultiInstanceInvalidationService.a) this).t(parcel.readInt(), parcel.createStringArray());
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    int k(e eVar, String str);

    void t(int i10, String[] strArr);
}
