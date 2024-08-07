package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o7.j;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    public String f5546a;

    /* renamed from: b  reason: collision with root package name */
    public DataHolder f5547b;

    /* renamed from: c  reason: collision with root package name */
    public ParcelFileDescriptor f5548c;

    /* renamed from: d  reason: collision with root package name */
    public long f5549d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f5550e;

    static {
        Class<SafeBrowsingData> cls = SafeBrowsingData.class;
    }

    public SafeBrowsingData() {
        this((String) null, (DataHolder) null, (ParcelFileDescriptor) null, 0, (byte[]) null);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 2, this.f5546a);
        l0.e1(parcel, 3, this.f5547b, i10);
        l0.e1(parcel, 4, this.f5548c, i10);
        l0.c1(parcel, 5, this.f5549d);
        l0.Z0(parcel, 6, this.f5550e);
        l0.o1(n12, parcel);
        this.f5548c = null;
    }

    public SafeBrowsingData(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j10, byte[] bArr) {
        this.f5546a = str;
        this.f5547b = dataHolder;
        this.f5548c = parcelFileDescriptor;
        this.f5549d = j10;
        this.f5550e = bArr;
    }
}
