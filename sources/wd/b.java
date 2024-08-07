package wd;

import java.lang.reflect.Array;

/* compiled from: ByteMatrix */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final byte[][] f16798a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16799b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16800c;

    public b(int i10, int i11) {
        int[] iArr = new int[2];
        iArr[1] = i10;
        iArr[0] = i11;
        this.f16798a = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        this.f16799b = i10;
        this.f16800c = i11;
    }

    public final byte a(int i10, int i11) {
        return this.f16798a[i11][i10];
    }

    public final void b(int i10, int i11, int i12) {
        this.f16798a[i11][i10] = (byte) i12;
    }

    public final void c(boolean z10, int i10, int i11) {
        int i12;
        byte[] bArr = this.f16798a[i11];
        if (z10) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        bArr[i10] = (byte) i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f16799b * 2 * this.f16800c) + 2);
        for (int i10 = 0; i10 < this.f16800c; i10++) {
            byte[] bArr = this.f16798a[i10];
            for (int i11 = 0; i11 < this.f16799b; i11++) {
                byte b10 = bArr[i11];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append(10);
        }
        return sb2.toString();
    }
}
