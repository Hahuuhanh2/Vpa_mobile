package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p3.l0;
import u6.i;
import y6.i;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    public final String f5327a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final int f5328b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5329c;

    public Feature(String str, long j10) {
        this.f5327a = str;
        this.f5329c = j10;
        this.f5328b = -1;
    }

    public Feature(String str, long j10, int i10) {
        this.f5327a = str;
        this.f5328b = i10;
        this.f5329c = j10;
    }

    public final long P0() {
        long j10 = this.f5329c;
        return j10 == -1 ? (long) this.f5328b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f5327a;
            if (((str == null || !str.equals(feature.f5327a)) && (this.f5327a != null || feature.f5327a != null)) || P0() != feature.P0()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5327a, Long.valueOf(P0())});
    }

    public final String toString() {
        i.a aVar = new i.a(this);
        aVar.a(this.f5327a, "name");
        aVar.a(Long.valueOf(P0()), "version");
        return aVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.f1(parcel, 1, this.f5327a);
        l0.b1(parcel, 2, this.f5328b);
        l0.c1(parcel, 3, P0());
        l0.o1(n12, parcel);
    }
}
