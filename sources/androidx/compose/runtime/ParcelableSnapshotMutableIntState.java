package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import sk.j;
import w0.e;
import y0.g;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ParcelableSnapshotMutableIntState.kt */
public final class ParcelableSnapshotMutableIntState extends e implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableIntState.kt */
    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableIntState> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new ParcelableSnapshotMutableIntState(parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new ParcelableSnapshotMutableIntState[i10];
        }
    }

    public ParcelableSnapshotMutableIntState(int i10) {
        super(i10);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "parcel");
        parcel.writeInt(((e.a) g.d(this.f16271a, this)).f16272b);
    }
}
