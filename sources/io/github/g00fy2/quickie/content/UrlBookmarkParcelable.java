package io.github.g00fy2.quickie.content;

import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

/* compiled from: ParcelableContent.kt */
public final class UrlBookmarkParcelable implements Parcelable {
    public static final Parcelable.Creator<UrlBookmarkParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f20769a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20770b;

    /* compiled from: ParcelableContent.kt */
    public static final class a implements Parcelable.Creator<UrlBookmarkParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new UrlBookmarkParcelable(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i10) {
            return new UrlBookmarkParcelable[i10];
        }
    }

    public UrlBookmarkParcelable(String str, String str2) {
        j.f(str, "title");
        j.f(str2, "url");
        this.f20769a = str;
        this.f20770b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "out");
        parcel.writeString(this.f20769a);
        parcel.writeString(this.f20770b);
    }
}
