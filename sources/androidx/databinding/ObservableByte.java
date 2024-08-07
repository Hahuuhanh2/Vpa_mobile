package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import d2.b;
import java.io.Serializable;

public class ObservableByte extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public byte f2193b;

    public class a implements Parcelable.Creator<ObservableByte> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        public final Object[] newArray(int i10) {
            return new ObservableByte[i10];
        }
    }

    public ObservableByte() {
        throw null;
    }

    public ObservableByte(byte b10) {
        this.f2193b = b10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f2193b);
    }
}
