package k9;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import w8.a;
import y8.h;

/* compiled from: XChaCha20Poly1305 */
public final class p implements a {

    /* renamed from: a  reason: collision with root package name */
    public final h f12109a;

    public p(byte[] bArr) {
        this.f12109a = new h(bArr);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 24 + 16);
        byte[] a10 = n.a(24);
        allocate.put(a10);
        this.f12109a.b(allocate, a10, bArr, bArr2);
        return allocate.array();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f12109a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
