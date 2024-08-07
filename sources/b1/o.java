package b1;

import android.support.v4.media.a;
import f0.b0;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public b f3967a;

    /* renamed from: b  reason: collision with root package name */
    public int f3968b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int[] f3969c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    public float[][] f3970d = ((float[][]) Array.newInstance(Float.TYPE, new int[]{10, 3}));

    /* renamed from: e  reason: collision with root package name */
    public int f3971e;

    /* renamed from: f  reason: collision with root package name */
    public String f3972f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f3973g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    public boolean f3974h = false;

    /* renamed from: i  reason: collision with root package name */
    public long f3975i;

    /* renamed from: j  reason: collision with root package name */
    public float f3976j = Float.NaN;

    public final float a(float f10) {
        float abs;
        switch (this.f3968b) {
            case 1:
                return Math.signum(f10 * 6.2831855f);
            case 2:
                abs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f10 * 6.2831855f));
            case 6:
                float abs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f10 * 6.2831855f));
        }
        return 1.0f - abs;
    }

    public void b(float f10, float f11, float f12, int i10, int i11) {
        int[] iArr = this.f3969c;
        int i12 = this.f3971e;
        iArr[i12] = i10;
        float[] fArr = this.f3970d[i12];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        this.f3968b = Math.max(this.f3968b, i11);
        this.f3971e++;
    }

    public void c(int i10) {
        int i11 = this.f3971e;
        if (i11 == 0) {
            PrintStream printStream = System.err;
            StringBuilder q10 = a.q("Error no points added to ");
            q10.append(this.f3972f);
            printStream.println(q10.toString());
            return;
        }
        int[] iArr = this.f3969c;
        float[][] fArr = this.f3970d;
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
                        float[] fArr2 = fArr[i18];
                        fArr[i18] = fArr[i17];
                        fArr[i17] = fArr2;
                        i18++;
                    }
                    i17++;
                }
                int i21 = iArr[i18];
                iArr[i18] = iArr[i15];
                iArr[i15] = i21;
                float[] fArr3 = fArr[i18];
                fArr[i18] = fArr[i15];
                fArr[i15] = fArr3;
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
        int i26 = 0;
        while (true) {
            int[] iArr3 = this.f3969c;
            if (i25 >= iArr3.length) {
                break;
            }
            if (iArr3[i25] != iArr3[i25 - 1]) {
                i26++;
            }
            i25++;
        }
        if (i26 == 0) {
            i26 = 1;
        }
        double[] dArr = new double[i26];
        int[] iArr4 = new int[2];
        iArr4[1] = 3;
        iArr4[0] = i26;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr4);
        int i27 = 0;
        for (int i28 = 0; i28 < this.f3971e; i28++) {
            if (i28 > 0) {
                int[] iArr5 = this.f3969c;
                if (iArr5[i28] == iArr5[i28 - 1]) {
                }
            }
            dArr[i27] = ((double) this.f3969c[i28]) * 0.01d;
            double[] dArr3 = dArr2[i27];
            float[] fArr4 = this.f3970d[i28];
            dArr3[0] = (double) fArr4[0];
            dArr3[1] = (double) fArr4[1];
            dArr3[2] = (double) fArr4[2];
            i27++;
        }
        this.f3967a = b.a(i10, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f3972f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f3971e; i10++) {
            StringBuilder v2 = b0.v(str, "[");
            v2.append(this.f3969c[i10]);
            v2.append(" , ");
            v2.append(decimalFormat.format(this.f3970d[i10]));
            v2.append("] ");
            str = v2.toString();
        }
        return str;
    }
}
