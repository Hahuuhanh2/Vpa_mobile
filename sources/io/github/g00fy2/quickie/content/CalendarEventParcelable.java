package io.github.g00fy2.quickie.content;

import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

/* compiled from: ParcelableContent.kt */
public final class CalendarEventParcelable implements Parcelable {
    public static final Parcelable.Creator<CalendarEventParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f20738a;

    /* renamed from: b  reason: collision with root package name */
    public final CalendarDateTimeParcelable f20739b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20740c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20741d;

    /* renamed from: e  reason: collision with root package name */
    public final CalendarDateTimeParcelable f20742e;

    /* renamed from: f  reason: collision with root package name */
    public final String f20743f;

    /* renamed from: n  reason: collision with root package name */
    public final String f20744n;

    /* compiled from: ParcelableContent.kt */
    public static final class a implements Parcelable.Creator<CalendarEventParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            String readString = parcel.readString();
            Parcelable.Creator<CalendarDateTimeParcelable> creator = CalendarDateTimeParcelable.CREATOR;
            return new CalendarEventParcelable(readString, creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), creator.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i10) {
            return new CalendarEventParcelable[i10];
        }
    }

    public CalendarEventParcelable(String str, CalendarDateTimeParcelable calendarDateTimeParcelable, String str2, String str3, CalendarDateTimeParcelable calendarDateTimeParcelable2, String str4, String str5) {
        j.f(str, "description");
        j.f(calendarDateTimeParcelable, "end");
        j.f(str2, "location");
        j.f(str3, "organizer");
        j.f(calendarDateTimeParcelable2, "start");
        j.f(str4, "status");
        j.f(str5, "summary");
        this.f20738a = str;
        this.f20739b = calendarDateTimeParcelable;
        this.f20740c = str2;
        this.f20741d = str3;
        this.f20742e = calendarDateTimeParcelable2;
        this.f20743f = str4;
        this.f20744n = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "out");
        parcel.writeString(this.f20738a);
        this.f20739b.writeToParcel(parcel, i10);
        parcel.writeString(this.f20740c);
        parcel.writeString(this.f20741d);
        this.f20742e.writeToParcel(parcel, i10);
        parcel.writeString(this.f20743f);
        parcel.writeString(this.f20744n);
    }
}
