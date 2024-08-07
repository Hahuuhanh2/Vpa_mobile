package xb;

import android.support.v4.media.a;
import n0.l;
import sk.j;

/* compiled from: SessionGenerator.kt */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f17244a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17245b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17246c;

    /* renamed from: d  reason: collision with root package name */
    public final long f17247d;

    public q(String str, String str2, int i10, long j10) {
        j.f(str, "sessionId");
        j.f(str2, "firstSessionId");
        this.f17244a = str;
        this.f17245b = str2;
        this.f17246c = i10;
        this.f17247d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return j.a(this.f17244a, qVar.f17244a) && j.a(this.f17245b, qVar.f17245b) && this.f17246c == qVar.f17246c && this.f17247d == qVar.f17247d;
    }

    public final int hashCode() {
        String str = this.f17245b;
        long j10 = this.f17247d;
        return ((l.f(str, this.f17244a.hashCode() * 31, 31) + this.f17246c) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder q10 = a.q("SessionDetails(sessionId=");
        q10.append(this.f17244a);
        q10.append(", firstSessionId=");
        q10.append(this.f17245b);
        q10.append(", sessionIndex=");
        q10.append(this.f17246c);
        q10.append(", sessionStartTimestampUs=");
        q10.append(this.f17247d);
        q10.append(')');
        return q10.toString();
    }
}
