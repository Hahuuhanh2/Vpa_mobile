package io.github.g00fy2.quickie.content;

import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

/* compiled from: ParcelableContent.kt */
public final class SmsParcelable implements Parcelable {
    public static final Parcelable.Creator<SmsParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f20767a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20768b;

    /* compiled from: ParcelableContent.kt */
    public static final class a implements Parcelable.Creator<SmsParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new SmsParcelable(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i10) {
            return new SmsParcelable[i10];
        }
    }

    public SmsParcelable(String str, String str2) {
        j.f(str, "message");
        j.f(str2, "phoneNumber");
        this.f20767a = str;
        this.f20768b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "out");
        parcel.writeString(this.f20767a);
        parcel.writeString(this.f20768b);
    }
}
