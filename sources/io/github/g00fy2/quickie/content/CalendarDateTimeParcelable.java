package io.github.g00fy2.quickie.content;

import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

/* compiled from: ParcelableContent.kt */
public final class CalendarDateTimeParcelable implements Parcelable {
    public static final Parcelable.Creator<CalendarDateTimeParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f20731a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20732b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20733c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20734d;

    /* renamed from: e  reason: collision with root package name */
    public final int f20735e;

    /* renamed from: f  reason: collision with root package name */
    public final int f20736f;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f20737n;

    /* compiled from: ParcelableContent.kt */
    public static final class a implements Parcelable.Creator<CalendarDateTimeParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            boolean z10;
            j.f(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new CalendarDateTimeParcelable(readInt, readInt2, readInt3, readInt4, readInt5, readInt6, z10);
        }

        public final Object[] newArray(int i10) {
            return new CalendarDateTimeParcelable[i10];
        }
    }

    public CalendarDateTimeParcelable(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        this.f20731a = i10;
        this.f20732b = i11;
        this.f20733c = i12;
        this.f20734d = i13;
        this.f20735e = i14;
        this.f20736f = i15;
        this.f20737n = z10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "out");
        parcel.writeInt(this.f20731a);
        parcel.writeInt(this.f20732b);
        parcel.writeInt(this.f20733c);
        parcel.writeInt(this.f20734d);
        parcel.writeInt(this.f20735e);
        parcel.writeInt(this.f20736f);
        parcel.writeInt(this.f20737n ? 1 : 0);
    }
}
