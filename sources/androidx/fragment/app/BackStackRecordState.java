package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.a0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f2423a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f2424b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f2425c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f2426d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2427e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2428f;

    /* renamed from: n  reason: collision with root package name */
    public final int f2429n;

    /* renamed from: o  reason: collision with root package name */
    public final int f2430o;

    /* renamed from: p  reason: collision with root package name */
    public final CharSequence f2431p;

    /* renamed from: q  reason: collision with root package name */
    public final int f2432q;

    /* renamed from: r  reason: collision with root package name */
    public final CharSequence f2433r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList<String> f2434s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<String> f2435t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f2436u;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        public final Object createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        public final Object[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    public BackStackRecordState(a aVar) {
        int size = aVar.f2555a.size();
        this.f2423a = new int[(size * 6)];
        if (aVar.f2561g) {
            this.f2424b = new ArrayList<>(size);
            this.f2425c = new int[size];
            this.f2426d = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                a0.a aVar2 = aVar.f2555a.get(i10);
                int i12 = i11 + 1;
                this.f2423a[i11] = aVar2.f2571a;
                ArrayList<String> arrayList = this.f2424b;
                Fragment fragment = aVar2.f2572b;
                arrayList.add(fragment != null ? fragment.f2447e : null);
                int[] iArr = this.f2423a;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f2573c;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f2574d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f2575e;
                int i16 = i15 + 1;
                iArr[i15] = aVar2.f2576f;
                iArr[i16] = aVar2.f2577g;
                this.f2425c[i10] = aVar2.f2578h.ordinal();
                this.f2426d[i10] = aVar2.f2579i.ordinal();
                i10++;
                i11 = i16 + 1;
            }
            this.f2427e = aVar.f2560f;
            this.f2428f = aVar.f2563i;
            this.f2429n = aVar.f2554s;
            this.f2430o = aVar.f2564j;
            this.f2431p = aVar.f2565k;
            this.f2432q = aVar.f2566l;
            this.f2433r = aVar.f2567m;
            this.f2434s = aVar.f2568n;
            this.f2435t = aVar.f2569o;
            this.f2436u = aVar.f2570p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2423a);
        parcel.writeStringList(this.f2424b);
        parcel.writeIntArray(this.f2425c);
        parcel.writeIntArray(this.f2426d);
        parcel.writeInt(this.f2427e);
        parcel.writeString(this.f2428f);
        parcel.writeInt(this.f2429n);
        parcel.writeInt(this.f2430o);
        TextUtils.writeToParcel(this.f2431p, parcel, 0);
        parcel.writeInt(this.f2432q);
        TextUtils.writeToParcel(this.f2433r, parcel, 0);
        parcel.writeStringList(this.f2434s);
        parcel.writeStringList(this.f2435t);
        parcel.writeInt(this.f2436u ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f2423a = parcel.createIntArray();
        this.f2424b = parcel.createStringArrayList();
        this.f2425c = parcel.createIntArray();
        this.f2426d = parcel.createIntArray();
        this.f2427e = parcel.readInt();
        this.f2428f = parcel.readString();
        this.f2429n = parcel.readInt();
        this.f2430o = parcel.readInt();
        this.f2431p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2432q = parcel.readInt();
        this.f2433r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2434s = parcel.createStringArrayList();
        this.f2435t = parcel.createStringArrayList();
        this.f2436u = parcel.readInt() != 0;
    }
}
