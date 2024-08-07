package y8;

import java.util.Arrays;

/* compiled from: InsecureNonceXChaCha20 */
public final class g extends d {
    public g(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public final int[] b(int[] iArr, int i10) {
        if (iArr.length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = this.f17622a;
            int[] iArr4 = new int[16];
            int[] iArr5 = a.f17618a;
            System.arraycopy(iArr5, 0, iArr4, 0, iArr5.length);
            System.arraycopy(iArr3, 0, iArr4, iArr5.length, 8);
            iArr4[12] = iArr[0];
            iArr4[13] = iArr[1];
            iArr4[14] = iArr[2];
            iArr4[15] = iArr[3];
            a.b(iArr4);
            iArr4[4] = iArr4[12];
            iArr4[5] = iArr4[13];
            iArr4[6] = iArr4[14];
            iArr4[7] = iArr4[15];
            int[] copyOf = Arrays.copyOf(iArr4, 8);
            System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
            System.arraycopy(copyOf, 0, iArr2, iArr5.length, 8);
            iArr2[12] = i10;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    public final int c() {
        return 24;
    }
}
