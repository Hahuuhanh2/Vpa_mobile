package s8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f14656a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14657b;

    public a(IBinder iBinder, String str) {
        this.f14656a = iBinder;
        this.f14657b = str;
    }

    public final IBinder asBinder() {
        return this.f14656a;
    }

    public final void m(int i10, Parcel parcel) {
        try {
            this.f14656a.transact(i10, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
