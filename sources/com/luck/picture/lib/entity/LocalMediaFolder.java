package com.luck.picture.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

public class LocalMediaFolder implements Parcelable {
    public static final Parcelable.Creator<LocalMediaFolder> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public long f8091a;

    /* renamed from: b  reason: collision with root package name */
    public String f8092b;

    /* renamed from: c  reason: collision with root package name */
    public String f8093c;

    /* renamed from: d  reason: collision with root package name */
    public String f8094d;

    /* renamed from: e  reason: collision with root package name */
    public int f8095e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8096f;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<LocalMedia> f8097n;

    /* renamed from: o  reason: collision with root package name */
    public int f8098o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8099p;

    public class a implements Parcelable.Creator<LocalMediaFolder> {
        public final Object createFromParcel(Parcel parcel) {
            return new LocalMediaFolder(parcel);
        }

        public final Object[] newArray(int i10) {
            return new LocalMediaFolder[i10];
        }
    }

    public LocalMediaFolder() {
        this.f8091a = -1;
        this.f8097n = new ArrayList<>();
        this.f8098o = 1;
    }

    public final ArrayList<LocalMedia> a() {
        ArrayList<LocalMedia> arrayList = this.f8097n;
        if (arrayList != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.f8092b)) {
            return "unknown";
        }
        return this.f8092b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8091a);
        parcel.writeString(this.f8092b);
        parcel.writeString(this.f8093c);
        parcel.writeString(this.f8094d);
        parcel.writeInt(this.f8095e);
        parcel.writeByte(this.f8096f ? (byte) 1 : 0);
        parcel.writeTypedList(this.f8097n);
        parcel.writeInt(this.f8098o);
        parcel.writeByte(this.f8099p ? (byte) 1 : 0);
    }

    public LocalMediaFolder(Parcel parcel) {
        this.f8091a = -1;
        this.f8097n = new ArrayList<>();
        boolean z10 = true;
        this.f8098o = 1;
        this.f8091a = parcel.readLong();
        this.f8092b = parcel.readString();
        this.f8093c = parcel.readString();
        this.f8094d = parcel.readString();
        this.f8095e = parcel.readInt();
        this.f8096f = parcel.readByte() != 0;
        this.f8097n = parcel.createTypedArrayList(LocalMedia.CREATOR);
        this.f8098o = parcel.readInt();
        this.f8099p = parcel.readByte() == 0 ? false : z10;
    }
}
