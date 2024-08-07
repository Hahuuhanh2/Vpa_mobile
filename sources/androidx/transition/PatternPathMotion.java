package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import i3.m;
import m1.i;
import n1.g;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {

    /* renamed from: a  reason: collision with root package name */
    public final Path f3429a;

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f3430b;

    public PatternPathMotion() {
        throw null;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f3429a = new Path();
        this.f3430b = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f11058i);
        try {
            String d10 = i.d(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (d10 != null) {
                b(g.d(d10));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final Path a(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float sqrt = (float) Math.sqrt((double) ((f15 * f15) + (f14 * f14)));
        double atan2 = Math.atan2((double) f15, (double) f14);
        this.f3430b.setScale(sqrt, sqrt);
        this.f3430b.postRotate((float) Math.toDegrees(atan2));
        this.f3430b.postTranslate(f10, f11);
        Path path = new Path();
        this.f3429a.transform(this.f3430b, path);
        return path;
    }

    public final void b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, (float[]) null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        if (f12 == f10 && f13 == f11) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f3430b.setTranslate(-f12, -f13);
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float sqrt = 1.0f / ((float) Math.sqrt((double) ((f15 * f15) + (f14 * f14))));
        this.f3430b.postScale(sqrt, sqrt);
        this.f3430b.postRotate((float) Math.toDegrees(-Math.atan2((double) f15, (double) f14)));
        path.transform(this.f3430b, this.f3429a);
    }
}
