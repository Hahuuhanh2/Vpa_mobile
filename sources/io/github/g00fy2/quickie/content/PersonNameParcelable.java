package io.github.g00fy2.quickie.content;

import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

/* compiled from: ParcelableContent.kt */
public final class PersonNameParcelable implements Parcelable {
    public static final Parcelable.Creator<PersonNameParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f20758a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20759b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20760c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20761d;

    /* renamed from: e  reason: collision with root package name */
    public final String f20762e;

    /* renamed from: f  reason: collision with root package name */
    public final String f20763f;

    /* renamed from: n  reason: collision with root package name */
    public final String f20764n;

    /* compiled from: ParcelableContent.kt */
    public static final class a implements Parcelable.Creator<PersonNameParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new PersonNameParcelable(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i10) {
            return new PersonNameParcelable[i10];
        }
    }

    public PersonNameParcelable(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        j.f(str, "first");
        j.f(str2, "formattedName");
        j.f(str3, "last");
        j.f(str4, "middle");
        j.f(str5, "prefix");
        j.f(str6, "pronunciation");
        j.f(str7, "suffix");
        this.f20758a = str;
        this.f20759b = str2;
        this.f20760c = str3;
        this.f20761d = str4;
        this.f20762e = str5;
        this.f20763f = str6;
        this.f20764n = str7;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "out");
        parcel.writeString(this.f20758a);
        parcel.writeString(this.f20759b);
        parcel.writeString(this.f20760c);
        parcel.writeString(this.f20761d);
        parcel.writeString(this.f20762e);
        parcel.writeString(this.f20763f);
        parcel.writeString(this.f20764n);
    }
}
