package yc;

/* compiled from: BinaryShiftToken */
public final class a extends f {

    /* renamed from: c  reason: collision with root package name */
    public final short f17645c;

    /* renamed from: d  reason: collision with root package name */
    public final short f17646d;

    public a(f fVar, int i10, int i11) {
        super(fVar);
        this.f17645c = (short) i10;
        this.f17646d = (short) i11;
    }

    public final void a(cd.a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s10 = this.f17646d;
            if (i10 < s10) {
                if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                    aVar.b(31, 5);
                    short s11 = this.f17646d;
                    if (s11 > 62) {
                        aVar.b(s11 - 31, 16);
                    } else if (i10 == 0) {
                        aVar.b(Math.min(s11, 31), 5);
                    } else {
                        aVar.b(s11 - 31, 5);
                    }
                }
                aVar.b(bArr[this.f17645c + i10], 8);
                i10++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(this.f17645c);
        sb2.append("::");
        sb2.append((this.f17645c + this.f17646d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
