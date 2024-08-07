package xb;

import android.support.v4.media.a;
import n0.l;
import sk.j;

/* compiled from: SessionEvent.kt */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final String f17259a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17260b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17261c;

    /* renamed from: d  reason: collision with root package name */
    public long f17262d;

    /* renamed from: e  reason: collision with root package name */
    public i f17263e;

    /* renamed from: f  reason: collision with root package name */
    public String f17264f = "";

    public v(String str, String str2, int i10, long j10, i iVar) {
        j.f(str, "sessionId");
        j.f(str2, "firstSessionId");
        this.f17259a = str;
        this.f17260b = str2;
        this.f17261c = i10;
        this.f17262d = j10;
        this.f17263e = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return j.a(this.f17259a, vVar.f17259a) && j.a(this.f17260b, vVar.f17260b) && this.f17261c == vVar.f17261c && this.f17262d == vVar.f17262d && j.a(this.f17263e, vVar.f17263e) && j.a(this.f17264f, vVar.f17264f);
    }

    public final int hashCode() {
        String str = this.f17260b;
        long j10 = this.f17262d;
        int hashCode = this.f17263e.hashCode();
        return this.f17264f.hashCode() + ((hashCode + ((((l.f(str, this.f17259a.hashCode() * 31, 31) + this.f17261c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("SessionInfo(sessionId=");
        q10.append(this.f17259a);
        q10.append(", firstSessionId=");
        q10.append(this.f17260b);
        q10.append(", sessionIndex=");
        q10.append(this.f17261c);
        q10.append(", eventTimestampUs=");
        q10.append(this.f17262d);
        q10.append(", dataCollectionStatus=");
        q10.append(this.f17263e);
        q10.append(", firebaseInstallationId=");
        return l.k(q10, this.f17264f, ')');
    }
}
