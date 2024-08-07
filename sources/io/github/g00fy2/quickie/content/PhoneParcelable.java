package io.github.g00fy2.quickie.content;

import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

/* compiled from: ParcelableContent.kt */
public final class PhoneParcelable implements Parcelable {
    public static final Parcelable.Creator<PhoneParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f20765a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20766b;

    /* compiled from: ParcelableContent.kt */
    public static final class a implements Parcelable.Creator<PhoneParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new PhoneParcelable(parcel.readString(), parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new PhoneParcelable[i10];
        }
    }

    public PhoneParcelable(String str, int i10) {
        j.f(str, "number");
        this.f20765a = str;
        this.f20766b = i10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "out");
        parcel.writeString(this.f20765a);
        parcel.writeInt(this.f20766b);
    }
}
