package n5;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o5.l;
import s4.e;

/* compiled from: AndroidResourceSignature */
public final class a implements e {

    /* renamed from: b  reason: collision with root package name */
    public final int f13518b;

    /* renamed from: c  reason: collision with root package name */
    public final e f13519c;

    public a(int i10, e eVar) {
        this.f13518b = i10;
        this.f13519c = eVar;
    }

    public final void a(MessageDigest messageDigest) {
        this.f13519c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f13518b).array());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f13518b != aVar.f13518b || !this.f13519c.equals(aVar.f13519c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return l.g(this.f13518b, this.f13519c);
    }
}
