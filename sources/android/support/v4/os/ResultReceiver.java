package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;

@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public a f263a;

    public class a implements Parcelable.Creator<ResultReceiver> {
        public final Object createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public final Object[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    public class b extends a.C0008a {
        public b() {
        }

        public final void w(int i10, Bundle bundle) {
            ResultReceiver.this.getClass();
            ResultReceiver.this.a(i10, bundle);
        }
    }

    public ResultReceiver(Parcel parcel) {
        a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i10 = a.C0008a.f266a;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(a.f265g);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                aVar = new a.C0008a.C0009a(readStrongBinder);
            } else {
                aVar = (a) queryLocalInterface;
            }
        }
        this.f263a = aVar;
    }

    public void a(int i10, Bundle bundle) {
    }

    public final void d(int i10, Bundle bundle) {
        a aVar = this.f263a;
        if (aVar != null) {
            try {
                aVar.w(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f263a == null) {
                this.f263a = new b();
            }
            parcel.writeStrongBinder(this.f263a.asBinder());
        }
    }
}
