package y8;

/* compiled from: InsecureNonceChaCha20 */
public final class c extends d {
    public c(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public final int[] b(int[] iArr, int i10) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            int[] iArr3 = this.f17622a;
            int[] iArr4 = a.f17618a;
            System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
            System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    public final int c() {
        return 12;
    }
}
