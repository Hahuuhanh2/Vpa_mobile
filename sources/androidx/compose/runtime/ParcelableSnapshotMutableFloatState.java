package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import sk.j;
import w0.d;
import y0.g;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ParcelableSnapshotMutableFloatState.kt */
public final class ParcelableSnapshotMutableFloatState extends d implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableFloatState.kt */
    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableFloatState> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
        }

        public final Object[] newArray(int i10) {
            return new ParcelableSnapshotMutableFloatState[i10];
        }
    }

    public ParcelableSnapshotMutableFloatState(float f10) {
        super(f10);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "parcel");
        parcel.writeFloat(((d.a) g.d(this.f16269a, this)).f16270b);
    }
}
