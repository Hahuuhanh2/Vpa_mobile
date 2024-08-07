package f6;

import android.support.v4.media.a;
import c6.b;
import java.util.Arrays;

/* compiled from: EncodedPayload */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final b f10015a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f10016b;

    public m(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f10015a = bVar;
            this.f10016b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f10015a.equals(mVar.f10015a)) {
            return false;
        }
        return Arrays.equals(this.f10016b, mVar.f10016b);
    }

    public final int hashCode() {
        return ((this.f10015a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10016b);
    }

    public final String toString() {
        StringBuilder q10 = a.q("EncodedPayload{encoding=");
        q10.append(this.f10015a);
        q10.append(", bytes=[...]}");
        return q10.toString();
    }
}
