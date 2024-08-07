package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final AbsSavedState f2187b = new AbsSavedState() {
    };

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f2188a;

    public AbsSavedState() {
        this.f2188a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f2188a, i10);
    }

    public class a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return AbsSavedState.f2187b;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final Object[] newArray(int i10) {
            return new AbsSavedState[i10];
        }

        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f2187b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2188a = parcelable == f2187b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2188a = readParcelable == null ? f2187b : readParcelable;
    }
}
