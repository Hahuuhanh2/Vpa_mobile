package xb;

import android.support.v4.media.a;
import sk.j;

/* compiled from: SessionEvent.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final h f17214a;

    /* renamed from: b  reason: collision with root package name */
    public final h f17215b;

    /* renamed from: c  reason: collision with root package name */
    public final double f17216c;

    public i() {
        this(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ i(int r3) {
        /*
            r2 = this;
            xb.h r3 = xb.h.COLLECTION_SDK_NOT_INSTALLED
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.<init>(r3, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.i.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f17214a == iVar.f17214a && this.f17215b == iVar.f17215b && j.a(Double.valueOf(this.f17216c), Double.valueOf(iVar.f17216c));
    }

    public final int hashCode() {
        int hashCode = this.f17215b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f17216c);
        return ((hashCode + (this.f17214a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        StringBuilder q10 = a.q("DataCollectionStatus(performance=");
        q10.append(this.f17214a);
        q10.append(", crashlytics=");
        q10.append(this.f17215b);
        q10.append(", sessionSamplingRate=");
        q10.append(this.f17216c);
        q10.append(')');
        return q10.toString();
    }

    public i(h hVar, h hVar2, double d10) {
        j.f(hVar, "performance");
        j.f(hVar2, "crashlytics");
        this.f17214a = hVar;
        this.f17215b = hVar2;
        this.f17216c = d10;
    }
}
