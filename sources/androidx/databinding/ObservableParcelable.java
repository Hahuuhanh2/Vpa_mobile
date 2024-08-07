package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import d2.i;

public class ObservableParcelable<T extends Parcelable> extends i<T> implements Parcelable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new a();

    public class a implements Parcelable.Creator<ObservableParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i10) {
            return new ObservableParcelable[i10];
        }
    }

    public ObservableParcelable() {
        throw null;
    }

    public ObservableParcelable(T t10) {
        super(t10);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable((Parcelable) this.f8545b, 0);
    }
}
