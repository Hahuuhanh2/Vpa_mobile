package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f6093a;

    public class a implements Parcelable.Creator<DateValidatorPointBackward> {
        public final Object createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong());
        }

        public final Object[] newArray(int i10) {
            return new DateValidatorPointBackward[i10];
        }
    }

    public DateValidatorPointBackward(long j10) {
        this.f6093a = j10;
    }

    public static DateValidatorPointBackward a() {
        return new DateValidatorPointBackward(f0.h().getTimeInMillis());
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointBackward)) {
            return false;
        }
        if (this.f6093a == ((DateValidatorPointBackward) obj).f6093a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6093a)});
    }

    public final boolean j0(long j10) {
        if (j10 <= this.f6093a) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6093a);
    }
}
