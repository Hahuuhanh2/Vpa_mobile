package g0;

import android.support.v4.media.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import v.v;

/* compiled from: ExifAttribute */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f10229d = StandardCharsets.US_ASCII;

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f10230e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f10231f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: a  reason: collision with root package name */
    public final int f10232a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10233b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f10234c;

    public f(byte[] bArr, int i10, int i11) {
        this.f10232a = i10;
        this.f10233b = i11;
        this.f10234c = bArr;
    }

    public static f a(long j10, ByteOrder byteOrder) {
        return b(new long[]{j10}, byteOrder);
    }

    public static f b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f10231f[4] * jArr.length)]);
        wrap.order(byteOrder);
        for (long j10 : jArr) {
            wrap.putInt((int) j10);
        }
        return new f(wrap.array(), 4, jArr.length);
    }

    public final String toString() {
        StringBuilder q10 = a.q("(");
        q10.append(f10230e[this.f10232a]);
        q10.append(", data length:");
        return v.e(q10, this.f10234c.length, ")");
    }
}
