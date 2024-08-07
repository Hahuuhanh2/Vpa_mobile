package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import d2.b;
import java.io.Serializable;

public class ObservableLong extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public long f2198b;

    public class a implements Parcelable.Creator<ObservableLong> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        public final Object[] newArray(int i10) {
            return new ObservableLong[i10];
        }
    }

    public ObservableLong() {
        throw null;
    }

    public ObservableLong(long j10) {
        this.f2198b = j10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f2198b);
    }
}
