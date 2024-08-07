package j0;

import al.g0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.media.a;
import android.util.Rational;
import androidx.camera.core.impl.v;
import c0.f1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewPorts */
public final class k {
    public static HashMap a(Rect rect, boolean z10, Rational rational, int i10, int i11, int i12, HashMap hashMap) {
        boolean z11;
        Rational rational2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        RectF rectF;
        boolean z17;
        boolean z18;
        boolean z19;
        Rect rect2 = rect;
        int i13 = i10;
        int i14 = i11;
        boolean z20 = true;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        g0.y("Cannot compute viewport crop rects zero sized sensor rect.", z11);
        RectF rectF2 = new RectF(rect);
        HashMap hashMap2 = new HashMap();
        RectF rectF3 = new RectF(rect);
        for (Map.Entry entry : hashMap.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF4 = new RectF(0.0f, 0.0f, (float) ((v) entry.getValue()).d().getWidth(), (float) ((v) entry.getValue()).d().getHeight());
            matrix.setRectToRect(rectF4, rectF2, Matrix.ScaleToFit.CENTER);
            hashMap2.put((f1) entry.getKey(), matrix);
            RectF rectF5 = new RectF();
            matrix.mapRect(rectF5, rectF4);
            rectF3.intersect(rectF5);
        }
        if (i13 != 90 && i13 != 270) {
            rational2 = new Rational(rational.getNumerator(), rational.getDenominator());
        } else if (rational == null) {
            rational2 = rational;
        } else {
            rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        }
        if (i14 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF6 = new RectF(0.0f, 0.0f, (float) rational2.getNumerator(), (float) rational2.getDenominator());
            if (i14 == 0) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.START);
            } else if (i14 == 1) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.CENTER);
            } else if (i14 == 2) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.END);
            } else {
                throw new IllegalStateException(a.m("Unexpected scale type: ", i14));
            }
            RectF rectF7 = new RectF();
            matrix2.mapRect(rectF7, rectF6);
            if (i12 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z21 = z12 ^ z10;
            if (i13 != 0 || z21) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i13 != 90 || !z21) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (!z13 && !z14) {
                if (i13 != 0 || !z21) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (i13 != 270 || z21) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (z15 || z16) {
                    float centerX = rectF3.centerX();
                    float f10 = centerX + centerX;
                    rectF = new RectF(f10 - rectF7.right, rectF7.top, f10 - rectF7.left, rectF7.bottom);
                } else {
                    if (i13 != 90 || z21) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    if (i13 != 180 || !z21) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    if (z17 || z18) {
                        float centerY = rectF3.centerY();
                        float f11 = centerY + centerY;
                        rectF = new RectF(rectF7.left, f11 - rectF7.bottom, rectF7.right, f11 - rectF7.top);
                    } else {
                        if (i13 != 180 || z21) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        if (i13 != 270 || !z21) {
                            z20 = false;
                        }
                        if (z19 || z20) {
                            float centerY2 = rectF3.centerY();
                            float f12 = centerY2 + centerY2;
                            RectF rectF8 = new RectF(rectF7.left, f12 - rectF7.bottom, rectF7.right, f12 - rectF7.top);
                            float centerX2 = rectF3.centerX();
                            float f13 = centerX2 + centerX2;
                            rectF7 = new RectF(f13 - rectF8.right, rectF8.top, f13 - rectF8.left, rectF8.bottom);
                        } else {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z21 + " rotation " + i13);
                        }
                    }
                }
                rectF3 = rectF;
            }
            rectF3 = rectF7;
        }
        HashMap hashMap3 = new HashMap();
        RectF rectF9 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF9, rectF3);
            Rect rect3 = new Rect();
            rectF9.round(rect3);
            hashMap3.put((f1) entry2.getKey(), rect3);
        }
        return hashMap3;
    }
}
