package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import d2.b;
import java.io.Serializable;

public class ObservableShort extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public short f2199b;

    public class a implements Parcelable.Creator<ObservableShort> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new ObservableShort[i10];
        }
    }

    public ObservableShort() {
        throw null;
    }

    public ObservableShort(short s10) {
        this.f2199b = s10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2199b);
    }
}
