package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import d2.b;
import java.io.Serializable;

public class ObservableBoolean extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2192b;

    public class a implements Parcelable.Creator<ObservableBoolean> {
        public final Object createFromParcel(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            return new ObservableBoolean(z10);
        }

        public final Object[] newArray(int i10) {
            return new ObservableBoolean[i10];
        }
    }

    public ObservableBoolean() {
        throw null;
    }

    public ObservableBoolean(boolean z10) {
        this.f2192b = z10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2192b ? 1 : 0);
    }
}
