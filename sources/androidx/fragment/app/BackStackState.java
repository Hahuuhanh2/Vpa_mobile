package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2437a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2438b;

    public class a implements Parcelable.Creator<BackStackState> {
        public final Object createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public final Object[] newArray(int i10) {
            return new BackStackState[i10];
        }
    }

    public BackStackState(Parcel parcel) {
        this.f2437a = parcel.createStringArrayList();
        this.f2438b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f2437a);
        parcel.writeTypedList(this.f2438b);
    }
}
