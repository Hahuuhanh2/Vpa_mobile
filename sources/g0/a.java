package g0;

import al.g0;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* compiled from: AspectRatioUtil */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Rational f10214a = new Rational(4, 3);

    /* renamed from: b  reason: collision with root package name */
    public static final Rational f10215b = new Rational(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static final Rational f10216c = new Rational(16, 9);

    /* renamed from: d  reason: collision with root package name */
    public static final Rational f10217d = new Rational(9, 16);

    /* renamed from: g0.a$a  reason: collision with other inner class name */
    /* compiled from: AspectRatioUtil */
    public static final class C0109a implements Comparator<Rational> {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f10218a;

        /* renamed from: b  reason: collision with root package name */
        public final Rational f10219b;

        public C0109a(Rational rational, Rational rational2) {
            this.f10219b = rational2 == null ? new Rational(4, 3) : rational2;
            this.f10218a = b(rational);
        }

        public static float a(RectF rectF, RectF rectF2) {
            float f10;
            float f11;
            if (rectF.width() < rectF2.width()) {
                f10 = rectF.width();
            } else {
                f10 = rectF2.width();
            }
            if (rectF.height() < rectF2.height()) {
                f11 = rectF.height();
            } else {
                f11 = rectF2.height();
            }
            return f10 * f11;
        }

        public final RectF b(Rational rational) {
            if (rational.floatValue() == this.f10219b.floatValue()) {
                return new RectF(0.0f, 0.0f, (float) this.f10219b.getNumerator(), (float) this.f10219b.getDenominator());
            }
            if (rational.floatValue() > this.f10219b.floatValue()) {
                return new RectF(0.0f, 0.0f, (float) this.f10219b.getNumerator(), (((float) rational.getDenominator()) * ((float) this.f10219b.getNumerator())) / ((float) rational.getNumerator()));
            }
            return new RectF(0.0f, 0.0f, (((float) rational.getNumerator()) * ((float) this.f10219b.getDenominator())) / ((float) rational.getDenominator()), (float) this.f10219b.getDenominator());
        }

        public final int compare(Object obj, Object obj2) {
            boolean z10;
            Rational rational = (Rational) obj;
            Rational rational2 = (Rational) obj2;
            boolean z11 = false;
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF b10 = b(rational);
            RectF b11 = b(rational2);
            RectF rectF = this.f10218a;
            if (b10.width() < rectF.width() || b10.height() < rectF.height()) {
                z10 = false;
            } else {
                z10 = true;
            }
            RectF rectF2 = this.f10218a;
            if (b11.width() >= rectF2.width() && b11.height() >= rectF2.height()) {
                z11 = true;
            }
            if (z10 && z11) {
                return (int) Math.signum((b10.height() * b10.width()) - (b11.height() * b11.width()));
            } else if (z10) {
                return -1;
            } else {
                if (z11) {
                    return 1;
                }
                return -((int) Math.signum(a(b10, this.f10218a) - a(b11, this.f10218a)));
            }
        }
    }

    public static boolean a(Size size, Rational rational) {
        boolean b10;
        Size size2 = m0.a.f13037b;
        if (rational != null) {
            if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
                return true;
            }
            if (size.getHeight() * size.getWidth() >= size2.getHeight() * size2.getWidth()) {
                int width = size.getWidth();
                int height = size.getHeight();
                Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
                int i10 = width % 16;
                if (i10 != 0 || height % 16 != 0) {
                    if (i10 == 0) {
                        b10 = b(height, width, rational);
                    } else if (height % 16 == 0) {
                        b10 = b(width, height, rational2);
                    }
                    return b10;
                } else if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(int i10, int i11, Rational rational) {
        boolean z10;
        if (i11 % 16 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.z(z10);
        double numerator = ((double) (rational.getNumerator() * i10)) / ((double) rational.getDenominator());
        if (numerator <= ((double) Math.max(0, i11 - 16)) || numerator >= ((double) (i11 + 16))) {
            return false;
        }
        return true;
    }
}
