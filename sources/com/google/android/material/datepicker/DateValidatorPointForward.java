package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f6094a;

    public class a implements Parcelable.Creator<DateValidatorPointForward> {
        public final Object createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }

        public final Object[] newArray(int i10) {
            return new DateValidatorPointForward[i10];
        }
    }

    public DateValidatorPointForward(long j10) {
        this.f6094a = j10;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointForward)) {
            return false;
        }
        if (this.f6094a == ((DateValidatorPointForward) obj).f6094a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6094a)});
    }

    public final boolean j0(long j10) {
        if (j10 >= this.f6094a) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6094a);
    }
}
