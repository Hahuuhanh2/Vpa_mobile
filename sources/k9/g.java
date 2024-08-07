package k9;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import m9.b;
import w8.a;
import w8.m;

/* compiled from: EncryptThenAuthenticate */
public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final j f12089a;

    /* renamed from: b  reason: collision with root package name */
    public final m f12090b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12091c;

    public g(j jVar, m mVar, int i10) {
        this.f12089a = jVar;
        this.f12090b = mVar;
        this.f12091c = i10;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a10 = this.f12089a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return b.n(a10, this.f12090b.b(b.n(bArr2, a10, copyOf)));
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f12091c;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f12091c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f12090b.a(copyOfRange2, b.n(bArr2, copyOfRange, copyOf));
            return this.f12089a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
