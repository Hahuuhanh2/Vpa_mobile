package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a f6089c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final b f6090d = new b();

    /* renamed from: a  reason: collision with root package name */
    public final d f6091a;

    /* renamed from: b  reason: collision with root package name */
    public final List<CalendarConstraints.DateValidator> f6092b;

    public class a implements d {
        public final boolean a(List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && next.j0(j10)) {
                    return true;
                }
            }
            return false;
        }

        public final int getId() {
            return 1;
        }
    }

    public class b implements d {
        public final boolean a(List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && !next.j0(j10)) {
                    return false;
                }
            }
            return true;
        }

        public final int getId() {
            return 2;
        }
    }

    public class c implements Parcelable.Creator<CompositeDateValidator> {
        public final Object createFromParcel(Parcel parcel) {
            d dVar;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                dVar = CompositeDateValidator.f6090d;
            } else if (readInt == 1) {
                dVar = CompositeDateValidator.f6089c;
            } else {
                dVar = CompositeDateValidator.f6090d;
            }
            readArrayList.getClass();
            return new CompositeDateValidator(readArrayList, dVar);
        }

        public final Object[] newArray(int i10) {
            return new CompositeDateValidator[i10];
        }
    }

    public interface d {
        boolean a(List<CalendarConstraints.DateValidator> list, long j10);

        int getId();
    }

    public CompositeDateValidator() {
        throw null;
    }

    public CompositeDateValidator(ArrayList arrayList, d dVar) {
        this.f6092b = arrayList;
        this.f6091a = dVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (!this.f6092b.equals(compositeDateValidator.f6092b) || this.f6091a.getId() != compositeDateValidator.f6091a.getId()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6092b.hashCode();
    }

    public final boolean j0(long j10) {
        return this.f6091a.a(this.f6092b, j10);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f6092b);
        parcel.writeInt(this.f6091a.getId());
    }
}
