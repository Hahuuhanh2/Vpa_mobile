package io.github.g00fy2.quickie.content;

import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

/* compiled from: ParcelableContent.kt */
public final class GeoPointParcelable implements Parcelable {
    public static final Parcelable.Creator<GeoPointParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final double f20756a;

    /* renamed from: b  reason: collision with root package name */
    public final double f20757b;

    /* compiled from: ParcelableContent.kt */
    public static final class a implements Parcelable.Creator<GeoPointParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new GeoPointParcelable(parcel.readDouble(), parcel.readDouble());
        }

        public final Object[] newArray(int i10) {
            return new GeoPointParcelable[i10];
        }
    }

    public GeoPointParcelable(double d10, double d11) {
        this.f20756a = d10;
        this.f20757b = d11;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "out");
        parcel.writeDouble(this.f20756a);
        parcel.writeDouble(this.f20757b);
    }
}
