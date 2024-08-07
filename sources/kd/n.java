package kd;

import java.util.Collections;
import java.util.Set;
import uc.a;

/* compiled from: ITFWriter */
public final class n extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f12492b = {1, 1, 1, 1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f12493c = {3, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    public static final int[][] f12494d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    public final boolean[] c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            r.b(str);
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int a10 = r.a(zArr, 0, f12492b, true);
            for (int i10 = 0; i10 < length; i10 += 2) {
                int digit = Character.digit(str.charAt(i10), 10);
                int digit2 = Character.digit(str.charAt(i10 + 1), 10);
                int[] iArr = new int[10];
                for (int i11 = 0; i11 < 5; i11++) {
                    int i12 = i11 * 2;
                    int[][] iArr2 = f12494d;
                    iArr[i12] = iArr2[digit][i11];
                    iArr[i12 + 1] = iArr2[digit2][i11];
                }
                a10 += r.a(zArr, a10, iArr, true);
            }
            r.a(zArr, a10, f12493c, true);
            return zArr;
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }

    public final Set f() {
        return Collections.singleton(a.ITF);
    }
}
