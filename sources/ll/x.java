package ll;

import fk.h;
import sk.j;

/* compiled from: Segment.kt */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f20918a;

    /* renamed from: b  reason: collision with root package name */
    public int f20919b;

    /* renamed from: c  reason: collision with root package name */
    public int f20920c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20921d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20922e;

    /* renamed from: f  reason: collision with root package name */
    public x f20923f;

    /* renamed from: g  reason: collision with root package name */
    public x f20924g;

    public x() {
        this.f20918a = new byte[8192];
        this.f20922e = true;
        this.f20921d = false;
    }

    public final x a() {
        x xVar = this.f20923f;
        if (xVar == this) {
            xVar = null;
        }
        x xVar2 = this.f20924g;
        j.c(xVar2);
        xVar2.f20923f = this.f20923f;
        x xVar3 = this.f20923f;
        j.c(xVar3);
        xVar3.f20924g = this.f20924g;
        this.f20923f = null;
        this.f20924g = null;
        return xVar;
    }

    public final void b(x xVar) {
        xVar.f20924g = this;
        xVar.f20923f = this.f20923f;
        x xVar2 = this.f20923f;
        j.c(xVar2);
        xVar2.f20924g = xVar;
        this.f20923f = xVar;
    }

    public final x c() {
        this.f20921d = true;
        return new x(this.f20918a, this.f20919b, this.f20920c, true, false);
    }

    public final void d(x xVar, int i10) {
        if (xVar.f20922e) {
            int i11 = xVar.f20920c;
            int i12 = i11 + i10;
            if (i12 > 8192) {
                if (!xVar.f20921d) {
                    int i13 = xVar.f20919b;
                    if (i12 - i13 <= 8192) {
                        byte[] bArr = xVar.f20918a;
                        h.n0(bArr, 0, bArr, i13, i11);
                        xVar.f20920c -= xVar.f20919b;
                        xVar.f20919b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f20918a;
            byte[] bArr3 = xVar.f20918a;
            int i14 = xVar.f20920c;
            int i15 = this.f20919b;
            h.n0(bArr2, i14, bArr3, i15, i15 + i10);
            xVar.f20920c += i10;
            this.f20919b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public x(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        j.f(bArr, "data");
        this.f20918a = bArr;
        this.f20919b = i10;
        this.f20920c = i11;
        this.f20921d = z10;
        this.f20922e = z11;
    }
}
