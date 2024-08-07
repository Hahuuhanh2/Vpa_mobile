package y8;

import android.support.v4.media.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import m9.b;

/* compiled from: InsecureNonceChaCha20Base */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public int[] f17622a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17623b;

    public d(byte[] bArr, int i10) {
        if (bArr.length == 32) {
            this.f17622a = a.c(bArr);
            this.f17623b = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public final ByteBuffer a(int i10, byte[] bArr) {
        int[] b10 = b(a.c(bArr), i10);
        int[] iArr = (int[]) b10.clone();
        a.b(iArr);
        for (int i11 = 0; i11 < b10.length; i11++) {
            b10[i11] = b10[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b10, 0, 16);
        return order;
    }

    public abstract int[] b(int[] iArr, int i10);

    public abstract int c();

    public final void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == c()) {
            int remaining = byteBuffer2.remaining();
            int i10 = (remaining / 64) + 1;
            for (int i11 = 0; i11 < i10; i11++) {
                ByteBuffer a10 = a(this.f17623b + i11, bArr);
                if (i11 == i10 - 1) {
                    b.h0(byteBuffer, byteBuffer2, a10, remaining % 64);
                } else {
                    b.h0(byteBuffer, byteBuffer2, a10, 64);
                }
            }
            return;
        }
        StringBuilder q10 = a.q("The nonce length (in bytes) must be ");
        q10.append(c());
        throw new GeneralSecurityException(q10.toString());
    }
}
