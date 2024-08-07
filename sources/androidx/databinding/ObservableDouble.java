package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import d2.b;
import java.io.Serializable;

public class ObservableDouble extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public double f2195b;

    public class a implements Parcelable.Creator<ObservableDouble> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        public final Object[] newArray(int i10) {
            return new ObservableDouble[i10];
        }
    }

    public ObservableDouble() {
        throw null;
    }

    public ObservableDouble(double d10) {
        this.f2195b = d10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeDouble(this.f2195b);
    }
}
