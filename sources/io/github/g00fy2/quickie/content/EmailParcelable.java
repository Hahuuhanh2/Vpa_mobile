package io.github.g00fy2.quickie.content;

import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

/* compiled from: ParcelableContent.kt */
public final class EmailParcelable implements Parcelable {
    public static final Parcelable.Creator<EmailParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f20752a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20753b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20754c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20755d;

    /* compiled from: ParcelableContent.kt */
    public static final class a implements Parcelable.Creator<EmailParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new EmailParcelable(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i10) {
            return new EmailParcelable[i10];
        }
    }

    public EmailParcelable(int i10, String str, String str2, String str3) {
        j.f(str, "address");
        j.f(str2, "body");
        j.f(str3, "subject");
        this.f20752a = str;
        this.f20753b = str2;
        this.f20754c = str3;
        this.f20755d = i10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "out");
        parcel.writeString(this.f20752a);
        parcel.writeString(this.f20753b);
        parcel.writeString(this.f20754c);
        parcel.writeInt(this.f20755d);
    }
}
