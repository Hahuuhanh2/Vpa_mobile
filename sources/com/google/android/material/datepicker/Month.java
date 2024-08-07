package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f6097a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6098b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6099c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6100d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6101e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6102f;

    /* renamed from: n  reason: collision with root package name */
    public String f6103n;

    public class a implements Parcelable.Creator<Month> {
        public final Object createFromParcel(Parcel parcel) {
            return Month.j(parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new Month[i10];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d10 = f0.d(calendar);
        this.f6097a = d10;
        this.f6098b = d10.get(2);
        this.f6099c = d10.get(1);
        this.f6100d = d10.getMaximum(7);
        this.f6101e = d10.getActualMaximum(5);
        this.f6102f = d10.getTimeInMillis();
    }

    public static Month j(int i10, int i11) {
        Calendar i12 = f0.i((Calendar) null);
        i12.set(1, i10);
        i12.set(2, i11);
        return new Month(i12);
    }

    public static Month k(long j10) {
        Calendar i10 = f0.i((Calendar) null);
        i10.setTimeInMillis(j10);
        return new Month(i10);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f6098b == month.f6098b && this.f6099c == month.f6099c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6098b), Integer.valueOf(this.f6099c)});
    }

    /* renamed from: i */
    public final int compareTo(Month month) {
        return this.f6097a.compareTo(month.f6097a);
    }

    public final String m() {
        if (this.f6103n == null) {
            this.f6103n = f.e(this.f6097a.getTimeInMillis());
        }
        return this.f6103n;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6099c);
        parcel.writeInt(this.f6098b);
    }
}
