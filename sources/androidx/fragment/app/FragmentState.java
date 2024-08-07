package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f2531a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2532b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2533c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2534d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2535e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2536f;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f2537n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f2538o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f2539p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f2540q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2541r;

    /* renamed from: s  reason: collision with root package name */
    public final String f2542s;

    /* renamed from: t  reason: collision with root package name */
    public final int f2543t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f2544u;

    public class a implements Parcelable.Creator<FragmentState> {
        public final Object createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public final Object[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f2531a = fragment.getClass().getName();
        this.f2532b = fragment.f2447e;
        this.f2533c = fragment.f2455t;
        this.f2534d = fragment.C;
        this.f2535e = fragment.D;
        this.f2536f = fragment.E;
        this.f2537n = fragment.H;
        this.f2538o = fragment.f2454s;
        this.f2539p = fragment.G;
        this.f2540q = fragment.F;
        this.f2541r = fragment.T.ordinal();
        this.f2542s = fragment.f2450o;
        this.f2543t = fragment.f2451p;
        this.f2544u = fragment.N;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2531a);
        sb2.append(" (");
        sb2.append(this.f2532b);
        sb2.append(")}:");
        if (this.f2533c) {
            sb2.append(" fromLayout");
        }
        if (this.f2535e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2535e));
        }
        String str = this.f2536f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f2536f);
        }
        if (this.f2537n) {
            sb2.append(" retainInstance");
        }
        if (this.f2538o) {
            sb2.append(" removing");
        }
        if (this.f2539p) {
            sb2.append(" detached");
        }
        if (this.f2540q) {
            sb2.append(" hidden");
        }
        if (this.f2542s != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f2542s);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f2543t);
        }
        if (this.f2544u) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2531a);
        parcel.writeString(this.f2532b);
        parcel.writeInt(this.f2533c ? 1 : 0);
        parcel.writeInt(this.f2534d);
        parcel.writeInt(this.f2535e);
        parcel.writeString(this.f2536f);
        parcel.writeInt(this.f2537n ? 1 : 0);
        parcel.writeInt(this.f2538o ? 1 : 0);
        parcel.writeInt(this.f2539p ? 1 : 0);
        parcel.writeInt(this.f2540q ? 1 : 0);
        parcel.writeInt(this.f2541r);
        parcel.writeString(this.f2542s);
        parcel.writeInt(this.f2543t);
        parcel.writeInt(this.f2544u ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f2531a = parcel.readString();
        this.f2532b = parcel.readString();
        boolean z10 = true;
        this.f2533c = parcel.readInt() != 0;
        this.f2534d = parcel.readInt();
        this.f2535e = parcel.readInt();
        this.f2536f = parcel.readString();
        this.f2537n = parcel.readInt() != 0;
        this.f2538o = parcel.readInt() != 0;
        this.f2539p = parcel.readInt() != 0;
        this.f2540q = parcel.readInt() != 0;
        this.f2541r = parcel.readInt();
        this.f2542s = parcel.readString();
        this.f2543t = parcel.readInt();
        this.f2544u = parcel.readInt() == 0 ? false : z10;
    }
}
