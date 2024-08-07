package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.R$styleable;

public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: d  reason: collision with root package name */
    public ImageFilterView.c f1746d = new ImageFilterView.c();

    /* renamed from: e  reason: collision with root package name */
    public float f1747e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f1748f = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f1749n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public Path f1750o;

    /* renamed from: p  reason: collision with root package name */
    public ViewOutlineProvider f1751p;

    /* renamed from: q  reason: collision with root package name */
    public RectF f1752q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable[] f1753r = new Drawable[2];

    /* renamed from: s  reason: collision with root package name */
    public LayerDrawable f1754s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1755t = true;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f1756u = null;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f1757v = null;

    /* renamed from: w  reason: collision with root package name */
    public float f1758w = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    public float f1759x = Float.NaN;

    /* renamed from: y  reason: collision with root package name */
    public float f1760y = Float.NaN;

    /* renamed from: z  reason: collision with root package name */
    public float f1761z = Float.NaN;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        public final void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.f1748f) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f1749n);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    private void setOverlay(boolean z10) {
        this.f1755t = z10;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f1756u = obtainStyledAttributes.getDrawable(R$styleable.ImageFilterView_altSrc);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ImageFilterView_crossfade) {
                    this.f1747e = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R$styleable.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R$styleable.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f1755t));
                } else if (index == R$styleable.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f1758w));
                } else if (index == R$styleable.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f1759x));
                } else if (index == R$styleable.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f1761z));
                } else if (index == R$styleable.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f1760y));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f1757v = drawable;
            if (this.f1756u == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f1757v = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f1753r;
                    Drawable mutate = drawable2.mutate();
                    this.f1757v = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f1753r;
            Drawable mutate2 = getDrawable().mutate();
            this.f1757v = mutate2;
            drawableArr2[0] = mutate2;
            this.f1753r[1] = this.f1756u.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f1753r);
            this.f1754s = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f1747e * 255.0f));
            if (!this.f1755t) {
                this.f1754s.getDrawable(0).setAlpha((int) ((1.0f - this.f1747e) * 255.0f));
            }
            super.setImageDrawable(this.f1754s);
        }
    }

    public final void b() {
        float f10;
        float f11;
        float f12;
        float f13;
        if (!Float.isNaN(this.f1758w) || !Float.isNaN(this.f1759x) || !Float.isNaN(this.f1760y) || !Float.isNaN(this.f1761z)) {
            float f14 = 0.0f;
            if (Float.isNaN(this.f1758w)) {
                f10 = 0.0f;
            } else {
                f10 = this.f1758w;
            }
            if (Float.isNaN(this.f1759x)) {
                f11 = 0.0f;
            } else {
                f11 = this.f1759x;
            }
            if (Float.isNaN(this.f1760y)) {
                f12 = 1.0f;
            } else {
                f12 = this.f1760y;
            }
            if (!Float.isNaN(this.f1761z)) {
                f14 = this.f1761z;
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

    public final void c() {
        if (!Float.isNaN(this.f1758w) || !Float.isNaN(this.f1759x) || !Float.isNaN(this.f1760y) || !Float.isNaN(this.f1761z)) {
            b();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f1746d.f1787f;
    }

    public float getCrossfade() {
        return this.f1747e;
    }

    public float getImagePanX() {
        return this.f1758w;
    }

    public float getImagePanY() {
        return this.f1759x;
    }

    public float getImageRotate() {
        return this.f1761z;
    }

    public float getImageZoom() {
        return this.f1760y;
    }

    public float getRound() {
        return this.f1749n;
    }

    public float getRoundPercent() {
        return this.f1748f;
    }

    public float getSaturation() {
        return this.f1746d.f1786e;
    }

    public float getWarmth() {
        return this.f1746d.f1788g;
    }

    public final void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        b();
    }

    public void setAltImageResource(int i10) {
        Drawable mutate = h.a.a(getContext(), i10).mutate();
        this.f1756u = mutate;
        Drawable[] drawableArr = this.f1753r;
        drawableArr[0] = this.f1757v;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f1753r);
        this.f1754s = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1747e);
    }

    public void setBrightness(float f10) {
        ImageFilterView.c cVar = this.f1746d;
        cVar.f1785d = f10;
        cVar.a(this);
    }

    public void setContrast(float f10) {
        ImageFilterView.c cVar = this.f1746d;
        cVar.f1787f = f10;
        cVar.a(this);
    }

    public void setCrossfade(float f10) {
        this.f1747e = f10;
        if (this.f1753r != null) {
            if (!this.f1755t) {
                this.f1754s.getDrawable(0).setAlpha((int) ((1.0f - this.f1747e) * 255.0f));
            }
            this.f1754s.getDrawable(1).setAlpha((int) (this.f1747e * 255.0f));
            super.setImageDrawable(this.f1754s);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f1756u == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f1757v = mutate;
        Drawable[] drawableArr = this.f1753r;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f1756u;
        LayerDrawable layerDrawable = new LayerDrawable(this.f1753r);
        this.f1754s = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f1747e);
    }

    public void setImagePanX(float f10) {
        this.f1758w = f10;
        c();
    }

    public void setImagePanY(float f10) {
        this.f1759x = f10;
        c();
    }

    public void setImageResource(int i10) {
        if (this.f1756u != null) {
            Drawable mutate = h.a.a(getContext(), i10).mutate();
            this.f1757v = mutate;
            Drawable[] drawableArr = this.f1753r;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f1756u;
            LayerDrawable layerDrawable = new LayerDrawable(this.f1753r);
            this.f1754s = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f1747e);
            return;
        }
        super.setImageResource(i10);
    }

    public void setImageRotate(float f10) {
        this.f1761z = f10;
        c();
    }

    public void setImageZoom(float f10) {
        this.f1760y = f10;
        c();
    }

    public void setRound(float f10) {
        boolean z10;
        if (Float.isNaN(f10)) {
            this.f1749n = f10;
            float f11 = this.f1748f;
            this.f1748f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        if (this.f1749n != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1749n = f10;
        if (f10 != 0.0f) {
            if (this.f1750o == null) {
                this.f1750o = new Path();
            }
            if (this.f1752q == null) {
                this.f1752q = new RectF();
            }
            if (this.f1751p == null) {
                b bVar = new b();
                this.f1751p = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f1752q.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f1750o.reset();
            Path path = this.f1750o;
            RectF rectF = this.f1752q;
            float f12 = this.f1749n;
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
        if (this.f1748f != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1748f = f10;
        if (f10 != 0.0f) {
            if (this.f1750o == null) {
                this.f1750o = new Path();
            }
            if (this.f1752q == null) {
                this.f1752q = new RectF();
            }
            if (this.f1751p == null) {
                a aVar = new a();
                this.f1751p = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f1748f) / 2.0f;
            this.f1752q.set(0.0f, 0.0f, (float) width, (float) height);
            this.f1750o.reset();
            this.f1750o.addRoundRect(this.f1752q, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        ImageFilterView.c cVar = this.f1746d;
        cVar.f1786e = f10;
        cVar.a(this);
    }

    public void setWarmth(float f10) {
        ImageFilterView.c cVar = this.f1746d;
        cVar.f1788g = f10;
        cVar.a(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }
}
