package ud;

import n0.l;
import v.v;

/* compiled from: FormatInformation */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final int[][] f15498c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a  reason: collision with root package name */
    public final int f15499a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f15500b;

    public e(int i10) {
        int i11 = (i10 >> 3) & 3;
        if (i11 >= 0) {
            int[] iArr = l.f13351a;
            if (i11 < 4) {
                this.f15499a = iArr[i11];
                this.f15500b = (byte) (i10 & 7);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static e a(int i10, int i11) {
        int bitCount;
        int[][] iArr = f15498c;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            int[] iArr2 = iArr[i14];
            int i15 = iArr2[0];
            if (i15 == i10 || i15 == i11) {
                return new e(iArr2[1]);
            }
            int bitCount2 = Integer.bitCount(i10 ^ i15);
            if (bitCount2 < i12) {
                i13 = iArr2[1];
                i12 = bitCount2;
            }
            if (i10 != i11 && (bitCount = Integer.bitCount(i15 ^ i11)) < i12) {
                i13 = iArr2[1];
                i12 = bitCount;
            }
        }
        if (i12 <= 3) {
            return new e(i13);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f15499a == eVar.f15499a && this.f15500b == eVar.f15500b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (v.g(this.f15499a) << 3) | this.f15500b;
    }
}
