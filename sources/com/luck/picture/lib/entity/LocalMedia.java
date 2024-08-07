package com.luck.picture.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class LocalMedia implements Parcelable {
    public static final Parcelable.Creator<LocalMedia> CREATOR = new a();
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public long G;
    public boolean H;
    public String I;
    public String J;
    public long K = -1;
    public long L;
    public String M;
    public boolean N;
    public boolean O;
    public boolean P;
    public LocalMedia Q;

    /* renamed from: a  reason: collision with root package name */
    public long f8072a;

    /* renamed from: b  reason: collision with root package name */
    public String f8073b;

    /* renamed from: c  reason: collision with root package name */
    public String f8074c;

    /* renamed from: d  reason: collision with root package name */
    public String f8075d;

    /* renamed from: e  reason: collision with root package name */
    public String f8076e;

    /* renamed from: f  reason: collision with root package name */
    public String f8077f;

    /* renamed from: n  reason: collision with root package name */
    public String f8078n;

    /* renamed from: o  reason: collision with root package name */
    public String f8079o;

    /* renamed from: p  reason: collision with root package name */
    public String f8080p;

    /* renamed from: q  reason: collision with root package name */
    public long f8081q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8082r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8083s;

    /* renamed from: t  reason: collision with root package name */
    public int f8084t;

    /* renamed from: u  reason: collision with root package name */
    public int f8085u;

    /* renamed from: v  reason: collision with root package name */
    public String f8086v;

    /* renamed from: w  reason: collision with root package name */
    public int f8087w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8088x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8089y;

    /* renamed from: z  reason: collision with root package name */
    public int f8090z;

    public class a implements Parcelable.Creator<LocalMedia> {
        public final Object createFromParcel(Parcel parcel) {
            return new LocalMedia(parcel);
        }

        public final Object[] newArray(int i10) {
            return new LocalMedia[i10];
        }
    }

    public LocalMedia() {
    }

    public final String a() {
        boolean z10;
        String str = this.f8073b;
        if (d()) {
            str = this.f8077f;
        }
        boolean z11 = false;
        if (!this.f8089y || TextUtils.isEmpty(this.f8076e)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            str = this.f8076e;
        }
        if (!TextUtils.isEmpty(this.f8080p)) {
            str = this.f8080p;
        }
        if (this.H && !TextUtils.isEmpty(this.f8075d)) {
            z11 = true;
        }
        if (z11) {
            str = this.f8075d;
        }
        if (!TextUtils.isEmpty(this.f8078n)) {
            return this.f8078n;
        }
        return str;
    }

    public final boolean d() {
        if (!this.f8083s || TextUtils.isEmpty(this.f8077f)) {
            return false;
        }
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        if (!this.P || TextUtils.isEmpty(this.f8077f)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMedia)) {
            return false;
        }
        LocalMedia localMedia = (LocalMedia) obj;
        if (!TextUtils.equals(this.f8073b, localMedia.f8073b) && !TextUtils.equals(this.f8074c, localMedia.f8074c) && this.f8072a != localMedia.f8072a) {
            z10 = false;
        }
        if (!z10) {
            localMedia = null;
        }
        this.Q = localMedia;
        return z10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8072a);
        parcel.writeString(this.f8073b);
        parcel.writeString(this.f8074c);
        parcel.writeString(this.f8075d);
        parcel.writeString(this.f8076e);
        parcel.writeString(this.f8077f);
        parcel.writeString(this.f8078n);
        parcel.writeString(this.f8079o);
        parcel.writeString(this.f8080p);
        parcel.writeLong(this.f8081q);
        parcel.writeByte(this.f8082r ? (byte) 1 : 0);
        parcel.writeByte(this.f8083s ? (byte) 1 : 0);
        parcel.writeInt(this.f8084t);
        parcel.writeInt(this.f8085u);
        parcel.writeString(this.f8086v);
        parcel.writeInt(this.f8087w);
        parcel.writeByte(this.f8088x ? (byte) 1 : 0);
        parcel.writeByte(this.f8089y ? (byte) 1 : 0);
        parcel.writeInt(this.f8090z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeFloat(this.F);
        parcel.writeLong(this.G);
        parcel.writeByte(this.H ? (byte) 1 : 0);
        parcel.writeString(this.I);
        parcel.writeString(this.J);
        parcel.writeLong(this.K);
        parcel.writeLong(this.L);
        parcel.writeString(this.M);
        parcel.writeByte(this.N ? (byte) 1 : 0);
        parcel.writeByte(this.O ? (byte) 1 : 0);
        parcel.writeByte(this.P ? (byte) 1 : 0);
    }

    public LocalMedia(Parcel parcel) {
        this.f8072a = parcel.readLong();
        this.f8073b = parcel.readString();
        this.f8074c = parcel.readString();
        this.f8075d = parcel.readString();
        this.f8076e = parcel.readString();
        this.f8077f = parcel.readString();
        this.f8078n = parcel.readString();
        this.f8079o = parcel.readString();
        this.f8080p = parcel.readString();
        this.f8081q = parcel.readLong();
        boolean z10 = true;
        this.f8082r = parcel.readByte() != 0;
        this.f8083s = parcel.readByte() != 0;
        this.f8084t = parcel.readInt();
        this.f8085u = parcel.readInt();
        this.f8086v = parcel.readString();
        this.f8087w = parcel.readInt();
        this.f8088x = parcel.readByte() != 0;
        this.f8089y = parcel.readByte() != 0;
        this.f8090z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readFloat();
        this.G = parcel.readLong();
        this.H = parcel.readByte() != 0;
        this.I = parcel.readString();
        this.J = parcel.readString();
        this.K = parcel.readLong();
        this.L = parcel.readLong();
        this.M = parcel.readString();
        this.N = parcel.readByte() != 0;
        this.O = parcel.readByte() != 0;
        this.P = parcel.readByte() == 0 ? false : z10;
    }
}
