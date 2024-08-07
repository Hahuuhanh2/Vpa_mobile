package ll;

import ll.f;
import sk.j;

/* compiled from: Util.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f20859a = -1234567890;

    static {
        new f.a();
    }

    public static final boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        j.f(bArr, "a");
        j.f(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final String c(byte b10) {
        char[] cArr = m9.b.D;
        return new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]});
    }
}
