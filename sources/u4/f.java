package u4;

import android.support.v4.media.a;
import java.security.MessageDigest;
import s4.e;

/* compiled from: DataCacheKey */
public final class f implements e {

    /* renamed from: b  reason: collision with root package name */
    public final e f15110b;

    /* renamed from: c  reason: collision with root package name */
    public final e f15111c;

    public f(e eVar, e eVar2) {
        this.f15110b = eVar;
        this.f15111c = eVar2;
    }

    public final void a(MessageDigest messageDigest) {
        this.f15110b.a(messageDigest);
        this.f15111c.a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f15110b.equals(fVar.f15110b) || !this.f15111c.equals(fVar.f15111c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15111c.hashCode() + (this.f15110b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("DataCacheKey{sourceKey=");
        q10.append(this.f15110b);
        q10.append(", signature=");
        q10.append(this.f15111c);
        q10.append('}');
        return q10.toString();
    }
}
