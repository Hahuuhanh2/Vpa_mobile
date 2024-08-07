package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g7.b;
import java.util.ArrayList;
import java.util.List;
import p3.l0;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f5493a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5494b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5495c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5496d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5497e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5498f;

    /* renamed from: n  reason: collision with root package name */
    public final int f5499n;

    /* renamed from: o  reason: collision with root package name */
    public final List f5500o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5501p;

    /* renamed from: q  reason: collision with root package name */
    public final long f5502q;

    /* renamed from: r  reason: collision with root package name */
    public final int f5503r;

    /* renamed from: s  reason: collision with root package name */
    public final String f5504s;

    /* renamed from: t  reason: collision with root package name */
    public final float f5505t;

    /* renamed from: u  reason: collision with root package name */
    public final long f5506u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f5507v;

    public WakeLockEvent(int i10, long j10, int i11, String str, int i12, ArrayList arrayList, String str2, long j11, int i13, String str3, String str4, float f10, long j12, String str5, boolean z10) {
        this.f5493a = i10;
        this.f5494b = j10;
        this.f5495c = i11;
        this.f5496d = str;
        this.f5497e = str3;
        this.f5498f = str5;
        this.f5499n = i12;
        this.f5500o = arrayList;
        this.f5501p = str2;
        this.f5502q = j11;
        this.f5503r = i13;
        this.f5504s = str4;
        this.f5505t = f10;
        this.f5506u = j12;
        this.f5507v = z10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5493a);
        l0.c1(parcel, 2, this.f5494b);
        l0.f1(parcel, 4, this.f5496d);
        l0.b1(parcel, 5, this.f5499n);
        l0.h1(parcel, 6, this.f5500o);
        l0.c1(parcel, 8, this.f5502q);
        l0.f1(parcel, 10, this.f5497e);
        l0.b1(parcel, 11, this.f5495c);
        l0.f1(parcel, 12, this.f5501p);
        l0.f1(parcel, 13, this.f5504s);
        l0.b1(parcel, 14, this.f5503r);
        float f10 = this.f5505t;
        parcel.writeInt(262159);
        parcel.writeFloat(f10);
        l0.c1(parcel, 16, this.f5506u);
        l0.f1(parcel, 17, this.f5498f);
        l0.X0(parcel, 18, this.f5507v);
        l0.o1(n12, parcel);
    }

    public final int zza() {
        return this.f5495c;
    }

    public final long zzb() {
        return this.f5494b;
    }

    public final String zzc() {
        String str;
        List list = this.f5500o;
        String str2 = "";
        if (list == null) {
            str = str2;
        } else {
            str = TextUtils.join(",", list);
        }
        int i10 = this.f5503r;
        String str3 = this.f5497e;
        String str4 = this.f5504s;
        float f10 = this.f5505t;
        String str5 = this.f5498f;
        int i11 = this.f5499n;
        String str6 = this.f5496d;
        boolean z10 = this.f5507v;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\t");
        sb2.append(str6);
        sb2.append("\t");
        sb2.append(i11);
        sb2.append("\t");
        sb2.append(str);
        sb2.append("\t");
        sb2.append(i10);
        sb2.append("\t");
        if (str3 == null) {
            str3 = str2;
        }
        sb2.append(str3);
        sb2.append("\t");
        if (str4 == null) {
            str4 = str2;
        }
        sb2.append(str4);
        sb2.append("\t");
        sb2.append(f10);
        sb2.append("\t");
        if (str5 != null) {
            str2 = str5;
        }
        sb2.append(str2);
        sb2.append("\t");
        sb2.append(z10);
        return sb2.toString();
    }
}
