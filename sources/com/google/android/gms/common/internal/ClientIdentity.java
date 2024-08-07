package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import y6.i;
import y6.n;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new n();

    /* renamed from: a  reason: collision with root package name */
    public final int f5381a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5382b;

    public ClientIdentity(int i10, String str) {
        this.f5381a = i10;
        this.f5382b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        if (clientIdentity.f5381a != this.f5381a || !i.a(clientIdentity.f5382b, this.f5382b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5381a;
    }

    public final String toString() {
        int i10 = this.f5381a;
        String str = this.f5382b;
        return i10 + ":" + str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5381a);
        l0.f1(parcel, 2, this.f5382b);
        l0.o1(n12, parcel);
    }
}
