package sd;

import a1.e;
import java.lang.reflect.Array;

/* compiled from: BarcodeMatrix */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e[] f14739a;

    /* renamed from: b  reason: collision with root package name */
    public int f14740b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14741c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14742d;

    public a(int i10, int i11) {
        e[] eVarArr = new e[i10];
        this.f14739a = eVarArr;
        int length = eVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f14739a[i12] = new e(((i11 + 4) * 17) + 1, 2);
        }
        this.f14742d = i11 * 17;
        this.f14741c = i10;
        this.f14740b = -1;
    }

    public final e a() {
        return this.f14739a[this.f14740b];
    }

    public final byte[][] b(int i10, int i11) {
        int[] iArr = new int[2];
        iArr[1] = this.f14742d * i10;
        iArr[0] = this.f14741c * i11;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        int i12 = this.f14741c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i12 - i13) - 1;
            e eVar = this.f14739a[i13 / i11];
            int length = ((byte[]) eVar.f46b).length * i10;
            byte[] bArr2 = new byte[length];
            for (int i15 = 0; i15 < length; i15++) {
                bArr2[i15] = ((byte[]) eVar.f46b)[i15 / i10];
            }
            bArr[i14] = bArr2;
        }
        return bArr;
    }
}
