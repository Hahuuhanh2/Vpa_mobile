package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.R$styleable;

public class ImageFilterView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    public c f1764d = new c();

    /* renamed from: e  reason: collision with root package name */
    public boolean f1765e = true;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1766f = null;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f1767n = null;

    /* renamed from: o  reason: collision with root package name */
    public float f1768o = 0.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f1769p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    public float f1770q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public Path f1771r;

    /* renamed from: s  reason: collision with root package name */
    public ViewOutlineProvider f1772s;

    /* renamed from: t  reason: collision with root package name */
    public RectF f1773t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable[] f1774u = new Drawable[2];

    /* renamed from: v  reason: collision with root package name */
    public LayerDrawable f1775v;

    /* renamed from: w  reason: collision with root package name */
    public float f1776w = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    public float f1777x = Float.NaN;

    /* renamed from: y  reason: collision with root package name */
    public float f1778y = Float.NaN;

    /* renamed from: z  reason: collision with root package name */
    public float f1779z = Float.NaN;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        public final void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.f1769p) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f1770q);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public float[] f1782a = new float[20];

        /* renamed from: b  reason: collision with root package name */
        public ColorMatrix f1783b = new ColorMatrix();

        /* renamed from: c  reason: collision with root package name */
        public ColorMatrix f1784c = new ColorMatrix();

        /* renamed from: d  reason: collision with root package name */
        public float f1785d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1786e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1787f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1788g = 1.0f;

        public final void a(ImageView imageView) {
            boolean z10;
            float f10;
            float f11;
            float f12;
            float f13;
            this.f1783b.reset();
            float f14 = this.f1786e;
            boolean z11 = true;
            if (f14 != 1.0f) {
                float f15 = 1.0f - f14;
                float f16 = 0.2999f * f15;
                float f17 = 0.587f * f15;
                float f18 = f15 * 0.114f;
                float[] fArr = this.f1782a;
                fArr[0] = f16 + f14;
                fArr[1] = f17;
                fArr[2] = f18;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f16;
                fArr[6] = f17 + f14;
                fArr[7] = f18;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f16;
                fArr[11] = f17;
                fArr[12] = f18 + f14;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                f10 = 1.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                this.f1783b.set(fArr);
                z10 = true;
            } else {
                f10 = 1.0f;
                z10 = false;
            }
            float f19 = this.f1787f;
            if (f19 != f10) {
                this.f1784c.setScale(f19, f19, f19, f10);
                this.f1783b.postConcat(this.f1784c);
                z10 = true;
            }
            float f20 = this.f1788g;
            if (f20 != f10) {
                if (f20 <= 0.0f) {
                    f20 = 0.01f;
                }
                float f21 = (5000.0f / f20) / 100.0f;
                if (f21 > 66.0f) {
                    double d10 = (double) (f21 - 60.0f);
                    f11 = ((float) Math.pow(d10, -0.13320475816726685d)) * 329.69873f;
                    f12 = ((float) Math.pow(d10, 0.07551484555006027d)) * 288.12216f;
                } else {
                    f12 = (((float) Math.log((double) f21)) * 99.4708f) - 161.11957f;
                    f11 = 255.0f;
                }
                if (f21 >= 66.0f) {
                    f13 = 255.0f;
                } else if (f21 > 19.0f) {
                    f13 = (((float) Math.log((double) (f21 - 10.0f))) * 138.51773f) - 305.0448f;
                } else {
                    f13 = 0.0f;
                }
                float min = Math.min(255.0f, Math.max(f11, 0.0f));
                float min2 = Math.min(255.0f, Math.max(f12, 0.0f));
                float min3 = Math.min(255.0f, Math.max(f13, 0.0f));
                float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
                float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, 0.0f));
                float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, 0.0f));
                float[] fArr2 = this.f1782a;
                fArr2[0] = min / min4;
                fArr2[1] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[3] = 0.0f;
                fArr2[4] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[6] = min2 / min5;
                fArr2[7] = 0.0f;
                fArr2[8] = 0.0f;
                fArr2[9] = 0.0f;
                fArr2[10] = 0.0f;
                fArr2[11] = 0.0f;
                fArr2[12] = min6;
                fArr2[13] = 0.0f;
                fArr2[14] = 0.0f;
                fArr2[15] = 0.0f;
                fArr2[16] = 0.0f;
                fArr2[17] = 0.0f;
                fArr2[18] = 1.0f;
                fArr2[19] = 0.0f;
                this.f1784c.set(fArr2);
                this.f1783b.postConcat(this.f1784c);
                z10 = true;
            }
            float f22 = this.f1785d;
            if (f22 != 1.0f) {
                float[] fArr3 = this.f1782a;
                fArr3[0] = f22;
                fArr3[1] = 0.0f;
                fArr3[2] = 0.0f;
                fArr3[3] = 0.0f;
                fArr3[4] = 0.0f;
                fArr3[5] = 0.0f;
                fArr3[6] = f22;
                fArr3[7] = 0.0f;
                fArr3[8] = 0.0f;
                fArr3[9] = 0.0f;
                fArr3[10] = 0.0f;
                fArr3[11] = 0.0f;
                fArr3[12] = f22;
                fArr3[13] = 0.0f;
                fArr3[14] = 0.0f;
                fArr3[15] = 0.0f;
                fArr3[16] = 0.0f;
                fArr3[17] = 0.0f;
                fArr3[18] = 1.0f;
                fArr3[19] = 0.0f;
                this.f1784c.set(fArr3);
                this.f1783b.postConcat(this.f1784c);
            } else {
                z11 = z10;
            }
            if (z11) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f1783b));
                return;
            }
            ImageView imageView2 = imageView;
            imageView.clearColorFilter();
        }
    }

    public ImageFilterView(Context context) {
        super(context);
    }

    private void setOverlay(boolean z10) {
        this.f1765e = z10;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f1766f = obtainStyledAttributes.getDrawable(R$styleable.ImageFilterView_altSrc);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ImageFilterView_crossfade) {
                    this.f1768o = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R$styleable.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_brightness) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f1765e));
                } else if (index == R$styleable.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f1776w));
                } else if (index == R$styleable.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f1777x));
                } else if (index == R$styleable.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f1779z));
                } else if (index == R$styleable.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f1778y));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f1767n = drawable;
            if (this.f1766f == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f1767n = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f1774u;
                    Drawable mutate = drawable2.mutate();
                    this.f1767n = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f1774u;
            Drawable mutate2 = getDrawable().mutate();
            this.f1767n = mutate2;
            drawableArr2[0] = mutate2;
            this.f1774u[1] = this.f1766f.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f1774u);
            this.f1775v = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f1768o * 255.0f));
            if (!this.f1765e) {
                this.f1775v.getDrawable(0).setAlpha((int) ((1.0f - this.f1768o) * 255.0f));
            }
            super.setImageDrawable(this.f1775v);
        }
    }

    public final void d() {
        float f10;
        float f11;
        float f12;
        float f13;
        if (!Float.isNaN(this.f1776w) || !Float.isNaN(this.f1777x) || !Float.isNaN(this.f1778y) || !Float.isNaN(this.f1779z)) {
            float f14 = 0.0f;
            if (Float.isNaN(this.f1776w)) {
                f10 = 0.0f;
            } else {
                f10 = this.f1776w;
            }
            if (Float.isNaN(this.f1777x)) {
                f11 = 0.0f;
            } else {
                f11 = this.f1777x;
            }
            if (Float.isNaN(this.f1778y)) {
                f12 = 1.0f;
            } else {
                f12 = this.f1778y;
            }
            if (!Float.isNaN(this.f1779z)) {
                f14 = this.f1779z;
            }
            Matrix matrix = new Matrix();
            matrix.reset();
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            float width = (float) getWidth();
            float height = (float) getHeight();
            if (intrinsicWidth * height < intrinsicHeight * width) {
                f13 = width / intrinsicWidth;
            } else {
                f13 = height / intrinsicHeight;
            }
            float f15 = f12 * f13;
            matrix.postScale(f15, f15);
            float f16 = intrinsicWidth * f15;
            float f17 = f15 * intrinsicHeight;
            matrix.postTranslate(((((width - f16) * f10) + width) - f16) * 0.5f, ((((height - f17) * f11) + height) - f17) * 0.5f);
            matrix.postRotate(f14, width / 2.0f, height / 2.0f);
            setImageMatrix(matrix);
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public final void e() {
        if (!Float.isNaN(this.f1776w) || !Float.isNaN(this.f1777x) || !Float.isNaN(this.f1778y) || !Float.isNaN(this.f1779z)) {
            d();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public float getBrightness() {
        return this.f1764d.f1785d;
    }

    public float getContrast() {
        return this.f1764d.f1787f;
    }

    public float getCrossfade() {
        return this.f1768o;
    }

    public float getImagePanX() {
        return this.f1776w;
    }

    public float getImagePanY() {
        return this.f1777x;
    }

    public float getImageRotate() {
        return this.f1779z;
    }

    public float getImageZoom() {
        return this.f1778y;
    }

    public float getRound() {
        return this.f1770q;
    }

    public float getRoundPercent() {
        return this.f1769p;
    }

    public float getSaturation() {
        return this.f1764d.f1786e;
    }

    public float getWarmth() {
        return this.f1764d.f1788g;
    }

    public final void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        d();
    }

    public void setAltImageResource(int i10) {
        Drawable mutate = h.a.a(getContext(), i10).mutate();
        this.f1766f = mutate;
        Drawable[] drawableArr = this.f1774u;
        drawableArr[0] = this.f1767n;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f1774u);
        this.f1775v = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1768o);
    }

    public void setBrightness(float f10) {
        c cVar = this.f1764d;
        cVar.f1785d = f10;
        cVar.a(this);
    }

    public void setContrast(float f10) {
        c cVar = this.f1764d;
        cVar.f1787f = f10;
        cVar.a(this);
    }

    public void setCrossfade(float f10) {
        this.f1768o = f10;
        if (this.f1774u != null) {
            if (!this.f1765e) {
                this.f1775v.getDrawable(0).setAlpha((int) ((1.0f - this.f1768o) * 255.0f));
            }
            this.f1775v.getDrawable(1).setAlpha((int) (this.f1768o * 255.0f));
            super.setImageDrawable(this.f1775v);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f1766f == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f1767n = mutate;
        Drawable[] drawableArr = this.f1774u;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f1766f;
        LayerDrawable layerDrawable = new LayerDrawable(this.f1774u);
        this.f1775v = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1768o);
    }

    public void setImagePanX(float f10) {
        this.f1776w = f10;
        e();
    }

    public void setImagePanY(float f10) {
        this.f1777x = f10;
        e();
    }

    public void setImageResource(int i10) {
        if (this.f1766f != null) {
            Drawable mutate = h.a.a(getContext(), i10).mutate();
            this.f1767n = mutate;
            Drawable[] drawableArr = this.f1774u;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f1766f;
            LayerDrawable layerDrawable = new LayerDrawable(this.f1774u);
            this.f1775v = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f1768o);
            return;
        }
        super.setImageResource(i10);
    }

    public void setImageRotate(float f10) {
        this.f1779z = f10;
        e();
    }

    public void setImageZoom(float f10) {
        this.f1778y = f10;
        e();
    }

    public void setRound(float f10) {
        boolean z10;
        if (Float.isNaN(f10)) {
            this.f1770q = f10;
            float f11 = this.f1769p;
            this.f1769p = -1.0f;
            setRoundPercent(f11);
            return;
        }
        if (this.f1770q != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1770q = f10;
        if (f10 != 0.0f) {
            if (this.f1771r == null) {
                this.f1771r = new Path();
            }
            if (this.f1773t == null) {
                this.f1773t = new RectF();
            }
            if (this.f1772s == null) {
                b bVar = new b();
                this.f1772s = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f1773t.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f1771r.reset();
            Path path = this.f1771r;
            RectF rectF = this.f1773t;
            float f12 = this.f1770q;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10;
        if (this.f1769p != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1769p = f10;
        if (f10 != 0.0f) {
            if (this.f1771r == null) {
                this.f1771r = new Path();
            }
            if (this.f1773t == null) {
                this.f1773t = new RectF();
            }
            if (this.f1772s == null) {
                a aVar = new a();
                this.f1772s = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f1769p) / 2.0f;
            this.f1773t.set(0.0f, 0.0f, (float) width, (float) height);
            this.f1771r.reset();
            this.f1771r.addRoundRect(this.f1773t, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        c cVar = this.f1764d;
        cVar.f1786e = f10;
        cVar.a(this);
    }

    public void setWarmth(float f10) {
        c cVar = this.f1764d;
        cVar.f1788g = f10;
        cVar.a(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(context, attributeSet);
    }
}
