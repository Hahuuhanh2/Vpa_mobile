package cd;

/* compiled from: BitSource */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4693a;

    /* renamed from: b  reason: collision with root package name */
    public int f4694b;

    /* renamed from: c  reason: collision with root package name */
    public int f4695c;

    public c(byte[] bArr) {
        this.f4693a = bArr;
    }

    public final int a() {
        return ((this.f4693a.length - this.f4694b) * 8) - this.f4695c;
    }

    public final int b(int i10) {
        if (i10 <= 0 || i10 > 32 || i10 > a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f4695c;
        byte b10 = 0;
        if (i11 > 0) {
            int i12 = 8 - i11;
            int min = Math.min(i10, i12);
            int i13 = i12 - min;
            byte[] bArr = this.f4693a;
            int i14 = this.f4694b;
            int i15 = (((255 >> (8 - min)) << i13) & bArr[i14]) >> i13;
            i10 -= min;
            int i16 = this.f4695c + min;
            this.f4695c = i16;
            if (i16 == 8) {
                this.f4695c = 0;
                this.f4694b = i14 + 1;
            }
            b10 = i15;
        }
        if (i10 <= 0) {
            return b10;
        }
        while (i10 >= 8) {
            int i17 = b10 << 8;
            byte[] bArr2 = this.f4693a;
            int i18 = this.f4694b;
            b10 = (bArr2[i18] & 255) | i17;
            this.f4694b = i18 + 1;
            i10 -= 8;
        }
        if (i10 <= 0) {
            return b10;
        }
        int i19 = 8 - i10;
        int i20 = (b10 << i10) | ((((255 >> i19) << i19) & this.f4693a[this.f4694b]) >> i19);
        this.f4695c += i10;
        return i20;
    }
}
