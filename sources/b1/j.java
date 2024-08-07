package b1;

import f0.b0;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: SplineSet */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public b f3939a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f3940b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    public float[] f3941c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    public int f3942d;

    /* renamed from: e  reason: collision with root package name */
    public String f3943e;

    public final float a(float f10) {
        return (float) this.f3939a.b((double) f10);
    }

    public void b(int i10, float f10) {
        int[] iArr = this.f3940b;
        if (iArr.length < this.f3942d + 1) {
            this.f3940b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3941c;
            this.f3941c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f3940b;
        int i11 = this.f3942d;
        iArr2[i11] = i10;
        this.f3941c[i11] = f10;
        this.f3942d = i11 + 1;
    }

    public void c(int i10) {
        int i11 = this.f3942d;
        if (i11 != 0) {
            int[] iArr = this.f3940b;
            float[] fArr = this.f3941c;
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i11 - 1;
            iArr2[1] = 0;
            int i12 = 2;
            while (i12 > 0) {
                int i13 = i12 - 1;
                int i14 = iArr2[i13];
                i12 = i13 - 1;
                int i15 = iArr2[i12];
                if (i14 < i15) {
                    int i16 = iArr[i15];
                    int i17 = i14;
                    int i18 = i17;
                    while (i17 < i15) {
                        int i19 = iArr[i17];
                        if (i19 <= i16) {
                            int i20 = iArr[i18];
                            iArr[i18] = i19;
                            iArr[i17] = i20;
                            float f10 = fArr[i18];
                            fArr[i18] = fArr[i17];
                            fArr[i17] = f10;
                            i18++;
                        }
                        i17++;
                    }
                    int i21 = iArr[i18];
                    iArr[i18] = iArr[i15];
                    iArr[i15] = i21;
                    float f11 = fArr[i18];
                    fArr[i18] = fArr[i15];
                    fArr[i15] = f11;
                    int i22 = i12 + 1;
                    iArr2[i12] = i18 - 1;
                    int i23 = i22 + 1;
                    iArr2[i22] = i14;
                    int i24 = i23 + 1;
                    iArr2[i23] = i15;
                    i12 = i24 + 1;
                    iArr2[i24] = i18 + 1;
                }
            }
            int i25 = 1;
            for (int i26 = 1; i26 < this.f3942d; i26++) {
                int[] iArr3 = this.f3940b;
                if (iArr3[i26 - 1] != iArr3[i26]) {
                    i25++;
                }
            }
            double[] dArr = new double[i25];
            int[] iArr4 = new int[2];
            iArr4[1] = 1;
            iArr4[0] = i25;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
            int i27 = 0;
            for (int i28 = 0; i28 < this.f3942d; i28++) {
                if (i28 > 0) {
                    int[] iArr5 = this.f3940b;
                    if (iArr5[i28] == iArr5[i28 - 1]) {
                    }
                }
                dArr[i27] = ((double) this.f3940b[i28]) * 0.01d;
                dArr2[i27][0] = (double) this.f3941c[i28];
                i27++;
            }
            this.f3939a = b.a(i10, dArr, dArr2);
        }
    }

    public final String toString() {
        String str = this.f3943e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f3942d; i10++) {
            StringBuilder v2 = b0.v(str, "[");
            v2.append(this.f3940b[i10]);
            v2.append(" , ");
            v2.append(decimalFormat.format((double) this.f3941c[i10]));
            v2.append("] ");
            str = v2.toString();
        }
        return str;
    }
}
