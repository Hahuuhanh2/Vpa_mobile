package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f237a;

    /* renamed from: b  reason: collision with root package name */
    public int f238b;

    /* renamed from: c  reason: collision with root package name */
    public int f239c;

    /* renamed from: d  reason: collision with root package name */
    public int f240d;

    /* renamed from: e  reason: collision with root package name */
    public int f241e;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public final Object[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f237a = parcel.readInt();
        this.f239c = parcel.readInt();
        this.f240d = parcel.readInt();
        this.f241e = parcel.readInt();
        this.f238b = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f237a);
        parcel.writeInt(this.f239c);
        parcel.writeInt(this.f240d);
        parcel.writeInt(this.f241e);
        parcel.writeInt(this.f238b);
    }
}
