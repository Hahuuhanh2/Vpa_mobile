package io.github.g00fy2.quickie.content;

import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

/* compiled from: ParcelableContent.kt */
public final class WifiParcelable implements Parcelable {
    public static final Parcelable.Creator<WifiParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f20771a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20772b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20773c;

    /* compiled from: ParcelableContent.kt */
    public static final class a implements Parcelable.Creator<WifiParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new WifiParcelable(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        public final Object[] newArray(int i10) {
            return new WifiParcelable[i10];
        }
    }

    public WifiParcelable(String str, int i10, String str2) {
        j.f(str, "password");
        j.f(str2, "ssid");
        this.f20771a = i10;
        this.f20772b = str;
        this.f20773c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "out");
        parcel.writeInt(this.f20771a);
        parcel.writeString(this.f20772b);
        parcel.writeString(this.f20773c);
    }
}
