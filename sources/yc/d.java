package yc;

import cd.a;

/* compiled from: SimpleToken */
public final class d extends f {

    /* renamed from: c  reason: collision with root package name */
    public final short f17652c;

    /* renamed from: d  reason: collision with root package name */
    public final short f17653d;

    public d(f fVar, int i10, int i11) {
        super(fVar);
        this.f17652c = (short) i10;
        this.f17653d = (short) i11;
    }

    public final void a(a aVar, byte[] bArr) {
        aVar.b(this.f17652c, this.f17653d);
    }

    public final String toString() {
        short s10 = this.f17652c;
        short s11 = this.f17653d;
        short s12 = (s10 & ((1 << s11) - 1)) | (1 << s11);
        return "<" + Integer.toBinaryString(s12 | (1 << this.f17653d)).substring(1) + '>';
    }
}
