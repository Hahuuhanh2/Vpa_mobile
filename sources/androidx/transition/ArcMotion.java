package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.support.v4.media.a;
import android.util.AttributeSet;
import i3.m;
import m1.i;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {

    /* renamed from: d  reason: collision with root package name */
    public static final float f3389d = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a  reason: collision with root package name */
    public float f3390a;

    /* renamed from: b  reason: collision with root package name */
    public float f3391b;

    /* renamed from: c  reason: collision with root package name */
    public float f3392c;

    public ArcMotion() {
        throw null;
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3390a = 0.0f;
        this.f3391b = 0.0f;
        this.f3392c = f3389d;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f11057h);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f3391b = b(i.b(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        this.f3390a = b(i.b(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        this.f3392c = b(i.b(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    public static float b(float f10) {
        if (f10 >= 0.0f && f10 <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f10 / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    public final Path a(float f10, float f11, float f12, float f13) {
        boolean z10;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        Path path = new Path();
        path.moveTo(f10, f11);
        float f19 = f12 - f10;
        float f20 = f13 - f11;
        float f21 = (f20 * f20) + (f19 * f19);
        float f22 = (f10 + f12) / 2.0f;
        float f23 = (f11 + f13) / 2.0f;
        float f24 = 0.25f * f21;
        if (f11 > f13) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Math.abs(f19) < Math.abs(f20)) {
            float abs = Math.abs(f21 / (f20 * 2.0f));
            if (z10) {
                f16 = abs + f13;
                f15 = f12;
            } else {
                f16 = abs + f11;
                f15 = f10;
            }
            f14 = this.f3391b;
        } else {
            float f25 = f21 / (f19 * 2.0f);
            if (z10) {
                f18 = f11;
                f17 = f25 + f10;
            } else {
                f17 = f12 - f25;
                f18 = f13;
            }
            f14 = this.f3390a;
        }
        float f26 = f24 * f14 * f14;
        float f27 = f22 - f15;
        float f28 = f23 - f16;
        float f29 = (f28 * f28) + (f27 * f27);
        float f30 = this.f3392c;
        float f31 = f24 * f30 * f30;
        if (f29 >= f26) {
            if (f29 > f31) {
                f26 = f31;
            } else {
                f26 = 0.0f;
            }
        }
        if (f26 != 0.0f) {
            float sqrt = (float) Math.sqrt((double) (f26 / f29));
            f15 = a.e(f15, f22, sqrt, f22);
            f16 = a.e(f16, f23, sqrt, f23);
        }
        path.cubicTo((f10 + f15) / 2.0f, (f11 + f16) / 2.0f, (f15 + f12) / 2.0f, (f16 + f13) / 2.0f, f12, f13);
        return path;
    }
}
