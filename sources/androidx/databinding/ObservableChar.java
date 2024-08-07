package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import d2.b;
import java.io.Serializable;

public class ObservableChar extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public char f2194b;

    public class a implements Parcelable.Creator<ObservableChar> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new ObservableChar[i10];
        }
    }

    public ObservableChar() {
        throw null;
    }

    public ObservableChar(char c10) {
        this.f2194b = c10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2194b);
    }
}
