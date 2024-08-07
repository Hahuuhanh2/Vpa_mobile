package g6;

import f6.n;
import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Iterable<n> f10373a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f10374b;

    public a() {
        throw null;
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f10373a = iterable;
        this.f10374b = bArr;
    }

    public final Iterable<n> a() {
        return this.f10373a;
    }

    public final byte[] b() {
        return this.f10374b;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f10373a.equals(fVar.a())) {
            byte[] bArr2 = this.f10374b;
            if (fVar instanceof a) {
                bArr = ((a) fVar).f10374b;
            } else {
                bArr = fVar.b();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10373a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10374b);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("BackendRequest{events=");
        q10.append(this.f10373a);
        q10.append(", extras=");
        q10.append(Arrays.toString(this.f10374b));
        q10.append("}");
        return q10.toString();
    }
}
