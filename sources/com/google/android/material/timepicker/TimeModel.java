package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f7145a;

    /* renamed from: b  reason: collision with root package name */
    public int f7146b;

    /* renamed from: c  reason: collision with root package name */
    public int f7147c;

    /* renamed from: d  reason: collision with root package name */
    public int f7148d;

    public class a implements Parcelable.Creator<TimeModel> {
        public final Object createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel() {
        this(0, 0, 10, 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f7146b == timeModel.f7146b && this.f7147c == timeModel.f7147c && this.f7145a == timeModel.f7145a && this.f7148d == timeModel.f7148d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7145a), Integer.valueOf(this.f7146b), Integer.valueOf(this.f7147c), Integer.valueOf(this.f7148d)});
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7146b);
        parcel.writeInt(this.f7147c);
        parcel.writeInt(this.f7148d);
        parcel.writeInt(this.f7145a);
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f7146b = i10;
        this.f7147c = i11;
        this.f7148d = i12;
        this.f7145a = i13;
    }
}
