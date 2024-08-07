package io.github.g00fy2.quickie.content;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import sk.j;

/* compiled from: ParcelableContent.kt */
public final class AddressParcelable implements Parcelable {
    public static final Parcelable.Creator<AddressParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f20729a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20730b;

    /* compiled from: ParcelableContent.kt */
    public static final class a implements Parcelable.Creator<AddressParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new AddressParcelable(parcel.readInt(), parcel.createStringArrayList());
        }

        public final Object[] newArray(int i10) {
            return new AddressParcelable[i10];
        }
    }

    public AddressParcelable(int i10, List list) {
        j.f(list, "addressLines");
        this.f20729a = list;
        this.f20730b = i10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "out");
        parcel.writeStringList(this.f20729a);
        parcel.writeInt(this.f20730b);
    }
}
