package b1;

import android.support.v4.media.a;
import java.util.Arrays;

/* compiled from: Oscillator */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public float[] f3932a = new float[0];

    /* renamed from: b  reason: collision with root package name */
    public double[] f3933b = new double[0];

    /* renamed from: c  reason: collision with root package name */
    public double[] f3934c;

    /* renamed from: d  reason: collision with root package name */
    public g f3935d;

    /* renamed from: e  reason: collision with root package name */
    public int f3936e;

    public final void a(double d10, float f10) {
        int length = this.f3932a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f3933b, d10);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f3933b = Arrays.copyOf(this.f3933b, length);
        this.f3932a = Arrays.copyOf(this.f3932a, length);
        this.f3934c = new double[length];
        double[] dArr = this.f3933b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f3933b[binarySearch] = d10;
        this.f3932a[binarySearch] = f10;
    }

    public final double b(double d10) {
        if (d10 < 0.0d) {
            d10 = 0.0d;
        } else if (d10 > 1.0d) {
            d10 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f3933b, d10);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i10 = (-binarySearch) - 1;
        float[] fArr = this.f3932a;
        float f10 = fArr[i10];
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        double d11 = (double) (f10 - f11);
        double[] dArr = this.f3933b;
        double d12 = dArr[i10];
        double d13 = dArr[i11];
        double d14 = d11 / (d12 - d13);
        return ((((d10 * d10) - (d13 * d13)) * d14) / 2.0d) + ((d10 - d13) * (((double) f11) - (d14 * d13))) + this.f3934c[i11];
    }

    public final double c(double d10, double d11) {
        double d12;
        double b10 = b(d10) + d11;
        switch (this.f3936e) {
            case 1:
                return Math.signum(0.5d - (b10 % 1.0d));
            case 2:
                d12 = Math.abs((((b10 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((b10 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                d12 = ((b10 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d11 + b10) * 6.283185307179586d);
            case 6:
                double abs = 1.0d - Math.abs(((b10 * 4.0d) % 4.0d) - 2.0d);
                d12 = abs * abs;
                break;
            case 7:
                return this.f3935d.b(b10 % 1.0d);
            default:
                return Math.sin(b10 * 6.283185307179586d);
        }
        return 1.0d - d12;
    }

    public final String toString() {
        StringBuilder q10 = a.q("pos =");
        q10.append(Arrays.toString(this.f3933b));
        q10.append(" period=");
        q10.append(Arrays.toString(this.f3932a));
        return q10.toString();
    }
}
