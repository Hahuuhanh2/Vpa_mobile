package l9;

import java.util.Arrays;
import m9.b;

/* compiled from: Bytes */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12897a;

    public a(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f12897a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Arrays.equals(((a) obj).f12897a, this.f12897a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12897a);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Bytes(");
        q10.append(b.u(this.f12897a));
        q10.append(")");
        return q10.toString();
    }
}
