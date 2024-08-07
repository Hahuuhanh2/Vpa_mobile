package t3;

import android.support.v4.media.a;

/* compiled from: NetworkState.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14805a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14806b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14807c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14808d;

    public c(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f14805a = z10;
        this.f14806b = z11;
        this.f14807c = z12;
        this.f14808d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14805a == cVar.f14805a && this.f14806b == cVar.f14806b && this.f14807c == cVar.f14807c && this.f14808d == cVar.f14808d;
    }

    public final int hashCode() {
        boolean z10 = this.f14805a;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        boolean z12 = this.f14806b;
        if (z12) {
            z12 = true;
        }
        int i11 = (i10 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f14807c;
        if (z13) {
            z13 = true;
        }
        int i12 = (i11 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f14808d;
        if (!z14) {
            z11 = z14;
        }
        return i12 + (z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder q10 = a.q("NetworkState(isConnected=");
        q10.append(this.f14805a);
        q10.append(", isValidated=");
        q10.append(this.f14806b);
        q10.append(", isMetered=");
        q10.append(this.f14807c);
        q10.append(", isNotRoaming=");
        q10.append(this.f14808d);
        q10.append(')');
        return q10.toString();
    }
}
