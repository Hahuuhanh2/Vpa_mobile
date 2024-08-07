package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p3.l0;
import v6.j;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    public final int f5338a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5339b;

    public Scope() {
        throw null;
    }

    public Scope(int i10, String str) {
        y6.j.d("scopeUri must not be null or empty", str);
        this.f5338a = i10;
        this.f5339b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5339b.equals(((Scope) obj).f5339b);
    }

    public final int hashCode() {
        return this.f5339b.hashCode();
    }

    public final String toString() {
        return this.f5339b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f5338a;
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, i11);
        l0.f1(parcel, 2, this.f5339b);
        l0.o1(n12, parcel);
    }
}
