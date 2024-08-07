package io.github.g00fy2.quickie.config;

import android.os.Parcel;
import android.os.Parcelable;
import sk.j;

/* compiled from: ParcelableScannerConfig.kt */
public final class ParcelableScannerConfig implements Parcelable {
    public static final Parcelable.Creator<ParcelableScannerConfig> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f20721a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20722b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f20723c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f20724d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f20725e;

    /* renamed from: f  reason: collision with root package name */
    public final float f20726f;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f20727n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f20728o;

    /* compiled from: ParcelableScannerConfig.kt */
    public static final class a implements Parcelable.Creator<ParcelableScannerConfig> {
        public final Object createFromParcel(Parcel parcel) {
            Integer num;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            j.f(parcel, "parcel");
            int[] createIntArray = parcel.createIntArray();
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                num = null;
            } else {
                num = Integer.valueOf(parcel.readInt());
            }
            Integer num2 = num;
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            float readFloat = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            return new ParcelableScannerConfig(createIntArray, readInt, num2, z10, z11, readFloat, z12, z13);
        }

        public final Object[] newArray(int i10) {
            return new ParcelableScannerConfig[i10];
        }
    }

    public ParcelableScannerConfig(int[] iArr, int i10, Integer num, boolean z10, boolean z11, float f10, boolean z12, boolean z13) {
        j.f(iArr, "formats");
        this.f20721a = iArr;
        this.f20722b = i10;
        this.f20723c = num;
        this.f20724d = z10;
        this.f20725e = z11;
        this.f20726f = f10;
        this.f20727n = z12;
        this.f20728o = z13;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        j.f(parcel, "out");
        parcel.writeIntArray(this.f20721a);
        parcel.writeInt(this.f20722b);
        Integer num = this.f20723c;
        if (num == null) {
            i11 = 0;
        } else {
            parcel.writeInt(1);
            i11 = num.intValue();
        }
        parcel.writeInt(i11);
        parcel.writeInt(this.f20724d ? 1 : 0);
        parcel.writeInt(this.f20725e ? 1 : 0);
        parcel.writeFloat(this.f20726f);
        parcel.writeInt(this.f20727n ? 1 : 0);
        parcel.writeInt(this.f20728o ? 1 : 0);
    }
}
