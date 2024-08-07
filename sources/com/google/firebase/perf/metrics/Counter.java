package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f7644a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicLong f7645b;

    public class a implements Parcelable.Creator<Counter> {
        public final Object createFromParcel(Parcel parcel) {
            return new Counter(parcel);
        }

        public final Object[] newArray(int i10) {
            return new Counter[i10];
        }
    }

    public Counter(String str) {
        this.f7644a = str;
        this.f7645b = new AtomicLong(0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7644a);
        parcel.writeLong(this.f7645b.get());
    }

    public Counter(Parcel parcel) {
        this.f7644a = parcel.readString();
        this.f7645b = new AtomicLong(parcel.readLong());
    }
}
