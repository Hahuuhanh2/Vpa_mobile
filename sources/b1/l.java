package b1;

import android.support.v4.media.a;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: StepCurve */
public final class l extends c {

    /* renamed from: d  reason: collision with root package name */
    public g f3953d;

    public l(String str) {
        String str2 = str;
        this.f3900a = str2;
        double[] dArr = new double[(str.length() / 2)];
        int indexOf = str2.indexOf(40) + 1;
        int indexOf2 = str2.indexOf(44, indexOf);
        int i10 = 0;
        while (indexOf2 != -1) {
            dArr[i10] = Double.parseDouble(str2.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str2.indexOf(44, indexOf);
            i10++;
        }
        dArr[i10] = Double.parseDouble(str2.substring(indexOf, str2.indexOf(41, indexOf)).trim());
        double[] copyOf = Arrays.copyOf(dArr, i10 + 1);
        int length = (copyOf.length * 3) - 2;
        int length2 = copyOf.length - 1;
        double d10 = 1.0d / ((double) length2);
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = length;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        double[] dArr3 = new double[length];
        for (int i11 = 0; i11 < copyOf.length; i11++) {
            double d11 = copyOf[i11];
            int i12 = i11 + length2;
            dArr2[i12][0] = d11;
            double d12 = ((double) i11) * d10;
            dArr3[i12] = d12;
            if (i11 > 0) {
                int i13 = (length2 * 2) + i11;
                dArr2[i13][0] = d11 + 1.0d;
                dArr3[i13] = d12 + 1.0d;
                int i14 = i11 - 1;
                dArr2[i14][0] = (d11 - 1.0d) - d10;
                dArr3[i14] = (d12 - 4.0d) - d10;
            }
        }
        g gVar = new g(dArr3, dArr2);
        PrintStream printStream = System.out;
        StringBuilder q10 = a.q(" 0 ");
        q10.append(gVar.b(0.0d));
        printStream.println(q10.toString());
        PrintStream printStream2 = System.out;
        StringBuilder q11 = a.q(" 1 ");
        q11.append(gVar.b(1.0d));
        printStream2.println(q11.toString());
        this.f3953d = gVar;
    }

    public final double a(double d10) {
        return this.f3953d.b(d10);
    }

    public final double b(double d10) {
        return this.f3953d.e(d10);
    }
}
