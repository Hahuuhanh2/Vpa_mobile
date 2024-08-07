package j1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* compiled from: IUnusedAppRestrictionsBackportService */
public interface c extends IInterface {

    /* renamed from: i  reason: collision with root package name */
    public static final String f11467i = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    /* compiled from: IUnusedAppRestrictionsBackportService */
    public static abstract class a extends Binder implements c {
        public a() {
            attachInterface(this, c.f11467i);
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            b bVar;
            String str = c.f11467i;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(b.f11466h);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                        bVar = new a(readStrongBinder);
                    } else {
                        bVar = (b) queryLocalInterface;
                    }
                }
                UnusedAppRestrictionsBackportService.a aVar = (UnusedAppRestrictionsBackportService.a) this;
                if (bVar != null) {
                    UnusedAppRestrictionsBackportService.this.a();
                }
                return true;
            }
        }
    }
}
