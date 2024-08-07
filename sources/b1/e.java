package b1;

import f0.b0;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public a f3905a;

    /* renamed from: b  reason: collision with root package name */
    public String f3906b;

    /* renamed from: c  reason: collision with root package name */
    public int f3907c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f3908d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f3909e = 0;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<b> f3910f = new ArrayList<>();

    /* compiled from: KeyCycleOscillator */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public h f3911a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f3912b;

        /* renamed from: c  reason: collision with root package name */
        public double[] f3913c;

        /* renamed from: d  reason: collision with root package name */
        public float[] f3914d;

        /* renamed from: e  reason: collision with root package name */
        public float[] f3915e;

        /* renamed from: f  reason: collision with root package name */
        public float[] f3916f;

        /* renamed from: g  reason: collision with root package name */
        public b f3917g;

        /* renamed from: h  reason: collision with root package name */
        public double[] f3918h;

        /* renamed from: i  reason: collision with root package name */
        public double[] f3919i;

        public a(int i10, int i11, String str) {
            char c10;
            long j10;
            int i12 = i11;
            String str2 = str;
            h hVar = new h();
            this.f3911a = hVar;
            hVar.f3936e = i10;
            if (str2 != null) {
                double[] dArr = new double[(str.length() / 2)];
                int indexOf = str2.indexOf(40) + 1;
                int indexOf2 = str2.indexOf(44, indexOf);
                char c11 = 0;
                int i13 = 0;
                while (indexOf2 != -1) {
                    dArr[i13] = Double.parseDouble(str2.substring(indexOf, indexOf2).trim());
                    indexOf = indexOf2 + 1;
                    indexOf2 = str2.indexOf(44, indexOf);
                    i13++;
                }
                dArr[i13] = Double.parseDouble(str2.substring(indexOf, str2.indexOf(41, indexOf)).trim());
                double[] copyOf = Arrays.copyOf(dArr, i13 + 1);
                int length = (copyOf.length * 3) - 2;
                int length2 = copyOf.length - 1;
                double d10 = 1.0d / ((double) length2);
                int[] iArr = new int[2];
                iArr[1] = 1;
                iArr[0] = length;
                double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
                double[] dArr3 = new double[length];
                int i14 = 0;
                while (i14 < copyOf.length) {
                    double d11 = copyOf[i14];
                    int i15 = i14 + length2;
                    dArr2[i15][c11] = d11;
                    double d12 = ((double) i14) * d10;
                    dArr3[i15] = d12;
                    if (i14 > 0) {
                        int i16 = (length2 * 2) + i14;
                        j10 = 4607182418800017408L;
                        c10 = 0;
                        dArr2[i16][0] = d11 + 1.0d;
                        dArr3[i16] = d12 + 1.0d;
                        int i17 = i14 - 1;
                        dArr2[i17][0] = (d11 - 1.0d) - d10;
                        dArr3[i17] = (d12 - 4.0d) - d10;
                    } else {
                        j10 = 4607182418800017408L;
                        c10 = 0;
                    }
                    i14++;
                    long j11 = j10;
                    c11 = c10;
                }
                hVar.f3935d = new g(dArr3, dArr2);
            }
            this.f3912b = new float[i12];
            this.f3913c = new double[i12];
            this.f3914d = new float[i12];
            this.f3915e = new float[i12];
            this.f3916f = new float[i12];
            float[] fArr = new float[i12];
        }
    }

    /* compiled from: KeyCycleOscillator */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3920a;

        /* renamed from: b  reason: collision with root package name */
        public float f3921b;

        /* renamed from: c  reason: collision with root package name */
        public float f3922c;

        /* renamed from: d  reason: collision with root package name */
        public float f3923d;

        /* renamed from: e  reason: collision with root package name */
        public float f3924e;

        public b(int i10, float f10, float f11, float f12, float f13) {
            this.f3920a = i10;
            this.f3921b = f13;
            this.f3922c = f11;
            this.f3923d = f10;
            this.f3924e = f12;
        }
    }

    public final float a(float f10) {
        a aVar = this.f3905a;
        b bVar = aVar.f3917g;
        if (bVar != null) {
            bVar.c((double) f10, aVar.f3918h);
        } else {
            double[] dArr = aVar.f3918h;
            dArr[0] = (double) aVar.f3915e[0];
            dArr[1] = (double) aVar.f3916f[0];
            dArr[2] = (double) aVar.f3912b[0];
        }
        double[] dArr2 = aVar.f3918h;
        return (float) ((aVar.f3911a.c((double) f10, dArr2[1]) * aVar.f3918h[2]) + dArr2[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ba, code lost:
        r5 = r13 * 2.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d0, code lost:
        r5 = r17 * r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d2, code lost:
        r1 = r2.f3919i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e2, code lost:
        return (float) ((r5 * r2.f3918h[2]) + ((r11 * r1[2]) + r1[0]));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float b(float r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            b1.e$a r2 = r0.f3905a
            b1.b r3 = r2.f3917g
            r4 = 2
            r5 = 0
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x001d
            double r9 = (double) r1
            double[] r11 = r2.f3919i
            r3.f(r9, r11)
            b1.b r3 = r2.f3917g
            double[] r11 = r2.f3918h
            r3.c(r9, r11)
            goto L_0x0025
        L_0x001d:
            double[] r3 = r2.f3919i
            r3[r8] = r5
            r3[r7] = r5
            r3[r4] = r5
        L_0x0025:
            b1.h r3 = r2.f3911a
            double r9 = (double) r1
            double[] r1 = r2.f3918h
            r11 = r1[r7]
            double r11 = r3.c(r9, r11)
            b1.h r1 = r2.f3911a
            double[] r3 = r2.f3918h
            r13 = r3[r7]
            double[] r3 = r2.f3919i
            r15 = r3[r7]
            double r17 = r1.b(r9)
            double r17 = r17 + r13
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r3 > 0) goto L_0x004c
            r9 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            goto L_0x0055
        L_0x004c:
            int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x0055
            r9 = 4607182409792818153(0x3feffffde7210be9, double:0.999999)
        L_0x0055:
            double[] r3 = r1.f3933b
            int r3 = java.util.Arrays.binarySearch(r3, r9)
            if (r3 <= 0) goto L_0x005e
            goto L_0x007e
        L_0x005e:
            if (r3 == 0) goto L_0x007e
            int r3 = -r3
            int r3 = r3 + -1
            float[] r7 = r1.f3932a
            r19 = r7[r3]
            int r20 = r3 + -1
            r7 = r7[r20]
            float r5 = r19 - r7
            double r5 = (double) r5
            double[] r4 = r1.f3933b
            r21 = r4[r3]
            r3 = r4[r20]
            double r21 = r21 - r3
            double r5 = r5 / r21
            double r9 = r9 * r5
            double r13 = (double) r7
            double r5 = r5 * r3
            double r13 = r13 - r5
            double r13 = r13 + r9
            goto L_0x0080
        L_0x007e:
            r13 = 0
        L_0x0080:
            double r13 = r13 + r15
            int r3 = r1.f3936e
            r4 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r9 = 4616189618054758400(0x4010000000000000, double:4.0)
            switch(r3) {
                case 1: goto L_0x00cd;
                case 2: goto L_0x00bd;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00b9;
                case 5: goto L_0x00ac;
                case 6: goto L_0x00a2;
                case 7: goto L_0x0097;
                default: goto L_0x008f;
            }
        L_0x008f:
            double r13 = r13 * r4
            double r17 = r17 * r4
            double r17 = java.lang.Math.cos(r17)
            goto L_0x00d0
        L_0x0097:
            b1.g r1 = r1.f3935d
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r17 % r3
            double r5 = r1.e(r3)
            goto L_0x00d2
        L_0x00a2:
            double r13 = r13 * r9
            double r17 = r17 * r9
            double r17 = r17 + r6
            double r17 = r17 % r9
            double r17 = r17 - r6
            goto L_0x00d0
        L_0x00ac:
            r6 = -4604611780675359464(0xc01921fb54442d18, double:-6.283185307179586)
            double r13 = r13 * r6
            double r17 = r17 * r4
            double r17 = java.lang.Math.sin(r17)
            goto L_0x00d0
        L_0x00b9:
            double r13 = -r13
        L_0x00ba:
            double r5 = r13 * r6
            goto L_0x00d2
        L_0x00bd:
            double r13 = r13 * r9
            double r17 = r17 * r9
            r3 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r17 = r17 + r3
            double r17 = r17 % r9
            double r17 = r17 - r6
            double r17 = java.lang.Math.signum(r17)
            goto L_0x00d0
        L_0x00cd:
            r5 = 0
            goto L_0x00d2
        L_0x00d0:
            double r5 = r17 * r13
        L_0x00d2:
            double[] r1 = r2.f3919i
            r3 = r1[r8]
            r7 = 2
            r8 = r1[r7]
            double r11 = r11 * r8
            double r11 = r11 + r3
            double[] r1 = r2.f3918h
            r2 = r1[r7]
            double r5 = r5 * r2
            double r5 = r5 + r11
            float r1 = (float) r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.e.b(float):float");
    }

    public void c(g1.a aVar) {
    }

    public final void d() {
        int i10;
        int size = this.f3910f.size();
        if (size != 0) {
            Collections.sort(this.f3910f, new d());
            double[] dArr = new double[size];
            char c10 = 2;
            int[] iArr = new int[2];
            iArr[1] = 3;
            char c11 = 0;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            this.f3905a = new a(this.f3907c, size, this.f3908d);
            Iterator<b> it = this.f3910f.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                b next = it.next();
                float f10 = next.f3923d;
                dArr[i11] = ((double) f10) * 0.01d;
                double[] dArr3 = dArr2[i11];
                float f11 = next.f3921b;
                dArr3[c11] = (double) f11;
                float f12 = next.f3922c;
                dArr3[1] = (double) f12;
                float f13 = next.f3924e;
                dArr3[c10] = (double) f13;
                a aVar = this.f3905a;
                aVar.f3913c[i11] = ((double) next.f3920a) / 100.0d;
                aVar.f3914d[i11] = f10;
                aVar.f3915e[i11] = f12;
                aVar.f3916f[i11] = f13;
                aVar.f3912b[i11] = f11;
                i11++;
                dArr2 = dArr2;
                c10 = 2;
                c11 = 0;
            }
            double[][] dArr4 = dArr2;
            a aVar2 = this.f3905a;
            int length = aVar2.f3913c.length;
            int[] iArr2 = new int[2];
            iArr2[1] = 3;
            iArr2[0] = length;
            double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
            float[] fArr = aVar2.f3912b;
            aVar2.f3918h = new double[(fArr.length + 2)];
            aVar2.f3919i = new double[(fArr.length + 2)];
            if (aVar2.f3913c[0] > 0.0d) {
                aVar2.f3911a.a(0.0d, aVar2.f3914d[0]);
            }
            double[] dArr6 = aVar2.f3913c;
            int length2 = dArr6.length - 1;
            if (dArr6[length2] < 1.0d) {
                aVar2.f3911a.a(1.0d, aVar2.f3914d[length2]);
            }
            for (int i12 = 0; i12 < dArr5.length; i12++) {
                double[] dArr7 = dArr5[i12];
                dArr7[0] = (double) aVar2.f3915e[i12];
                dArr7[1] = (double) aVar2.f3916f[i12];
                dArr7[2] = (double) aVar2.f3912b[i12];
                aVar2.f3911a.a(aVar2.f3913c[i12], aVar2.f3914d[i12]);
            }
            h hVar = aVar2.f3911a;
            double d10 = 0.0d;
            int i13 = 0;
            while (true) {
                float[] fArr2 = hVar.f3932a;
                if (i13 >= fArr2.length) {
                    break;
                }
                d10 += (double) fArr2[i13];
                i13++;
            }
            int i14 = 1;
            double d11 = 0.0d;
            while (true) {
                float[] fArr3 = hVar.f3932a;
                if (i14 >= fArr3.length) {
                    break;
                }
                int i15 = i14 - 1;
                float f14 = (fArr3[i15] + fArr3[i14]) / 2.0f;
                double[] dArr8 = hVar.f3933b;
                d11 = ((dArr8[i14] - dArr8[i15]) * ((double) f14)) + d11;
                i14++;
            }
            int i16 = 0;
            while (true) {
                float[] fArr4 = hVar.f3932a;
                if (i16 >= fArr4.length) {
                    break;
                }
                fArr4[i16] = (float) (((double) fArr4[i16]) * (d10 / d11));
                i16++;
            }
            hVar.f3934c[0] = 0.0d;
            int i17 = 1;
            while (true) {
                float[] fArr5 = hVar.f3932a;
                if (i17 >= fArr5.length) {
                    break;
                }
                int i18 = i17 - 1;
                double[] dArr9 = hVar.f3933b;
                double d12 = dArr9[i17] - dArr9[i18];
                double[] dArr10 = hVar.f3934c;
                dArr10[i17] = (d12 * ((double) ((fArr5[i18] + fArr5[i17]) / 2.0f))) + dArr10[i18];
                i17++;
            }
            double[] dArr11 = aVar2.f3913c;
            if (dArr11.length > 1) {
                i10 = 0;
                aVar2.f3917g = b.a(0, dArr11, dArr5);
            } else {
                i10 = 0;
                aVar2.f3917g = null;
            }
            b.a(i10, dArr, dArr4);
        }
    }

    public final String toString() {
        String str = this.f3906b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f3910f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            StringBuilder v2 = b0.v(str, "[");
            v2.append(next.f3920a);
            v2.append(" , ");
            v2.append(decimalFormat.format((double) next.f3921b));
            v2.append("] ");
            str = v2.toString();
        }
        return str;
    }
}
