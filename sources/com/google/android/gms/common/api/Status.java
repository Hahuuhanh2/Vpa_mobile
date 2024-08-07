package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p3.l0;
import v6.a;
import v6.e;
import v6.k;
import y6.i;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class Status extends AbstractSafeParcelable implements e, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new k();

    /* renamed from: e  reason: collision with root package name */
    public static final Status f5340e = new Status(0, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: f  reason: collision with root package name */
    public static final Status f5341f = new Status(14, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: n  reason: collision with root package name */
    public static final Status f5342n = new Status(8, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: o  reason: collision with root package name */
    public static final Status f5343o = new Status(15, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: p  reason: collision with root package name */
    public static final Status f5344p = new Status(16, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f5345a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5346b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f5347c;

    /* renamed from: d  reason: collision with root package name */
    public final ConnectionResult f5348d;

    static {
        new Status(-1, (String) null, (PendingIntent) null, (ConnectionResult) null);
        new Status(17, (String) null, (PendingIntent) null, (ConnectionResult) null);
        new Status(18, (String) null, (PendingIntent) null, (ConnectionResult) null);
    }

    public Status() {
        throw null;
    }

    public Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f5345a = i10;
        this.f5346b = str;
        this.f5347c = pendingIntent;
        this.f5348d = connectionResult;
    }

    public final boolean P0() {
        return this.f5345a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f5345a != status.f5345a || !i.a(this.f5346b, status.f5346b) || !i.a(this.f5347c, status.f5347c) || !i.a(this.f5348d, status.f5348d)) {
            return false;
        }
        return true;
    }

    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5345a), this.f5346b, this.f5347c, this.f5348d});
    }

    public final String toString() {
        i.a aVar = new i.a(this);
        String str = this.f5346b;
        if (str == null) {
            str = a.a(this.f5345a);
        }
        aVar.a(str, "statusCode");
        aVar.a(this.f5347c, "resolution");
        return aVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5345a);
        l0.f1(parcel, 2, this.f5346b);
        l0.e1(parcel, 3, this.f5347c, i10);
        l0.e1(parcel, 4, this.f5348d, i10);
        l0.o1(n12, parcel);
    }
}
