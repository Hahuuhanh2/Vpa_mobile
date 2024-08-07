package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;

/* compiled from: IMediaSession */
public interface b extends IInterface {

    /* compiled from: IMediaSession */
    public static abstract class a extends Binder implements b {

        /* renamed from: android.support.v4.media.session.b$a$a  reason: collision with other inner class name */
        /* compiled from: IMediaSession */
        public static class C0007a implements b {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f258a;

            public C0007a(IBinder iBinder) {
                this.f258a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f258a;
            }

            public final void g(MediaControllerCompat$MediaControllerImplApi21.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar);
                    this.f258a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b m(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                return new C0007a(iBinder);
            }
            return (b) queryLocalInterface;
        }
    }

    void g(MediaControllerCompat$MediaControllerImplApi21.a aVar);
}
