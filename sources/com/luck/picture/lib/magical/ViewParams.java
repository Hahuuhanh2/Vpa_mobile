package com.luck.picture.lib.magical;

import android.os.Parcel;
import android.os.Parcelable;

public class ViewParams implements Parcelable {
    public static final Parcelable.Creator<ViewParams> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f8122a;

    /* renamed from: b  reason: collision with root package name */
    public int f8123b;

    /* renamed from: c  reason: collision with root package name */
    public int f8124c;

    /* renamed from: d  reason: collision with root package name */
    public int f8125d;

    public class a implements Parcelable.Creator<ViewParams> {
        public final Object createFromParcel(Parcel parcel) {
            return new ViewParams(parcel);
        }

        public final Object[] newArray(int i10) {
            return new ViewParams[i10];
        }
    }

    public ViewParams() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8122a);
        parcel.writeInt(this.f8123b);
        parcel.writeInt(this.f8124c);
        parcel.writeInt(this.f8125d);
    }

    public ViewParams(Parcel parcel) {
        this.f8122a = parcel.readInt();
        this.f8123b = parcel.readInt();
        this.f8124c = parcel.readInt();
        this.f8125d = parcel.readInt();
    }
}
