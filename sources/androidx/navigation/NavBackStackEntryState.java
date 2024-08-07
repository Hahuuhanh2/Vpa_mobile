package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: NavBackStackEntryState.kt */
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f2908a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2909b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f2910c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f2911d;

    /* compiled from: NavBackStackEntryState.kt */
    public static final class a implements Parcelable.Creator<NavBackStackEntryState> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "inParcel");
            return new NavBackStackEntryState(parcel);
        }

        public final Object[] newArray(int i10) {
            return new NavBackStackEntryState[i10];
        }
    }

    public NavBackStackEntryState(Parcel parcel) {
        j.f(parcel, "inParcel");
        String readString = parcel.readString();
        j.c(readString);
        this.f2908a = readString;
        this.f2909b = parcel.readInt();
        this.f2910c = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        j.c(readBundle);
        this.f2911d = readBundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        j.f(parcel, "parcel");
        parcel.writeString(this.f2908a);
        parcel.writeInt(this.f2909b);
        parcel.writeBundle(this.f2910c);
        parcel.writeBundle(this.f2911d);
    }
}
