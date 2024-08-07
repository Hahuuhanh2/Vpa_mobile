package uc;

/* compiled from: LuminanceSource */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f15462a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15463b;

    public d(int i10, int i11) {
        this.f15462a = i10;
        this.f15463b = i11;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i10, byte[] bArr);

    public boolean c() {
        return false;
    }

    public d d() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c10;
        int i10 = this.f15462a;
        byte[] bArr = new byte[i10];
        StringBuilder sb2 = new StringBuilder((i10 + 1) * this.f15463b);
        for (int i11 = 0; i11 < this.f15463b; i11++) {
            bArr = b(i11, bArr);
            for (int i12 = 0; i12 < this.f15462a; i12++) {
                byte b10 = bArr[i12] & 255;
                if (b10 < 64) {
                    c10 = '#';
                } else if (b10 < 128) {
                    c10 = '+';
                } else if (b10 < 192) {
                    c10 = '.';
                } else {
                    c10 = ' ';
                }
                sb2.append(c10);
            }
            sb2.append(10);
        }
        return sb2.toString();
    }
}
