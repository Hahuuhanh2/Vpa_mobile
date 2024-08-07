package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Month f6075a;

    /* renamed from: b  reason: collision with root package name */
    public final Month f6076b;

    /* renamed from: c  reason: collision with root package name */
    public final DateValidator f6077c;

    /* renamed from: d  reason: collision with root package name */
    public Month f6078d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6079e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6080f;

    /* renamed from: n  reason: collision with root package name */
    public final int f6081n;

    public interface DateValidator extends Parcelable {
        boolean j0(long j10);
    }

    public class a implements Parcelable.Creator<CalendarConstraints> {
        public final Object createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f6075a = month;
        this.f6076b = month2;
        this.f6078d = month3;
        this.f6079e = i10;
        this.f6077c = dateValidator;
        if (month3 != null && month.f6097a.compareTo(month3.f6097a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 != null && month3.f6097a.compareTo(month2.f6097a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i10 < 0 || i10 > f0.i((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else if (month.f6097a instanceof GregorianCalendar) {
            int i11 = month2.f6099c;
            int i12 = month.f6099c;
            this.f6081n = (month2.f6098b - month.f6098b) + ((i11 - i12) * 12) + 1;
            this.f6080f = (i11 - i12) + 1;
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.f6075a.equals(calendarConstraints.f6075a) || !this.f6076b.equals(calendarConstraints.f6076b) || !v1.b.a(this.f6078d, calendarConstraints.f6078d) || this.f6079e != calendarConstraints.f6079e || !this.f6077c.equals(calendarConstraints.f6077c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6075a, this.f6076b, this.f6078d, Integer.valueOf(this.f6079e), this.f6077c});
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f6075a, 0);
        parcel.writeParcelable(this.f6076b, 0);
        parcel.writeParcelable(this.f6078d, 0);
        parcel.writeParcelable(this.f6077c, 0);
        parcel.writeInt(this.f6079e);
    }

    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final long f6082f = f0.a(Month.j(1900, 0).f6102f);

        /* renamed from: g  reason: collision with root package name */
        public static final long f6083g = f0.a(Month.j(2100, 11).f6102f);

        /* renamed from: a  reason: collision with root package name */
        public long f6084a = f6082f;

        /* renamed from: b  reason: collision with root package name */
        public long f6085b = f6083g;

        /* renamed from: c  reason: collision with root package name */
        public Long f6086c;

        /* renamed from: d  reason: collision with root package name */
        public int f6087d;

        /* renamed from: e  reason: collision with root package name */
        public DateValidator f6088e = new DateValidatorPointForward(Long.MIN_VALUE);

        public b() {
        }

        public final CalendarConstraints a() {
            Month month;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f6088e);
            Month k10 = Month.k(this.f6084a);
            Month k11 = Month.k(this.f6085b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f6086c;
            if (l10 == null) {
                month = null;
            } else {
                month = Month.k(l10.longValue());
            }
            return new CalendarConstraints(k10, k11, dateValidator, month, this.f6087d);
        }

        public b(CalendarConstraints calendarConstraints) {
            this.f6084a = calendarConstraints.f6075a.f6102f;
            this.f6085b = calendarConstraints.f6076b.f6102f;
            this.f6086c = Long.valueOf(calendarConstraints.f6078d.f6102f);
            this.f6087d = calendarConstraints.f6079e;
            this.f6088e = calendarConstraints.f6077c;
        }
    }
}
