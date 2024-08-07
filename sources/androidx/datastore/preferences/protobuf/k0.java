package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import j2.c;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite */
public final class k0 {

    /* renamed from: f  reason: collision with root package name */
    public static final k0 f2293f = new k0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f2294a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2295b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2296c;

    /* renamed from: d  reason: collision with root package name */
    public int f2297d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2298e;

    public k0() {
        this(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int i10;
        int i11 = this.f2297d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f2294a; i13++) {
            int i14 = this.f2295b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                i10 = CodedOutputStream.e0(i15, ((Long) this.f2296c[i13]).longValue());
            } else if (i16 == 1) {
                ((Long) this.f2296c[i13]).longValue();
                i10 = CodedOutputStream.O(i15);
            } else if (i16 == 2) {
                i10 = CodedOutputStream.K(i15, (c) this.f2296c[i13]);
            } else if (i16 == 3) {
                i12 = ((k0) this.f2296c[i13]).a() + (CodedOutputStream.b0(i15) * 2) + i12;
            } else if (i16 == 5) {
                ((Integer) this.f2296c[i13]).intValue();
                i10 = CodedOutputStream.N(i15);
            } else {
                int i17 = InvalidProtocolBufferException.f2211a;
                throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException());
            }
            i12 = i10 + i12;
        }
        this.f2297d = i12;
        return i12;
    }

    public final void b(int i10, Object obj) {
        int i11;
        if (this.f2298e) {
            int i12 = this.f2294a;
            int[] iArr = this.f2295b;
            if (i12 == iArr.length) {
                if (i12 < 4) {
                    i11 = 8;
                } else {
                    i11 = i12 >> 1;
                }
                int i13 = i12 + i11;
                this.f2295b = Arrays.copyOf(iArr, i13);
                this.f2296c = Arrays.copyOf(this.f2296c, i13);
            }
            int[] iArr2 = this.f2295b;
            int i14 = this.f2294a;
            iArr2[i14] = i10;
            this.f2296c[i14] = obj;
            this.f2294a = i14 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void c(g gVar) {
        if (this.f2294a != 0) {
            gVar.getClass();
            for (int i10 = 0; i10 < this.f2294a; i10++) {
                int i11 = this.f2295b[i10];
                Object obj = this.f2296c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    gVar.j(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    gVar.f(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    gVar.b(i12, (c) obj);
                } else if (i13 == 3) {
                    gVar.f2264a.y0(i12, 3);
                    ((k0) obj).c(gVar);
                    gVar.f2264a.y0(i12, 4);
                } else if (i13 == 5) {
                    gVar.e(i12, ((Integer) obj).intValue());
                } else {
                    int i14 = InvalidProtocolBufferException.f2211a;
                    throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        int i10 = this.f2294a;
        if (i10 == k0Var.f2294a) {
            int[] iArr = this.f2295b;
            int[] iArr2 = k0Var.f2295b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    z10 = true;
                    break;
                } else if (iArr[i11] != iArr2[i11]) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                Object[] objArr = this.f2296c;
                Object[] objArr2 = k0Var.f2296c;
                int i12 = this.f2294a;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z11 = true;
                        break;
                    } else if (!objArr[i13].equals(objArr2[i13])) {
                        z11 = false;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (!z11) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f2294a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f2295b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f2296c;
        int i16 = this.f2294a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public k0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f2297d = -1;
        this.f2294a = i10;
        this.f2295b = iArr;
        this.f2296c = objArr;
        this.f2298e = z10;
    }
}
