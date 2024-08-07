package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ba.c;
import com.google.firebase.auth.FirebaseUserMetadata;
import p3.l0;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzz implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzz> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final long f7556a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7557b;

    public zzz(long j10, long j11) {
        this.f7556a = j10;
        this.f7557b = j11;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.c1(parcel, 1, this.f7556a);
        l0.c1(parcel, 2, this.f7557b);
        l0.o1(n12, parcel);
    }
}
