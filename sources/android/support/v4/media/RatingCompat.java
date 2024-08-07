package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f221a;

    /* renamed from: b  reason: collision with root package name */
    public final float f222b;

    public static class a implements Parcelable.Creator<RatingCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public final Object[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    public RatingCompat(int i10, float f10) {
        this.f221a = i10;
        this.f222b = f10;
    }

    public final int describeContents() {
        return this.f221a;
    }

    public final String toString() {
        String str;
        StringBuilder q10 = a.q("Rating:style=");
        q10.append(this.f221a);
        q10.append(" rating=");
        float f10 = this.f222b;
        if (f10 < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f10);
        }
        q10.append(str);
        return q10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f221a);
        parcel.writeFloat(this.f222b);
    }
}
