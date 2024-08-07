package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: ICustomTabsCallback */
public interface a extends IInterface {

    /* renamed from: b.a$a  reason: collision with other inner class name */
    /* compiled from: ICustomTabsCallback */
    public static abstract class C0039a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f3856a = 0;

        /* renamed from: b.a$a$a  reason: collision with other inner class name */
        /* compiled from: ICustomTabsCallback */
        public static class C0040a implements a {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f3857a;

            public C0040a(IBinder iBinder) {
                this.f3857a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f3857a;
            }

            public final void c(Bundle bundle, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f3857a.transact(5, obtain, obtain2, 0)) {
                        int i10 = C0039a.f3856a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void v(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f3857a.transact(4, obtain, obtain2, 0)) {
                        int i10 = C0039a.f3856a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a m(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0040a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }

    void c(Bundle bundle, String str);

    void v(Bundle bundle);
}
