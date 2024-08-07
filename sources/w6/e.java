package w6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public interface e extends IInterface {

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static abstract class a extends zab implements e {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static e asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface instanceof e) {
                return (e) queryLocalInterface;
            }
            return new g0(iBinder);
        }

        public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            zac.zab(parcel);
            onResult((Status) zac.zaa(parcel, Status.CREATOR));
            return true;
        }
    }

    void onResult(Status status);
}
