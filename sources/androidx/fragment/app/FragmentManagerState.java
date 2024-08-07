package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<String> f2523a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f2524b;

    /* renamed from: c  reason: collision with root package name */
    public BackStackRecordState[] f2525c;

    /* renamed from: d  reason: collision with root package name */
    public int f2526d;

    /* renamed from: e  reason: collision with root package name */
    public String f2527e = null;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f2528f = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<BackStackState> f2529n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f2530o;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        public final Object createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        public final Object[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f2523a);
        parcel.writeStringList(this.f2524b);
        parcel.writeTypedArray(this.f2525c, i10);
        parcel.writeInt(this.f2526d);
        parcel.writeString(this.f2527e);
        parcel.writeStringList(this.f2528f);
        parcel.writeTypedList(this.f2529n);
        parcel.writeTypedList(this.f2530o);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f2523a = parcel.createStringArrayList();
        this.f2524b = parcel.createStringArrayList();
        this.f2525c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f2526d = parcel.readInt();
        this.f2527e = parcel.readString();
        this.f2528f = parcel.createStringArrayList();
        this.f2529n = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f2530o = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
