package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import sk.j;
import w0.f;
import y0.g;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ParcelableSnapshotMutableLongState.kt */
public final class ParcelableSnapshotMutableLongState extends f implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableLongState.kt */
    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableLongState> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }

        public final Object[] newArray(int i10) {
            return new ParcelableSnapshotMutableLongState[i10];
        }
    }

    public ParcelableSnapshotMutableLongState(long j10) {
        super(j10);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "parcel");
        parcel.writeLong(((f.a) g.d(this.f16273a, this)).f16274b);
    }
}
