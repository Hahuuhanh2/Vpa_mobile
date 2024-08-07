package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import sk.j;
import w0.c;
import y0.g;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ParcelableSnapshotMutableDoubleState.kt */
public final class ParcelableSnapshotMutableDoubleState extends c implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableDoubleState.kt */
    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableDoubleState> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new ParcelableSnapshotMutableDoubleState(parcel.readDouble());
        }

        public final Object[] newArray(int i10) {
            return new ParcelableSnapshotMutableDoubleState[i10];
        }
    }

    public ParcelableSnapshotMutableDoubleState(double d10) {
        super(d10);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "parcel");
        parcel.writeDouble(((c.a) g.d(this.f16267a, this)).f16268b);
    }
}
