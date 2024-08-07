package y8;

import a9.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* compiled from: InsecureNonceChaCha20Poly1305Base */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public final d f17624a;

    /* renamed from: b  reason: collision with root package name */
    public final d f17625b;

    public f(byte[] bArr) {
        if (a.C0003a.f116a.b()) {
            this.f17624a = d(1, bArr);
            this.f17625b = d(0, bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        int i10;
        int i11;
        if (bArr.length % 16 == 0) {
            i10 = bArr.length;
        } else {
            i10 = (bArr.length + 16) - (bArr.length % 16);
        }
        int remaining = byteBuffer.remaining();
        int i12 = remaining % 16;
        if (i12 == 0) {
            i11 = remaining;
        } else {
            i11 = (remaining + 16) - i12;
        }
        int i13 = i11 + i10;
        ByteBuffer order = ByteBuffer.allocate(i13 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(i10);
        order.put(byteBuffer);
        order.position(i13);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }

    public final byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.f17625b.a(0, bArr).get(bArr4);
                if (MessageDigest.isEqual(j7.a.w(bArr4, c(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    d dVar = this.f17624a;
                    dVar.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    dVar.d(bArr, allocate, byteBuffer);
                    return allocate.array();
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            d dVar = this.f17624a;
            dVar.getClass();
            if (byteBuffer.remaining() >= bArr2.length) {
                dVar.d(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
                byteBuffer.position(position);
                byteBuffer.limit(byteBuffer.limit() - 16);
                if (bArr3 == null) {
                    bArr3 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f17625b.a(0, bArr).get(bArr4);
                byte[] w9 = j7.a.w(bArr4, c(bArr3, byteBuffer));
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(w9);
                return;
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public abstract d d(int i10, byte[] bArr);
}
