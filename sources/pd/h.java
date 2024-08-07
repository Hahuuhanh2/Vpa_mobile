package pd;

import java.lang.reflect.Array;
import m9.b;

/* compiled from: PDF417CodewordDecoder */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f14169a = ((float[][]) Array.newInstance(Float.TYPE, new int[]{2787, 8}));

    static {
        int i10;
        int i11 = 0;
        while (true) {
            int[] iArr = b.F;
            if (i11 < 2787) {
                int i12 = iArr[i11];
                int i13 = i12 & 1;
                int i14 = 0;
                while (i14 < 8) {
                    float f10 = 0.0f;
                    while (true) {
                        i10 = i12 & 1;
                        if (i10 != i13) {
                            break;
                        }
                        f10 += 1.0f;
                        i12 >>= 1;
                    }
                    f14169a[i11][(8 - i14) - 1] = f10 / 17.0f;
                    i14++;
                    i13 = i10;
                }
                i11++;
            } else {
                return;
            }
        }
    }
}
