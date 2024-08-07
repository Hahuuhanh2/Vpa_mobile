package n5;

import j7.a;
import java.security.MessageDigest;
import s4.e;

/* compiled from: ObjectKey */
public final class d implements e {

    /* renamed from: b  reason: collision with root package name */
    public final Object f13522b;

    public d(Object obj) {
        a.r(obj);
        this.f13522b = obj;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f13522b.toString().getBytes(e.f14624a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f13522b.equals(((d) obj).f13522b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13522b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ObjectKey{object=");
        q10.append(this.f13522b);
        q10.append('}');
        return q10.toString();
    }
}
