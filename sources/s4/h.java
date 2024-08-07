package s4;

import android.support.v4.media.a;
import java.security.MessageDigest;
import o5.b;
import s4.g;

/* compiled from: Options */
public final class h implements e {

    /* renamed from: b  reason: collision with root package name */
    public final b f14631b = new b();

    public final void a(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            b bVar = this.f14631b;
            if (i10 < bVar.f16007c) {
                g gVar = (g) bVar.i(i10);
                Object m10 = this.f14631b.m(i10);
                g.b<T> bVar2 = gVar.f14628b;
                if (gVar.f14630d == null) {
                    gVar.f14630d = gVar.f14629c.getBytes(e.f14624a);
                }
                bVar2.a(gVar.f14630d, m10, messageDigest);
                i10++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(g<T> gVar) {
        if (this.f14631b.containsKey(gVar)) {
            return this.f14631b.getOrDefault(gVar, null);
        }
        return gVar.f14627a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f14631b.equals(((h) obj).f14631b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14631b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("Options{values=");
        q10.append(this.f14631b);
        q10.append('}');
        return q10.toString();
    }
}
