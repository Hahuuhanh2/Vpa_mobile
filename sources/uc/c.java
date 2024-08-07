package uc;

/* compiled from: InvertedLuminanceSource */
public final class c extends d {

    /* renamed from: c  reason: collision with root package name */
    public final d f15461c;

    public c(d dVar) {
        super(dVar.f15462a, dVar.f15463b);
        this.f15461c = dVar;
    }

    public final byte[] a() {
        byte[] a10 = this.f15461c.a();
        int i10 = this.f15462a * this.f15463b;
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (255 - (a10[i11] & 255));
        }
        return bArr;
    }

    public final byte[] b(int i10, byte[] bArr) {
        byte[] b10 = this.f15461c.b(i10, bArr);
        int i11 = this.f15462a;
        for (int i12 = 0; i12 < i11; i12++) {
            b10[i12] = (byte) (255 - (b10[i12] & 255));
        }
        return b10;
    }

    public final boolean c() {
        return this.f15461c.c();
    }

    public final d d() {
        return new c(this.f15461c.d());
    }
}
