package be;

import f0.b0;

/* compiled from: MarginValues.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f4171a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4172b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4173c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4174d;

    public c() {
        this(0);
    }

    public c(int i10) {
        this.f4171a = 0;
        this.f4172b = 0;
        this.f4173c = 0;
        this.f4174d = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4171a == cVar.f4171a && this.f4172b == cVar.f4172b && this.f4173c == cVar.f4173c && this.f4174d == cVar.f4174d;
    }

    public final int hashCode() {
        return (((((this.f4171a * 31) + this.f4172b) * 31) + this.f4173c) * 31) + this.f4174d;
    }

    public final String toString() {
        int i10 = this.f4171a;
        int i11 = this.f4172b;
        int i12 = this.f4173c;
        int i13 = this.f4174d;
        StringBuilder u10 = b0.u("MarginValues(start=", i10, ", top=", i11, ", end=");
        u10.append(i12);
        u10.append(", bottom=");
        u10.append(i13);
        u10.append(")");
        return u10.toString();
    }
}
