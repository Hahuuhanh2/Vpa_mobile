package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import d2.b;
import java.io.Serializable;

public class ObservableInt extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public int f2197b;

    public class a implements Parcelable.Creator<ObservableInt> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new ObservableInt[i10];
        }
    }

    public ObservableInt() {
        throw null;
    }

    public ObservableInt(int i10) {
        this.f2197b = i10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2197b);
    }
}
