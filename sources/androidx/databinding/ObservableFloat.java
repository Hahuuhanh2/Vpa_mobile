package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import d2.b;
import java.io.Serializable;

public class ObservableFloat extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public float f2196b;

    public class a implements Parcelable.Creator<ObservableFloat> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        public final Object[] newArray(int i10) {
            return new ObservableFloat[i10];
        }
    }

    public ObservableFloat() {
        throw null;
    }

    public ObservableFloat(float f10) {
        this.f2196b = f10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f2196b);
    }
}
