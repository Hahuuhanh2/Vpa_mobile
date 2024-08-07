package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.R$styleable;

/* compiled from: TouchResponse */
public final class b {
    public static final float[][] E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public float A = Float.NaN;
    public float B = Float.NaN;
    public int C = 0;
    public int D = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f1681a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1682b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1683c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f1684d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f1685e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f1686f = -1;

    /* renamed from: g  reason: collision with root package name */
    public float f1687g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public float f1688h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    public int f1689i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1690j = false;

    /* renamed from: k  reason: collision with root package name */
    public float f1691k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f1692l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1693m = false;

    /* renamed from: n  reason: collision with root package name */
    public float[] f1694n = new float[2];

    /* renamed from: o  reason: collision with root package name */
    public int[] f1695o = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public float f1696p;

    /* renamed from: q  reason: collision with root package name */
    public float f1697q;

    /* renamed from: r  reason: collision with root package name */
    public final MotionLayout f1698r;

    /* renamed from: s  reason: collision with root package name */
    public float f1699s = 4.0f;

    /* renamed from: t  reason: collision with root package name */
    public float f1700t = 1.2f;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1701u = true;

    /* renamed from: v  reason: collision with root package name */
    public float f1702v = 1.0f;

    /* renamed from: w  reason: collision with root package name */
    public int f1703w = 0;

    /* renamed from: x  reason: collision with root package name */
    public float f1704x = 10.0f;

    /* renamed from: y  reason: collision with root package name */
    public float f1705y = 10.0f;

    /* renamed from: z  reason: collision with root package name */
    public float f1706z = 1.0f;

    public b(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f1698r = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.OnSwipe);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == R$styleable.OnSwipe_touchAnchorId) {
                this.f1684d = obtainStyledAttributes.getResourceId(index, this.f1684d);
            } else if (index == R$styleable.OnSwipe_touchAnchorSide) {
                int i11 = obtainStyledAttributes.getInt(index, this.f1681a);
                this.f1681a = i11;
                float[] fArr = E[i11];
                this.f1688h = fArr[0];
                this.f1687g = fArr[1];
            } else if (index == R$styleable.OnSwipe_dragDirection) {
                int i12 = obtainStyledAttributes.getInt(index, this.f1682b);
                this.f1682b = i12;
                float[][] fArr2 = F;
                if (i12 < 6) {
                    float[] fArr3 = fArr2[i12];
                    this.f1691k = fArr3[0];
                    this.f1692l = fArr3[1];
                } else {
                    this.f1692l = Float.NaN;
                    this.f1691k = Float.NaN;
                    this.f1690j = true;
                }
            } else if (index == R$styleable.OnSwipe_maxVelocity) {
                this.f1699s = obtainStyledAttributes.getFloat(index, this.f1699s);
            } else if (index == R$styleable.OnSwipe_maxAcceleration) {
                this.f1700t = obtainStyledAttributes.getFloat(index, this.f1700t);
            } else if (index == R$styleable.OnSwipe_moveWhenScrollAtTop) {
                this.f1701u = obtainStyledAttributes.getBoolean(index, this.f1701u);
            } else if (index == R$styleable.OnSwipe_dragScale) {
                this.f1702v = obtainStyledAttributes.getFloat(index, this.f1702v);
            } else if (index == R$styleable.OnSwipe_dragThreshold) {
                this.f1704x = obtainStyledAttributes.getFloat(index, this.f1704x);
            } else if (index == R$styleable.OnSwipe_touchRegionId) {
                this.f1685e = obtainStyledAttributes.getResourceId(index, this.f1685e);
            } else if (index == R$styleable.OnSwipe_onTouchUp) {
                this.f1683c = obtainStyledAttributes.getInt(index, this.f1683c);
            } else if (index == R$styleable.OnSwipe_nestedScrollFlags) {
                this.f1703w = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.OnSwipe_limitBoundsTo) {
                this.f1686f = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == R$styleable.OnSwipe_rotationCenterId) {
                this.f1689i = obtainStyledAttributes.getResourceId(index, this.f1689i);
            } else if (index == R$styleable.OnSwipe_springDamping) {
                this.f1705y = obtainStyledAttributes.getFloat(index, this.f1705y);
            } else if (index == R$styleable.OnSwipe_springMass) {
                this.f1706z = obtainStyledAttributes.getFloat(index, this.f1706z);
            } else if (index == R$styleable.OnSwipe_springStiffness) {
                this.A = obtainStyledAttributes.getFloat(index, this.A);
            } else if (index == R$styleable.OnSwipe_springStopThreshold) {
                this.B = obtainStyledAttributes.getFloat(index, this.B);
            } else if (index == R$styleable.OnSwipe_springBoundary) {
                this.C = obtainStyledAttributes.getInt(index, this.C);
            } else if (index == R$styleable.OnSwipe_autoCompleteMode) {
                this.D = obtainStyledAttributes.getInt(index, this.D);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final RectF a(MotionLayout motionLayout, RectF rectF) {
        View findViewById;
        int i10 = this.f1686f;
        if (i10 == -1 || (findViewById = motionLayout.findViewById(i10)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i10 = this.f1685e;
        if (i10 == -1 || (findViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z10) {
        if (z10) {
            float[][] fArr = F;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = E;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = F;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = E;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = E[this.f1681a];
        this.f1688h = fArr5[0];
        this.f1687g = fArr5[1];
        int i10 = this.f1682b;
        float[][] fArr6 = F;
        if (i10 < 6) {
            float[] fArr7 = fArr6[i10];
            this.f1691k = fArr7[0];
            this.f1692l = fArr7[1];
        }
    }

    public final String toString() {
        if (Float.isNaN(this.f1691k)) {
            return "rotation";
        }
        return this.f1691k + " , " + this.f1692l;
    }
}
