package uc;

/* compiled from: PlanarYUVLuminanceSource */
public final class f extends d {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f15467c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15468d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15469e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15470f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15471g;

    public f(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i14, i15);
        if (i14 + i12 > i10 || i15 + i13 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f15467c = bArr;
        this.f15468d = i10;
        this.f15469e = i11;
        this.f15470f = i12;
        this.f15471g = i13;
    }

    public final byte[] a() {
        int i10 = this.f15462a;
        int i11 = this.f15463b;
        int i12 = this.f15468d;
        if (i10 == i12 && i11 == this.f15469e) {
            return this.f15467c;
        }
        int i13 = i10 * i11;
        byte[] bArr = new byte[i13];
        int i14 = (this.f15471g * i12) + this.f15470f;
        if (i10 == i12) {
            System.arraycopy(this.f15467c, i14, bArr, 0, i13);
            return bArr;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            System.arraycopy(this.f15467c, i14, bArr, i15 * i10, i10);
            i14 += this.f15468d;
        }
        return bArr;
    }

    public final byte[] b(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= this.f15463b) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i10)));
        }
        int i11 = this.f15462a;
        if (bArr == null || bArr.length < i11) {
            bArr = new byte[i11];
        }
        System.arraycopy(this.f15467c, ((i10 + this.f15471g) * this.f15468d) + this.f15470f, bArr, 0, i11);
        return bArr;
    }
}
