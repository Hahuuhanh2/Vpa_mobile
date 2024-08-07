package ll;

import fk.h;
import j7.a;
import java.security.MessageDigest;
import sk.j;

/* compiled from: SegmentedByteString.kt */
public final class z extends j {

    /* renamed from: e  reason: collision with root package name */
    public final transient byte[][] f20928e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int[] f20929f;

    public z(byte[][] bArr, int[] iArr) {
        super(j.f20882d.f20883a);
        this.f20928e = bArr;
        this.f20929f = iArr;
    }

    public final String b() {
        return new j(t()).b();
    }

    public final j c(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = this.f20928e.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f20929f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            instance.update(this.f20928e[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = instance.digest();
        j.c(digest);
        return new j(digest);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (jVar.i() != i() || !o(jVar, i())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f20884b;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f20928e.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f20929f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr = this.f20928e[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f20884b = i12;
        return i12;
    }

    public final int i() {
        return this.f20929f[this.f20928e.length - 1];
    }

    public final String j() {
        return new j(t()).j();
    }

    public final byte[] k() {
        return t();
    }

    public final byte m(int i10) {
        int i11;
        b.b((long) this.f20929f[this.f20928e.length - 1], (long) i10, 1);
        int r02 = a.r0(this, i10);
        if (r02 == 0) {
            i11 = 0;
        } else {
            i11 = this.f20929f[r02 - 1];
        }
        int[] iArr = this.f20929f;
        byte[][] bArr = this.f20928e;
        return bArr[r02][(i10 - i11) + iArr[bArr.length + r02]];
    }

    public final boolean n(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        j.f(bArr, "other");
        if (i10 < 0 || i10 > i() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int r02 = a.r0(this, i10);
        while (i10 < i14) {
            if (r02 == 0) {
                i13 = 0;
            } else {
                i13 = this.f20929f[r02 - 1];
            }
            int[] iArr = this.f20929f;
            int i15 = iArr[this.f20928e.length + r02];
            int min = Math.min(i14, (iArr[r02] - i13) + i13) - i10;
            if (!b.a(this.f20928e[r02], (i10 - i13) + i15, bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            r02++;
        }
        return true;
    }

    public final boolean o(j jVar, int i10) {
        int i11;
        j.f(jVar, "other");
        if (i() - i10 < 0) {
            return false;
        }
        int i12 = i10 + 0;
        int r02 = a.r0(this, 0);
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            if (r02 == 0) {
                i11 = 0;
            } else {
                i11 = this.f20929f[r02 - 1];
            }
            int[] iArr = this.f20929f;
            int i15 = iArr[this.f20928e.length + r02];
            int min = Math.min(i12, (iArr[r02] - i11) + i11) - i13;
            if (!jVar.n(i14, this.f20928e[r02], (i13 - i11) + i15, min)) {
                return false;
            }
            i14 += min;
            i13 += min;
            r02++;
        }
        return true;
    }

    public final j p() {
        return new j(t()).p();
    }

    public final void s(f fVar, int i10) {
        int i11;
        j.f(fVar, "buffer");
        int i12 = 0 + i10;
        int r02 = a.r0(this, 0);
        int i13 = 0;
        while (i13 < i12) {
            if (r02 == 0) {
                i11 = 0;
            } else {
                i11 = this.f20929f[r02 - 1];
            }
            int[] iArr = this.f20929f;
            int i14 = iArr[this.f20928e.length + r02];
            int min = Math.min(i12, (iArr[r02] - i11) + i11) - i13;
            int i15 = (i13 - i11) + i14;
            x xVar = new x(this.f20928e[r02], i15, i15 + min, true, false);
            x xVar2 = fVar.f20877a;
            if (xVar2 == null) {
                xVar.f20924g = xVar;
                xVar.f20923f = xVar;
                fVar.f20877a = xVar;
            } else {
                x xVar3 = xVar2.f20924g;
                j.c(xVar3);
                xVar3.b(xVar);
            }
            i13 += min;
            r02++;
        }
        fVar.f20878b += (long) i10;
    }

    public final byte[] t() {
        byte[] bArr = new byte[i()];
        int length = this.f20928e.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f20929f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            h.n0(this.f20928e[i10], i12, bArr, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public final String toString() {
        return new j(t()).toString();
    }
}
