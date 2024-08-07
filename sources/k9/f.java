package k9;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import w8.a;
import y8.e;

/* compiled from: ChaCha20Poly1305 */
public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final e f12088a;

    public f(byte[] bArr) {
        this.f12088a = new e(bArr);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12 + 16);
        byte[] a10 = n.a(12);
        allocate.put(a10);
        this.f12088a.b(allocate, a10, bArr, bArr2);
        return allocate.array();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f12088a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
