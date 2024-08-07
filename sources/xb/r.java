package xb;

import android.support.v4.media.a;
import sk.j;

/* compiled from: SessionEvent.kt */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final l f17248a = l.SESSION_START;

    /* renamed from: b  reason: collision with root package name */
    public final v f17249b;

    /* renamed from: c  reason: collision with root package name */
    public final b f17250c;

    public r(v vVar, b bVar) {
        this.f17249b = vVar;
        this.f17250c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f17248a == rVar.f17248a && j.a(this.f17249b, rVar.f17249b) && j.a(this.f17250c, rVar.f17250c);
    }

    public final int hashCode() {
        int hashCode = this.f17249b.hashCode();
        return this.f17250c.hashCode() + ((hashCode + (this.f17248a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("SessionEvent(eventType=");
        q10.append(this.f17248a);
        q10.append(", sessionData=");
        q10.append(this.f17249b);
        q10.append(", applicationInfo=");
        q10.append(this.f17250c);
        q10.append(')');
        return q10.toString();
    }
}
